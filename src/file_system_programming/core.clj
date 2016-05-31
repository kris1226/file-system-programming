(ns file-system-programming.core
(use clojure.java.io)
  (:gen-class))
(import 'java.io.File)

(def db (atom {:magician-name "Kristopher"}))

(def save-agent (agent nil))

(defn save-data-2 []
  (send-off save-agent
    (fn [_]
      (spit "somefile.tmp" (prn-str @db))
      (.renameTo (File. "somefile.tmp") (File. "somefile")))))

(defn save-data []
  (spit "somefile.txt" (prn-str @db)))

(defn load-data []
  (reset! db (read-string (slurp "somefile"))))


(defn read-file [path]
  (with-open [rdr (reader path)]
    (doseq [line (line-seq rdr)]
      (println line))))

