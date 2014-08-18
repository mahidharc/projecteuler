(ns projecteuler.core
  (:gen-class))

(defn -main
  "I don't do a whole lot ... yet."
  [& args]
  (println "Hello, World!"))

;Problem 1
(apply + (set (concat (range 0 1000 3) (range 0 1000 5))))

;Problem 2
(def fib-seq
     (lazy-cat [1 2] (map + (rest fib-seq) fib-seq)))

(apply + (filter even? (take 32 fib-seq)))

;Problem 3
