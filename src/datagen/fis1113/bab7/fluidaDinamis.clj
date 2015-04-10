;;Debit fluida
(spit "data/fis1113/bab7/C2A2FGAB-0.txt"
(vec
(for [r (range 10 50 2) v (range 1 20)]
        (let [Q (* 3.14 r r v 0.0001)]
                [r
                 v
                 (nd Q 2)]))))
(spit "data/fis1113/bab7/C2A2FGAB-1.txt"
(vec
(for [A (range 10 15) v (range 5 15) t (range 20 60 10)]
        (let [V (* A v t 0.01) ]
                [A
                 v
                 t
                 (nd V 2)]))))
;;Fluid Dynamics
;;Continuity
(spit "data/fis1113/bab7/C2A2FGAC-0.txt"
(vec
(for [r1 [1.0 1.1 1.2 1.3 1.4 1.5] r2 [0.05 0.1] n [10 20 30 40] v1 (range 1 5)]
        (let [v2 (/ (* r1 r1 v1) (* n r2 r2))]
                [r1
                 r2
                 n
                 v1
                 (nd v2 2)]))))
;;Fluid Dynamics
;;Continuity
(spit "data/fis1113/bab7/C2A2FGAC-1.txt"
(vec
(filter #(not (= (first %) (second %)))
(for [d1 [10 11 12 13 14 15 16] d2 [10 11 12 13 14 15 16]]
        (let [p (/ (* d2 d2) (* d1 d1))]
                [d1
                 d2
                 p])))))
;;Bernoulli Law
;;Venturimeter 1
(spit "data/fis1113/bab7/C2A2FGAD-0.txt"
(vec
(take 100
(filter #(= (* (first %) (first %)) (+ (* (second %) (second %)) (* 2 100 (nth % 2))))
(for [v2 (range 1 101) v1 (range 1 v2) h (range 1 500)][v2 v1 h (/ v2 v1)])))))
;;Bernoulli Law
;;Venturimeter 2
(spit "data/fis1113/bab7/C2A2FGAD-1.txt"
(vec
(take 100
(filter #(= (* (first %) (first %)) (+ (* (second %) (second %)) (* 2 10 136 (nth % 2))))
(for [v2 (range 1 101) v1 (range 1 v2) h (range 1 500)][v2 v1 h (/ v2 v1)])))))

;;Bernoulli Law
;;Pitot Tube
(spit "data/fis1113/bab7/C2A2FGAF-0.txt"
(vec
(for [h (range 5 110)]
        (let [v (Math/sqrt (* 2 13600 10 h 0.001 1/12 10))]
                [h (nd v 2)]))))


;;Gaya Angkat Pesawat
(spit "data/fis1113/bab7/C2A2FGAF-1.txt"
(vec
(for [dP (range 300 400 2) A (range 50 100 10)]
        (let [F (* dP A 1/1000)]
                [dP A (nd F 2)]))))

;;Teorema Torriceli
(spit "data/fis1113/bab7/C2A2FGAG-0.txt"
(vec
(take 100
(filter #(> (- (first %) (second %)) 20)
(filter #(= (* (last %) (last %)) (* 2000 (- (first %) (second %))))
(for [h1 (range 50 500) h2 (range 1 500) v (range 1 500)]
      [h1 h2 v]))))))
(spit "data/fis1113/bab7/C2A2FGAG-1.txt"
(vec
(take 100
(filter #(> (- (first %) (second %)) 20)
(filter #(= (* (last %) (last %)) (* 4 (second %) (- (first %) (second %))))
(for [h1 (range 50 500) h2 (range 1 500) x (range 1 500)]
      [h1 h2 x]))))))

(defn pang [x y]
  (reduce * (repeat y x)))

(defn nd [ang numd]
  (/ (Math/round (* ang (Math/pow 10 numd))) (Math/pow 10 numd)))
