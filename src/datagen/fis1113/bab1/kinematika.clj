;;Perpindahan dua dimensi
(spit "data/fis1113/bab1/C2A2FABA-m.txt"
   (loop [data [], a 1]
     (if (> a 3)
       data
       (recur (loop [data1 data, b 2]
                (if (> b 4)
                    data1
                    (recur (loop [data2 data1, c 3]
                             (if (> c 5)
                                 data2
                                 (recur (loop [data3 data2, d 2]
                                          (if (> d 4)
                                              data3
                                              (recur (loop [data4 data3, t1 0]
                                                       (if (> t1 2)
                                                           data4
                                                           (recur (loop [data5 data4, dt 1]
                                                                    (if (> dt 3)
                                                                        data5
                                                                        (recur
                                                                           (let [t2 (+ t1 dt)
                                                                                 x1y1 [(+ (* a t1) b) (+ (* c t1) d)]
                                                                                 x2y2 [(+ (* a t2) b) (+ (* c t2) d)]
                                                                                 dxy [(- (first x2y2) (first x1y1))
                                                                                      (- (last x2y2) (last x1y1))]
                                                                                 mdxy (+ (* (first dxy) (first dxy))
                                                                                         (* (second dxy) (second dxy)))]
                                                                           (conj data5 [a b c d t1 t2 x1y1 x2y2 dxy mdxy]))
              (inc dt)))) (inc t1)))) (inc d)))) (inc c)))) (inc b)))) (inc a)))))

;;Vektor posisi dua dimensi
(spit "data/fis1113/bab1/C2A2FABA-2.txt"
   (loop [data [], a 2]
     (if (> a 4)
       data
       (recur (loop [data1 data, b 2]
                (if (> b 4)
                    data1
                    (recur (loop [data2 data1, c 3]
                             (if (> c 5)
                                 data2
                                 (recur (loop [data3 data2, d 2]
                                          (if (> d 4)
                                              data3
                                              (recur (loop [data4 data3, t1 0]
                                                       (if (> t1 3)
                                                           data4
                                                           (recur (loop [data5 data4, dt 1]
                                                                    (if (> dt 3)
                                                                        data5
                                                                        (recur
                                                                           (let [t2 (+ t1 dt)
                                                                                 x1y1 [(+ (* a t1) b) (+ (* c t1) d)]
                                                                                 x2y2 [(+ (* a t2) b) (+ (* c t2) d)]
                                                                                 dxy [(- (first x2y2) (first x1y1))
                                                                                      (- (last x2y2) (last x1y1))]
                                                                                 mdxy (+ (* (first dxy) (first dxy))
                                                                                         (* (second dxy) (second dxy)))]
                                                                           (conj data5 [a b c d t1 x1y1]))
              (inc dt)))) (inc t1)))) (inc d)))) (inc c)))) (inc b)))) (inc a)))))

;; Vektor perpindahan
(spit "data/fis1113/bab1/C2A2FABA-3.txt"
   (loop [data [], a 2]
     (if (> a 4)
       data
       (recur (loop [data1 data, b 2]
                (if (> b 4)
                    data1
                    (recur (loop [data2 data1, c 3]
                             (if (> c 5)
                                 data2
                                 (recur (loop [data3 data2, d 2]
                                          (if (> d 4)
                                              data3
                                              (recur (loop [data4 data3, t1 0]
                                                       (if (> t1 3)
                                                           data4
                                                           (recur (loop [data5 data4, dt 1]
                                                                    (if (> dt 3)
                                                                        data5
                                                                        (recur
                                                                           (let [t2 (+ t1 dt)
                                                                                 x1y1 [(+ (* a t1) b) (+ (* c t1) d)]
                                                                                 x2y2 [(+ (* a t2) b) (+ (* c t2) d)]
                                                                                 dxy [(- (first x2y2) (first x1y1))
                                                                                      (- (last x2y2) (last x1y1))]
                                                                                 mdxy (+ (* (first dxy) (first dxy))
                                                                                         (* (second dxy) (second dxy)))]
                                                                           (conj data5 [a b c d t1 t2 dxy]))
              (inc dt)))) (inc t1)))) (inc d)))) (inc c)))) (inc b)))) (inc a)))))

