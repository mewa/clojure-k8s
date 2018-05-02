(ns k8s.core
  (:gen-class)
  (:require [clojure.core.async :as async :refer [go chan close! <! >! <!! >!!]]
            [clojure.string :as s]
            [kubernetes.core :as core]
            [kubernetes.api.core :as k8score]
            [kubernetes.api.batch-v- :as k8sbatch]
            [kubernetes.api.core-v- :as k8scorev]
            [cheshire.core :refer :all]
            [ring.adapter.jetty :as jetty]))

(defonce next-serial (atom -1))
(defn serial []
  (let [val (swap! next-serial inc)]
    val))

(def kube-config {:base-url "http://localhost:8001"})

(defn run-k8s [f & args]
  (core/with-api-context kube-config
    (try (apply f args)
         (catch Exception e {:error (or (ex-data e) e)}))))


(defn new-job
  "Create job which executes CMD"
  [cmd]
  (let [job-name (str "k8s-job-" (serial))]
    (k8sbatch/create-batch-v1-namespaced-job
     "default"
     {:metadata {:name job-name}
      :spec {:template {:spec {:containers [{:image "alpine"
                                             :name "k8s-job"
                                             :command ["sh" "-c" cmd]}]
                               :restartPolicy "Never"}}}})
    {:name job-name}))

(defn job-pods
  "Get pods for job ID and return a channel with information about
  each pod"
  [id]
  (let [pods (chan)]
    (go
      (doseq
          [pod
           (map (fn [v] {:name (get-in v [:metadata :name])
                         :status (get-in v [:status :phase])})
                (:items (k8scorev/list-core-v1-namespaced-pod
                         "default"
                         {:label-selector (str "job-name=" id)})))]
        (>! pods pod))
      (close! pods))
    pods))

(defn pod-logs
  "Get logs for each item in channel PODS and return a channel
  with logs for each pod"
  [pods]
  (let [logs (chan)]
    (go
      (loop [podinfo (<! pods)]
        (when podinfo
          (let [pod (:name podinfo)
                status (:status podinfo)]
            (>! logs
                {:pod pod
                 :status status
                 :log (k8scorev/read-core-v1-namespaced-pod-log pod "default")})
            (recur (<! pods)))))
      (close! logs))
    logs))

(defn get-job
  "Get information for job with given ID"
  [id]
  (let [pods (job-pods id)
        logs (pod-logs pods)]
    (loop [log (<!! logs)
           acc nil]
      (if log
        (recur (<!! logs) (cons log acc))
        acc))))

(defn run-handler
  "Ring handler which parses REQUEST and starts a job"
  [request]
  (let [handler (fn [cmd] (run-k8s new-job cmd))
        resp (-> request
                 :body
                 slurp
                 handler)]
    {:status 200
     :content-type "application/json"
     :body (generate-string resp {:pretty true})}))

(defn explode-query
  "Explode query string Q into a map"
  [q]
  (reduce #(apply assoc %1 %2) {}
       (map #(s/split % #"=") (s/split q #"&"))))

(defn get-handler
  "Ring handler which parses REQUEST and returns job info"
  [request]
  (if-let [id ((explode-query (:query-string request)) "id")]
    (let [jobinfo (run-k8s get-job id)]
      {:status 200
       :body (generate-string jobinfo {:pretty true})})
    {:status 400
     :body "id query param is required"}))

(defn route
  "Given a map of HANDLERS, returns a Ring handler which matches
  requst URIs on map keys and executes handlers associated with
  those keys"
  [handlers]
  (fn [request] (if-let [handler (handlers (:uri request))]
                  (handler request)
                  {:status 404 :body "Not found"})))

(defn -main
  [& args]
  (jetty/run-jetty (route {"/run" run-handler
                           "/get" get-handler}) {:port 4000}))
