(ns iiii.core-test
  (:require [clojure.test :refer :all]
            [iiii.core :refer :all]))

(deftest worked
  (testing "work"
    (is (= "i i" (work "a a")))
    (is (= "ibi" (work "aba")))
    (is (= "simithing" (work "something")))
    (is (= "ibicdi" (work "abecde")))))

(deftest main-test
  (testing "-main"
    (is (= nil (-main "something")))))