(ns kubernetes.api.storage-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-storage-v1beta1-storage-class-with-http-info
  "
  create a StorageClass"
  ([body ] (create-storage-v1beta1-storage-class-with-http-info body nil))
  ([body {:keys [pretty ]}]
   (check-required-params body)
   (call-api "/apis/storage.k8s.io/v1beta1/storageclasses" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn create-storage-v1beta1-storage-class
  "
  create a StorageClass"
  ([body ] (create-storage-v1beta1-storage-class body nil))
  ([body optional-params]
   (:data (create-storage-v1beta1-storage-class-with-http-info body optional-params))))

(defn delete-storage-v1beta1-collection-storage-class-with-http-info
  "
  delete collection of StorageClass"
  ([] (delete-storage-v1beta1-collection-storage-class-with-http-info nil))
  ([{:keys [pretty continue field-selector include-uninitialized label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/storageclasses" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn delete-storage-v1beta1-collection-storage-class
  "
  delete collection of StorageClass"
  ([] (delete-storage-v1beta1-collection-storage-class nil))
  ([optional-params]
   (:data (delete-storage-v1beta1-collection-storage-class-with-http-info optional-params))))

(defn delete-storage-v1beta1-storage-class-with-http-info
  "
  delete a StorageClass"
  ([name body ] (delete-storage-v1beta1-storage-class-with-http-info name body nil))
  ([name body {:keys [pretty grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1beta1/storageclasses/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn delete-storage-v1beta1-storage-class
  "
  delete a StorageClass"
  ([name body ] (delete-storage-v1beta1-storage-class name body nil))
  ([name body optional-params]
   (:data (delete-storage-v1beta1-storage-class-with-http-info name body optional-params))))

(defn get-storage-v1beta1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/storage.k8s.io/v1beta1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken" "HTTPBasic"]}))

(defn get-storage-v1beta1-api-resources
  "
  get available resources"
  []
  (:data (get-storage-v1beta1-api-resources-with-http-info)))

(defn list-storage-v1beta1-storage-class-with-http-info
  "
  list or watch objects of kind StorageClass"
  ([] (list-storage-v1beta1-storage-class-with-http-info nil))
  ([{:keys [pretty continue field-selector include-uninitialized label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/storageclasses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn list-storage-v1beta1-storage-class
  "
  list or watch objects of kind StorageClass"
  ([] (list-storage-v1beta1-storage-class nil))
  ([optional-params]
   (:data (list-storage-v1beta1-storage-class-with-http-info optional-params))))

(defn patch-storage-v1beta1-storage-class-with-http-info
  "
  partially update the specified StorageClass"
  ([name body ] (patch-storage-v1beta1-storage-class-with-http-info name body nil))
  ([name body {:keys [pretty ]}]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1beta1/storageclasses/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn patch-storage-v1beta1-storage-class
  "
  partially update the specified StorageClass"
  ([name body ] (patch-storage-v1beta1-storage-class name body nil))
  ([name body optional-params]
   (:data (patch-storage-v1beta1-storage-class-with-http-info name body optional-params))))

(defn read-storage-v1beta1-storage-class-with-http-info
  "
  read the specified StorageClass"
  ([name ] (read-storage-v1beta1-storage-class-with-http-info name nil))
  ([name {:keys [pretty exact export ]}]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1beta1/storageclasses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn read-storage-v1beta1-storage-class
  "
  read the specified StorageClass"
  ([name ] (read-storage-v1beta1-storage-class name nil))
  ([name optional-params]
   (:data (read-storage-v1beta1-storage-class-with-http-info name optional-params))))

(defn replace-storage-v1beta1-storage-class-with-http-info
  "
  replace the specified StorageClass"
  ([name body ] (replace-storage-v1beta1-storage-class-with-http-info name body nil))
  ([name body {:keys [pretty ]}]
   (check-required-params name body)
   (call-api "/apis/storage.k8s.io/v1beta1/storageclasses/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn replace-storage-v1beta1-storage-class
  "
  replace the specified StorageClass"
  ([name body ] (replace-storage-v1beta1-storage-class name body nil))
  ([name body optional-params]
   (:data (replace-storage-v1beta1-storage-class-with-http-info name body optional-params))))

(defn watch-storage-v1beta1-storage-class-with-http-info
  "
  watch changes to an object of kind StorageClass"
  ([name ] (watch-storage-v1beta1-storage-class-with-http-info name nil))
  ([name {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name)
   (call-api "/apis/storage.k8s.io/v1beta1/watch/storageclasses/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-storage-v1beta1-storage-class
  "
  watch changes to an object of kind StorageClass"
  ([name ] (watch-storage-v1beta1-storage-class name nil))
  ([name optional-params]
   (:data (watch-storage-v1beta1-storage-class-with-http-info name optional-params))))

(defn watch-storage-v1beta1-storage-class-list-with-http-info
  "
  watch individual changes to a list of StorageClass"
  ([] (watch-storage-v1beta1-storage-class-list-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/storage.k8s.io/v1beta1/watch/storageclasses" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-storage-v1beta1-storage-class-list
  "
  watch individual changes to a list of StorageClass"
  ([] (watch-storage-v1beta1-storage-class-list nil))
  ([optional-params]
   (:data (watch-storage-v1beta1-storage-class-list-with-http-info optional-params))))

