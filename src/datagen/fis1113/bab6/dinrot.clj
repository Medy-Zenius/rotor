;;Dinamika Rotasi
(spit "data/fis1113/bab6/C2A2FFCB-0.txt"
(vec
(for [m (range 50 100 5) a (range 10 20 2) b (range 10 20 2)]
        (let [I (+ (* m a a) (* m b b))]
                [m
                 a
                 b
                 I
                 ]))))
(spit "data/fis1113/bab6/C2A2FFCB-1.txt"
(vec
(for [m (range 10 40 2) a (range 4 15 2)]
        (let [I (* m 1/2 a 1/2 a 2)]
                [m
                 a
                 I
                 ]))))
(spit "data/fis1113/bab6/C2A2FFCB-2.txt"
(vec
(for [m (range 10 40 2) a (range 4 15 2)]
        (let [t (* a 1/2 3)
              I (+ (* m t t) (* m 1/3 t 1/3 t))]
                [m
                 a
                 I
                 ]))))
(spit "data/fis1113/bab6/C2A2FFCB-3.txt"
(vec
(for [m (range 10 40 2) a (range 4 15 2)]
        (let [t (* a 1/2 3)
              I (* m 2/3 t 2/3 t 3)]
                [m
                 a
                 I
                 ]))))
(spit "data/fis1113/bab6/C2A2FFCC-0.txt"
(vec
(for [m (range 10 40 2) a (range 4 15 2)]
        (let [
              I (* m a a 4)]
                [m
                 a
                 I
                 ]))))
(spit "data/fis1113/bab6/C2A2FFCC-1.txt"
(vec
(for [m (range 10 40 2) a (range 4 15 2)]
        (let [
              I (* m a a 3)]
                [m
                 a
                 I
                 ]))))

(spit "data/fis1113/bab6/C2A2FFCD-0.txt"
(vec
(for [m (range 1 10) L (range 1 2 0.1)]
        (let [
              I (* 1/3 m L L)]
                [m
                 (nd L 1)
                 (nd I 3)
                 ]))))

(spit "data/fis1113/bab6/C2A2FFCD-1.txt"
(vec
(for [m (range 1 10) L (range 1 2 0.1)]
        (let [
              I (* 1/12 m L L)]
                [m
                 (nd L 1)
                 (nd I 3)
                 ]))))

(spit "data/fis1113/bab6/C2A2FFCD-2.txt"
(vec
(for [m (range 1 10) R (range 1 2 0.1)]
        (let [
              I (* m R R)]
                [m
                 (nd R 3)
                 (nd I 3)
                 ]))))
(spit "data/fis1113/bab6/C2A2FFCD-3.txt"
(vec
(for [m (range 1 10) R (range 1 2 0.1)]
        (let [
              I (* 1/2 m R R)]
                [m
                 (nd R 3)
                 (nd I 3)
                 ]))))
(spit "data/fis1113/bab6/C2A2FFCD-4.txt"
(vec
(for [m (range 1 10) R (range 0.1 1 0.1)]
        (let [
              I (* 2/3 m R R)]
                [m
                 (nd R 3)
                 (nd I 3)
                 ]))))
(spit "data/fis1113/bab6/C2A2FFCD-5.txt"
(vec
(for [m (range 1 10) R (range 0.1 1 0.1)]
        (let [
              I (* 2/5 m R R)]
                [m
                 (nd R 3)
                 (nd I 3)
                 ]))))

(spit "data/fis1113/bab6/C2A2FFCE-0.txt"
(vec
(for [mK (range 0.8 2 0.2) mB (range 1.2 4 0.2)]
        (let [g 10
              a (/ (* mB g) (+ mB (* 1/2 mK)))]
                [(nd mK 1)
                 (nd mB 1)
                 (nd a 3)
                 ]))))
(spit "data/fis1113/bab6/C2A2FFCE-1.txt"
(vec
(for [mK (range 0.8 2 0.2) mB (range 1.2 4 0.2)]
        (let [g 10
              a (/ (* mB g) (+ mB (* 1/2 mK)))
              T (* 1/2 mK a)]
                [(nd mK 1)
                 (nd mB 1)
                 (nd T 3)
                 ]))))
(spit "data/fis1113/bab6/C2A2FFCE-2.txt"
(vec
(for [mK (range 0.8 2 0.2) mB (range 1.2 4 0.2) t [1 2 3 4]]
        (let [g 10
              a (/ (* mB g) (+ mB (* 1/2 mK)))
              s (* 1/2 a t t)]
                [(nd mK 1)
                 (nd mB 1)
                 t
                 (nd s 3)
                 ]))))
(spit "data/fis1113/bab6/C2A2FFCEA-0.txt"
(vec
(for [mK (range 0.8 1.6 0.2) mA (range 1.2 3 0.2) mB (range 0.8 mA 0.2)]
        (let [g 10
              a (/ (* (- mA mB) g) (+ mA mB (* 1/2 mK)))]
                [(nd mK 1)
                 (nd mA 1)
                 (nd mB 1)
                 (nd a 3)
                 ]))))
(spit "data/fis1113/bab6/C2A2FFCEA-1.txt"
(vec
(for [mK (range 0.8 1.4 0.2) mA (range 1.0 3 0.2) mB (range 0.8 mA 0.2) s [2 4 8]]
        (let [g 10
              a (/ (* (- mA mB) g) (+ mA mB (* 1/2 mK)))
              v (Math/sqrt (* 2 a s))
              ]
                [(nd mK 1)
                 (nd mA 1)
                 (nd mB 1)
                 s
                 (nd v 3)
                 ]))))
