;;Gelombang Mekanik
;;Amplitudo, periode, frekuensi
(spit "data/fis12ktsp/bab1/C3A1FAAH-0.txt"
(vec
(take 200
(for [vx [["x1" 1/4]["x2" 1/2]["x3" 3/4]["x4" 1]["x5" 5/4]["x6" 3/2]["x7" 7/4]["x8" 2]]
      vy [["y1" 1/2]["y2" 1]["y3" 3/2]]
      x (range 1 10)
      y (range 1 5)
        :let [sx (first vx)
              lambda (/ x (second vx))
              sy (first vy)
              A (/ y (second vy))]
      ]
        [sx x lambda sy y A]))))

(spit "data/fis12ktsp/bab1/C3A1FAAH-1.txt"
(vec
(take 200
(for [vt [["t1" 1/4]["t2" 1/2]["t3" 3/4]["t4" 1]["t5" 5/4]["t6" 3/2]["t7" 7/4]["t8" 2]]
      vy [["y1" 1/2]["y2" 1]["y3" 3/2]]
      t (range 1 5 1/2)
      y (range 1 5)
        :let [st (first vt)
              T (/ t (second vt))
              sy (first vy)
              A (/ y (second vy))]
      ]
        [st t T sy y A]))))

(spit "data/fis12ktsp/bab1/C3A1FAAH-2.txt"
(vec
(take 200
(for [vt [["t1" 1/4]["t2" 1/2]["t3" 3/4]["t4" 1]["t5" 5/4]["t6" 3/2]["t7" 7/4]["t8" 2]]
      t (range 1 5 1/2)
        :let [st (first vt)
              T (/ t (second vt))
              f (/ 1 T)]
      ]
        [st t f]))))

;;cepat rambat gelombang
(spit "data/fis12ktsp/bab1/C3A1FAAI-0.txt"
(vec
(take 200
(for [f (range 2 20 2) v (range 100 200 2)
        :let [lambda (nd (/ v f 1000.0) 5)
              T (nd (/ 1 f) 4)]
      ]
        [f v T lambda]))))

(spit "data/fis12ktsp/bab1/C3A1FAAI-1.txt"
(vec
(take 200
(for [v (range 300 400 2) dt (range 2 11)
        :let [s (* 1/2 v dt)]
      ]
        [v dt s]))))

(spit "data/fis12ktsp/bab1/C3A1FAAI-2.txt"
(vec
(take 200
(for [n (range 1 11) t (range 1 11) lambda (range 400 500 10)
        :when (= (rem n t) 0)
        :let [v (/ (* n lambda 0.01) t)]
      ]
        [n t lambda (nd v 2)]))))

;; Persamaan gelombang berjalan
(spit "data/fis12ktsp/bab1/C3A1FAAJ-0.txt"
(vec
(take 200
(for [x (range 100 200 2) v (range 50 200 2) to (range 1 10) f (range 10 30 10)
        :when (= (rem x v) 0)
        :let [t (- to (/ x v))
              t1 (if (> t 0) t 0.0)
              n (* t1 f)]
      ]
        [x v to f t1 n]))))

(spit "data/fis12ktsp/bab1/C3A1FAAJ-2.txt"
(vec
(take 200
(for [A (range 2 4) a (range 2 5 1/4) b (range 5 7 1/4) c (range 4 6 1/4)
        ;:when (= (rem x v) 0)
        :let [T (/ 2 a)
              lamb (/ 2 b)
              v (/ a b)
              ]
      ]
        [A a b T lamb v c]))))

(spit "data/fis12ktsp/bab1/C3A1FAAJ-4.txt"
(vec
(take 200
(for [A (range 2 4) a (range 2 5 1/2) b (range 5 7 1/3) c (range 4 6 1/2)
        ;:when (= (rem x v) 0)
        :let [T (/ 2 a)
              lamb (/ 2 b)
              v (/ a b)
              ]
      ]
        [A a b T lamb v c]))))

;; Gelombang berjalan, y , v , a
(spit "data/fis12ktsp/bab1/C3A1FAAK-0.txt"
(vec
(take 200
(for [f (range 1/3 2 1/3) t (range 1 5 1/2) lamb (range 1/6 7 1/6) x (range 1 6 1/2)
      fs [1/3 2/3 4/3 5/3 1/6 5/6 7/6 11/6]
        :when (= (- (* 2 f t) (/ (* 2 x) lamb)) fs)
        :let [A (+ 2 (rand-int 8))
              y (* A (Math/sin (* Math/PI (- (* 2 f t) (/ (* 2 x) lamb)))))]
      ]
        [t x (* 2 f) (/ 2 lamb) (nd y 2) A]))))

(spit "data/fis12ktsp/bab1/C3A1FAAK-1.txt"
(vec
(take 200
(for [f (range 1/3 2 1/3) t (range 1 5 1/2) lamb (range 1/6 7 1/6) x (range 1 6 1/2)
      fs [1/3 2/3 4/3 5/3 1/6 5/6 7/6 11/6]
        :when (= (- (* 2 f t) (/ (* 2 x) lamb)) fs)
        :let [A (+ 2 (rand-int 8))
              v (* A 2 f (Math/cos (* Math/PI (- (* 2 f t) (/ (* 2 x) lamb)))))]
      ]
        [t x (* 2 f) (/ 2 lamb) (nd v 2) A]))))

