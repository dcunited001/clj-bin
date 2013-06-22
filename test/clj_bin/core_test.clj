(ns clj-bin.core-test
  (:require [clojure.test :refer :all]
            [clj-bin.core :refer :all])

(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))

;;=============
;; serializer
;;=============

(deftest serializer-interest
  (testing "Serializer - ccnb - interest message"
    (is (= 
      (clj-bin.core/ser-intmsg 16r01d2f2faa55041524300fa9d000102000000) (
"<Interest>
  <Name>
    <Component ccnbencoding="text">PARC</Component>
    <Component ccnbencoding="base64Binary">AAEC</Component>
  </Name>
</Interest>")))))

;;=============
;; gloss
;;=============

;;=============
;; vertigo
;;=============

;; serializer
