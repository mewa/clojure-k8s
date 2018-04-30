(ns k8s.core
  (:gen-class)
  (:require [clojure.string :as s]
            [kubernetes.core :as core]
            [kubernetes.api.core :as k8score]
            [kubernetes.api.batch-v- :as k8sbatch]
            [kubernetes.api.apps-v-beta- :as k8sapps]))

(defn test-job []
  (k8sbatch/create-batch-v1-namespaced-job
   "default"
   {:metadata {:name "test-job"}
    :spec {:template {:spec {:containers [{:image "alpine"
                                           :name "k8s-test"
                                           :command ["echo" "success"]}]
                             :restartPolicy "Never"}}}}))

(defn -main
  [& args]
  (core/with-api-context {:base-url "https://kubernetes.default.svc"
                          :auths {"BearerToken" (slurp "/var/run/secrets/kubernetes.io/serviceaccount/token")}}
    (println (try (job)
                  (catch Exception e (println "Could not create job: "
                                              (if-let [data (ex-data e)]
                                                data
                                                e)))))
    (println "Done")))
