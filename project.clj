(defproject one-route "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.7.0"]
                 [ring "1.4.0"]
                 [ring-server "0.4.0" :exclusions [[org.clojure/clojure]
                                                   [ring]]]
                 [ring/ring-json "0.4.0"]
                 [compojure "1.4.0" :exclusions [[org.clojure/clojure] [ring/ring-core]]]]
  :local-repo "lib")
