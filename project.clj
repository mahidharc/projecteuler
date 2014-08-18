(defproject projecteuler "0.1.0-SNAPSHOT"
  :description "Project Euler Clojure"
  :url "http://github.com/mahidharc/projecteuler"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.6.0"]]
  :main ^:skip-aot projecteuler.core
  :target-path "target/%s"
  :profiles {:uberjar {:aot :all}})
