(ns kubernetes.api.certificates-v-beta-
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn create-certificates-v1beta1-certificate-signing-request-with-http-info
  "
  create a CertificateSigningRequest"
  ([body ] (create-certificates-v1beta1-certificate-signing-request-with-http-info body nil))
  ([body {:keys [pretty ]}]
   (check-required-params body)
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests" :post
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn create-certificates-v1beta1-certificate-signing-request
  "
  create a CertificateSigningRequest"
  ([body ] (create-certificates-v1beta1-certificate-signing-request body nil))
  ([body optional-params]
   (:data (create-certificates-v1beta1-certificate-signing-request-with-http-info body optional-params))))

(defn delete-certificates-v1beta1-certificate-signing-request-with-http-info
  "
  delete a CertificateSigningRequest"
  ([name body ] (delete-certificates-v1beta1-certificate-signing-request-with-http-info name body nil))
  ([name body {:keys [pretty grace-period-seconds orphan-dependents propagation-policy ]}]
   (check-required-params name body)
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}" :delete
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "gracePeriodSeconds" grace-period-seconds "orphanDependents" orphan-dependents "propagationPolicy" propagation-policy }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn delete-certificates-v1beta1-certificate-signing-request
  "
  delete a CertificateSigningRequest"
  ([name body ] (delete-certificates-v1beta1-certificate-signing-request name body nil))
  ([name body optional-params]
   (:data (delete-certificates-v1beta1-certificate-signing-request-with-http-info name body optional-params))))

