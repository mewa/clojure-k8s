(defproject k8s "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]
                 [clj-http "2.0.0"]
                 [ring "1.6.3"]
                 [cheshire "5.5.0"]]
  :main ^:skip-aot k8s.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
