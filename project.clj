(defproject file-system-programming "0.1.0-SNAPSHOT"
  :description "FIXME: Read and write data to file system"
  :url "https://github.com/kris1226/file-system-programmin"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]]
  :main ^:skip-aot file-system-programming.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