(defn delete-certificates-v1beta1-collection-certificate-signing-request-with-http-info
  "
  delete collection of CertificateSigningRequest"
  ([] (delete-certificates-v1beta1-collection-certificate-signing-request-with-http-info nil))
  ([{:keys [pretty continue field-selector include-uninitialized label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests" :delete
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn delete-certificates-v1beta1-collection-certificate-signing-request
  "
  delete collection of CertificateSigningRequest"
  ([] (delete-certificates-v1beta1-collection-certificate-signing-request nil))
  ([optional-params]
   (:data (delete-certificates-v1beta1-collection-certificate-signing-request-with-http-info optional-params))))

(defn get-certificates-v1beta1-api-resources-with-http-info
  "
  get available resources"
  []
  (call-api "/apis/certificates.k8s.io/v1beta1/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken" "HTTPBasic"]}))

(defn get-certificates-v1beta1-api-resources
  "
  get available resources"
  []
  (:data (get-certificates-v1beta1-api-resources-with-http-info)))

(defn list-certificates-v1beta1-certificate-signing-request-with-http-info
  "
  list or watch objects of kind CertificateSigningRequest"
  ([] (list-certificates-v1beta1-certificate-signing-request-with-http-info nil))
  ([{:keys [pretty continue field-selector include-uninitialized label-selector limit resource-version timeout-seconds watch ]}]
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"pretty" pretty "continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn list-certificates-v1beta1-certificate-signing-request
  "
  list or watch objects of kind CertificateSigningRequest"
  ([] (list-certificates-v1beta1-certificate-signing-request nil))
  ([optional-params]
   (:data (list-certificates-v1beta1-certificate-signing-request-with-http-info optional-params))))

(defn patch-certificates-v1beta1-certificate-signing-request-with-http-info
  "
  partially update the specified CertificateSigningRequest"
  ([name body ] (patch-certificates-v1beta1-certificate-signing-request-with-http-info name body nil))
  ([name body {:keys [pretty ]}]
   (check-required-params name body)
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}" :patch
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["application/json-patch+json" "application/merge-patch+json" "application/strategic-merge-patch+json"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn patch-certificates-v1beta1-certificate-signing-request
  "
  partially update the specified CertificateSigningRequest"
  ([name body ] (patch-certificates-v1beta1-certificate-signing-request name body nil))
  ([name body optional-params]
   (:data (patch-certificates-v1beta1-certificate-signing-request-with-http-info name body optional-params))))

(defn read-certificates-v1beta1-certificate-signing-request-with-http-info
  "
  read the specified CertificateSigningRequest"
  ([name ] (read-certificates-v1beta1-certificate-signing-request-with-http-info name nil))
  ([name {:keys [pretty exact export ]}]
   (check-required-params name)
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty "exact" exact "export" export }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn read-certificates-v1beta1-certificate-signing-request
  "
  read the specified CertificateSigningRequest"
  ([name ] (read-certificates-v1beta1-certificate-signing-request name nil))
  ([name optional-params]
   (:data (read-certificates-v1beta1-certificate-signing-request-with-http-info name optional-params))))

(defn replace-certificates-v1beta1-certificate-signing-request-with-http-info
  "
  replace the specified CertificateSigningRequest"
  ([name body ] (replace-certificates-v1beta1-certificate-signing-request-with-http-info name body nil))
  ([name body {:keys [pretty ]}]
   (check-required-params name body)
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn replace-certificates-v1beta1-certificate-signing-request
  "
  replace the specified CertificateSigningRequest"
  ([name body ] (replace-certificates-v1beta1-certificate-signing-request name body nil))
  ([name body optional-params]
   (:data (replace-certificates-v1beta1-certificate-signing-request-with-http-info name body optional-params))))

(defn replace-certificates-v1beta1-certificate-signing-request-approval-with-http-info
  "
  replace approval of the specified CertificateSigningRequest"
  ([name body ] (replace-certificates-v1beta1-certificate-signing-request-approval-with-http-info name body nil))
  ([name body {:keys [pretty ]}]
   (check-required-params name body)
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}/approval" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn replace-certificates-v1beta1-certificate-signing-request-approval
  "
  replace approval of the specified CertificateSigningRequest"
  ([name body ] (replace-certificates-v1beta1-certificate-signing-request-approval name body nil))
  ([name body optional-params]
   (:data (replace-certificates-v1beta1-certificate-signing-request-approval-with-http-info name body optional-params))))

(defn replace-certificates-v1beta1-certificate-signing-request-status-with-http-info
  "
  replace status of the specified CertificateSigningRequest"
  ([name body ] (replace-certificates-v1beta1-certificate-signing-request-status-with-http-info name body nil))
  ([name body {:keys [pretty ]}]
   (check-required-params name body)
   (call-api "/apis/certificates.k8s.io/v1beta1/certificatesigningrequests/{name}/status" :put
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"pretty" pretty }
              :form-params   {}
              :body-param    body
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn replace-certificates-v1beta1-certificate-signing-request-status
  "
  replace status of the specified CertificateSigningRequest"
  ([name body ] (replace-certificates-v1beta1-certificate-signing-request-status name body nil))
  ([name body optional-params]
   (:data (replace-certificates-v1beta1-certificate-signing-request-status-with-http-info name body optional-params))))

(defn watch-certificates-v1beta1-certificate-signing-request-with-http-info
  "
  watch changes to an object of kind CertificateSigningRequest"
  ([name ] (watch-certificates-v1beta1-certificate-signing-request-with-http-info name nil))
  ([name {:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (check-required-params name)
   (call-api "/apis/certificates.k8s.io/v1beta1/watch/certificatesigningrequests/{name}" :get
             {:path-params   {"name" name }
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-certificates-v1beta1-certificate-signing-request
  "
  watch changes to an object of kind CertificateSigningRequest"
  ([name ] (watch-certificates-v1beta1-certificate-signing-request name nil))
  ([name optional-params]
   (:data (watch-certificates-v1beta1-certificate-signing-request-with-http-info name optional-params))))

(defn watch-certificates-v1beta1-certificate-signing-request-list-with-http-info
  "
  watch individual changes to a list of CertificateSigningRequest"
  ([] (watch-certificates-v1beta1-certificate-signing-request-list-with-http-info nil))
  ([{:keys [continue field-selector include-uninitialized label-selector limit pretty resource-version timeout-seconds watch ]}]
   (call-api "/apis/certificates.k8s.io/v1beta1/watch/certificatesigningrequests" :get
             {:path-params   {}
              :header-params {}
              :query-params  {"continue" continue "fieldSelector" field-selector "includeUninitialized" include-uninitialized "labelSelector" label-selector "limit" limit "pretty" pretty "resourceVersion" resource-version "timeoutSeconds" timeout-seconds "watch" watch }
              :form-params   {}
              :content-types ["*/*"]
              :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf" "application/json;stream=watch" "application/vnd.kubernetes.protobuf;stream=watch"]
              :auth-names    ["BearerToken" "HTTPBasic"]})))

(defn watch-certificates-v1beta1-certificate-signing-request-list
  "
  watch individual changes to a list of CertificateSigningRequest"
  ([] (watch-certificates-v1beta1-certificate-signing-request-list nil))
  ([optional-params]
   (:data (watch-certificates-v1beta1-certificate-signing-request-list-with-http-info optional-params))))