;; Besar Vektor perpindahan
(spit "data/fis1113/bab1/C2A2FABA-4.txt"
   (loop [data [], a 2]
     (if (> a 4)
       data
       (recur (loop [data1 data, b 2]
                (if (> b 4)
                    data1
                    (recur (loop [data2 data1, c 3]
                             (if (> c 5)
                                 data2
                                 (recur (loop [data3 data2, d 2]
                                          (if (> d 4)
                                              data3
                                              (recur (loop [data4 data3, t1 0]
                                                       (if (> t1 3)
                                                           data4
                                                           (recur (loop [data5 data4, dt 1]
                                                                    (if (> dt 3)
                                                                        data5
                                                                        (recur
                                                                           (let [t2 (+ t1 dt)
                                                                                 x1y1 [(+ (* a t1) b) (+ (* c t1) d)]
                                                                                 x2y2 [(+ (* a t2) b) (+ (* c t2) d)]
                                                                                 dxy [(- (first x2y2) (first x1y1))
                                                                                      (- (last x2y2) (last x1y1))]
                                                                                 mdxy (+ (* (first dxy) (first dxy))
                                                                                         (* (second dxy) (second dxy)))]
                                                                           (conj data5 [a b c d t1 t2 mdxy]))
              (inc dt)))) (inc t1)))) (inc d)))) (inc c)))) (inc b)))) (inc a)))))

;; Kecepatan rata-rata dua dimensi
(spit "data/fis1113/bab1/C2A2FABB-1.txt"
   (loop [data [], a 2]
     (if (> a 4)
       data
       (recur (loop [data1 data, b 2]
                (if (> b 4)
                    data1
                    (recur (loop [data2 data1, c 3]
                             (if (> c 5)
                                 data2
                                 (recur (loop [data3 data2, d 2]
                                          (if (> d 4)
                                              data3
                                              (recur (loop [data4 data3, t1 0]
                                                       (if (> t1 3)
                                                           data4
                                                           (recur (loop [data5 data4, dt 1]
                                                                    (if (> dt 3)
                                                                        data5
                                                                        (recur
                                                                           (let [t2 (+ t1 dt)
                                                                                 x1y1 [(+ (* a t1) b) (+ (* c t1) d)]
                                                                                 x2y2 [(+ (* a t2) b) (+ (* c t2) d)]
                                                                                 dxy [(- (first x2y2) (first x1y1))
                                                                                      (- (last x2y2) (last x1y1))]
                                                                                 vavg [(/ (first dxy) dt)
                                                                                       (/ (last dxy) dt)]
                                                                                 mdxy (+ (* (first dxy) (first dxy))
                                                                                         (* (second dxy) (second dxy)))]
                                                                           (conj data5 [a b c d t1 t2 vavg]))
              (inc dt)))) (inc t1)))) (inc d)))) (inc c)))) (inc b)))) (inc a)))))
;; Besar Kecepatan rata-rata dua dimensi
(spit "data/fis1113/bab1/C2A2FABB-2.txt"
   (loop [data [], a 2]
     (if (> a 4)
       data
       (recur (loop [data1 data, b 2]
                (if (> b 4)
                    data1
                    (recur (loop [data2 data1, c 3]
                             (if (> c 5)
                                 data2
                                 (recur (loop [data3 data2, d 2]
                                          (if (> d 4)
                                              data3
                                              (recur (loop [data4 data3, t1 0]
                                                       (if (> t1 3)
                                                           data4
                                                           (recur (loop [data5 data4, dt 1]
                                                                    (if (> dt 3)
                                                                        data5
                                                                        (recur
                                                                           (let [t2 (+ t1 dt)
                                                                                 x1y1 [(+ (* a t1) b) (+ (* c t1) d)]
                                                                                 x2y2 [(+ (* a t2) b) (+ (* c t2) d)]
                                                                                 dxy [(- (first x2y2) (first x1y1))
                                                                                      (- (last x2y2) (last x1y1))]
                                                                                 vavg [(/ (first dxy) dt)
                                                                                       (/ (last dxy) dt)]
                                                                                 mv (+ (* (first vavg) (first vavg))
                                                                                         (* (second vavg) (second vavg)))]
                                                                           (conj data5 [a b c d t1 t2 mv]))
              (inc dt)))) (inc t1)))) (inc d)))) (inc c)))) (inc b)))) (inc a)))))

