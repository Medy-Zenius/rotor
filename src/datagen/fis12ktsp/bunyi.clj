;;Bunyi
(spit "data/fis12ktsp/bab2/C3A1FBAB-0.txt"
(vec (take 200
(for [v (range 320 360) f (range 40 200) lamb (range 1 100)
        :when (= (* lamb f) v)
      ]
        [lamb f v]))))
(spit "data/fis12ktsp/bab2/C3A1FBAB-1.txt"
(vec (take 200
(for [v (range 320 360 5) f (range 400 1000 50)
        :let [T (/ 1 f)
              lamb (* v T)]
      ]
        [lamb T v]))))

;;Cepat rambat pada zat padat dan gas
(spit "data/fis12ktsp/bab2/C3A1FBAC-0.txt"
(vec (take 200
(for [l (range 1 5) m  (range 1 100) F (range 1 100) v (range 1 1000)
        :when (= (* v v) (/ (* F l) m))
      ]
        [l m F v]))))

(spit "data/fis12ktsp/bab2/C3A1FBAC-1.txt"
(vec (take 200
(for [lamb (range 1 5) f (range 500 750 50) xE [1/4 1/3 1 2 3 4] xR [1/4 1/3 1 2 3 4]
        :let [v1 (* lamb f)
              v2 (/ (* v1 xE) xR)]
      ]
        [lamb f (* xE xE) (* xR xR) v2]))))

(spit "data/fis12ktsp/bab2/C3A1FBAC-2.txt"
(vec (take 200
(for [v (range 500 1000 100) f (range 500 800 50) xT [1/4 1/3 2 3 4]
        :let [ v2 (* v xT)
              lamb (/ v2 f)]
      ]
        [lamb f v (* xT xT) v2]))))

;;Efek Doppler
(spit "data/fis12ktsp/bab2/C3A1FBAD-0.txt"
(vec (take 200
(for [fp (range 500 600) fs (range 400 600) v (range 320 360) vp (range -20 20)
        :when (and (not= 0 vp) (= (* fs (/ (+ v vp) v)) fp))
      ]
        [v vp fs fp]))))
(spit "data/fis12ktsp/bab2/C3A1FBAD-1.txt"
(vec (take 200
(for [fp (range 500 600) fs (range 400 600) v (range 320 360) vs (range -20 20)
        :when (and (not= 0 vs) (= (* fs (/ v (+ v vs))) fp))
      ]
        [v vs fs fp]))))
(spit "data/fis12ktsp/bab2/C3A1FBAD-2.txt"
(vec (take 200
(for [fp (range 500 600) fs (range 400 600) v (range 320 360) vs (range -20 20) vp (range -20 20)
        :when (and (not= 0 vs) (not= 0 vp) (= (* fs (/ (+ v vp) (+ v vs))) fp))
      ]
        [v vp vs fs fp]))))

;;layangan
(spit "data/fis12ktsp/bab2/C3A1FBAE-0.txt"
(vec (take 200
(for [f1 (range 500 600) fl (range 2 5)
       :let [f2 [(- f1 fl) (+ f1 fl)]]
      ]
        [f1 fl f2]))))

(spit "data/fis12ktsp/bab2/C3A1FBAE-1.txt"
(vec (take 200
(for [f1 (range 400 800) fl (range -5 5) vp (range -10 10) v (range 320 380)
       :let [fp (+ f1 fl)
             fp1 (* f1 (/ (+ v vp) v))]
       :when (and (= fp fp1) (not= fl 0) (not= vp 0))
      ]
        [f1 fp v vp]))))

;;Pipa organa terbuka
(spit "data/fis12ktsp/bab2/C3A1FBAG-0.txt"
(vec (take 50
(for [vn [[0 "nada dasar"]]
      L (range 10 100)
      f (range 500 1000)
      v (range 32000 38000 20)
      :when (= f (* (+ (first vn) 1) 1/2 (/ v L)))
      ]
        [f vn v L]))))
(spit "data/fis12ktsp/bab2/C3A1FBAG-1.txt"
(vec (take 50
(for [vn [[1 "nada atas pertama"]]
      L (range 10 100)
      f (range 500 1000)
      v (range 32000 38000 20)
      :when (= f (* (+ (first vn) 1) 1/2 (/ v L)))
      ]
        [f vn v L]))))
(spit "data/fis12ktsp/bab2/C3A1FBAG-2.txt"
(vec (take 200
(for [vn [[2 "nada atas kedua"]
          [3 "nada atas ketiga"] [4 "nada atas keempat"] [5 "nada atas kelima"]]
      L (range 10 100)
      f (range 500 1000)
      v (range 32000 38000 20)
      :when (= f (* (+ (first vn) 1) 1/2 (/ v L)))
      ]
        [f vn v L]))))

;;Pipa organa tertutup
(spit "data/fis12ktsp/bab2/C3A1FBAH-0.txt"
(vec (take 100
(for [vn [[0 "nada dasar"]]
      L (range 11 100)
      f (range 500 1000)
      v (range 32000 34000 20)
      :when (= f (* (+ (* 2 (first vn)) 1) 1/4 (/ v L)))
      ]
        [f vn v L]))))

(spit "data/fis12ktsp/bab2/C3A1FBAH-1.txt"
(vec (take 100
(for [vn [[1 "nada atas pertama"]]
      L (range 10 100)
      f (range 800 1000)
      v (range 32000 34000 20)
      :when (= f (* (+ (* 2 (first vn)) 1) 1/4 (/ v L)))
      ]
        [f vn v L]))))
