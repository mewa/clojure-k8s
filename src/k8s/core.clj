(ns k8s.core
  (:gen-class)
  (:require [kubernetes.core :as core]
            [kubernetes.api.core :as k8score]
            [kubernetes.api.batch-v- :as k8sbatch]
            [cheshire.core :refer :all]
            [ring.adapter.jetty :as jetty]))

(defonce next-serial (atom -1))
(defn serial []
  (let [val (swap! next-serial inc)]
    val))

(def kube-config {:base-url "http://localhost:8001"})

(defn run-job [cmd]
  (k8sbatch/create-batch-v1-namespaced-job
   "default"
   {:metadata {:name (str "k8s-job-" (serial))}
    :spec {:template {:spec {:containers [{:image "alpine"
                                           :name "k8s-job"
                                           :command ["sh" "-c" cmd]}]
                             :restartPolicy "Never"}}}}))

(defn run [cmd]
  (core/with-api-context kube-config
    (try (run-job cmd)
         (catch Exception e {:error (or (ex-data e) e)}))))

(defn handler [request]
  (let [resp ((comp run slurp :body) request)]
    {:status 200
     :content-type "application/json"
     :body (generate-string resp {:pretty true})}))

(defn -main
  [& args]
  (jetty/run-jetty handler {:port 4000}))
