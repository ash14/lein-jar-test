(defproject lein-jar-test "0.1.0-SNAPSHOT"
  :description "FIXME: write description"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :dependencies [[org.clojure/clojure "1.8.0"]

                 [org.clojure/clojurescript "1.10.238"]
                 ;[org.clojure/clojurescript "1.9.946"]

                 [com.taoensso/timbre "4.10.0"]]
  :main lein-jar-test.core
  :jar-name "lein-jar-test.jar"
  :aot :all)
