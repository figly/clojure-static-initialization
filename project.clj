(defproject clojure-static-initialization "0.1.0-SNAPSHOT"
  :description "Demo of Clojure running static initialization code at compile time"
  :url "http://example.com/FIXME"
  :license {:name "Eclipse Public License"
            :url "http://www.eclipse.org/legal/epl-v10.html"}
  :source-paths ["src/clojure"]
  :java-source-paths ["src/java"]
  :aot [clojure-static-initialization.gen-class-demo
        clojure-static-initialization.proxy-demo
        ]
  :dependencies [[org.clojure/clojure "1.7.0"]])
