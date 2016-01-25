(ns java-example.core
  (import Foo)
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println (.bar (Foo.))))
