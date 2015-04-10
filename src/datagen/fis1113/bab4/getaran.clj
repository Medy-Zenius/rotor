;;Persamaan GHS
(spit "data/fis1113/bab4/C2A2FDAE-0.txt"
(let [vs1 [0 30 37 45 53 60]
      vs2 (map #(- 180 %) vs1)
      vs3 (map #(+ 180 %) vs1)
      vs4 (map #(- 360 %) vs1)
      vs5 (map #(+ 360 %) vs1)
      vs (flatten (conj vs1 vs2 vs3 vs4 vs5))
      cvs (count vs)
      ]
(loop [data [], A 2]
   (if (> A 12)
       data
       (recur (loop [data1 data, is 0]
                            (if (= is cvs)
                              data1
                              (let [s (nth vs is)
                                    y (* A (sind s))]
                              (recur (conj data1 [A
                                                  s
                                                  (nd y 2)
                                                  ])
                                     (inc is))))) (inc A))))))
;;Persamaan GHS
(spit "data/fis1113/bab4/C2A2FDAE-1.txt"
(let [vs1 [0 1/6 1/4 1/3]
      vs2 (map #(- 1 %) vs1)
      vs3 (map #(+ 1 %) vs1)
      vs4 (map #(- 2 %) vs1)
      vs5 (map #(+ 2 %) vs1)
      vs (flatten (conj vs1 vs2 vs3 vs4 vs5))
      cvs (count vs)
      ]
(loop [data [], A 2]
   (if (> A 12)
       data
       (recur (loop [data1 data, is 0]
                            (if (= is cvs)
                              data1
                              (let [s (nth vs is)
                                    y (* A (Math/sin (* (Math/PI) s)))
                                   ]
                              (recur (conj data1 [A
                                                  s
                                                  (nd y 2)
                                                  ])
                                     (inc is))))) (inc A))))))

;;Persamaan GHS
(spit "data/fis1113/bab4/C2A2FDAE-2.txt"
(let [vs1 [0 30 37 45 53 60]
      vs2 (map #(- 180 %) vs1)
      vs3 (map #(+ 180 %) vs1)
      vs4 (map #(- 360 %) vs1)
      vs5 (map #(+ 360 %) vs1)
      vs (flatten (conj vs1 vs2 vs3 vs4 vs5))
      cvs (count vs)
      ]
(loop [data [], A 2]
   (if (> A 12)
       data
       (recur (loop [data1 data, is 0]
                            (if (= is cvs)
                              data1
                              (let [s (nth vs is)
                                    y (* A (cosd s))]
                              (recur (conj data1 [A
                                                  s
                                                  (nd y 2)
                                                  ])
                                     (inc is))))) (inc A))))))
;; Persamaan GHS
(spit "data/fis1113/bab4/C2A2FDAE-3.txt"
(let [vs1 [0 1/6 1/4 1/3]
      vs2 (map #(- 1 %) vs1)
      vs3 (map #(+ 1 %) vs1)
      vs4 (map #(- 2 %) vs1)
      vs5 (map #(+ 2 %) vs1)
      vs (flatten (conj vs1 vs2 vs3 vs4 vs5))
      cvs (count vs)
      ]
(loop [data [], A 2]
   (if (> A 12)
       data
       (recur (loop [data1 data, is 0]
                            (if (= is cvs)
                              data1
                              (let [s (nth vs is)
                                    y (* A (Math/cos (* (Math/PI) s)))
                                   ]
                              (recur (conj data1 [A
                                                  s
                                                  (nd y 2)
                                                  ])
                                     (inc is))))) (inc A))))))

;;Persamaan GHS
(spit "data/fis1113/bab4/C2A2FDAF-0.txt"
(let [vthe [6 4 3]]
(loop [data [], A 2]
   (if (> A 12)
       data
       (recur (loop [data1 data, ithe 0]
                    (if (= ithe 3)
                          data1
                          (recur (loop [data2 data1, t 0]
                                       (if (> t 10)
                                       data2
                                       (let [theta (nth vthe ithe)
                                             y (* A (Math/sin (+ (* (Math/PI) t) (/ (Math/PI) theta))))
                                             ]
                                        (recur (conj data2 [A
                                                            theta
                                                            t
                                                            (nd y 2)
                                                            ])
                         (inc t))))) (inc ithe)))) (inc A))))))

;;Persamaan GHS
(spit "data/fis1113/bab4/C2A2FDAF-1.txt"
(let [vthe1 [2 1 1]
      vthe2 [3 3 2]]
(loop [data [], A 2]
   (if (> A 12)
       data
       (recur (loop [data1 data, ithe 0]
                    (if (= ithe 3)
                          data1
                          (recur (loop [data2 data1, t 0]
                                       (if (> t 10)
                                       data2
                                       (let [theta1 (nth vthe1 ithe)
                                             theta2 (nth vthe2 ithe)
                                             y (* A (Math/cos (* (/ (Math/PI) 2) (+ t (/ theta1 theta2)))))
                                             ]
                                        (recur (conj data2 [A
                                                            theta1
                                                            theta2
                                                            t
                                                            (nd y 2)
                                                            ])
                         (inc t))))) (inc ithe)))) (inc A))))))

;;Persamaan GHS
(spit "data/fis1113/bab4/C2A2FDAH-0.txt"
(let [vthe1 [2 1 1]
      vthe2 [3 3 2]]
(loop [data [], A 2]
   (if (> A 12)
       data
       (recur (loop [data1 data, xT 2]
                    (if (> xT 10)
                          data1
                          (recur (loop [data2 data1, xp 2]
                                       (if (> xp 5)
                                       data2
                                       (let [f (/ 1 (* 2 xT))
                                             ]
                                        (recur (conj data2 [A
                                                            xT
                                                            xp
                                                            f
                                                            ])
                         (inc xp))))) (inc xT)))) (inc A))))))

;;Persamaan GHS
(spit "data/fis1113/bab4/C2A2FDAH-1.txt"
(let [vthe1 [2 1 1]
      vthe2 [3 3 2]]
(loop [data [], A 20]
   (if (> A 30)
       data
       (recur (loop [data1 data, xT 2]
                    (if (> xT 14)
                          data1
                          (recur (loop [data2 data1, xp 3]
                                       (if (> xp 15)
                                       data2
                                       (let [T (/ xT 2)
                                             ]
                                        (recur (conj data2 [A
                                                            xT
                                                            xp
                                                            T
                                                            ])
                         (+ xp 2))))) (+ xT 2)))) (inc A))))))

;;Persamaan GHS
(spit "data/fis1113/bab4/C2A2FDAH-2.txt"
(let [x 1]
(loop [data [], A 2]
   (if (> A 20)
       data
       (recur (loop [data1 data, T 60]
                            (if (> T 500)
                              data1
                              (let [t1 (/ T 6)
                                    t2 (/ T 3)
                                    y (/ A 2)
                                    ]
                              (recur (conj data1 [A T y [t1 t2]
                                                  ])
                                     (+ T 30))))) (+ A 2))))))

;; GHS - Kecepatan dan percepatan
(spit "data/fis1113/bab4/C2A2FDAI-0.txt"
(let [vs1 [0 1/6 1/4 1/3]
      vs2 (map #(- 1 %) vs1)
      vs3 (map #(+ 1 %) vs1)
      vs4 (map #(- 2 %) vs1)
      vs5 (map #(+ 2 %) vs1)
      vs (flatten (conj vs1 vs2 vs3 vs4 vs5))
      cvs (count vs)
      ]
(loop [data [], A 2]
   (if (> A 12)
       data
       (recur (loop [data1 data, is 0]
                            (if (= is cvs)
                              data1
                              (let [s (nth vs is)
                                    v (* A (Math/cos (* (Math/PI) s)))
                                   ]
                              (recur (conj data1 [A
                                                  s
                                                  (nd v 2)
                                                  ])
                                     (inc is))))) (inc A))))))

;; GHS - Kecepatan dan percepatan
(spit "data/fis1113/bab4/C2A2FDAI-1.txt"
(let [vs1 [0 1/6 1/4 1/3]
      vs2 (map #(- 1 %) vs1)
      vs3 (map #(+ 1 %) vs1)
      vs4 (map #(- 2 %) vs1)
      vs5 (map #(+ 2 %) vs1)
      vs (flatten (conj vs1 vs2 vs3 vs4 vs5))
      cvs (count vs)
      ]
(loop [data [], A 2]
   (if (> A 12)
       data
       (recur (loop [data1 data, is 0]
                            (if (= is cvs)
                              data1
                              (let [s (nth vs is)
                                    a (* -1 A (Math/PI) (Math/sin (* (Math/PI) s)))
                                   ]
                              (recur (conj data1 [A
                                                  s
                                                  (nd a 2)
                                                  ])
                                     (inc is))))) (inc A))))))

;;Kecepatan dan percepatan maksimum
(spit "data/fis1113/bab4/C2A2FDAI-2.txt"
(let [vthe1 [2 1 1 1]
      vthe2 [3 3 2 6]
      cvthe (count vthe1)]
(loop [data [], A 2]
   (if (> A 20)
       data
       (recur (loop [data1 data, ivt 0]
                    (if (= ivt  cvthe)
                          data1
                          (recur (loop [data2 data1, xT 2]
                                       (if (> xT 12)
                                       data2
                                       (let [xs (nth vthe2 ivt)
                                             vmax (/ (* 2 A) xT)
                                             ]
                                        (recur (conj data2 [A
                                                            xT
                                                            xs
                                                            vmax
                                                            ])
                         (inc xT))))) (inc ivt)))) (inc A))))))

;;Kecepatan dan percepatan maksimum
(spit "data/fis1113/bab4/C2A2FDAI-3.txt"
(let [vthe1 [2 1 1 1]
      vthe2 [3 3 2 6]
      cvthe (count vthe1)]
(loop [data [], A 10]
   (if (> A 20)
       data
       (recur (loop [data1 data, x1 2]
                    (if (> x1  5)
                          data1
                          (recur (loop [data2 data1, x2 2]
                                       (if (> x2 6)
                                       data2
                                       (let [omg (* x1 x2)
                                             amax (* A omg omg)
                                             ]
                                        (recur (conj data2 [A
                                                            x1
                                                            x2
                                                            amax
                                                            ])
                         (inc x2))))) (inc x1)))) (inc A))))))

;; GHS - Kecepatan dan percepatan
(spit "data/fis1113/bab4/C2A2FDAI-4.txt"
(let [vs1 [0 1/6 1/4 1/3]
      vs2 (map #(- 1 %) vs1)
      vs3 (map #(+ 1 %) vs1)
      vs4 (map #(- 2 %) vs1)
      vs5 (map #(+ 2 %) vs1)
      vs (flatten (conj vs1 vs2 vs3 vs4 vs5))
      cvs (count vs)
      ]
(loop [data [], A 2]
   (if (> A 12)
       data
       (recur (loop [data1 data, f 2]
                            (if (> f 20)
                              data1
                              (let [vmax (* 2 f A)
                                   ]
                              (recur (conj data1 [A
                                                  f
                                                  vmax
                                                  ])
                                     (inc f))))) (inc A))))))
;; tetapan pegas
(spit "data/fis1113/bab4/C2A2FDAJ-0.txt"
(let [vf1 (range 2 100)
      vf (map #(* % % 0.01) vf1)
      ]
(loop [data [], m 1]
   (if (> m 10)
       data
       (recur (loop [data1 data, f 2]
                            (if (> f 5)
                              data1
                              (let [k (* 4 f f m)
                                   ]
                              (recur (conj data1 [m
                                                  f
                                                  k
                                                  ])
                                     (inc f))))) (+ m 1))))))
;;tetapan pegas
(spit "data/fis1113/bab4/C2A2FDAJ-1.txt"
(let [vf1 (range 2 100)
      vf (map #(* % % 0.01) vf1)
      ]
(loop [data [], m 100]
   (if (> m 1000)
       data
       (recur (loop [data1 data, y 10]
                            (if (> y 20)
                              data1
                              (let [k (/ (* m 10) y 10)
                                    T (* 2 (Math/sqrt (/ m k 1000)))
                                   ]
                              (recur (conj data1 [m
                                                  y
                                                  (nd T 2)
                                                  ])
                                     (+ y 2))))) (+ m 100))))))

;;Energi pegas
(spit "data/fis1113/bab4/C2A2FDAKA-0.txt"
(loop [data [], k 400]
   (if (> k 1000)
       data
       (recur (loop [data1 data, A 10]
                            (if (> A 50)
                              data1
                              (let [EM (* 1/2 k A A 0.0001)
                                   ]
                              (recur (conj data1 [k
                                                  A
                                                  (nd EM 2)
                                                  ])
                                     (+ A 2))))) (+ k 100)))))

;;Energi pegas
(spit "data/fis1113/bab4/C2A2FDAKA-1.txt"
(let [vt1 [0 1/6 1/4 1/3]
      vt2 (map #(- 1 %) vt1)
      vt3 (map #(+ 1 %) vt1)
      vt4 (map #(- 2 %) vt1)
      vt5 (map #(+ 2 %) vt1)
      vt (flatten (conj vt1 vt2 vt3 vt4 vt5))
      cvt (count vt)
      ]
(loop [data [], A 10]
   (if (> A 20)
       data
       (recur (loop [data1 data, it 0]
                    (if (= it cvt)
                          data1
                          (recur (loop [data2 data1, k 10]
                                       (if (> k 100)
                                       data2
                                       (let [t (nth vt it)
                                             y (* A (Math/sin (* (Math/PI) t)))
                                             Ep (* 1/2 k y y 0.0001)
                                             ]
                                        (recur (conj data2 [A
                                                            k
                                                            t
                                                            (nd Ep 3)
                                                            ])
                         (+ k 30))))) (inc it)))) (+ A 2))))))

;;Energi pegas
(spit "data/fis1113/bab4/C2A2FDAKA-2.txt"
(let [vt1 [0 1/6 1/4 1/3]
      vt2 (map #(- 1 %) vt1)
      vt3 (map #(+ 1 %) vt1)
      vt4 (map #(- 2 %) vt1)
      vt5 (map #(+ 2 %) vt1)
      vt (flatten (conj vt1 vt2 vt3 vt4 vt5))
      cvt (count vt)
      ]
(loop [data [], A 10]
   (if (> A 20)
       data
       (recur (loop [data1 data, it 0]
                    (if (= it cvt)
                          data1
                          (recur (loop [data2 data1, k 10]
                                       (if (> k 100)
                                       data2
                                       (let [t (nth vt it)
                                             bv (* A (Math/cos (* (Math/PI) t)))
                                             Ek (* 1/2 k bv bv 0.0001)
                                             ]
                                        (recur (conj data2 [A
                                                            k
                                                            t
                                                            (nd Ek 3)
                                                            ])
                         (+ k 30))))) (inc it)))) (+ A 2))))))

;;Energi pegas
(spit "data/fis1113/bab4/C2A2FDAKA-3.txt"
(let [vfrak (map #(/ 1 %) (range 2 30))
      cfrak (count vfrak)]
  (loop [data [], ifrak 0]
         (if (= ifrak cfrak)
             data
             (let [frak (nth vfrak ifrak)
                   fEp (* frak frak)
                   fEk (- 1 fEp)]
             (recur (conj data [frak (/ fEk fEp)]) (inc ifrak)))))))

;;Rangkaian pegas pegas
(spit "data/fis1113/bab4/C2A2FDAL-0.txt"
(let [lk (take 30 (filter #(= (last %) (/ (* (first %) (second %)) (+ (first %) (second %))))
         (for [k1 (range 1 100) k2 (range 1 100) k (range 1 100)] [k1 k2 k])))
      clk (count lk)
      ]
(loop [data [], m 1]
   (if (> m 10)
       data
       (recur (loop [data1 data, ik 0]
                    (if (= ik clk)
                          data1
                          (let [vk (nth lk ik)
                                k1 (* (first vk) 40)
                                k2 (* (second vk) 40)
                                k (* (last vk) 40)
                                y (/ (* m 10) k)]
                          (recur (conj data1 [m k1 k2 y])
                          (inc ik))))) (inc m))))))

;;Rangkaian pegas pegas
(spit "data/fis1113/bab4/C2A2FDAL-1.txt"
(let [lk (take 30 (for [k1 (range 100 1000 100) k2 (range 100 1000 100)] [k1 k2 (+ k1 k2)]))
      clk (count lk)
      ]
(loop [data [], m 1]
   (if (> m 10)
       data
       (recur (loop [data1 data, ik 0]
                    (if (= ik clk)
                          data1
                          (let [vk (nth lk ik)
                                k1 (first vk)
                                k2 (second vk)
                                k (last vk)
                                y (/ (* m 10) k)]
                          (recur (conj data1 [m k1 k2 y])
                          (inc ik))))) (inc m))))))

;;Rangkaian pegas pegas
(spit "data/fis1113/bab4/C2A2FDAL-2.txt"
(let [lk (take 30 (filter #(= (last %) (/ (* (first %) (second %)) (+ (first %) (second %))))
         (for [k1 (range 1 100) k2 (range 1 100) k (range 1 100)] [k1 k2 k])))
      clk (count lk)
      ]
(loop [data [], y 10]
   (if (> y 50)
       data
       (recur (loop [data1 data, ik 0]
                    (if (= ik clk)
                          data1
                          (let [vk (nth lk ik)
                                k1 (* (first vk) 40)
                                k2 (* (second vk) 40)
                                k (* (last vk) 40)
                                F (* k y 0.01)]
                          (recur (conj data1 [y k1 k2 (nd F 2)])
                          (inc ik))))) (+ y 5))))))

;;Rangkaian pegas pegas
(spit "data/fis1113/bab4/C2A2FDAL-3.txt"
(let [lk (take 30 (for [k1 (range 100 1000 100) k2 (range 100 1000 100)] [k1 k2 (+ k1 k2)]))
      clk (count lk)
      ]
(loop [data [], y 1]
   (if (> y 10)
       data
       (recur (loop [data1 data, ik 0]
                    (if (= ik clk)
                          data1
                          (let [vk (nth lk ik)
                                k1 (first vk)
                                k2 (second vk)
                                k (last vk)
                                F (* k y 0.01)]
                          (recur (conj data1 [y k1 k2 (nd F 2)])
                          (inc ik))))) (+ y 2))))))

(defn nd [ang numd]
  (/ (Math/round (* ang (Math/pow 10 numd))) (Math/pow 10 numd)))

(defn sind [sdt]
  (* (Math/round (* (Math/sin (* Math/PI (/ sdt 180))) 100)) 0.01))

(defn cosd [sdt]
  (* (Math/round (* (Math/cos (* Math/PI (/ sdt 180))) 100)) 0.01))

(defn tand [sdt]
  (* (Math/round (* (Math/tan (* Math/PI (/ sdt 180))) 100)) 0.01))
