(ns kubernetes.api.batch-v-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-batch-v1-namespaced-job-with-http-info
  "
  create a Job"
  ([namespace body ] (create-batch-v1-namespaced-job-with-http-info namespace body nil))
  ([namespace body {:keys [pretty ]}]
   (check-required-params namespace body)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn create-batch-v1-namespaced-job
  "
  create a Job"
  ([namespace body ] (create-batch-v1-namespaced-job namespace body nil))
  ([namespace body optional-params]
   (:data (create-batch-v1-namespaced-job-with-http-info namespace body optional-params))))

(defn delete-batch-v1-collection-namespaced-job-with-http-info
  "
  delete collection of Job"
  ([namespace ] (delete-batch-v1-collection-namespaced-job-with-http-info namespace nil))
  ([namespace {:keys [pretty continue field-selector include-uninitialized label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn delete-batch-v1-collection-namespaced-job
  "
  delete collection of Job"
  ([namespace ] (delete-batch-v1-collection-namespaced-job namespace nil))
  ([namespace optional-params]
   (:data (delete-batch-v1-collection-namespaced-job-with-http-info namespace optional-params))))

(defn delete-batch-v1-namespaced-job-with-http-info
  "
  delete a Job"
  ([name namespace body ] (delete-batch-v1-namespaced-job-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace body)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn delete-batch-v1-namespaced-job
  "
  delete a Job"
  ([name namespace body ] (delete-batch-v1-namespaced-job name namespace body nil))
  ([name namespace body optional-params]
   (:data (delete-batch-v1-namespaced-job-with-http-info name namespace body optional-params))))

(defn get-batch-v1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/batch/v1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken" "HTTPBasic"]}))

(defn get-batch-v1-api-resources
  "
  get available resources"
  []
  (:data (get-batch-v1-api-resources-with-http-info)))

(defn list-batch-v1-job-for-all-namespaces-with-http-info
  "
  list or watch objects of kind Job"
  ([] (list-batch-v1-job-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/batch/v1/jobs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn list-batch-v1-job-for-all-namespaces
  "
  list or watch objects of kind Job"
  ([] (list-batch-v1-job-for-all-namespaces nil))
  ([optional-params]
   (:data (list-batch-v1-job-for-all-namespaces-with-http-info optional-params))))

(defn list-batch-v1-namespaced-job-with-http-info
  "
  list or watch objects of kind Job"
  ([namespace ] (list-batch-v1-namespaced-job-with-http-info namespace nil))
  ([namespace {:keys [pretty continue field-selector include-uninitialized label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn list-batch-v1-namespaced-job
  "
  list or watch objects of kind Job"
  ([namespace ] (list-batch-v1-namespaced-job namespace nil))
  ([namespace optional-params]
   (:data (list-batch-v1-namespaced-job-with-http-info namespace optional-params))))

(defn patch-batch-v1-namespaced-job-with-http-info
  "
  partially update the specified Job"
  ([name namespace body ] (patch-batch-v1-namespaced-job-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty ]}]
   (check-required-params name namespace body)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn patch-batch-v1-namespaced-job
  "
  partially update the specified Job"
  ([name namespace body ] (patch-batch-v1-namespaced-job name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-batch-v1-namespaced-job-with-http-info name namespace body optional-params))))

(defn patch-batch-v1-namespaced-job-status-with-http-info
  "
  partially update status of the specified Job"
  ([name namespace body ] (patch-batch-v1-namespaced-job-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty ]}]
   (check-required-params name namespace body)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs/{name}/status" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn patch-batch-v1-namespaced-job-status
  "
  partially update status of the specified Job"
  ([name namespace body ] (patch-batch-v1-namespaced-job-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-batch-v1-namespaced-job-status-with-http-info name namespace body optional-params))))

(defn read-batch-v1-namespaced-job-with-http-info
  "
  read the specified Job"
  ([name namespace ] (read-batch-v1-namespaced-job-with-http-info name namespace nil))
  ([name namespace {:keys [pretty exact export ]}]
   (check-required-params name namespace)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn read-batch-v1-namespaced-job
  "
  read the specified Job"
  ([name namespace ] (read-batch-v1-namespaced-job name namespace nil))
  ([name namespace optional-params]
   (:data (read-batch-v1-namespaced-job-with-http-info name namespace optional-params))))

(defn read-batch-v1-namespaced-job-status-with-http-info
  "
  read status of the specified Job"
  ([name namespace ] (read-batch-v1-namespaced-job-status-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs/{name}/status" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn read-batch-v1-namespaced-job-status
  "
  read status of the specified Job"
  ([name namespace ] (read-batch-v1-namespaced-job-status name namespace nil))
  ([name namespace optional-params]
   (:data (read-batch-v1-namespaced-job-status-with-http-info name namespace optional-params))))

(defn replace-batch-v1-namespaced-job-with-http-info
  "
  replace the specified Job"
  ([name namespace body ] (replace-batch-v1-namespaced-job-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty ]}]
   (check-required-params name namespace body)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn replace-batch-v1-namespaced-job
  "
  replace the specified Job"
  ([name namespace body ] (replace-batch-v1-namespaced-job name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-batch-v1-namespaced-job-with-http-info name namespace body optional-params))))

(defn replace-batch-v1-namespaced-job-status-with-http-info
  "
  replace status of the specified Job"
  ([name namespace body ] (replace-batch-v1-namespaced-job-status-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty ]}]
   (check-required-params name namespace body)
   (call-api "/apis/batch/v1/namespaces/{namespace}/jobs/{name}/status" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn replace-batch-v1-namespaced-job-status
  "
  replace status of the specified Job"
  ([name namespace body ] (replace-batch-v1-namespaced-job-status name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-batch-v1-namespaced-job-status-with-http-info name namespace body optional-params))))

(defn watch-batch-v1-job-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of Job"
  ([] (watch-batch-v1-job-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/batch/v1/watch/jobs" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-batch-v1-job-list-for-all-namespaces
  "
  watch individual changes to a list of Job"
  ([] (watch-batch-v1-job-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-batch-v1-job-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-batch-v1-namespaced-job-with-http-info
  "
  watch changes to an object of kind Job"
  ([name namespace ] (watch-batch-v1-namespaced-job-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/batch/v1/watch/namespaces/{namespace}/jobs/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-batch-v1-namespaced-job
  "
  watch changes to an object of kind Job"
  ([name namespace ] (watch-batch-v1-namespaced-job name namespace nil))
  ([name namespace optional-params]
   (:data (watch-batch-v1-namespaced-job-with-http-info name namespace optional-params))))

(defn watch-batch-v1-namespaced-job-list-with-http-info
  "
  watch individual changes to a list of Job"
  ([namespace ] (watch-batch-v1-namespaced-job-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/batch/v1/watch/namespaces/{namespace}/jobs" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-batch-v1-namespaced-job-list
  "
  watch individual changes to a list of Job"
  ([namespace ] (watch-batch-v1-namespaced-job-list namespace nil))
  ([namespace optional-params]
   (:data (watch-batch-v1-namespaced-job-list-with-http-info namespace optional-params))))