(spit "data/fis12ktsp/bab2/C3A1FBAH-2.txt"
(vec (take 100
(for [vn [[2 "nada atas kedua"]]
      L (range 10 100)
      f (range 1000 1200)
      v (range 32000 34000 20)
      :when (= f (* (+ (* 2 (first vn)) 1) 1/4 (/ v L)))
      ]
        [f vn v L]))))
;;Dawai
(spit "data/fis12ktsp/bab2/C3A1FBAI-0.txt"
(vec (take 50
(for [vn [[0 "nada dasar"]]
      L (range 10 100)
      f (range 500 1000)
      v (range 32000 38000 20)
      :when (= f (* (+ (first vn) 1) 1/2 (/ v L)))
      ]
        [f vn v L]))))

(spit "data/fis12ktsp/bab2/C3A1FBAI-1.txt"
(vec (take 50
(for [vn [[1 "nada atas pertama"]]
      L (range 10 100)
      f (range 500 1000)
      v (range 32000 38000 20)
      :when (= f (* (+ (first vn) 1) 1/2 (/ v L)))
      ]
        [f vn v L]))))
(spit "data/fis12ktsp/bab2/C3A1FBAI-3.txt"
(vec (take 200
(for [fo (range 500 1000 50) xf [1/4 1/2 2 3 4]
      :let [foa (* fo xf)]
      ]
        [fo foa (* xf xf)]))))
(spit "data/fis12ktsp/bab2/C3A1FBAI-4.txt"
(vec (take 200
(for [fo (range 500 1000 50) xL [1/4 1/2 2 3 4]
      :let [foa (/ fo xL)]
      ]
        [fo foa xL]))))

;;Dawai dan pipa organa
(spit "data/fis12ktsp/bab2/C3A1FBAJ-0.txt"
(vec (take 200
(for [fo (range 500 1000 50) vn [[0 "nada dasar"] [1 "nada atas pertama"] [2 "nada atas kedua"] [3 "nada atas ketiga"]]
      v (range 320 350 4)
      :let [L (* (+ (* 2 (first vn)) 1) 1/4 (/ v fo))]
      ]
        [fo vn v (nd L 2)]))))

(spit "data/fis12ktsp/bab2/C3A1FBAJ-1.txt"
(vec (take 200
(for [fot (range 500 1000 50)
      vnt [[0 "nada dasar"] [1 "nada atas pertama"] [2 "nada atas kedua"] [3 "nada atas ketiga"]]
      vnb [[0 "nada dasar"] [1 "nada atas pertama"] [2 "nada atas kedua"] [3 "nada atas ketiga"]]
      v (range 320 350 4)
      :let [ft (* (+ (* 2 (first vnt)) 1) fot)
            Lb (* (+ (first vnb) 1) 1/2 (/ v ft))]
      ]
        [fot vnt vnb v (nd Lb 2)]))))

;; tabung resonansi
(spit "data/fis12ktsp/bab2/C3A1FBAJA-0.txt"
(vec (take 200
(for [f (range 500 1000 50)
      vn1 [[1 "pertama"] [2 "kedua"] [3 "ketiga"] [4 "keempat"]]
      vn2 [[1 "pertama"] [2 "kedua"] [3 "ketiga"] [4 "keempat"]]
      v (range 320 350 4)
      L1 (range 0.20 0.50 0.02)
      :when (not= vn1 vn2)
      :let [dL (* 1/2 (- (first vn2) (first vn1)) (/ v f))
            L2 (+ L1 dL)]
      ]
        [f vn1 vn2 v (nd L1 2) (nd (* L2 100) 2)]))))

;;Intensitas bunyi
(spit "data/fis12ktsp/bab2/C3A1FBAK-0.txt"
(vec (take 200
(for [xd (range 1/10 5 1/5) xP (range 1/10 5 1/5)
      :let [xI (* (/ 1 (* xd xd)) xP)]
      ]
        [xd xP xI]))))

(spit "data/fis12ktsp/bab2/C3A1FBAK-1.txt"
(vec (take 200
(for [IA (range 2 10) rA (range 2 10) rAB (range 1 5)
      :let [IB (* IA (/ (* rA rA) (+ (* rA rA) (* rAB rAB))))]
      ]
        [IA rA rAB IB]))))
;;Taraf Intensitas
(spit "data/fis12ktsp/bab2/C3A1FBAL-0.txt"
(vec (take 200
(for [TI1 (range 5 30) xp (range 1 4)
      :let [TI2 (+ TI1 (* xp 10))
            nx (reduce * (repeat xp 10))]
      ]
        [TI1 nx TI2]))))

(spit "data/fis12ktsp/bab2/C3A1FBAL-1.txt"
(vec (take 200
(for [xp [1 2 3] TI1 (range 5 30 5)  n2 (range 2 100) n1 (range 1 n2) r2 (range 2 100) r1 (range 1 r2)
      :when (= (reduce * (repeat xp 10)) (* (/ n2 n1) (/ (* r1 r1) (* r2 r2))))
      :let [TI2 (+ TI1 (* xp 10))]
      ]
        [TI1 n2 n1 r2 r1 TI2]))))

(defn nd [ang numd]
  (/ (Math/round (* ang (Math/pow 10 numd))) (Math/pow 10 numd)))
