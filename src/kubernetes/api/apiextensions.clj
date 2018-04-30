(ns kubernetes.api.apiextensions
  (:require [kubernetes.core :refer [call-api check-required-params with-collection-format]])
  (:import (java.io File)))

(defn get-apiextensions-api-group-with-http-info
  "
  get information of a group"
  []
  (call-api "/apis/apiextensions.k8s.io/" :get
            {:path-params   {}
             :header-params {}
             :query-params  {}
             :form-params   {}
             :content-types ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :accepts       ["application/json" "application/yaml" "application/vnd.kubernetes.protobuf"]
             :auth-names    ["BearerToken" "HTTPBasic"]}))

(defn get-apiextensions-api-group
  "
  get information of a group"
  []
  (:data (get-apiextensions-api-group-with-http-info)))

