;;Momentum
(spit "data/fis1113/bab5/C2A2FEAB-0.txt"
(vec
(filter #(not (= (second %) 0))
(for [m (range 1 12) v (range -10 10)][m v (* m v)]))))

;;Momentum
(spit "data/fis1113/bab5/C2A2FEAB-1.txt"
(vec
(filter #(and (not (= (second %) 0)) (not (= (nth % 2) 0)))
(for [m (range 1 5) vo (range -5 5) a (range -2 3) t (range 1 8)][m vo a t (* m (+ vo (* a t)))]))))

;;Momentum
(spit "data/fis1113/bab5/C2A2FEAB-2.txt"
(vec
(for [m (range 1 10) vo (range 10 20) alf [60 53 37]]
        [m
         vo
         alf
         (nd (* m vo (cosd alf)) 1)])))

;;Momentum
(spit "data/fis1113/bab5/C2A2FEAB-3.txt"
(vec
(filter #(and (not (= (second %) 0)) (not (= (nth % 2) 0)))
(for [m (range 1 5) vo (range -5 5) a (range -2 3) t (range 1 8)]
        [m vo a t
         (- (* m (+ vo (* a t))) (* m vo))]))))

;;Momentum
(spit "data/fis1113/bab5/C2A2FEAB-4.txt"
(vec
(for [a (range 1 10) b (range (inc a) 10)]
        [(/ a b)
         (- (* -1 (/ a b)) 1)])))

;;Hukum Kekekalan Momentum
(spit "data/fis1113/bab5/C2A2FEAC-0.txt"
(vec
(for [a (range 1 10) b (range (inc a) 10)]
        (let [m1 (/ a b)
              m2 (- 1 m1)
              v2 (/ m1 m2)
              ]
                [m1 v2]))))

;;Hukum Kekekalan Momentum
(spit "data/fis1113/bab5/C2A2FEAC-1.txt"
(vec
(for [m (range 1 10) v (range 1 10)]
        (let [P1 (* 0.5 (Math/sqrt 2) m v)
              ]
                [m v (nd P1 2)]))))

;;Hukum Kekekalan Momentum
(spit "data/fis1113/bab5/C2A2FEAC-2.txt"
(vec
(take 200
(filter #(and (>= (nth % 6) 0) (<= (nth % 6) 1))
(filter #(and (not (= (nth % 4) 0)) (not (= (nth % 5) 0)))
(filter #(= (+ (* (nth % 0) (nth % 2)) (* (nth % 1) (nth % 3)))
            (+ (* (nth % 0) (nth % 4)) (* (nth % 1) (nth % 5))))
(for [m1 (range 1 4) m2 (range 1 4) v1 (range 1 10) v2 (range -10 -1) v11 (range -10 10) v21 (range -10 10)]
        (let [e (/ (- v21 v11) (- v1 v2))]
        [m1 m2 v1 v2 v11 v21 e]))))))))

;;Energi Kinetik
(spit "data/fis1113/bab5/C2A2FEAD-0.txt"
(vec
(take 200
(filter #(and (>= (nth % 6) 0) (<= (nth % 6) 1))
(filter #(and (not (= (nth % 4) 0)) (not (= (nth % 5) 0)))
(filter #(= (+ (* (nth % 0) (nth % 2)) (* (nth % 1) (nth % 3)))
            (+ (* (nth % 0) (nth % 4)) (* (nth % 1) (nth % 5))))
(for [m1 (range 1 4) m2 (range 1 4) v1 (range 1 10) v2 (range -10 -1) v11 (range -10 10) v21 (range -10 10)]
        (let [e (/ (- v21 v11) (- v1 v2))]
        [m1 m2 v1 v2 v11 v21 e (* 0.5 m2 v21 v21)]))))))))

;; Energi Kinetik
(spit "data/fis1113/bab5/C2A2FEAD-1.txt"
(vec
(take 200
(filter #(and (>= (nth % 6) 0) (<= (nth % 6) 1))
(filter #(and (not (= (nth % 4) 0)) (not (= (nth % 5) 0)))
(filter #(= (+ (* (nth % 0) (nth % 2)) (* (nth % 1) (nth % 3)))
            (+ (* (nth % 0) (nth % 4)) (* (nth % 1) (nth % 5))))
(for [m1 (range 1 4) m2 (range 1 4) v1 (range 1 10) v2 (range -10 -1) v11 (range -10 10) v21 (range -10 10)]
        (let [e (/ (- v21 v11) (- v1 v2))
              Ek (+ (* 0.5 m1 v1 v1) (* 0.5 m2 v2 v2))
              Ek1 (+ (* 0.5 m1 v11 v11) (* 0.5 m2 v21 v21))
              dEk (- Ek Ek1)
              ]
        [m1 m2 v1 v2 v11 v21 e dEk]))))))))

