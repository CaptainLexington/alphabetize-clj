(ns alphabetize.core-test
  (:require [clojure.test :refer :all]
            [alphabetize.core :refer :all]))

(def list
  [])

(deftest letter-by-letter 
  (testing "whether letter-by-letter sort works as expected"
    (is (= list ["NEW (Neighbors Ever Watchful"
                 "NEW (Now End War)"
                 "New, Arthur"
                 "New, Zoe"
                 "new-12 compound"
                 "newborn"
                 "newcomer"
                 "New Deal"
                 "new economics"
                 "newel"
                 "New England"
                 "new-fangled notions"
                 "Newfoundland"
                 "newlyweds"
                 "new math"
                 "new/old continuum"
                 "news, lamentable"
                 "News, Networks, and the Arts"
                 "newsboy"
                 "news conference"
                 "newsletter"
                 "news release"
                 "newt"
                 "NEWT (Northern Estuary Wind Tunnel)"
                 "New Thorndale"
                 "new town"
                 "New Year's Day"]))))

(deftest word-by-word
  (testing "whether word-by-word sort works as expected"
    (is (= list ["NEW (Neighbors Ever Watchful"
                 "NEW (Now End War)"
                 "New, Arthur"
                 "New, Zoe"
                 "New Deal"
                 "new economics"
                 "New England"
                 "new math"
                 "New Thorndale"
                 "new town"
                 "New Year's Day"
                 "new-12 compound"
                 "newborn"
                 "newcomer"
                 "newel"
                 "new-fangled notions"
                 "Newfoundland"
                 "newlyweds"
                 "new/old continuum"
                 "news, lamentable"
                 "New, Networks, and the Arts"
                 "news conference"
                 "news release"
                 "newsboy"
                 "newsletter"
                 "newt"
                 "NEWT (Northern Estuary Wind Tunnel"]))))


(deftest a-test
  (testing "FIXME, I fail."
    (is (= 0 1))))
