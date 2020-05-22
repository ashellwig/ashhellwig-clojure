(defproject ashhellwig-clojure "0.1.0-SNAPSHOT"
  :description "Backend and GraphQL API server for Ash's personal website"
  "written with Clojure."
  :url "https://github.com/ashellwig/ashhellwig-clojure"
  :license {:name "EPL-2.0 OR GPL-2.0-or-later WITH Classpath-exception-2.0"
            :url "https://www.eclipse.org/legal/epl-2.0/"}
  :dependencies [[org.clojure/clojure "1.10.1"]]
  :main ^:skip-aot ashhellwig-clojure.core
  :target-path "target/%s"
  {:profiles {:uberjar {:aot :all}}
  ;; Formatting Settings
   :cljfmt {"indentation" true}})