(spit "data/fis1113/bab6/C2A2FFCEA-2.txt"
(vec
(for [mK (range 0.8 1.4 0.2) mA (range 1.0 3 0.2) mB (range 0.8 mA 0.2)]
        (let [g 10
              a (/ (* (- mA mB) g) (+ mA mB (* 1/2 mK)))
              T (+ (* mB g) (* mB a))
              ]
                [(nd mK 1)
                 (nd mA 1)
                 (nd mB 1)
                 (nd T 3)
                 ]))))

(spit "data/fis1113/bab6/C2A2FFCEB-0.txt"
(vec
(for [mK (range 0.8 1.2 0.2) mA (range 1.0 2 0.2) mB (range 1.0 mA 0.2) u [0.2 0.4]]
        (let [g 10
              a (/ (* (- mA (* u mB)) g) (+ mA mB (* 1/2 mK)))]
                [(nd mK 1)
                 (nd mA 1)
                 (nd mB 1)
                 (nd u 1)
                 (nd a 3)
                 ]))))
(spit "data/fis1113/bab6/C2A2FFCEB-1.txt"
(vec
(for [mK (range 0.8 1.2 0.2) mA (range 1.0 2 0.2) mB (range 1.0 mA 0.2) u [0.2 0.4] t [1 2 3]]
        (let [g 10
              a (/ (* (- mA (* u mB)) g) (+ mA mB (* 1/2 mK)))
              v (* a t)]
                [(nd mK 1)
                 (nd mA 1)
                 (nd mB 1)
                 (nd u 1)
                 t
                 (nd v 3)
                 ]))))
(spit "data/fis1113/bab6/C2A2FFCEB-2.txt"
(vec
(for [mK (range 0.8 1.2 0.2) mA (range 1.0 2 0.2) mB (range 1.0 mA 0.2) u [0.2 0.4] t [1 2 3]]
        (let [g 10
              a (/ (* (- mA (* u mB)) g) (+ mA mB (* 1/2 mK)))
              v (* a t)
              Ek (* 1/2 mA v v)]
                [(nd mK 1)
                 (nd mA 1)
                 (nd mB 1)
                 (nd u 1)
                 t
                 (nd Ek 3)
                 ]))))

(spit "data/fis1113/bab6/C2A2FFCF-0.txt"
(vec
(for [I (range 2 12 2) omg (range 20 50 2)]
        (let [Ek (* 1/2 I omg omg)]
                [I
                 omg
                 Ek
                 ]))))
(spit "data/fis1113/bab6/C2A2FFCF-1.txt"
(vec
(for [m (range 1  2 0.1) R (range 10 20 2) omg (range 1000 2000 100)]
        (let [I (* m R R 1/10000)
              w (* omg 2 (Math/PI) 1/60)
              Ek (* 1/2 I w w)]
                [(nd m 1)
                 R
                 omg
                 (nd Ek 2)
                 ]))))

(spit "data/fis1113/bab6/C2A2FFCF-2.txt"
(vec
(for [omg1 (range 300 600 30) omg2 (range (+ omg1 120) (+ omg1 240) 30) I (range 2 10 2)]
        (let [w1 (/ omg1 30)
              w2 (/ omg2 30)
              W (* 1/2 I (- (* w2 w2) (* w1 w1)))]
                [omg1
                 omg2
                 I
                 W
                 ]))))

;;Energi kinetik translasi dan rotasi
(spit "data/fis1113/bab6/C2A2FFCG-0.txt"
(vec
(for [m (range 30 50 2) v (range 1 20)]
        (let [k 1
              Ek (* 1/2 m v v (+ k 1))]
                [m
                 v
                 Ek]))))
(spit "data/fis1113/bab6/C2A2FFCG-1.txt"
(vec
(for [m (range 2 20 2) v (range 5 50 5)]
        (let [k 2/5
              Ek (* 1/2 m v v (+ k 1))]
                [m
                 v
                 Ek]))))
(spit "data/fis1113/bab6/C2A2FFCG-2.txt"
(vec
(take 100
(filter #(= (* (first %) (first %)) (* 12 (second %)))
(for [v (range 2 1000) h (range 10 1000)]
        (let [k 2/3
              ]
                [v
                 h]))))))

(spit "data/fis1113/bab6/C2A2FFCG-3.txt"
(vec
(filter #(not (= (first %) (second %)))
(for [benda1 [[1 "silinder berongga tipis"] [1/2 "silinder pejal"] [2/3 "bola berongga tipis"] [2/5 "bola pejal"]]
      benda2 [[1 "silinder berongga tipis"] [1/2 "silinder pejal"] [2/3 "bola berongga tipis"] [2/5 "bola pejal"]]]
        (let [pv_kuadrat (/ (+ (first benda2) 1) (+ (first benda1) 1))]
                [benda1
                 benda2
                 pv_kuadrat])))))

;;Dinamika rotasi Momentum Anguler
(spit "data/fis1113/bab6/C2A2FFCH-0.txt"
(vec
(for [I (range 3 4 0.1) w (range 2 3 0.1) Ia (range 2 I 0.1)]
        (let [wa (/ (* I w) Ia)]
                [(nd I 1)
                 (nd w 1)
                 (nd Ia 1)
                 (nd wa 2)]))))
(spit "data/fis1113/bab6/C2A2FFCH-1.txt"
(vec
(for [I (range 3 3.5 0.1) wa (range 5 5.5 0.1) w (range 2 wa 0.1) ]
        (let [Ia (/ (* I w) wa)]
                [(nd I 1)
                 (nd wa 1)
                 (nd w 1)
                 (nd Ia 2)]))))

(defn nd [ang numd]
  (/ (Math/round (* ang (Math/pow 10 numd))) (Math/pow 10 numd)))

