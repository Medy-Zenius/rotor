;;Energi Kinetik
(spit "data/fis1113/bab3/C2A2FCCB-0.txt"
(loop [data [], m 2]
   (if (> m 20)
       data
       (recur (loop [data1 data, v 2]
                            (if (> v 20)
                              data1
                              (recur (conj data1 [m
                                                  v
                                                  (* 1/2 m v v)
                                                  ])
                                     (+ v 1)))) (+ m 2)))))

;;Energi Kinetik
(spit "data/fis1113/bab3/C2A2FCCB-1.txt"
(let [vg [9.8 10]]
(loop [data [], m 2]
   (if (> m 20)
       data
       (recur (loop [data1 data, h 5]
                            (if (> h 40)
                              data1
                              (let [g (nth vg (rand-int 2))]
                              (recur (conj data1 [m
                                                  h
                                                  g
                                                  (nd (* m g h) 1)
                                                  ])
                                     (+ h 1))))) (+ m 2))))))

;;Energi kinetik
(spit "data/fis1113/bab3/C2A2FCCB-2.txt"
(let [alfis [[30 1/4 3/4] [37 9/25 16/25] [45 1/2 1/2] [53 16/25 9/25] [60 3/4 1/4]]]
(loop [data [], m 2]
   (if (> m 10)
       data
       (recur (loop [data1 data, vo 50]
                    (if (> vo 200)
                          data1
                          (recur (loop [data2 data1, ialf 0]
                                       (if (= ialf 5)
                                       data2
                                       (let [alf (first (nth alfis ialf))
                                             s2alf (second (nth alfis ialf))
                                             c2alf (last (nth alfis ialf))
                                             Ek (* 1/2 m vo vo c2alf)
                                             ]
                                        (recur (conj data2 [m
                                                            vo
                                                            alf
                                                            Ek
                                                            ])
                         (inc ialf))))) (+ vo 10)))) (+ m 2))))))

;;Energi potensial
(spit "data/fis1113/bab3/C2A2FCCC-2.txt"
(let [alfis [[30 1/4 3/4] [37 9/25 16/25] [45 1/2 1/2] [53 16/25 9/25] [60 3/4 1/4]]]
(loop [data [], m 2]
   (if (> m 10)
       data
       (recur (loop [data1 data, vo 50]
                    (if (> vo 200)
                          data1
                          (recur (loop [data2 data1, ialf 0]
                                       (if (= ialf 5)
                                       data2
                                       (let [alf (first (nth alfis ialf))
                                             s2alf (second (nth alfis ialf))
                                             c2alf (last (nth alfis ialf))
                                             Ep (* 1/2 m vo vo s2alf)
                                             ]
                                        (recur (conj data2 [m
                                                            vo
                                                            alf
                                                            Ep
                                                            ])
                         (inc ialf))))) (+ vo 10)))) (+ m 2))))))

;;Energi Mekanik
(spit "data/fis1113/bab3/C2A2FCCD-0.txt"
(let [vg [9.8 10]]
(loop [data [], m 2]
   (if (> m 8)
       data
       (recur (loop [data1 data, ho 100]
                    (if (> ho 110)
                          data1
                          (recur (loop [data2 data1, dh 20]
                                       (if (> dh 60)
                                       data2
                                       (let [g (nth vg (rand-int 2))
                                             h1 (- ho dh)
                                             Ep1 (* m g h1)
                                             Ek1 (* m g (- ho h1))
                                             ]
                                        (recur (conj data2 [m
                                                            ho
                                                            h1
                                                            g
                                                            (Math/round (* Ek1 1.0))
                                                            ])
                         (+ dh 4))))) (+ ho 2)))) (+ m 1))))))