;;Koefisien restitusi
(spit "data/fis1113/bab5/C2A2FEAE-0.txt"
(vec
(take 200
(filter #(and (>= (nth % 6) 0) (<= (nth % 6) 1))
(filter #(and (not (= (nth % 4) 0)) (not (= (nth % 5) 0)))
(filter #(= (+ (* (nth % 0) (nth % 2)) (* (nth % 1) (nth % 3)))
            (+ (* (nth % 0) (nth % 4)) (* (nth % 1) (nth % 5))))
(for [m1 (range 1 4) m2 (range 1 4) v1 (range 1 10) v2 (range -10 -1) v11 (range -10 10) v21 (range -10 10)]
        (let [e (/ (- v21 v11) (- v1 v2))
              ]
        [m1 m2 v1 v2 v11 v21 e]))))))))

;;Tumbukan lenting sempurna
(spit "data/fis1113/bab5/C2A2FEAF-0.txt"
(vec
(take 200
(filter #(= (nth % 6) 1)
(filter #(and (not (= (nth % 4) 0)) (not (= (nth % 5) 0)))
(filter #(= (+ (* (nth % 0) (nth % 2)) (* (nth % 1) (nth % 3)))
            (+ (* (nth % 0) (nth % 4)) (* (nth % 1) (nth % 5))))
(filter #(not (= (first %) (second %)))
(for [m1 (range 1 5) m2 (range 1 5) v1 (range 1 10) v2 (range -10 10) v11 (range -10 10) v21 (range -10 10)]
        (let [e (if (= (- v1 v2) 0) -1 (/ (- v21 v11) (- v1 v2)))
              Ek11 (* 0.5 m1 v11 v11)
              Ek21 (* 0.5 m2 v21 v21)
              ]
        [m1 m2 v1 v2 v11 v21 e Ek11 Ek21])))))))))

;;Tumbukan lenting sempurna
(spit "data/fis1113/bab5/C2A2FEAF-2.txt"
(vec
(take 200
(filter #(= (nth % 6) 1)
(filter #(and (not (= (nth % 4) 0)) (not (= (nth % 5) 0)))
(filter #(= (+ (* (nth % 0) (nth % 2)) (* (nth % 1) (nth % 3)))
            (+ (* (nth % 0) (nth % 4)) (* (nth % 1) (nth % 5))))
(for [m1 (range 1 10) v1 (range 1 5) v2 (range -10 -1) v11 (range -10 10) v21 (range -10 10)]
        (let [e (if (= (- v1 v2) 0) -1 (/ (- v21 v11) (- v1 v2)))
              ]
        [m1 m1 v1 v2 v11 v21 e]))))))))

;;Tumbukan tak lenting
(spit "data/fis1113/bab5/C2A2FEAG-0.txt"
(vec
(take 200
(filter #(not (= (nth % 2) (nth % 3)))
(filter #(= (+ (* (nth % 0) (nth % 2)) (* (nth % 1) (nth % 3)))
            (+ (* (nth % 0) (nth % 4)) (* (nth % 1) (nth % 5))))
(filter #(not (= (first %) (second %)))
(for [m1 (range 1 5) m2 (range 1 5) v1 (range 1 10) v2 (range -10 10) v11 (range -10 10)]
        [m1 m2 v1 v2 v11 v11])))))))

;;Tumbukan tak lenting
(spit "data/fis1113/bab5/C2A2FEAG-1.txt"
(vec
(take 200
(filter #(not (= (nth % 2) (nth % 3)))
(filter #(= (+ (* (nth % 0) (nth % 2)) (* (nth % 1) (nth % 3)))
            (+ (* (nth % 0) (nth % 4)) (* (nth % 1) (nth % 5))))
(filter #(not (= (first %) (second %)))
(for [m1 [1/10 2/10] m2 (range 1 5) v1 (range 100 200) v11 (range 1 200)]
        [m1 m2 v1 0 v11 v11 (* m1 1000)])))))))

