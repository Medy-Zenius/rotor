;;Usaha 1
(spit "data/fis1113/bab3/C2A2FCAB-0.txt"
(loop [data [], F 2]
   (if (> F 50)
       data
       (recur (loop [data1 data, s1 5]
                    (if (> s1 20)
                          data1
                          (recur (loop [data2 data1, ds 2]
                                       (if (> ds 50)
                                       data2
                                       (let [s2 (+ s1 ds)
                                             W (* F ds)]
                                        (recur (conj data2 [F
                                                            s1
                                                            s2
                                                            W
                                                            ])
                         (+ ds 5))))) (+ s1 4)))) (+ F 4)))))

;;Usaha 2
(spit "data/fis1113/bab3/C2A2FCAC-0.txt"
(loop [data [], a 2]
   (if (> a 8)
       data
       (recur (loop [data1 data, m 1]
                    (if (> m 10)
                          data1
                          (recur (loop [data2 data1, t 2]
                                       (if (> t 10)
                                       data2
                                       (let [F (* m a)
                                             ds (* 1/2 a t t)
                                             W (* F ds)]
                                        (recur (conj data2 [F
                                                            m
                                                            t
                                                            W
                                                            ])
                         (+ t 2))))) (+ m 1)))) (+ a 1)))))

;;Usaha 2
(spit "data/fis1113/bab3/C2A2FCAD-0.txt"
(let [alfis [[30 0.5 0.87] [37 0.6 0.8] [45 0.71 0.71] [53 0.8 0.6] [60 0.87 0.5]]]
(loop [data [], F 10]
   (if (> F 100)
       data
       (recur (loop [data1 data, ialf 0]
                    (if (= ialf 5)
                          data1
                          (recur (loop [data2 data1, ds 2]
                                       (if (> ds 10)
                                       data2
                                       (let [alf (first (nth alfis ialf))
                                             salf (second (nth alfis ialf))
                                             calf (last (nth alfis ialf))
                                             Fx (* F calf)
                                             W (* Fx ds)]
                                        (recur (conj data2 [F
                                                            alf
                                                            salf
                                                            calf
                                                            ds
                                                            (nd W 2)
                                                            ])
                         (+ ds 2))))) (inc ialf)))) (+ F 10))))))

;;Usaha - Grafik F - s
(spit "data/fis1113/bab3/C2A2FCAE-0.txt"
(vec (filter #(> (Math/abs (- (first (first %)) (second (first %)))) 2)
(loop [data [], F1 10]
   (if (> F1 40)
       data
       (recur (loop [data1 data, s1 0]
                    (if (> s1 30)
                          data1
                          (recur (loop [data2 data1, dF -10]
                                       (if (> dF 20)
                                       data2
                                       (recur (loop [data3 data2, ds 10]
                                                (if (> ds 40)
                                                    data3
                                                    (let [F2 (+ F1 dF)
                                                          s2 (+ s1 ds)
                                                          W (* 1/2 (+ F1 F2) ds)]
                                                    (recur (conj data3 [[F1 F2] [s1 s2] W])
                              (+ ds 6))))) (+ dF 4)))) (+ s1 8)))) (+ F1 10)))))))

;;Usaha - Grafik F - s 2
(spit "data/fis1113/bab3/C2A2FCAE-1.txt"
(vec (filter #(> (Math/abs (- (first (first %)) (second (first %)))) 2)
(loop [data [], F1 10]
   (if (> F1 40)
       data
       (recur (loop [data1 data, s1 0]
                    (if (> s1 30)
                          data1
                          (recur (loop [data2 data1, dF -10]
                                       (if (> dF 20)
                                       data2
                                       (recur (loop [data3 data2, ds 10]
                                                (if (> ds 40)
                                                    data3
                                                    (let [F2 (+ F1 dF)
                                                          s2 (+ s1 ds)
                                                          s3 (+ s2 (rand-int 8) 4)
                                                          W (+ (* 1/2 (+ F1 F2) ds) (* F2 (- s3 s2)))]
                                                    (recur (conj data3 [[F1 F2 F2] [s1 s2 s3] W])
                              (+ ds 6))))) (+ dF 4)))) (+ s1 8)))) (+ F1 10)))))))

;;Usaha Negatif
(spit "data/fis1113/bab3/C2A2FCAF-0.txt"
(loop [data [], m 2]
   (if (> m 20)
       data
       (recur (loop [data1 data, vo 2]
                            (if (> vo 20)
                              data1
                              (recur (conj data1 [m
                                                  vo
                                                  (* -1/2 m vo vo)
                                                  ])
                                     (+ vo 1)))) (+ m 2)))))
