(ns clojure-static-initialization.proxy-demo)

(defn make-proxy []
  (proxy [clojure_static_initialization.Demo] []))