;;Kecepatan sesaat turunan
(spit "data/fis1113/bab1/C2A2FABC-0.txt"
(loop [data [], a 2]
   (if (> a 4)
       data
       (recur (loop [data1 data, b 3]
                    (if (> b 5)
                          data1
                          (recur (loop [data2 data1, c 1]
                                       (if (> c 4)
                                       data2
                                       (recur (loop [data3 data2, t 0]
                                                (if (> t 5)
                                                    data3
                                                    (let [vt (+ (* 2 a t) b)]
                                                    (recur (conj data3 [a b c t vt])
                        (inc t))))) (inc c)))) (inc b)))) (inc a)))))

;; Vektor Kecepatan sesaat
(spit "data/fis1113/bab1/C2A2FABC-1.txt"
   (loop [data [], a 2]
     (if (> a 4)
       data
       (recur (loop [data1 data, b 2]
                (if (> b 4)
                    data1
                    (recur (loop [data2 data1, c 3]
                             (if (> c 5)
                                 data2
                                 (recur (loop [data3 data2, d 2]
                                          (if (> d 4)
                                              data3
                                              (recur (loop [data4 data3, t 0]
                                                      (if (> t 5)
                                                          data4
                                                          (recur
                                                          (let [vt [(+ (* 2 a t) b) c]]
                                                             (conj data4 [a b c d t vt]))
               (inc t)))) (inc d)))) (inc c)))) (inc b)))) (inc a)))))

;; Besar Kecepatan sesaat
(spit "data/fis1113/bab1/C2A2FABC-2.txt"
   (loop [data [], a 2]
     (if (> a 4)
       data
       (recur (loop [data1 data, b 2]
                (if (> b 4)
                    data1
                    (recur (loop [data2 data1, c 3]
                             (if (> c 5)
                                 data2
                                 (recur (loop [data3 data2, d 2]
                                          (if (> d 4)
                                              data3
                                              (recur (loop [data4 data3, t 0]
                                                      (if (> t 5)
                                                          data4
                                                          (recur
                                                          (let [vt [(+ (* 2 a t) b) c]
                                                                mvt (+ (* (first vt) (first vt))
                                                                       (* (last vt) (last vt)))]
                                                             (conj data4 [a b c d t mvt]))
               (inc t)))) (inc d)))) (inc c)))) (inc b)))) (inc a)))))

;;Integral kecepatan menjadi posisi.
(spit "data/fis1113/bab1/C2A2FABE-0.txt"
(let [vso [0 1 2 3 4 5 6 7 8 9]]
(loop [data [], a 2]
   (if (> a 10)
       data
       (recur (loop [data1 data, b 1]
                            (if (> b 10)
                              data1
                              (recur (loop [data2 data1, t 0]
                                       (if (> t 5)
                                           data2
                                           (let [so (nth vso (rand-int 10))]
                                           (recur (conj data2 [a
                                                               b
                                                               t
                                                               so
                                                               (+ (/ (* a t t) 2) (* b t) so)
                                                               ]) (inc t))))) (inc b)))) (inc a))))))
;;Integral kecepatan - posisi
(spit "data/fis1113/bab1/C2A2FABE-3.txt"
   (loop [data [], a 2]
     (if (> a 8)
       data
       (recur (loop [data1 data, b 1]
                (if (> b 4)
                    data1
                    (recur (loop [data2 data1, c 2]
                             (if (> c 8)
                                 data2
                                 (recur (loop [data3 data2, d 1]
                                          (if (> d 3)
                                              data3
                                              (recur (loop [data4 data3, t 0]
                                                      (if (> t 4)
                                                          data4
                                                          (recur
                                                          (let [
                                                                sox (rand-int 9)
                                                                soy (rand-int 9)
                                                                st [(+ (/ (* a t t) 2) (* b t) sox)
                                                                    (+ (/ (* c t t) 2) (* d t) soy)]
                                                                ]
                                                             (conj data4 [a b c d t sox soy st]))
               (inc t)))) (inc d)))) (+ c 2)))) (inc b)))) (+ a 2)))))

;; Laju anguler rata-rata
(spit "data/fis1113/bab1/C2A2FADB-2.txt"
   (loop [data [], a 2]
     (if (> a 4)
       data
       (recur (loop [data1 data, b 2]
                (if (> b 4)
                    data1
                    (recur (loop [data2 data1, c 3]
                             (if (> c 5)
                                 data2
                                 (recur (loop [data3 data2, dt 1]
                                          (if (> dt 4)
                                              data3
                                              (recur (loop [data4 data3, t1 0]
                                                      (if (> t1 5)
                                                          data4
                                                          (recur
                                                          (let [t2 (+ t1 dt)
                                                                oavg (/ (- (+ (* a t2 t2) (* b t2) c)
                                                                           (+ (* a t1 t1) (* b t1) c)) dt)
                                                                ]
                                                             (conj data4 [a b c t1 t2 oavg]))
               (inc t1)))) (inc dt)))) (inc c)))) (inc b)))) (inc a)))))