(spit "data/fis12ktsp/bab1/C3A1FAAK-2.txt"
(vec
(take 200
(for [f (range 1/3 2 1/3) t (range 1 5 1/2) lamb (range 1/6 7 1/6) x (range 1 6 1/2)
      fs [1/3 2/3 4/3 5/3 1/6 5/6 7/6 11/6]
        :when (= (- (* 2 f t) (/ (* 2 x) lamb)) fs)
        :let [A (+ 2 (rand-int 8))
              a (* -1 A 2 f 2 f (Math/sin (* Math/PI (- (* 2 f t) (/ (* 2 x) lamb)))))]
      ]
        [t x (* 2 f) (/ 2 lamb) (nd a 2) A]))))

(spit "data/fis12ktsp/bab1/C3A1FAAK-3.txt"
(vec
(take 200
(for [A (range 2 10) a (range 1.2 4 0.2) b (range 1.4 5 0.4) c (range 2.4 8 0.5)
        :let [ym A
              vm (* b A)
              am (* b b A)]
      ]
        [A (nd a 1) (nd b 1) (nd c 1) ym (nd vm 2) (nd am 2)]))))

(spit "data/fis12ktsp/bab1/C3A1FAAL-0.txt"
(vec
(take 200
(for [A2 (range 2 20 2) a (range 1.2 4 0.2) b (range 1.4 5 0.4)
        :let [A (/ A2 2)
              f  (/ b 2)
              v (/ b a)]
      ]
        [A2 (nd a 1) (nd b 1) (nd f 2) (nd v 2) A]))))
(spit "data/fis12ktsp/bab1/C3A1FAAL-1.txt"
(vec
(take 200
(for [a (range 1/6 2 1/6) x (range 1/2 10 1/2) b (range 2 4 1/4)
      fs [1/3 2/3 4/3 5/3 7/3 8/3 10/3 11/3 13/3 1/6 5/6 7/6 11/6]
        :when (= (* a x) fs)
        :let [A2 (+ 2 (rand-int 10))
              As (* A2 (Math/cos (* Math/PI a x)))
              lamb (/ 2 a)]
      ]
        [A2 a b x (nd As 2) lamb]))))

(spit "data/fis12ktsp/bab1/C3A1FAAM-0.txt"
(vec
(take 200
(for [a (range 1/6 2 1/6) x (range 1/2 4 1/2) f (range 1/6 10 1/6) t (range 5 15 1/2)
      fs [1/3 2/3 4/3 5/3 7/3 8/3 10/3 11/3 13/3 1/6 5/6 7/6 11/6]
        :when (and (= (* a x) fs) (= (* 2 f t) fs))
        :let [A2 (+ 2 (rand-int 10))
              As (* A2 (Math/cos (* Math/PI a x)))
              y (* As (Math/sin (* Math/PI 2 f t)))]
      ]
        [A2 a (* 2 f) x t (nd y 2)]))))

(spit "data/fis12ktsp/bab1/C3A1FAAM-1.txt"
(vec
(take 200
(for [a (range 1/6 2 1/6) x (range 1/2 4 1/2) f (range 1/6 10 1/6) t (range 5 15 1/2)
      fs [1/3 2/3 4/3 5/3 7/3 8/3 10/3 11/3 13/3 1/6 5/6 7/6 11/6]
        :when (and (= (* a x) fs) (= (* 2 f t) fs))
        :let [A2 (+ 2 (rand-int 10))
              As (* A2 (Math/cos (* Math/PI a x)))
              v (* As 2 f (Math/cos (* Math/PI 2 f t)))]
      ]
        [A2 a (* 2 f) x t (nd v 2)]))))

(spit "data/fis12ktsp/bab1/C3A1FAAM-2.txt"
(vec
(take 200
(for [a (range 1/6 2 1/6) x (range 1/2 4 1/2) f (range 1/6 10 1/6) t (range 5 15 1/2)
      fs [1/3 2/3 4/3 5/3 7/3 8/3 10/3 11/3 13/3 1/6 5/6 7/6 11/6]
        :when (and (= (* a x) fs) (= (* 2 f t) fs))
        :let [A2 (+ 2 (rand-int 10))
              As (* A2 (Math/cos (* Math/PI a x)))
              aa (* -1 As 2 f 2 f 10 (Math/sin (* Math/PI 2 f t)))]
      ]
        [A2 a (* 2 f) x t (nd aa 2)]))))

;;Letak simpul dan perut (ujung terikat)
(spit "data/fis12ktsp/bab1/C3A1FAAN-0.txt"
(vec
(take 200
(for [v (range 1 4) T (range 1/10 2 1/10) n (range 1 100)
        :let [lamb (* v T)
              sn (* (dec n) 1/2 lamb)
              pn (* (- (* 2 n) 1) 1/4 lamb)]
      ]
        [v T n sn pn]))))

;;Letak simpul dan perut ujung terikat
(spit "data/fis12ktsp/bab1/C3A1FAAN-2.txt"
(vec
(take 200
(for [lamb (range 3 10 2) f (range 1/2 2 1/2) n (range 1 20)
        :let [a (/ 2 lamb)
              b (* 2 f)
              A2 (+ 2 (rand-int 10))
              sn (* (dec n) 1/2 lamb)
              pn (* (- (* 2 n) 1) 1/4 lamb)]
      ]
        [a b n sn pn A2]))))

(defn nd [ang numd]
  (/ (Math/round (* ang (Math/pow 10 numd))) (Math/pow 10 numd)))
