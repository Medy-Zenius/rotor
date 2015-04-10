(ns rotor.soal.C1X1A
  (:require [compojure.core :refer :all]
            [rotor.models.genfunc :as fnc]
            ))

(def my-ns "rotor.soal.C1X1A")

;;;; Matematika kelas 10 KTSP
;;;; Akar Pangkat dan Logaritma

;;;; Akar
(defn d-C1X1ABAA-0 []
  (spit "data/mat10ktsp/C1X1ABAA-0.txt"
        (conj (vec (for [a (range 1 6) b (range 1 9)] [a b (Math/round (Math/pow a b)) (fnc/jawaban)])) 5)))
(defn C1X1ABAA-0 []
  (let [data (read-string (slurp "data/mat10ktsp/C1X1ABAA-0.txt"))
        datum (nth data (rand-int (dec (count data))))
        a (nth datum 0)
        b (nth datum 1)
        angka (nth datum 2)
        jwb (nth datum 3)
        bobot (last data)
       ]
        {:soal (str "$" a "^{" b "}$")
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         :score bobot
         }))
(defn C1X1ABAA []
  "Konsep"
  (C1X1ABAA-0))
  ;(let [x (rand-int 3)] ((resolve (symbol my-ns (str "C1X1FDAI-" x))))))

(defn d-C1X1ABAD-0 []
  (spit "data/mat10ktsp/C1X1ABAD-0.txt"
        (conj (vec (for [a (range 1 7) b (range 1 5) c (range 1 5)]
                        [a b c (Math/round (Math/pow a (+ b c))) (fnc/jawaban)])) 10)))
(defn C1X1ABAD-0 []
  (let [data (read-string (slurp "data/mat10ktsp/C1X1ABAD-0.txt"))
        datum (nth data (rand-int (dec (count data))))
        a (nth datum 0)
        b (nth datum 1)
        c (nth datum 2)
        angka (nth datum 3)
        jwb (nth datum 4)
        bobot (last data)
       ]
        {:soal (str "$" a "^{" b "}\\times" a "^{" c "}$")
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         :score bobot
         }))
(defn d-C1X1ABAD-1 []
  (spit "data/mat10ktsp/C1X1ABAD-1.txt"
        (conj (vec (for [a (range 1 7) b (range 1 7) c (range 1 b)]
                        [a b c (Math/round (Math/pow a (- b c))) (fnc/jawaban)])) 10)))
(defn C1X1ABAD-1 []
  (let [data (read-string (slurp "data/mat10ktsp/C1X1ABAD-1.txt"))
        datum (nth data (rand-int (dec (count data))))
        a (nth datum 0)
        b (nth datum 1)
        c (nth datum 2)
        angka (nth datum 3)
        jwb (nth datum 4)
        bobot (last data)
       ]
        {:soal (str "$" a "^{" b "}\\over" a "^{" c "}$")
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         :score bobot
         }))
(defn C1X1ABAD []
  "Aturan Pangkat Perkalian dan Pembagian"
  ;(C1X1ABAD-1))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C1X1ABAD-" x))))))


(defn d-C1X1ABAF-0 []
  (spit "data/mat10ktsp/C1X1ABAF-0.txt"
        (conj (vec (for [a (range 1 8) b (range 0 5)]
                        [a b (/ 1 (fnc/pangkat a b)) (fnc/jawaban)])) 10)))
  (defn C1X1ABAF-0 []
  (let [data (read-string (slurp "data/mat10ktsp/C1X1ABAF-0.txt"))
        datum (nth data (rand-int (dec (count data))))
        a (nth datum 0)
        b (nth datum 1)
        angka (nth datum 2)
        jwb (nth datum 3)
        bobot (last data)
       ]
        {:soal (str "$" a "^{" (if (> b 0) "-") b "}$")
         :pilihan (fnc/create-option1b angka jwb)
         :jawaban jwb
         :score bobot
         }))
(defn C1X1ABAF []
  "Aturan Pangkat Nol dan Negatif"
  (C1X1ABAF-0))
  ;(let [x (rand-int 3)] ((resolve (symbol my-ns (str "C1X1FDAI-" x))))))


(defn d-C1X1ABAG-0 []
  (spit "data/mat10ktsp/C1X1ABAG-0.txt"
        (conj (vec (for [a (range 1 8) b (range 0 5) c (range 0 5)]
                        [a b c (fnc/pangkat (fnc/pangkat a b) c) (fnc/jawaban)])) 10)))
  (defn C1X1ABAG-0 []
  (let [data (read-string (slurp "data/mat10ktsp/C1X1ABAG-0.txt"))
        datum (nth data (rand-int (dec (count data))))
        a (nth datum 0)
        b (nth datum 1)
        c (nth datum 2)
        angka (nth datum 3)
        jwb (nth datum 4)
        bobot (last data)
       ]
        {:soal (str "$(" a "^{"  b "})^" c "$")
         :pilihan (fnc/create-option1b angka jwb)
         :jawaban jwb
         :score bobot
         }))
(defn d-C1X1ABAG-1 []

  (spit "data/mat10ktsp/C1X1ABAG-1.txt"
        (conj (vec (for [a (range 1 8) b (range 0 5) c (range 0 5)]
                        [a b c (fnc/pangkat (fnc/pangkat a b) c) (fnc/jawaban)])) 10)))
  (defn C1X1ABAG-1 []
  (let [data (read-string (slurp "data/mat10ktsp/C1X1ABAG-1.txt"))
        datum (nth data (rand-int (dec (count data))))
        a (nth datum 0)
        b (nth datum 1)
        c (nth datum 2)
        angka (nth datum 3)
        jwb (nth datum 4)
        bobot (last data)
       ]
        {:soal (str "$(" a "^{"  b "})^" c "$")
         ;$\sqrt[p]{a}$ vs.\ $\sqrt[\leftroot{-3}\uproot{3}p]{a}$
         ;$\sqrt[p]{\tfrac{1}{n}}$ vs.\ $\sqrt[\leftroot{-3}\uproot{3}p]{\tfrac{1}{n}}$
         :pilihan (fnc/create-option1b angka jwb)
         :jawaban jwb
         :score bobot
         }))
(defn C1X1ABAG []
  "Aturan Pangkat Nol dan Negatif"
  (C1X1ABAG-1))