;Percepatan sentripetal
(spit "data/fis1113/bab1/C2A2FADD-1.txt"
(loop [data [], w 1]
   (if (> w 10)
       data
       (recur (loop [data1 data, R 10]
                            (if (> R 50)
                              data1
                              (recur (conj data1 [w
                                                  R
                                                  (nd (* w w R 0.01) 2)])
                                     (+ R 1)))) (+ w 1)))))

;;Percepatan sentripetal  turunan theta --> omega : as = omega^2 R
(spit "data/fis1113/bab1/C2A2FADD-2.txt"
(loop [data [], a 2]
   (if (> a 4)
       data
       (recur (loop [data1 data, b 3]
                    (if (> b 5)
                          data1
                          (recur (loop [data2 data1, c 1]
                                       (if (> c 4)
                                       data2
                                       (recur (loop [data3 data2, t 0]
                                                (if (> t 5)
                                                    data3
                                                    (let [R (+ 1 (rand-int 5))
                                                          wt (+ (* 2 a t) b)
                                                          ast (* wt wt R)]
                                                    (recur (conj data3 [a b c t R ast]) (inc t)))))
                                                                           (inc c)))) (inc b)))) (inc a)))))

;Percepatan tangensial
(spit "data/fis1113/bab1/C2A2FADE-2.txt"
(loop [data [], alf 1]
   (if (> alf 10)
       data
       (recur (loop [data1 data, R 10]
                            (if (> R 50)
                              data1
                              (recur (conj data1 [alf
                                                  R
                                                  (nd (* alf R 0.01) 2)])
                                     (+ R 1)))) (+ alf 1)))))

;;Gerak Melingkar Berubah Beraturan
(spit "data/fis1113/bab1/C2A2FADG-0.txt"
(loop [data [], wo 1]
   (if (> wo 10)
       data
       (recur (loop [data1 data, alf 1]
                            (if (> alf 10)
                              data1
                              (recur (loop [data2 data1, t 1]
                                       (if (> t 5)
                                           data2
                                           (let [wt (+ wo (* alf t))]
                                           (recur (conj data2 [wo
                                                               alf
                                                               t
                                                               wt
                                                               ]) (inc t))))) (inc alf)))) (inc wo)))))
;;Gerak Melingkar Berubah Beraturan
(spit "data/fis1113/bab1/C2A2FADG-1.txt"
(loop [data [], alf 1]
   (if (> alf 10)
       data
       (recur (loop [data1 data, t 10]
                            (if (> t 50)
                              data1
                              (recur (conj data1 [alf
                                                  t
                                                  (* alf t)
                                                  ])
                                     (+ t 1)))) (+ alf 1)))))
;;Gerak Melingkar Berubah Beraturan
(spit "data/fis1113/bab1/C2A2FADG-2.txt"
(loop [data [], alf 1]
   (if (> alf 10)
       data
       (recur (loop [data1 data, put 20]
                            (if (> put 60)
                              data1
                              (recur (conj data1 [alf
                                                  put
                                                  (* 4 alf put)
                                                  ])
                                     (+ put 1)))) (+ alf 1)))))

;;Gerak Melingkar - percepatan total
(spit "data/fis1113/bab1/C2A2FADEA-0.txt"
(loop [data [], a 2]
   (if (> a 3)
       data
       (recur (loop [data1 data, b 1]
                            (if (> b 5)
                              data1
                              (recur (loop [data2 data1, t 1]
                                       (if (> t 3)
                                           data2
                                           (let [R (+ 1 (rand-int 2))
                                                 aT (* a R)
                                                 wt (+ (* a t) b)
                                                 as (* wt wt R)
                                                 atot (+ (* aT aT) (* as as))]
                                           (recur (conj data2 [a
                                                               b
                                                               t
                                                               R
                                                               atot
                                                               ]) (inc t))))) (inc b)))) (inc a)))))

(defn nd [ang numd]
  (/ (Math/round (* ang (Math/pow 10 numd))) (Math/pow 10 numd)))