;; Usaha Negatif
(spit "data/fis1113/bab3/C2A2FCAF-1.txt"
(loop [data [], m 2]
   (if (> m 20)
       data
       (recur (loop [data1 data, vo 10]
                    (if (> vo 20)
                          data1
                          (recur (loop [data2 data1, dv 2]
                                       (if (> dv 9)
                                       data2
                                       (let [vt (- vo dv)
                                             W (- (* 1/2 m vt vt) (* 1/2 m vo vo))]
                                        (recur (conj data2 [m vo vt W])
                         (+ dv 1))))) (+ vo 1)))) (+ m 2)))))

;;Usaha - Grafik F - s 2
(spit "data/fis1113/bab3/C2A2FCAF-2.txt"
(vec
(filter #(or (and (> (first (first %)) 0) (< (second (first %)) 0)) (and (< (first (first %)) 0) (> (second (first %)) 0)))
(filter #(> (Math/abs (- (first (first %)) (second (first %)))) 2)
(loop [data [], F1 -20]
   (if (> F1 20)
       data
       (recur (loop [data1 data, F2 -20]
                    (if (> F2 20)
                          data1
                          (recur (loop [data2 data1, s1 4]
                                       (if (> s1 10)
                                       data2
                                       (recur (loop [data3 data2, ds 4]
                                                (if (> ds 20)
                                                    data3
                                                    (if (= F1 F2)
                                                    (recur data3 (+ ds 4))
                                                    (let [s2 (+ s1 ds)
                                                          sT (/ (- (* F1 s2) (* F2 s1)) (- F1 F2))
                                                          W (+ (* 1/2 F1 (- sT s1)) (* 1/2 F2 (- s2 sT)))
                                                          ]
                                                    (recur (conj data3 [[F1 F2] [s1 s2] W])
                              (+ ds 4)))))) (+ s1 2)))) (+ F2 4)))) (+ F1 5))))))))

;;Usaha - Usaha oleh beberapa gaya
(spit "data/fis1113/bab3/C2A2FCAG-0.txt"
(vec (filter #(> (last %) 0)
(let [vmu [0.1 0.2 0.3 0.4]]
(loop [data [], F 10]
   (if (> F 40)
       data
       (recur (loop [data1 data, imu 0]
                    (if (= imu 4)
                          data1
                          (recur (loop [data2 data1, m 1]
                                       (if (> m 10)
                                       data2
                                       (recur (loop [data3 data2, ds 10]
                                                (if (> ds 40)
                                                    data3
                                                    (let [mu (nth vmu imu)
                                                          fg (Math/round (* mu m 10))
                                                          W (* (- F fg) ds)]
                                                    (recur (conj data3 [F mu m ds W])
                              (+ ds 6))))) (+ m 2)))) (+ imu 1)))) (+ F 5))))))))

;; Usaha - usaha oleh beberapa gaya
(spit "data/fis1113/bab3/C2A2FCAG-1.txt"
(vec
(filter #(and (> (last %) 0) (> (first %) 2))
(let [vmu [0.1 0.2 0.3 0.4]
      alfis [[30 0.5 0.87] [37 0.6 0.8] [45 0.71 0.71] [53 0.8 0.6] [60 0.87 0.5]]
      ]
(loop [data [], F1 2]
   (if (> F1 20)
       data
       (recur (loop [data1 data, F2 2]
                    (if (> F2 20)
                          data1
                          (recur (loop [data2 data1, m 1]
                                       (if (> m 10)
                                       data2
                                       (recur (loop [data3 data2, ds 10]
                                                (if (> ds 40)
                                                    data3
                                                    (let [mu (nth vmu (rand-int (count vmu)))
                                                          valf (nth alfis (rand-int (count alfis)))
                                                          alf (first valf) sinalf (second valf) cosalf (last valf)
                                                          N (- (* m 10) (* F1 sinalf))
                                                          fg (* mu N)
                                                          F1x (* F1 cosalf)
                                                          W (if (> F1x F2) (* (- F1x F2 fg) ds) (* (- F2 F1x fg) ds))
                                                          ]
                                                    (recur (conj data3 [(Math/round N) F1 F2 mu m ds alf
                                                                        cosalf sinalf (nd W 1)])
                              (+ ds 7))))) (+ m 2)))) (+ F2 2)))) (+ F1 3))))))))

(defn nd [ang numd]
  (/ (Math/round (* ang (Math/pow 10 numd))) (Math/pow 10 numd)))



