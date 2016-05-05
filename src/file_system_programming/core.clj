(ns file-system-programming.core
(use clojure.java.io)
  (:gen-class))

(defn read-file [path]
  (with-open [rdr (reader path)]
    (doseq [line (line-seq rdr)]
      (println line))))
