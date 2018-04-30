(ns kubernetes.api.rbac-authorization-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-rbac-authorization-v1beta1-cluster-role-with-http-info
  "
  create a ClusterRole"
  ([body ] (create-rbac-authorization-v1beta1-cluster-role-with-http-info body nil))
  ([body {:keys [pretty ]}]
   (check-required-params body)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/clusterroles" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn create-rbac-authorization-v1beta1-cluster-role
  "
  create a ClusterRole"
  ([body ] (create-rbac-authorization-v1beta1-cluster-role body nil))
  ([body optional-params]
   (:data (create-rbac-authorization-v1beta1-cluster-role-with-http-info body optional-params))))

(defn create-rbac-authorization-v1beta1-cluster-role-binding-with-http-info
  "
  create a ClusterRoleBinding"
  ([body ] (create-rbac-authorization-v1beta1-cluster-role-binding-with-http-info body nil))
  ([body {:keys [pretty ]}]
   (check-required-params body)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn create-rbac-authorization-v1beta1-cluster-role-binding
  "
  create a ClusterRoleBinding"
  ([body ] (create-rbac-authorization-v1beta1-cluster-role-binding body nil))
  ([body optional-params]
   (:data (create-rbac-authorization-v1beta1-cluster-role-binding-with-http-info body optional-params))))

(defn create-rbac-authorization-v1beta1-namespaced-role-with-http-info
  "
  create a Role"
  ([namespace body ] (create-rbac-authorization-v1beta1-namespaced-role-with-http-info namespace body nil))
  ([namespace body {:keys [pretty ]}]
   (check-required-params namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn create-rbac-authorization-v1beta1-namespaced-role
  "
  create a Role"
  ([namespace body ] (create-rbac-authorization-v1beta1-namespaced-role namespace body nil))
  ([namespace body optional-params]
   (:data (create-rbac-authorization-v1beta1-namespaced-role-with-http-info namespace body optional-params))))

(defn create-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info
  "
  create a RoleBinding"
  ([namespace body ] (create-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info namespace body nil))
  ([namespace body {:keys [pretty ]}]
   (check-required-params namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings" :post
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn create-rbac-authorization-v1beta1-namespaced-role-binding
  "
  create a RoleBinding"
  ([namespace body ] (create-rbac-authorization-v1beta1-namespaced-role-binding namespace body nil))
  ([namespace body optional-params]
   (:data (create-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info namespace body optional-params))))

(defn delete-rbac-authorization-v1beta1-cluster-role-with-http-info
  "
  delete a ClusterRole"
  ([name body ] (delete-rbac-authorization-v1beta1-cluster-role-with-http-info name body nil))
  ([name body {:keys [pretty grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name body)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/clusterroles/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn delete-rbac-authorization-v1beta1-cluster-role
  "
  delete a ClusterRole"
  ([name body ] (delete-rbac-authorization-v1beta1-cluster-role name body nil))
  ([name body optional-params]
   (:data (delete-rbac-authorization-v1beta1-cluster-role-with-http-info name body optional-params))))

(defn delete-rbac-authorization-v1beta1-cluster-role-binding-with-http-info
  "
  delete a ClusterRoleBinding"
  ([name body ] (delete-rbac-authorization-v1beta1-cluster-role-binding-with-http-info name body nil))
  ([name body {:keys [pretty grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name body)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn delete-rbac-authorization-v1beta1-cluster-role-binding
  "
  delete a ClusterRoleBinding"
  ([name body ] (delete-rbac-authorization-v1beta1-cluster-role-binding name body nil))
  ([name body optional-params]
   (:data (delete-rbac-authorization-v1beta1-cluster-role-binding-with-http-info name body optional-params))))

(defn delete-rbac-authorization-v1beta1-collection-cluster-role-with-http-info
  "
  delete collection of ClusterRole"
  ([] (delete-rbac-authorization-v1beta1-collection-cluster-role-with-http-info nil))
  ([{:keys [pretty continue field-selector include-uninitialized label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/clusterroles" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn delete-rbac-authorization-v1beta1-collection-cluster-role
  "
  delete collection of ClusterRole"
  ([] (delete-rbac-authorization-v1beta1-collection-cluster-role nil))
  ([optional-params]
   (:data (delete-rbac-authorization-v1beta1-collection-cluster-role-with-http-info optional-params))))

(defn delete-rbac-authorization-v1beta1-collection-cluster-role-binding-with-http-info
  "
  delete collection of ClusterRoleBinding"
  ([] (delete-rbac-authorization-v1beta1-collection-cluster-role-binding-with-http-info nil))
  ([{:keys [pretty continue field-selector include-uninitialized label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn delete-rbac-authorization-v1beta1-collection-cluster-role-binding
  "
  delete collection of ClusterRoleBinding"
  ([] (delete-rbac-authorization-v1beta1-collection-cluster-role-binding nil))
  ([optional-params]
   (:data (delete-rbac-authorization-v1beta1-collection-cluster-role-binding-with-http-info optional-params))))

(defn delete-rbac-authorization-v1beta1-collection-namespaced-role-with-http-info
  "
  delete collection of Role"
  ([namespace ] (delete-rbac-authorization-v1beta1-collection-namespaced-role-with-http-info namespace nil))
  ([namespace {:keys [pretty continue field-selector include-uninitialized label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn delete-rbac-authorization-v1beta1-collection-namespaced-role
  "
  delete collection of Role"
  ([namespace ] (delete-rbac-authorization-v1beta1-collection-namespaced-role namespace nil))
  ([namespace optional-params]
   (:data (delete-rbac-authorization-v1beta1-collection-namespaced-role-with-http-info namespace optional-params))))

(defn delete-rbac-authorization-v1beta1-collection-namespaced-role-binding-with-http-info
  "
  delete collection of RoleBinding"
  ([namespace ] (delete-rbac-authorization-v1beta1-collection-namespaced-role-binding-with-http-info namespace nil))
  ([namespace {:keys [pretty continue field-selector include-uninitialized label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings" :delete
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn delete-rbac-authorization-v1beta1-collection-namespaced-role-binding
  "
  delete collection of RoleBinding"
  ([namespace ] (delete-rbac-authorization-v1beta1-collection-namespaced-role-binding namespace nil))
  ([namespace optional-params]
   (:data (delete-rbac-authorization-v1beta1-collection-namespaced-role-binding-with-http-info namespace optional-params))))

(defn delete-rbac-authorization-v1beta1-namespaced-role-with-http-info
  "
  delete a Role"
  ([name namespace body ] (delete-rbac-authorization-v1beta1-namespaced-role-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn delete-rbac-authorization-v1beta1-namespaced-role
  "
  delete a Role"
  ([name namespace body ] (delete-rbac-authorization-v1beta1-namespaced-role name namespace body nil))
  ([name namespace body optional-params]
   (:data (delete-rbac-authorization-v1beta1-namespaced-role-with-http-info name namespace body optional-params))))

(defn delete-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info
  "
  delete a RoleBinding"
  ([name namespace body ] (delete-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings/{name}" :delete
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn delete-rbac-authorization-v1beta1-namespaced-role-binding
  "
  delete a RoleBinding"
  ([name namespace body ] (delete-rbac-authorization-v1beta1-namespaced-role-binding name namespace body nil))
  ([name namespace body optional-params]
   (:data (delete-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info name namespace body optional-params))))

(defn get-rbac-authorization-v1beta1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/rbac.authorization.k8s.io/v1beta1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken" "HTTPBasic"]}))

(defn get-rbac-authorization-v1beta1-api-resources
  "
  get available resources"
  []
  (:data (get-rbac-authorization-v1beta1-api-resources-with-http-info)))

(defn list-rbac-authorization-v1beta1-cluster-role-with-http-info
  "
  list or watch objects of kind ClusterRole"
  ([] (list-rbac-authorization-v1beta1-cluster-role-with-http-info nil))
  ([{:keys [pretty continue field-selector include-uninitialized label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/clusterroles" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn list-rbac-authorization-v1beta1-cluster-role
  "
  list or watch objects of kind ClusterRole"
  ([] (list-rbac-authorization-v1beta1-cluster-role nil))
  ([optional-params]
   (:data (list-rbac-authorization-v1beta1-cluster-role-with-http-info optional-params))))

(defn list-rbac-authorization-v1beta1-cluster-role-binding-with-http-info
  "
  list or watch objects of kind ClusterRoleBinding"
  ([] (list-rbac-authorization-v1beta1-cluster-role-binding-with-http-info nil))
  ([{:keys [pretty continue field-selector include-uninitialized label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn list-rbac-authorization-v1beta1-cluster-role-binding
  "
  list or watch objects of kind ClusterRoleBinding"
  ([] (list-rbac-authorization-v1beta1-cluster-role-binding nil))
  ([optional-params]
   (:data (list-rbac-authorization-v1beta1-cluster-role-binding-with-http-info optional-params))))

(defn list-rbac-authorization-v1beta1-namespaced-role-with-http-info
  "
  list or watch objects of kind Role"
  ([namespace ] (list-rbac-authorization-v1beta1-namespaced-role-with-http-info namespace nil))
  ([namespace {:keys [pretty continue field-selector include-uninitialized label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn list-rbac-authorization-v1beta1-namespaced-role
  "
  list or watch objects of kind Role"
  ([namespace ] (list-rbac-authorization-v1beta1-namespaced-role namespace nil))
  ([namespace optional-params]
   (:data (list-rbac-authorization-v1beta1-namespaced-role-with-http-info namespace optional-params))))

(defn list-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info
  "
  list or watch objects of kind RoleBinding"
  ([namespace ] (list-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info namespace nil))
  ([namespace {:keys [pretty continue field-selector include-uninitialized label-selector limit resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn list-rbac-authorization-v1beta1-namespaced-role-binding
  "
  list or watch objects of kind RoleBinding"
  ([namespace ] (list-rbac-authorization-v1beta1-namespaced-role-binding namespace nil))
  ([namespace optional-params]
   (:data (list-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info namespace optional-params))))

(defn list-rbac-authorization-v1beta1-role-binding-for-all-namespaces-with-http-info
  "
  list or watch objects of kind RoleBinding"
  ([] (list-rbac-authorization-v1beta1-role-binding-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/rolebindings" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn list-rbac-authorization-v1beta1-role-binding-for-all-namespaces
  "
  list or watch objects of kind RoleBinding"
  ([] (list-rbac-authorization-v1beta1-role-binding-for-all-namespaces nil))
  ([optional-params]
   (:data (list-rbac-authorization-v1beta1-role-binding-for-all-namespaces-with-http-info optional-params))))

(defn list-rbac-authorization-v1beta1-role-for-all-namespaces-with-http-info
  "
  list or watch objects of kind Role"
  ([] (list-rbac-authorization-v1beta1-role-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/roles" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn list-rbac-authorization-v1beta1-role-for-all-namespaces
  "
  list or watch objects of kind Role"
  ([] (list-rbac-authorization-v1beta1-role-for-all-namespaces nil))
  ([optional-params]
   (:data (list-rbac-authorization-v1beta1-role-for-all-namespaces-with-http-info optional-params))))

(defn patch-rbac-authorization-v1beta1-cluster-role-with-http-info
  "
  partially update the specified ClusterRole"
  ([name body ] (patch-rbac-authorization-v1beta1-cluster-role-with-http-info name body nil))
  ([name body {:keys [pretty ]}]
   (check-required-params name body)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/clusterroles/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn patch-rbac-authorization-v1beta1-cluster-role
  "
  partially update the specified ClusterRole"
  ([name body ] (patch-rbac-authorization-v1beta1-cluster-role name body nil))
  ([name body optional-params]
   (:data (patch-rbac-authorization-v1beta1-cluster-role-with-http-info name body optional-params))))

(defn patch-rbac-authorization-v1beta1-cluster-role-binding-with-http-info
  "
  partially update the specified ClusterRoleBinding"
  ([name body ] (patch-rbac-authorization-v1beta1-cluster-role-binding-with-http-info name body nil))
  ([name body {:keys [pretty ]}]
   (check-required-params name body)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn patch-rbac-authorization-v1beta1-cluster-role-binding
  "
  partially update the specified ClusterRoleBinding"
  ([name body ] (patch-rbac-authorization-v1beta1-cluster-role-binding name body nil))
  ([name body optional-params]
   (:data (patch-rbac-authorization-v1beta1-cluster-role-binding-with-http-info name body optional-params))))

(defn patch-rbac-authorization-v1beta1-namespaced-role-with-http-info
  "
  partially update the specified Role"
  ([name namespace body ] (patch-rbac-authorization-v1beta1-namespaced-role-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty ]}]
   (check-required-params name namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn patch-rbac-authorization-v1beta1-namespaced-role
  "
  partially update the specified Role"
  ([name namespace body ] (patch-rbac-authorization-v1beta1-namespaced-role name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-rbac-authorization-v1beta1-namespaced-role-with-http-info name namespace body optional-params))))

(defn patch-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info
  "
  partially update the specified RoleBinding"
  ([name namespace body ] (patch-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty ]}]
   (check-required-params name namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings/{name}" :patch
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn patch-rbac-authorization-v1beta1-namespaced-role-binding
  "
  partially update the specified RoleBinding"
  ([name namespace body ] (patch-rbac-authorization-v1beta1-namespaced-role-binding name namespace body nil))
  ([name namespace body optional-params]
   (:data (patch-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info name namespace body optional-params))))

(defn read-rbac-authorization-v1beta1-cluster-role-with-http-info
  "
  read the specified ClusterRole"
  ([name ] (read-rbac-authorization-v1beta1-cluster-role-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (check-required-params name)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/clusterroles/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn read-rbac-authorization-v1beta1-cluster-role
  "
  read the specified ClusterRole"
  ([name ] (read-rbac-authorization-v1beta1-cluster-role name nil))
  ([name optional-params]
   (:data (read-rbac-authorization-v1beta1-cluster-role-with-http-info name optional-params))))

(defn read-rbac-authorization-v1beta1-cluster-role-binding-with-http-info
  "
  read the specified ClusterRoleBinding"
  ([name ] (read-rbac-authorization-v1beta1-cluster-role-binding-with-http-info name nil))
  ([name {:keys [pretty ]}]
   (check-required-params name)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn read-rbac-authorization-v1beta1-cluster-role-binding
  "
  read the specified ClusterRoleBinding"
  ([name ] (read-rbac-authorization-v1beta1-cluster-role-binding name nil))
  ([name optional-params]
   (:data (read-rbac-authorization-v1beta1-cluster-role-binding-with-http-info name optional-params))))

(defn read-rbac-authorization-v1beta1-namespaced-role-with-http-info
  "
  read the specified Role"
  ([name namespace ] (read-rbac-authorization-v1beta1-namespaced-role-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn read-rbac-authorization-v1beta1-namespaced-role
  "
  read the specified Role"
  ([name namespace ] (read-rbac-authorization-v1beta1-namespaced-role name namespace nil))
  ([name namespace optional-params]
   (:data (read-rbac-authorization-v1beta1-namespaced-role-with-http-info name namespace optional-params))))

(defn read-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info
  "
  read the specified RoleBinding"
  ([name namespace ] (read-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info name namespace nil))
  ([name namespace {:keys [pretty ]}]
   (check-required-params name namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn read-rbac-authorization-v1beta1-namespaced-role-binding
  "
  read the specified RoleBinding"
  ([name namespace ] (read-rbac-authorization-v1beta1-namespaced-role-binding name namespace nil))
  ([name namespace optional-params]
   (:data (read-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info name namespace optional-params))))

(defn replace-rbac-authorization-v1beta1-cluster-role-with-http-info
  "
  replace the specified ClusterRole"
  ([name body ] (replace-rbac-authorization-v1beta1-cluster-role-with-http-info name body nil))
  ([name body {:keys [pretty ]}]
   (check-required-params name body)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/clusterroles/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn replace-rbac-authorization-v1beta1-cluster-role
  "
  replace the specified ClusterRole"
  ([name body ] (replace-rbac-authorization-v1beta1-cluster-role name body nil))
  ([name body optional-params]
   (:data (replace-rbac-authorization-v1beta1-cluster-role-with-http-info name body optional-params))))

(defn replace-rbac-authorization-v1beta1-cluster-role-binding-with-http-info
  "
  replace the specified ClusterRoleBinding"
  ([name body ] (replace-rbac-authorization-v1beta1-cluster-role-binding-with-http-info name body nil))
  ([name body {:keys [pretty ]}]
   (check-required-params name body)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/clusterrolebindings/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn replace-rbac-authorization-v1beta1-cluster-role-binding
  "
  replace the specified ClusterRoleBinding"
  ([name body ] (replace-rbac-authorization-v1beta1-cluster-role-binding name body nil))
  ([name body optional-params]
   (:data (replace-rbac-authorization-v1beta1-cluster-role-binding-with-http-info name body optional-params))))

(defn replace-rbac-authorization-v1beta1-namespaced-role-with-http-info
  "
  replace the specified Role"
  ([name namespace body ] (replace-rbac-authorization-v1beta1-namespaced-role-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty ]}]
   (check-required-params name namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/roles/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn replace-rbac-authorization-v1beta1-namespaced-role
  "
  replace the specified Role"
  ([name namespace body ] (replace-rbac-authorization-v1beta1-namespaced-role name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-rbac-authorization-v1beta1-namespaced-role-with-http-info name namespace body optional-params))))

(defn replace-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info
  "
  replace the specified RoleBinding"
  ([name namespace body ] (replace-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info name namespace body nil))
  ([name namespace body {:keys [pretty ]}]
   (check-required-params name namespace body)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/namespaces/{namespace}/rolebindings/{name}" :put
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn replace-rbac-authorization-v1beta1-namespaced-role-binding
  "
  replace the specified RoleBinding"
  ([name namespace body ] (replace-rbac-authorization-v1beta1-namespaced-role-binding name namespace body nil))
  ([name namespace body optional-params]
   (:data (replace-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info name namespace body optional-params))))

(defn watch-rbac-authorization-v1beta1-cluster-role-with-http-info
  "
  watch changes to an object of kind ClusterRole"
  ([name ] (watch-rbac-authorization-v1beta1-cluster-role-with-http-info name nil))
  ([name {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/watch/clusterroles/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-rbac-authorization-v1beta1-cluster-role
  "
  watch changes to an object of kind ClusterRole"
  ([name ] (watch-rbac-authorization-v1beta1-cluster-role name nil))
  ([name optional-params]
   (:data (watch-rbac-authorization-v1beta1-cluster-role-with-http-info name optional-params))))

(defn watch-rbac-authorization-v1beta1-cluster-role-binding-with-http-info
  "
  watch changes to an object of kind ClusterRoleBinding"
  ([name ] (watch-rbac-authorization-v1beta1-cluster-role-binding-with-http-info name nil))
  ([name {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/watch/clusterrolebindings/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-rbac-authorization-v1beta1-cluster-role-binding
  "
  watch changes to an object of kind ClusterRoleBinding"
  ([name ] (watch-rbac-authorization-v1beta1-cluster-role-binding name nil))
  ([name optional-params]
   (:data (watch-rbac-authorization-v1beta1-cluster-role-binding-with-http-info name optional-params))))

(defn watch-rbac-authorization-v1beta1-cluster-role-binding-list-with-http-info
  "
  watch individual changes to a list of ClusterRoleBinding"
  ([] (watch-rbac-authorization-v1beta1-cluster-role-binding-list-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/watch/clusterrolebindings" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-rbac-authorization-v1beta1-cluster-role-binding-list
  "
  watch individual changes to a list of ClusterRoleBinding"
  ([] (watch-rbac-authorization-v1beta1-cluster-role-binding-list nil))
  ([optional-params]
   (:data (watch-rbac-authorization-v1beta1-cluster-role-binding-list-with-http-info optional-params))))

(defn watch-rbac-authorization-v1beta1-cluster-role-list-with-http-info
  "
  watch individual changes to a list of ClusterRole"
  ([] (watch-rbac-authorization-v1beta1-cluster-role-list-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/watch/clusterroles" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-rbac-authorization-v1beta1-cluster-role-list
  "
  watch individual changes to a list of ClusterRole"
  ([] (watch-rbac-authorization-v1beta1-cluster-role-list nil))
  ([optional-params]
   (:data (watch-rbac-authorization-v1beta1-cluster-role-list-with-http-info optional-params))))

(defn watch-rbac-authorization-v1beta1-namespaced-role-with-http-info
  "
  watch changes to an object of kind Role"
  ([name namespace ] (watch-rbac-authorization-v1beta1-namespaced-role-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/watch/namespaces/{namespace}/roles/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-rbac-authorization-v1beta1-namespaced-role
  "
  watch changes to an object of kind Role"
  ([name namespace ] (watch-rbac-authorization-v1beta1-namespaced-role name namespace nil))
  ([name namespace optional-params]
   (:data (watch-rbac-authorization-v1beta1-namespaced-role-with-http-info name namespace optional-params))))

(defn watch-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info
  "
  watch changes to an object of kind RoleBinding"
  ([name namespace ] (watch-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info name namespace nil))
  ([name namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/watch/namespaces/{namespace}/rolebindings/{name}" :get
             {:path-params   {"name" name "namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-rbac-authorization-v1beta1-namespaced-role-binding
  "
  watch changes to an object of kind RoleBinding"
  ([name namespace ] (watch-rbac-authorization-v1beta1-namespaced-role-binding name namespace nil))
  ([name namespace optional-params]
   (:data (watch-rbac-authorization-v1beta1-namespaced-role-binding-with-http-info name namespace optional-params))))

(defn watch-rbac-authorization-v1beta1-namespaced-role-binding-list-with-http-info
  "
  watch individual changes to a list of RoleBinding"
  ([namespace ] (watch-rbac-authorization-v1beta1-namespaced-role-binding-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/watch/namespaces/{namespace}/rolebindings" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-rbac-authorization-v1beta1-namespaced-role-binding-list
  "
  watch individual changes to a list of RoleBinding"
  ([namespace ] (watch-rbac-authorization-v1beta1-namespaced-role-binding-list namespace nil))
  ([namespace optional-params]
   (:data (watch-rbac-authorization-v1beta1-namespaced-role-binding-list-with-http-info namespace optional-params))))

(defn watch-rbac-authorization-v1beta1-namespaced-role-list-with-http-info
  "
  watch individual changes to a list of Role"
  ([namespace ] (watch-rbac-authorization-v1beta1-namespaced-role-list-with-http-info namespace nil))
  ([namespace {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params namespace)
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/watch/namespaces/{namespace}/roles" :get
             {:path-params   {"namespace" namespace }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-rbac-authorization-v1beta1-namespaced-role-list
  "
  watch individual changes to a list of Role"
  ([namespace ] (watch-rbac-authorization-v1beta1-namespaced-role-list namespace nil))
  ([namespace optional-params]
   (:data (watch-rbac-authorization-v1beta1-namespaced-role-list-with-http-info namespace optional-params))))

(defn watch-rbac-authorization-v1beta1-role-binding-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of RoleBinding"
  ([] (watch-rbac-authorization-v1beta1-role-binding-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/watch/rolebindings" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-rbac-authorization-v1beta1-role-binding-list-for-all-namespaces
  "
  watch individual changes to a list of RoleBinding"
  ([] (watch-rbac-authorization-v1beta1-role-binding-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-rbac-authorization-v1beta1-role-binding-list-for-all-namespaces-with-http-info optional-params))))

(defn watch-rbac-authorization-v1beta1-role-list-for-all-namespaces-with-http-info
  "
  watch individual changes to a list of Role"
  ([] (watch-rbac-authorization-v1beta1-role-list-for-all-namespaces-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/rbac.authorization.k8s.io/v1beta1/watch/roles" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-rbac-authorization-v1beta1-role-list-for-all-namespaces
  "
  watch individual changes to a list of Role"
  ([] (watch-rbac-authorization-v1beta1-role-list-for-all-namespaces nil))
  ([optional-params]
   (:data (watch-rbac-authorization-v1beta1-role-list-for-all-namespaces-with-http-info optional-params))))