(spit "data/fis1113/bab5/C2A2FEAH-0.txt"
(vec
(take 200
(filter #(and (> (nth % 6) 0) (< (nth % 6) 1))
(filter #(and (not (= (nth % 4) 0)) (not (= (nth % 5) 0)))
(filter #(= (+ (* (nth % 0) (nth % 2)) (* (nth % 1) (nth % 3)))
            (+ (* (nth % 0) (nth % 4)) (* (nth % 1) (nth % 5))))
(for [m1 (range 1 4) m2 (range 1 4) v1 (range 1 10) v2 (range -10 -1) v11 (range -10 10) v21 (range -10 10)]
        (let [e (/ (- v21 v11) (- v1 v2))
              Ek (+ (* 0.5 m1 v1 v1) (* 0.5 m2 v2 v2))
              Ek1 (+ (* 0.5 m1 v11 v11) (* 0.5 m2 v21 v21))
              dEk (- Ek Ek1)
              ]
        [m1 m2 v1 v2 v11 v21 e dEk]))))))))


;;Impuls
(spit "data/fis1113/bab5/C2A2FEAI-0.txt"
(vec
(take 200
(filter #(= (nth % 6) 1)
(filter #(and (not (= (nth % 4) 0)) (not (= (nth % 5) 0)))
(filter #(= (+ (* (nth % 0) (nth % 2)) (* (nth % 1) (nth % 3)))
            (+ (* (nth % 0) (nth % 4)) (* (nth % 1) (nth % 5))))
(filter #(not (= (first %) (second %)))
(for [m1 (range 1 5) m2 (range 1 5) v1 (range 1 10) v2 (range -10 10) v11 (range -10 10) v21 (range -10 10)]
        (let [e (if (= (- v1 v2) 0) -1 (/ (- v21 v11) (- v1 v2)))
              I1 (Math/abs (* m1 (- v11 v1)))
              I2 (Math/abs (* m2 (- v21 v2)))
              ]
        [m1 m2 v1 v2 v11 v21 e I1 I2])))))))))

;;Impuls
(spit "data/fis1113/bab5/C2A2FEAI-1.txt"
(vec
(for [m (range 1 10) vo (range 10 20)]
        [m
         vo
         (* -2 m vo)])))

;;Impuls
(spit "data/fis1113/bab5/C2A2FEAI-2.txt"
(vec
(for [m [0.2 0.3] vo (range 10 20) vf (range 40 50)]
        [m
         vo
         vf
         (nd (* m (+ vo vf)) 1)])))

;;Impuls dan gaya
(spit "data/fis1113/bab5/C2A2FEAJ-0.txt"
(vec
(for [m [0.5 2 2.5 2 2.5 3] vo (range 10 20) dt [0.1 0.2 0.3 0.4 0.5]]
        [m
         vo
         dt
         (nd (/ (* 2 m vo) dt) 2)])))

;;Impuls dan gaya
(spit "data/fis1113/bab5/C2A2FEAJ-1.txt"
(vec
(for [m [0.2 0.3] vo (range 10 20 2) vf (range 40 50 2) dt [0.1 0.2 0.3 0.4 0.5]]
        [m
         vo
         vf
         dt
         (nd (/ (* m (+ vo vf)) dt) 2)])))

;;Impuls dan gaya
(spit "data/fis1113/bab5/C2A2FEAJ-2.txt"
(vec
(let [vvo (map #(* % %) (range 2 21))]
(for [m [1 2 3] vo (range 10 50 10) dt [0.1 0.2 0.3 0.4 0.5]]
        [m
         dt
         (nd (/ (* vo vo) 20) 2)
         (nd (/ (* m vo) dt) 2)
         ]))))

;; Impuls dan gaya (grafik)
(spit "data/fis1113/bab5/C2A2FEAK-0.txt"
(vec
(let [vvo (map #(* % %) (range 2 21))]
(for [m [1 2] F (range 5 11) dt1 [100 200 400] dt2 [100 200 400]]
        [m
         [0 F 0]
         [0 dt1 (+ dt1 dt2)]
         (nd (+ (* 0.5 F dt1 0.001) (* 0.5 F dt2 0.001)) 2)
         (nd (/ (+ (* 0.5 F dt1 0.001) (* 0.5 F dt2 0.001)) m) 2)
         ]))))

;; Impuls dan gaya (grafik)
(spit "data/fis1113/bab5/C2A2FEAK-1.txt"
(vec
(for [m [1 2 4] vo (range 0 4) F1 (range 10 20 2) dF (range -7 9 3) dt (range 2 10 4)]
        [m
         vo
         [F1 (+ F1 dF)]
         [0 dt]
         (nd (+ (/ (* 0.5 (+ F1 (+ F1 dF)) dt) m) vo) 2)
         ])))


(defn cosd [sdt]
  (* (Math/round (* (Math/cos (* Math/PI (/ sdt 180))) 100)) 0.01))
(defn nd [ang numd]
  (/ (Math/round (* ang (Math/pow 10 numd))) (Math/pow 10 numd)))
