(ns iiii.core
  (:require [clojure.string :as str])
  (:gen-class))

(defn work [args] (str/replace (str/join "" args) #"a|e|i|o|u" "i"))

(defn -main [& args] (println work args))