;;; Keseimbangan benda tegar
;; Besar Torsi
(spit "data/fis1113/bab6/C2A2FFAD-0.txt"
(vec
(for [a (range 3 7) b (range 3 7) F (range 10 20)]
        [a
         b
         F
         (* F (+ a b))
         (* F b)
         ])))

;; Besar Torsi
(spit "data/fis1113/bab6/C2A2FFAD-1.txt"
(vec
(for [a (range 3 7) b (range 3 7) F (range 10 20) alf [150 143 127]]
        [a
         b
         F
         alf
         (nd (* F (+ a b) (sind alf)) 2)
         (nd (* F b (sind alf)) 2)
         ])))
;;Besar Torsi
(spit "data/fis1113/bab6/C2A2FFAD-2.txt"
(vec
(for [a (range 3 7) b (range 3 7) F (range 10 20) alf [30 37 53]]
        [a
         b
         F
         alf
         (nd (* F a (sind alf)) 2)
         (nd (* F b (sind alf)) 2)

         ])))
;;Arah Torsi
(spit "data/fis1113/bab6/C2A2FFAE-0.txt"
(vec
(for [a (range 3 6) b (range 3 6) F1 (range 5 8) F2 (range 10 12) F3 (range 8 11) alf [45 30 37]]
        [a
         b
         F1
         F2
         F3
         alf
         (nd (- (* F2 a (sind alf)) (* F3 (+ a b))) 2)
         (nd (- (* F1 a) (* F3 b)) 2)
         (nd (- (* F1 (+ a b)) (* F2 b (sind alf))) 2)
         ])))

;;Arah Torsi
(spit "data/fis1113/bab6/C2A2FFAE-1.txt"
(vec
(for [a (range 5 9) b (range (- a 3) a) F1 (range 5 8) F2 (range 10 12) F3 (range 8 11)]
        [a
         b
         F1
         F2
         F3
         (nd (- (* F3 a 0.5) (* F1 b 0.5)) 2)
         (nd (- (* F2 a 0.5) (* F1 b)) 2)
         (nd (* F2 a 0.5) 2)
         ])))

;;Keseimbangan1
(spit "data/fis1113/bab6/C2A2FFAF-0.txt"
(vec
(for [a (range 2 6) b (range 2 6) m (range 5 12)]
        [a
         b
         m
         (/ (* a m 10) b)
         ])))

;;Keseimbangan1
(spit "data/fis1113/bab6/C2A2FFAF-1.txt"
(vec
(for [L (range 2 10 2) m (range 2 10) alf [30 37 45 53 60]]
        [L
         m
         alf
         (nd (/ (* 0.5 m 10) (sind alf)) 2)
         ])))

(spit "data/fis1113/bab6/C2A2FFAF-2.txt"
(vec
(for [L (range 2 10 2) m (range 2 10) alf [30 37 45 53 60]]
        (let [T (/ (* 0.5 m 10) (sind alf))
              Ex (* T (cosd alf))
              Ey (- (* m 10) (* T (sind alf)))
              E (Math/sqrt (+ (* Ex Ex) (* Ey Ey)))]
                [L
                 m
                 alf
                 (nd E 2)
                 ]))))

;;Keseimbangan 2
(spit "data/fis1113/bab6/C2A2FFAG-0.txt"
(vec
(for [L (range 2 10 2) mb (range 2 10) mA (range 5 10) alf [30 37 53]]
        (let [T (/ (+ (* 0.5 mb 10) (* mA 10)) (sind alf))]
                [L
                 mb
                 mA
                 alf
                 (nd T 2)
                 ]))))

;;Keseimbangan 2
(spit "data/fis1113/bab6/C2A2FFAG-1.txt"
(vec
(for [L (range 4 10 2) mb (range 2 10) mC (range 5 10) a (range 2 L)]
        (let [NA (/ (+ (* 1/2 L mb 10) (* (- L a) mC 10)) L)
              NB (/ (+ (* 1/2 L mb 10) (* a mC 10)) L)]
                [L
                 mb
                 mC
                 a
                 NA
                 NB
                 ]))))

;;Keseimbangan 2
(spit "data/fis1113/bab6/C2A2FFAG-2.txt"
(vec
(for [mb (range 20 40 2) talf [3/4 4/3 3/5 4/5 5/6 7/8 5/3 5/4 6/5 8/7]]
        (let [N1 (* mb 10)
              N2 (* 1/2 mb 10 (/ 1 talf))
              umin (/ N2 N1)]
                [mb
                 talf
                 N1
                 N2
                 umin
                 ]))))

;;Keseimbangan 2
(spit "data/fis1113/bab6/C2A2FFAGA-0.txt"
(vec
(filter #(> (last %) 0)
(for [mb (range 20 40 2) ctalf [3/4 4/3 3/5 4/5 5/6 7/8 5/3 5/4] x [1/4 1/2 1/3 3/4 2/3 5/6] us [1/4 1/3 1/2 2/3]]
        (let [mA (if (= (* x ctalf) us)
                  -1
                 (/ (* mb (- us (* 1/2 ctalf))) (- (* x ctalf) us)))

              ]
                [mb
                 ctalf
                 x
                 us
                 mA
                 ])))))

(defn cosd [sdt]
  (* (Math/round (* (Math/cos (* Math/PI (/ sdt 180))) 100)) 0.01))
(defn nd [ang numd]
  (/ (Math/round (* ang (Math/pow 10 numd))) (Math/pow 10 numd)))

(defn sind [sdt]
  (* (Math/round (* (Math/sin (* Math/PI (/ sdt 180))) 100)) 0.01))
