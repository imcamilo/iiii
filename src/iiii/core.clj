(ns iiii.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn rep-v [args] (str/replace (str/join " " args) #"a|e|o|u" "i"))

(defn -main [& args] (println (rep-v args)))