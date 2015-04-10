;;Gerak Parabola 1
(spit "data/fis1113/bab1/C2A2FAEA-0.txt"
(let [alfis [[30 0.5 0.87] [37 0.6 0.8] [45 0.71 0.71] [53 0.8 0.6] [60 0.87 0.5]]
      g 10]
(loop [data [], vo 50]
   (if (> vo 100)
       data
       (recur (loop [data1 data, ialf 0]
                            (if (> ialf 4)
                              data1
                              (recur (loop [data2 data1, t 1]
                                       (if (> t 4)
                                           data2
                                           (let [valf (nth alfis ialf)
                                                 alf (first valf) sinalf (second valf) cosalf (last valf)
                                                 vx (* vo cosalf)
                                                 voy (* vo sinalf)
                                                 vy (- voy (* g t))
                                                 vtot (Math/round (+ (* vx vx) (* vy vy)))]
                                           (recur (conj data2 [vo
                                                               alf
                                                               sinalf
                                                               cosalf
                                                               t
                                                               vtot
                                                               ]) (inc t))))) (inc ialf)))) (+ vo 4))))))

;;Gerak Parabola 1
(spit "data/fis1113/bab1/C2A2FAEA-1.txt"
(let [alfis [[30 0.5 0.87] [37 0.6 0.8] [45 0.71 0.71] [53 0.8 0.6] [60 0.87 0.5]]
      g 10]
(loop [data [], vo 50]
   (if (> vo 100)
       data
       (recur (loop [data1 data, ialf 0]
                            (if (> ialf 4)
                              data1
                              (recur (loop [data2 data1, t 1]
                                       (if (> t 4)
                                           data2
                                           (let [valf (nth alfis ialf)
                                                 alf (first valf) sinalf (second valf) cosalf (last valf)
                                                 x (nd (* vo cosalf t) 2)
                                                 y (nd (- (* vo sinalf t) (* 0.5 g t t)) 2)]
                                           (recur (conj data2 [vo
                                                               alf
                                                               sinalf
                                                               cosalf
                                                               t
                                                               x
                                                               y
                                                               ]) (inc t))))) (inc ialf)))) (+ vo 4))))))



;;Gerak Melingkar Berubah Beraturan
(spit "data/fis1113/bab1/C2A2FAEA-2.txt"
(let [alfis [[30 0.5 0.87] [37 0.6 0.8] [45 0.71 0.71] [53 0.8 0.6] [60 0.87 0.5]]
      g 10]
(loop [data [], vo 40]
   (if (> vo 100)
       data
       (recur (loop [data1 data, ialf 0]
                            (if (> ialf 4)
                              data1
                              (let [valf (nth alfis ialf)
                                    alf (first valf) sinalf (second valf) cosalf (last valf)
                                    voy (* vo sinalf)
                                    vox (* vo cosalf)
                                    tm (/ voy g)
                                    xm (* vox 2 tm)
                                    ym (- (* voy tm) (* 0.5 g tm tm))]
                              (recur (conj data1 [vo
                                                  alf
                                                  sinalf
                                                  cosalf
                                                  (nd vox 2)
                                                  (nd tm 2)
                                                  (nd xm 2)
                                                  (nd ym 2)
                                                  ])
                                     (+ ialf 1))))) (+ vo 4))))))

;; Gerak parabola - pesawat mendatar menjatuhkan bom
(spit "data/fis1113/bab1/C2A2FAEB-0.txt"
(let [vh (map #(* % % 5) (range 15 40))
      g 10]
(loop [data [], vo 40]
   (if (> vo 100)
       data
       (recur (loop [data1 data, ih 0]
                            (if (> ih 24)
                              data1
                              (let [h (nth vh ih)
                                    t (Math/round (Math/sqrt (/ (* 2 h) g)))
                                    x (* vo t)
                                    ]
                              (recur (conj data1 [vo h t x])
                                     (+ ih 1))))) (+ vo 4))))))

;; Gerak Parabola 2 - ditembakkan dari ketinggian h dengan sudut elevasi alfa
(spit "data/fis1113/bab1/C2A2FAEB-1.txt"
(let [vp (filter #(= 0 (- (* (last %) (last %)) (* (first %) (last %)) (second %)))
            (for [a (range 1 100) b (range 1 100) t (range 1 11)][a b t]))
      cp (count vp)
      valf [[30 0.5 0.87] [53 0.8 0.6]]
      cvalf (count valf)
      ]
(loop [data [], ivp 0]
   (if (= ivp  cp)
       data
       (recur (loop [data1 data, ialf 0]
                            (if (= ialf cvalf)
                              data1
                              (let [alf (first (nth valf ialf))
                                    sinalf (second (nth valf ialf))
                                    cosalf (last (nth valf ialf))
                                    h (* 5 (second (nth vp ivp)))
                                    vo (/ (* 5 (first (nth vp ivp))) sinalf)
                                    t (last (nth vp ivp))
                                    xm (nd (* vo cosalf t) 2)]
                              (recur (conj data1 [alf
                                                  sinalf
                                                  cosalf
                                                  vo
                                                  t
                                                  h
                                                  xm])
                                     (inc ialf))))) (inc ivp))))))

(defn nd [ang numd]
  (/ (Math/round (* ang (Math/pow 10 numd))) (Math/pow 10 numd)))

