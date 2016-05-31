(ns file-system-programming.core
(use clojure.java.io)
  (:gen-class))
(import 'java.io.File)

(def db (atom {:key "value"}))

(defn save-data []
  (spit "somefile" (prn-str @db)))

(defn load-data []
  (reset! db (read-string (slurp "somefile"))))

(defn read-file [path]
  (with-open [rdr (reader path)]
    (doseq [line (line-seq rdr)]
      (println line))))

