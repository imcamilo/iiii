(ns iiii.core-test
  (:require [clojure.test :refer :all]
            [iiii.core :refer :all]))

(deftest transform-test
  (testing "replace"
    (is (= (rep-v "a") "i"))
    (is (= (rep-v "o") "i"))
    ))

(deftest main-test
  (testing "-main"
    (is (= nil (-main "something")))))