;;Energi Mekanik
(spit "data/fis1113/bab3/C2A2FCCD-1.txt"
(let [valf [30 37 45 53 60]]
(loop [data [], m 2]
   (if (> m 10)
       data
       (recur (loop [data1 data, vo 40]
                    (if (> vo 50)
                          data1
                          (recur (loop [data2 data1, dv 10]
                                       (if (> dv 30)
                                       data2
                                       (let [alf (nth valf (rand-int 5))
                                             v1 (- vo dv)
                                             Ep (- (* 1/2 m vo vo) (* 1/2 m v1 v1))
                                             ]
                                        (recur (conj data2 [m
                                                            vo
                                                            v1
                                                            alf
                                                            (Math/round (* Ep 1.0))
                                                            ])
                         (+ dv 4))))) (+ vo 2)))) (+ m 2))))))

;;Energi Mekanik
(spit "data/fis1113/bab3/C2A2FCCD-2.txt"
(let [alfis [[30 0.5 0.87] [37 0.6 0.8] [45 0.71 0.71] [53 0.8 0.6] [60 0.87 0.5]]
      g 10]
(loop [data [], m 5]
   (if (> m 40)
       data
       (recur (loop [data1 data, ialf 0]
                            (if (> ialf 4)
                              data1
                              (recur (loop [data2 data1, so 4]
                                       (if (> so 24)
                                           data2
                                           (let [alf (first (nth alfis ialf))
                                                 sinalf (second (nth alfis ialf))
                                                 cosalf (last (nth alfis ialf))
                                                 Ek (* m g so sinalf)
                                                 ]
                                           (recur (conj data2 [m
                                                               so
                                                               alf
                                                               sinalf
                                                               cosalf
                                                               (Math/round Ek)
                                                               ]) (+ so 2))))) (inc ialf)))) (+ m 5))))))

;;Hubungan usaha dan energi
(spit "data/fis1113/bab3/C2A2FCCG-0.txt"
(loop [data [], m 2]
   (if (> m 6)
       data
       (recur (loop [data1 data, vo 2]
                    (if (> vo 10)
                          data1
                          (recur (loop [data2 data1, ds 2]
                                       (if (> ds 8)
                                       data2
                                       (recur (loop [data3 data2, F 5]
                                                (if (> F 10)
                                                    data3
                                                    (let [Ek (+ (* F ds) (* 1/2 m vo vo))
                                                          ]
                                                    (recur (conj data3 [m vo ds F Ek])
                        (+ F 1))))) (+ ds 2)))) (+ vo 2)))) (+ m 1)))))

;;Energi - Hub Usaha dan energi
(spit "data/fis1113/bab3/C2A2FCCG-1.txt"
(loop [data [], m 2]
   (if (> m 20)
       data
       (recur (loop [data1 data, vo 10]
                    (if (> vo 20)
                          data1
                          (recur (loop [data2 data1, mug 1]
                                       (if (> mug 4)
                                       data2
                                       (let [s (/ (* 1/2 vo vo) mug)
                                             ]
                                        (recur (conj data2 [m
                                                            vo
                                                            (nd (* mug 0.1) 1)
                                                            s
                                                            ])
                         (+ mug 1))))) (+ vo 2)))) (+ m 2)))))

;;Energi Mekanik
(spit "data/fis1113/bab3/C2A2FCCG-2.txt"
(vec
(filter #(> (last %) 0)
(let [alfis [[30 0.5 0.87] [37 0.6 0.8] [45 0.71 0.71] [53 0.8 0.6] [60 0.87 0.5]]
      g 10]
(loop [data [], s 6]
   (if (> s 20)
       data
       (recur (loop [data1 data, ialf 0]
                            (if (> ialf 4)
                              data1
                              (recur (loop [data2 data1, mug 1]
                                       (if (> mug 4)
                                           data2
                                           (let [alf (first (nth alfis ialf))
                                                 sinalf (second (nth alfis ialf))
                                                 cosalf (last (nth alfis ialf))
                                                 v (Math/sqrt (* 2 (- (* g s sinalf) (* mug s cosalf))))
                                                 ]
                                           (recur (conj data2 [s
                                                               alf
                                                               sinalf
                                                               cosalf
                                                               (nd (* mug 0.1) 1)
                                                               (nd v 2)
                                                               ]) (inc mug))))) (inc ialf)))) (+ s 2))))))))

(defn nd [ang numd]
  (/ (Math/round (* ang (Math/pow 10 numd))) (Math/pow 10 numd)))
