(ns rotor.soal.C2A2F
  (:require [compojure.core :refer :all]
            [rotor.models.genfunc :as fnc]
            [rotor.soal.C1X1F :as fis10]
            [rotor.soal.C2A2Fb :as fis11b]
            ))

(def my-ns "rotor.soal.C2A2F")

(defn C2A2FABA-0 []
  (fis10/C1X1FBAE-0))
(defn C2A2FABA-1 []
  (fis10/C1X1FBAE-1))

(defn C2A2FABA-2 []
  "Kinematika dengan vektor"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABA-2.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) d (nth datum 3) t1 (nth datum 4) x1y1 (nth datum 5)
        rt (str "$r(t)=(" a "t+" b ")i+(" c "t+" d ")j$")
        var ["i" "j"]
        rd (rand-int 0)
        angka (cond
                    (= rd 0) [x1y1 var]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Vektor posisi (r) suatu benda pada waktu (t) dinyatakan dengan persamaan " rt "
                              yang mana $i$ adalah vektor satuan ke arah sumbu-x positif dan $j$ adalah vektor satuan ke arah
                              sumbu-y positif. Vektor posisi benda pada pada detik ke " t1 " adalah $r(" t1 ")= ... $")
                )
         :pilihan (fnc/create-option11 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FABA-3 []
  "Vektor perpindahan"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABA-3.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) d (nth datum 3) t1 (nth datum 4) t2 (nth datum 5)
        dxy (nth datum 6)
        rt (str "$r(t)=(" a "t+" b ")i+(" c "t+" d ")j$")
        var ["i" "j"]
        rd (rand-int 0)
        angka (cond
                    (= rd 0) [dxy var]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Vektor posisi (r) suatu benda pada waktu (t) dinyatakan dengan persamaan " rt "
                              yang mana $i$ adalah vektor satuan ke arah sumbu-x positif dan $j$ adalah vektor satuan ke arah
                              sumbu-y positif. Vektor perpindahan benda dari detik ke " t1 " sampai detik ke " t2 "
                              adalah $r_{" t1 t2 "}= ... $")
                )
         :pilihan (fnc/create-option11 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FABA-4 []
  "Vektor perpindahan"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABA-4.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) d (nth datum 3) t1 (nth datum 4) t2 (nth datum 5)
        mdxy (nth datum 6)
        rt (str "$r(t)=(" a "t+" b ")i+(" c "t+" d ")j$")
        op "\\sqrt"
        rd (rand-int 0)
        angka (cond
                    (= rd 0) [op mdxy]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Vektor posisi (r) suatu benda pada waktu (t) dinyatakan dengan persamaan " rt "
                              yang mana $i$ adalah vektor satuan ke arah sumbu-x positif dan $j$ adalah vektor satuan ke arah
                              sumbu-y positif. Besar perpindahan benda dari detik ke " t1 " sampai detik ke " t2 "
                              adalah .... satuan")
                )
         :pilihan (fnc/create-option12 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FABA []
  "Kinematika dengan vektor - posisi dan perpindahan"
  ;(C2A2FABA-4))
  (let [x (rand-int 5)] ((resolve (symbol my-ns (str "C2A2FABA-" x))))))

(defn C2A2FABB-0 []
  (fis10/C1X1FBAF))
(defn C2A2FABB-1 []
  "Kecepatan-rata2"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABB-1.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) d (nth datum 3) t1 (nth datum 4) t2 (nth datum 5)
        vavg (nth datum 6)
        rt (str "$r(t)=(" a "t+" b ")i+(" c "t+" d ")j$")
        var ["i" "j"]
        rd (rand-int 0)
        angka (cond
                    (= rd 0) [vavg var]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Vektor posisi (r) suatu benda pada waktu (t) dinyatakan dengan persamaan " rt "
                              yang mana $i$ adalah vektor satuan ke arah sumbu-x positif dan $j$ adalah vektor satuan ke arah
                              sumbu-y positif. Vektor kecepatan rata-ratanya dari detik ke " t1 " sampai detik ke " t2 "
                              adalah $v_{" t1 t2 "}= ...$")
                )
         :pilihan (fnc/create-option11 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FABB-2 []
  "Besar Kecepatan-rata2"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABB-2.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) d (nth datum 3) t1 (nth datum 4) t2 (nth datum 5)
        vavg (nth datum 6)
        rt (str "$r(t)=(" a "t+" b ")i+(" c "t+" d ")j$")
        op "\\sqrt"
        rd (rand-int 0)
        angka (cond
                    (= rd 0) [op vavg]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Vektor posisi (r) suatu benda pada waktu (t) dinyatakan dengan persamaan " rt "
                              yang mana $i$ adalah vektor satuan ke arah sumbu-x positif dan $j$ adalah vektor satuan ke arah
                              sumbu-y positif. Besar kecepatan rata-ratanya dari detik ke " t1 " sampai detik ke " t2 "
                              adalah ... satuan.")
                )
         :pilihan (fnc/create-option12 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FABB []
  "Kinematika dengan vektor - posisi dan perpindahan"
  ;(C2A2FABB-0))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C2A2FABB-" x))))))

(defn C2A2FABC-0 []
  "Kecepatan sesaat"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABC-0.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) t (nth datum 3) vt (nth datum 4)
        st (str "$s(t)=" a "t^2+" b "t +" c "$")
        rd (rand-int 0)
        angka (cond
                    (= rd 0) vt
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Posisi (s) suatu benda yang sedang bergerak lurus pada waktu (t) dinyatakan dengan persamaan " st "
                              dimana s dalam meter dan t dalam detik. Besar kecepatan benda pada detik ke " t " adalah ... m/s.")
                )
         :pilihan (fnc/create-option1b angka jwb)
         :jawaban jwb
         }))
(defn C2A2FABC-1 []
  "Vektor kecepatan"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABC-1.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) d (nth datum 3) t (nth datum 4) vt (nth datum 5)
        rt (str "$r(t)=(" a "t^2+" b "t)i+(" c "t+" d ")j$")
        var ["i" "j"]
        rd (rand-int 0)
        angka (cond
                    (= rd 0) [vt var]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Vektor posisi (r) suatu benda pada waktu (t) dinyatakan dengan persamaan " rt "
                              yang mana $i$ adalah vektor satuan ke arah sumbu-x positif dan $j$ adalah vektor satuan ke arah
                              sumbu-y positif. Vektor kecepatan benda pada detik ke " t "
                              adalah $v(" t ")={}... $ m/s. (Semua satuan dalam SI).")
                )
         :pilihan (fnc/create-option11 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FABC-2 []
  "Besar Kecepatan"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABC-2.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) d (nth datum 3) t (nth datum 4) mvt (nth datum 5)
        rt (str "$r(t)=(" a "t^2+" b "t)i+(" c "t+" d ")j$")
        op "\\sqrt"
        rd (rand-int 0)
        angka (cond
                    (= rd 0) [op mvt]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Vektor posisi (r) suatu benda pada waktu (t) dinyatakan dengan persamaan " rt "
                              yang mana $i$ adalah vektor satuan ke arah sumbu-x positif dan $j$ adalah vektor satuan ke arah
                              sumbu-y positif. Besar kecepatan benda pada detik ke " t "
                              adalah ... m/s (semua satuan dalam SI).")
                )
         :pilihan (fnc/create-option12 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FABC []
  "Kinematika dengan vektor - Kecepatan sesaat"
  ;(C2A2FABC-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C2A2FABC-" x))))))

(defn C2A2FABD-0 []
  "Percepatan-rata2"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABB-1.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) d (nth datum 3) t1 (nth datum 4) t2 (nth datum 5)
        aavg (nth datum 6)
        vt (str "$v(t)=(" a "t+" b ")i+(" c "t+" d ")j$")
        var ["i" "j"]
        rd (rand-int 0)
        angka (cond
                    (= rd 0) [aavg var]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Vektor kecepatan (v) suatu benda pada waktu (t) dinyatakan dengan persamaan " vt "
                              yang mana $i$ adalah vektor satuan ke arah sumbu-x positif dan $j$ adalah vektor satuan ke arah
                              sumbu-y positif. Vektor percepatan rata-ratanya dari detik ke " t1 " sampai detik ke " t2 "
                              adalah $a_{" t1 t2 "}={}...$")
                )
         :pilihan (fnc/create-option11 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FABD-1 []
  "Besar percepatan-rata2"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABB-2.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) d (nth datum 3) t1 (nth datum 4) t2 (nth datum 5)
        aavg (nth datum 6)
        vt (str "$v(t)=(" a "t+" b ")i+(" c "t+" d ")j$")
        op "\\sqrt"
        rd (rand-int 0)
        angka (cond
                    (= rd 0) [op aavg]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Vektor kecepatan (v) suatu benda pada waktu (t) dinyatakan dengan persamaan " vt "
                              yang mana $i$ adalah vektor satuan ke arah sumbu-x positif dan $j$ adalah vektor satuan ke arah
                              sumbu-y positif. Besar percepatan rata-ratanya dari detik ke " t1 " sampai detik ke " t2 "
                              adalah ... satuan.")
                )
         :pilihan (fnc/create-option12 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FABD-2 []
  "Vektor percepatan"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABC-1.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) d (nth datum 3) t (nth datum 4) at (nth datum 5)
        vt (str "$v(t)=(" a "t^2+" b "t)i+(" c "t+" d ")j$")
        var ["i" "j"]
        rd (rand-int 0)
        angka (cond
                    (= rd 0) [at var]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Vektor kecepatan (v) suatu benda pada waktu (t) dinyatakan dengan persamaan " vt "
                              yang mana $i$ adalah vektor satuan ke arah sumbu-x positif dan $j$ adalah vektor satuan ke arah
                              sumbu-y positif. Vektor percepatan benda pada detik ke " t "
                              adalah $a(" t ")={}... $ m/s. (Semua satuan dalam SI).")
                )
         :pilihan (fnc/create-option11 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FABD-3 []
  "Besar Percepatan"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABC-2.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) d (nth datum 3) t (nth datum 4) mat (nth datum 5)
        vt (str "$v(t)=(" a "t^2+" b "t)i+(" c "t+" d ")j$")
        op "\\sqrt"
        rd (rand-int 0)
        angka (cond
                    (= rd 0) [op mat]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Vektor kecepatan (v) suatu benda pada waktu (t) dinyatakan dengan persamaan " vt "
                              yang mana $i$ adalah vektor satuan ke arah sumbu-x positif dan $j$ adalah vektor satuan ke arah
                              sumbu-y positif. Besar percepatan benda pada detik ke " t "
                              adalah ... $m/s^2$ (semua satuan dalam SI).")
                )
         :pilihan (fnc/create-option12 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FABD-4 []
  (fis10/C1X1FBAG))
(defn C2A2FABD []
  "Kinematika dengan vektor - Percepatan rata-rata dan sesaat"
  ;(C2A2FABD-4))
  (let [x (rand-int 5)] ((resolve (symbol my-ns (str "C2A2FABD-" x))))))

(defn C2A2FABE-0 []
  "Integral kecepatan - posisi"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABE-0.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) t (nth datum 2) so (nth datum 3) st (nth datum 4)
        vt (str "$v_t=(" a "t+" b ")$")
        rd (rand-int 3)
        angka (cond
                    (= rd 0) st
                    (= rd 1) so
                    (= rd 2) t
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu benda bergerak lurus dari posisi awal " so " meter dengan kecepatan terhadap waktu
                              " vt " m/s. Posisi benda pada detik ke " t " adalah ... meter.")
                (= rd 1) (str "Suatu benda bergerak lurus dengan kecepatan terhadap waktu
                              " vt " m/s. Jika posisi benda pada detik ke " t " adalah " st " m maka posisi awal
                              benda adalah ... m.")
                (= rd 2) (str "Suatu benda bergerak lurus dari posisi awal " so " dengan kecepatan terhadap waktu
                              " vt " m/s. Jika posisi benda adalah " st " m maka benda telah bergerak selama ... sekon.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C2A2FABE-1 []
  "Integral percepatan - kecepatan"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABE-0.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) t (nth datum 2) vo (nth datum 3) vt (nth datum 4)
        at (str "$a_t=(" a "t+" b ")$")
        rd (rand-int 2)
        angka (cond
                    (= rd 0) vt
                    (= rd 1) vo
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu benda bergerak lurus dengan kecepatan awal " vo " m/s dan percepatan terhadap waktu
                              " at " $m/s^2$. Kecepatan benda pada detik ke " t " adalah ... m/s.")
                (= rd 1) (str "Suatu benda bergerak lurus dengan percepatan terhadap waktu
                              " at "  $m/s^2$. Jika kecepatan benda pada detik ke " t " adalah " vt " m/s maka kecepatan awal
                              benda adalah ... m/s.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C2A2FABE-2 []
  "Integral kecepatan - posisi dua dimensi"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABE-2.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) d (nth datum 3) t (nth datum 4)
        sox (nth datum 5) soy (nth datum 6) st (nth datum 7)
        vt (str "$v(t)=(" a "t+" b ")i+(" c "t+" d ")j$")
        var ["i" "j"]
        rd (rand-int 0)
        angka (cond
                    (= rd 0) [st var]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Vektor kecepatan (v) suatu benda pada waktu (t) dinyatakan dengan persamaan " vt "
                              yang mana $i$ adalah vektor satuan ke arah sumbu-x positif dan $j$ adalah vektor satuan ke arah
                              sumbu-y positif. Jika koordinat posisi awal benda adalah (" sox "," soy ") m, maka
                              vektor posisi benda pada detik ke " t "
                              adalah $s(" t ")={}... $ m. (Semua satuan dalam SI).")
                )
         :pilihan (fnc/create-option11 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FABE-3 []
  "Integral percepatan - kecepatan dua dimensi"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABE-2.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) d (nth datum 3) t (nth datum 4)
        vox (nth datum 5) voy (nth datum 6) vt (nth datum 7)
        at (str "$a(t)=(" a "t+" b ")i+(" c "t+" d ")j$")
        var ["i" "j"]
        rd (rand-int 0)
        angka (cond
                    (= rd 0) [vt var]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Vektor percepatan (a) suatu benda pada waktu (t) dinyatakan dengan persamaan " at "
                              yang mana $i$ adalah vektor satuan ke arah sumbu-x positif dan $j$ adalah vektor satuan ke arah
                              sumbu-y positif. Jika vektor kecepatan awal benda adalah $(" vox "i+" voy "j)$ m, maka
                              vektor kecepatan benda pada detik ke " t "
                              adalah $v(" t ")={}... $ m/s. (Semua satuan dalam SI).")
                )
         :pilihan (fnc/create-option11 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FABE []
  "Kinematika dengan vektor - Integral"
  ;(C2A2FABE-3))
  (let [x (rand-int 4)] ((resolve (symbol my-ns (str "C2A2FABE-" x))))))

;; Gerak Melingkar
(defn C2A2FADA-0 []
  "Jarak tempuh dan sudut tempuh"
  (fis10/C1X1FCAA))
(defn C2A2FADA []
  "Gerak Melingkar - Jarak tempuh dan sudut tempuh"
  (C2A2FADA-0))
  ;(let [x (rand-int 4)] ((resolve (symbol my-ns (str "C2A2FADA-" x))))))

(defn C2A2FADB-0 []
  "Laju anguler/kecepatan sudut"
  (fis10/C1X1FCAB))
(defn C2A2FADB-1 []
  "Kecepatan sudut sesaat"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABC-0.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) t (nth datum 3) vt (nth datum 4)
        st (str "$\\theta(t)=" a "t^2+" b "t +" c "$")
        rd (rand-int 0)
        angka (cond
                    (= rd 0) vt
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Posisi sudut  suatu benda yang sedang bergerak melingkar dinyatakan
                              dengan persamaan " st "
                              dimana $\\theta$ dalam rad dan t dalam sekon. Laju anguler benda pada detik ke " t "
                              adalah ... rad/s.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C2A2FADB-2 []
  "Kecepatan sudut rata-rata"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FADB-2.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) t1 (nth datum 3) t2 (nth datum 4) oavg (nth datum 5)
        st (str "$\\theta(t)=" a "t^2+" b "t +" c "$")
        rd (rand-int 0)
        angka (cond
                    (= rd 0) oavg
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Posisi sudut  suatu benda yang sedang bergerak melingkar dinyatakan
                              dengan persamaan " st "
                              dimana $\\theta$ dalam rad dan t dalam sekon. Kecepatan sudut rata-rata benda dari
                              detik ke " t1 " sampai detik ke " t2 " adalah ... rad/s.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C2A2FADB []
  "Gerak Melingkar - laju anguler/kecepatan sudut"
  ;(C2A2FADB-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C2A2FADB-" x))))))

(defn C2A2FADC-0 []
  "Frekuensi dan perioda"
  (fis10/C1X1FCAC))
(defn C2A2FADC []
  "Gerak Melingkar - Frekuensi dan perioda"
  (C2A2FADC-0))

(defn C2A2FADD-0 []
  "Percepatan sentripetal"
  (fis10/C1X1FCAD))
(defn C2A2FADD-1 []
  "Percepatan sentripetal"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FADD-1.txt"))
        datum (nth data (rand-int (count data)))
        w (nth datum 0) R (nth datum 1) as (nth datum 2)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) as
                    (= rd 1) w
                    (= rd 2) R
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah benda bergerak melingkar dengan kecepatan sudut " w " rad/s. Jika jejari lintasannya
                              adalah " R " cm, maka percepatan sentripetal yang dialaminya adalah ... $m/s^2$")
                (= rd 1) (str "Sebuah benda bergerak melingkar dengan jejari lintasan " R " cm. Jika percepatan sentripetal
                              yang dialaminya " as " $m/s^2$, maka kecepatan sudut benda itu adalah ... rad/s.")
                (= rd 2) (str "Sebuah benda bergerak melingkar dengan kecepatan sudut " w " rad/s. Jika percepatan sentripetal
                              yang dialaminya " as " $m/s^2$, maka jejari lintasan benda itu adalah ... cm.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C2A2FADD-2 []
  "Percepatan sentripetal"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FADD-2.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) t (nth datum 3) R (nth datum 4) ast (nth datum 5)
        st (str "$\\theta(t)=" a "t^2+" b "t +" c "$")
        rd (rand-int 0)
        angka (cond
                    (= rd 0) ast
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Posisi sudut  suatu benda yang sedang bergerak melingkar dinyatakan
                              dengan persamaan " st "
                              dimana $\\theta$ dalam rad dan t dalam sekon. Jika jejari lintasan benda " R " m,
                              maka percepatan sentripetal yang dialami benda pada detik ke " t "
                              adalah ... $m/s^2$.")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FADD []
  "Gerak Melingkar - percepatan sentripetal"
  ;(C2A2FADD-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C2A2FADD-" x))))))

(defn C2A2FADE-0 []
  "Percepatan sudut sesaat"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FABC-0.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) t (nth datum 3) alft (nth datum 4)
        wt (str "$\\omega(t)=" a "t^2+" b "t +" c "$")
        rd (rand-int 0)
        angka (cond
                    (= rd 0) alft
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Kecepatan sudut  suatu benda yang sedang bergerak melingkar dinyatakan
                              dengan persamaan " wt "
                              dimana $\\omega$ dalam rad/s  dan t dalam sekon. Percepatan sudut benda pada detik ke " t "
                              adalah ... $rad/s^2$.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C2A2FADE-1 []
  "Percepatan sudut rata-rata"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FADB-2.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) c (nth datum 2) t1 (nth datum 3) t2 (nth datum 4) alfavg (nth datum 5)
        wt (str "$\\omega(t)=" a "t^2+" b "t +" c "$")
        rd (rand-int 0)
        angka (cond
                    (= rd 0) alfavg
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Kecepatan sudut suatu benda yang sedang bergerak melingkar dinyatakan
                              dengan persamaan " wt "
                              dimana $\\omega$ dalam rad/s dan t dalam sekon. Percepatan sudut rata-rata benda dari
                              detik ke " t1 " sampai detik ke " t2 " adalah ... $rad/s^2$.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C2A2FADE-2 []
  "Percepatan tangensial"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FADE-2.txt"))
        datum (nth data (rand-int (count data)))
        alf (nth datum 0) R (nth datum 1) aT (nth datum 2)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) aT
                    (= rd 1) alf
                    (= rd 2) R
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah titik pada roda yang  bergerak melingkar dengan percepatan sudut " alf " $rad/s^2$
                              berada pada jarak  " R " cm dari pusat roda.Percepatan tangensial yang dialaminya
                              adalah ... $m/s^2$.")
                (= rd 1) (str "Sebuah benda bergerak melingkar dengan jejari lintasan " R " cm. Jika percepatan tangensial
                              yang dialaminya " aT " $m/s^2$, maka percepatan sudut benda itu adalah ... $rad/s^2$.")
                (= rd 2) (str "Sebuah benda bergerak melingkar dengan pecepatan sudut " alf " $rad/s^2$.
                              Jika percepatan tangensial yang dialaminya " aT " $m/s^2$, maka jejari lintasan benda
                              itu adalah ... cm.")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FADE []
  "Gerak Melingkar - percepatan sudut"
  ;(C2A2FADE-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C2A2FADE-" x))))))

(defn C2A2FADEA-0 []
  "Percepatan total"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FADEA-0.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) t (nth datum 2) R (nth datum 3) atot (nth datum 4)
        wt (str "$\\omega(t)=" a "t+" b "$")
        op "\\sqrt"
        rd (rand-int 0)
        angka (cond
                    (= rd 0) [op atot]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah benda bergerak melingkar dengan kecepatan sudut berubah terhadap waktu sesuai dengan
                              persamaan " wt " ($\\omega$ dalam rad/s dan t dalam s). Jika jejari lintasan benda adalah
                              " R " m maka percepatan total benda pada detik ke " t " adalah ... m/s$^2$."))
         :pilihan (fnc/create-option12 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FADEA []
  "Gerak Melingkar - percepatan total"
  (C2A2FADEA-0))
  ;(let [x (rand-int 3)] ((resolve (symbol my-ns (str "C2A2FADEA-" x))))))

(defn C2A2FADF-0 []
  (fis10/C1X1FCAE))
(defn C2A2FADF []
  "Gerak Melingkar - GMB"
  (C2A2FADF-0))
  ;(let [x (rand-int 3)] ((resolve (symbol my-ns (str "C2A2FADF-" x))))))

(defn C2A2FADG-0 []
  "GMBB - kecepatan sudut"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FADG-0.txt"))
        datum (nth data (rand-int (count data)))
        wo (nth datum 0) alf (nth datum 1) t (nth datum 2) wt (nth datum 3)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) wt
                    (= rd 1) alf
                    (= rd 2) t
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu piringan berputar dengan kecepatan sudut awal " wo " rad/s dan percepatan sudut konstan
                              " alf " $rad/s^2$. Setelah " t " sekon kecepatan sudut piringan akan menjadi ... rad/s.")
                (= rd 1) (str "Sebuah roda berputar dengan kecepatan sudut awal " wo " rad/s. Jika setelah " t " detik
                              kecepatan sudutnya menjadi " wt " rad/s maka percepatan sudutnya adalah ... $rad/s^2$.")
                (= rd 2) (str "Suatu piringan berputar dengan kecepatan sudut awal " wo " rad/s dan percepatan sudut konstan
                              " alf " $rad/s^2$. Untuk mencapai kecepatan sudut " wt " rad/s dibutuhkan waktu ... sekon.")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FADG-1 []
  "GMBB - kecepatan sudut"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FADG-1.txt"))
        datum (nth data (rand-int (count data)))
        alf (nth datum 0) t (nth datum 1) wo (nth datum 2)
        rd (rand-int 3)
        angka (cond
                    (= rd 0) t
                    (= rd 1) wo
                    (= rd 2) alf
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu piringan yang mula-mula berputar dengan  kecepatan sudut " wo " rad/s
                              diperlambat dengan percepatan sudut " alf " rad/s$^2$ sampai berhenti. Waktu yang
                              dibutuhkan adalah ... sekon.")
                (= rd 1) (str "Untuk menghentikan putaran suatu roda diperlukan perlambatan sudut sebesar " alf " rad/s$^2$
                              selama " t " sekon. Kecepatan sudut awal roda tersebut adalah ... rad/s.")
                (= rd 2) (str "Roda yang berputar dengan kecepatan sudut " wo " rad/s hendak dihentikan dalam waktu " t "
                              sekon. Besar percepatan sudut yang diperlukan adalah ... rad/s$^2$.")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FADG-2 []
  "GMBB - kecepatan sudut"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FADG-2.txt"))
        datum (nth data (rand-int (count data)))
        alf (nth datum 0) put (nth datum 1) wo (nth datum 2)
        rd (rand-int 2)
        angka (cond
                    (= rd 0) alf
                    (= rd 1) put
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Suatu piringan yang mula-mula berputar dengan  kecepatan sudut " wo "$\\pi$ rad/s
                              diperlambat sehingga mengalami " put " putaran sampai berhenti. Perlambatan sudut
                              yang dialami dalam proses tersebut adalah ... rad/s$^2$.")
                (= rd 1) (str "Untuk menghentikan putaran suatu roda diperlukan perlambatan sudut sebesar " alf " rad/s$^2$.
                              Jika kecepatan sudut awal roda tersebut adalah " wo "$\\pi$ rad/s
                              maka jumlah putaran yang dialami roda sejak diperlambat adalah ... putaran.")
                )
         :pilihan (fnc/create-option1b angka jwb)
         :jawaban jwb
         }))
(defn C2A2FADG []
  "Gerak Melingkar - GMBB"
  ;(C2A2FADG-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C2A2FADG-" x))))))

(defn C2A2FAEA-0 []
  "Gerak Parabola"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FAEA-0.txt"))
        datum (nth data (rand-int (count data)))
        vo (nth datum 0) alf (nth datum 1) sinalf (nth datum 2) cosalf (nth datum 3) t (nth datum 4)
        vt (nth datum 5)
        rd (rand-int 0)
        angka (cond
                    (= rd 0) vt
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah peluru ditembakkan dengan kecepatan awal " vo " m/s dan sudut elevasi $" alf "^o$ dari
                              permukaan tanah. Jika $sin{}" alf "^o$ = " sinalf " dan $cos{}" alf "^o$ = " cosalf ",
                              maka laju benda pada detik ke " t " adalah $\\sqrt{....}$")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FAEA-1 []
  "Gerak Parabola"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FAEA-1.txt"))
        datum (nth data (rand-int (count data)))
        vo (nth datum 0) alf (nth datum 1) sinalf (nth datum 2) cosalf (nth datum 3) t (nth datum 4)
        x (nth datum 5) y (nth datum 6)
        rd (rand-int 0)
        angka (cond
                    (= rd 0) [x y]
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah peluru ditembakkan dengan kecepatan awal " vo " m/s dan sudut elevasi $" alf "^o$ dari
                              permukaan tanah. Jika posisi peluru terhadap waktu dinyatakan dalam koordinat [x(t) ,y(t)] m,
                              maka x(" t ") dan y(" t ") adalah ... m ($sin " alf "^o$ = " sinalf ",
                              $cos" alf "^o$ = " cosalf ").")
                )
         :pilihan (fnc/create-option5a angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FAEA-2 []
  "Gerak Parabola"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FAEA-2.txt"))
        datum (nth data (rand-int (count data)))
        vo (nth datum 0) alf (nth datum 1) sinalf (nth datum 2) cosalf (nth datum 3) vx (nth datum 4) tm (nth datum 5)
        xm (nth datum 6) ym (nth datum 7)
        rd (rand-int 0)
        angka (cond
                    (= rd 0) tm
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah peluru ditembakkan dengan kecepatan awal " vo " m/s dan sudut elevasi $" alf "^o$ dari
                              permukaan tanah. Waktu yang dibutuhkan peluru sampai titik tertingginya adalah ... sekon
                              ($sin " alf "^o$ = " sinalf ", $cos" alf "^o$ = " cosalf ").")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FAEA-3 []
  "Gerak Parabola"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FAEA-2.txt"))
        datum (nth data (rand-int (count data)))
        vo (nth datum 0) alf (nth datum 1) sinalf (nth datum 2) cosalf (nth datum 3) vx (nth datum 4) tm (nth datum 5)
        xm (nth datum 6) ym (nth datum 7)
        rd (rand-int 0)
        angka (cond
                    (= rd 0) vx
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah peluru ditembakkan dengan kecepatan awal " vo " m/s dan sudut elevasi $" alf "^o$ dari
                              permukaan tanah. Besar kecepatan peluru pada titik tertingginya adalah ... m/s
                              ($sin " alf "^o$ = " sinalf ", $cos" alf "^o$ = " cosalf ").")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FAEA-4 []
  "Gerak Parabola"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FAEA-2.txt"))
        datum (nth data (rand-int (count data)))
        vo (nth datum 0) alf (nth datum 1) sinalf (nth datum 2) cosalf (nth datum 3) vx (nth datum 4) tm (nth datum 5)
        xm (nth datum 6) ym (nth datum 7)
        rd (rand-int 0)
        angka (cond
                    (= rd 0) ym
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah peluru ditembakkan dengan kecepatan awal " vo " m/s dan sudut elevasi $" alf "^o$ dari
                              permukaan tanah. Tinggi maksimum yang dapat dicapai peluru adalah ... meter
                              ($sin " alf "^o$ = " sinalf ", $cos" alf "^o$ = " cosalf ").")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FAEA-5 []
  "Gerak Parabola"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FAEA-2.txt"))
        datum (nth data (rand-int (count data)))
        vo (nth datum 0) alf (nth datum 1) sinalf (nth datum 2) cosalf (nth datum 3) vx (nth datum 4) tm (nth datum 5)
        xm (nth datum 6) ym (nth datum 7)
        rd (rand-int 0)
        angka (cond
                    (= rd 0) xm
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah peluru ditembakkan dengan kecepatan awal " vo " m/s dan sudut elevasi $" alf "^o$ dari
                              permukaan tanah. Jangkauan horisontal terjauh yang dapat dicapai peluru adalah ... meter
                              ($sin " alf "^o$ = " sinalf ", $cos" alf "^o$ = " cosalf ").")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FAEA []
  "Gerak Parabola - kecepatan jangkauan x - y"
  ;(C2A2FAEA-5))
  (let [x (rand-int 6)] ((resolve (symbol my-ns (str "C2A2FAEA-" x))))))

(defn C2A2FAEB-0 []
  "Gerak Parabola"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FAEB-0.txt"))
        datum (nth data (rand-int (count data)))
        vo (nth datum 0) h (nth datum 1) t (nth datum 2) x (nth datum 3)
        rd (rand-int 4)
        angka (cond
                    (= rd 0) x
                    (= rd 1) t
                    (= rd 2) h
                    (= rd 3) vo
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah benda dijatuhkan dari pesawat udara yang sedang terbang mendatar dengan kecepatan
                              " vo " m/s pada ketinggian " h " meter. Benda tersebut akan jatuh ke tanah pada jarak
                              horisontal ... meter.")
                (= rd 1) (str "Sebuah benda dijatuhkan dari pesawat udara yang sedang terbang mendatar dengan kecepatan
                              " vo " m/s pada ketinggian " h " meter. Benda tersebut akan jatuh ke tanah dalam waktu
                              ... detik.")
                (= rd 2) (str "Sebuah benda dijatuhkan dari pesawat udara yang sedang terbang mendatar dengan kecepatan
                              " vo " m/s. Jika benda tersebut sampai di tanah dalam waktu " t " sekon, maka ketinggian
                              pesawat dari permukaan tanah adalah ... m.")
                (= rd 3) (str "Sebuah benda dijatuhkan dari pesawat udara yang sedang terbang mendatar pada ketinggian
                              " h " m. Jika benda tersebut sampai di tanah setelah menempuh jarak horisontal " x " m,
                              maka kecepatan pesawat ketika benda dijatuhkan adalah ... m/s.")

                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FAEB-1 []
  "Gerak Parabola"
  (let [data (read-string (slurp "data/fis1113/bab1/C2A2FAEB-1.txt"))
        datum (nth data (rand-int (count data)))
        alf (nth datum 0) sinalf (nth datum 1) cosalf (nth datum 2) vo (nth datum 3)
        t (nth datum 4) h (nth datum 5) xm (nth datum 6)
        rd (rand-int 4)
        angka (cond
                    (= rd 0) xm
                    (= rd 1) t
                    (= rd 2) h
                    (= rd 3) vo
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                (= rd 0) (str "Sebuah peluru ditembakkan dari menara dengan ketinggian " h " meter dengan sudut elevasi
                              " alf "$^o$. Jika kecepatan awal peluru adalah " vo " m/s maka peluru jatuh ke tanah pada
                              jarak horisontal ... meter dari menara.")
                (= rd 1) (str "Sebuah benda dilemparkan dengan kecepatan " vo " m/s dari tepi tebing yang tingginya
                              " h " meter. Jika sudut elevasi lemparan benda adalah " alf "$^o$ maka benda berada di
                              udara selama ... sekon.")
                (= rd 2) (str "Sebuah peluru ditembakkan dari puncak menara dengan kecepatan awal " vo " m/s dan sudut
                              kemiringan " alf "$^2$ terhadap horisontal. Jika peluru jatuh ke tanah setelah " t " sekon
                              maka ketinggian menara adalah ... m.")
                (= rd 3) (str "Sebuah benda dilemparkan dari puncak gedung yang tingginya " h " meter dengan kecepatan
                              dan sudut elevasi lemparan " alf "$^o$. Jika jarak benda dari kaki gedung " xm " meter
                              ketika jatuh ke tanah, maka kecepatan awal benda adalah ... m/s.")

                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FAEB []
  "Gerak Parabola - kecepatan jangkauan x - y"
  ;(C2A2FAEB-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C2A2FAEB-" x))))))

;;;Hukum Newton dan Gravitasi
(defn C2A2FBAB []
  "Hukum Newton I"
  (fis10/C1X1FDAB))
(defn C2A2FBAC []
  "Hukum Newton II"
  (fis10/C1X1FDAC))
(defn C2A2FBAD []
  "Hukum Newton III"
  (fis10/C1X1FDAD))
(defn C2A2FBAE []
  "Gaya Normal"
  (fis10/C1X1FDAF))

(defn C2A2FBAF-0 []
  "Gaya gesek"
  (fis10/C1X1FDAG))
(defn C2A2FBAF-1 []
  "Gerak gesek"
  (let [data (read-string (slurp "data/fis1113/bab2/C2A2FBAF-1.txt"))
        datum (nth data (rand-int (count data)))
        us (nth datum 0) uk (nth datum 1) m (nth datum 2) fg (nth datum 3)
        F (nth datum 4) a (nth datum 5)
        angka fg
        jwb (fnc/jawaban)
       ]
        {:soal (str "Sebuah balok bermassa " m " yang berada pada lantai kasar horisontal diberi
                    gaya " F " newton seperti pada gambar. Jika koefisien gesekan statis dan kinetis
                    antara permukaan balok dengan lantai berturut-turut adalah " us " dan " uk ",
                    maka gaya gesekan yang bekerja pada benda adalah ... newton.")
         :pictures [{:obj 4 :param "#000000,175,075,225,125"},
                    {:obj 9 :param "#939393,000,126,400"},
                    (if (> F 0) {:obj 3 :param "#000000,225,100,040,000"} {:obj 3 :param "#000000,175,100,040,180"})
                    (if (> F 0) {:obj 8 :param "#000000,270,103,F"} {:obj 8 :param "#000000,120,103,F"})]
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FBAF-2 []
  "Gerak gesek"
  (let [data (read-string (slurp "data/fis1113/bab2/C2A2FBAF-2.txt"))
        datum (nth data (rand-int (count data)))
        us (nth datum 0) uk (nth datum 1) m (nth datum 2) F (nth datum 3)
        a (nth datum 4)
        angka a
        jwb (fnc/jawaban)
       ]
        {:soal (str "Sebuah balok bermassa " m " yang berada pada lantai kasar horisontal diberi
                    gaya " F " newton seperti pada gambar. Jika koefisien gesekan statis dan kinetis
                    antara permukaan balok dengan lantai berturut-turut adalah " us " dan " uk ",
                    maka percepatan benda adalah ... $m/s^2$.")
         :pictures [{:obj 4 :param "#000000,175,075,225,125"},
                    {:obj 9 :param "#939393,000,126,400"},
                    (if (> F 0) {:obj 3 :param "#000000,225,100,040,000"} {:obj 3 :param "#000000,175,100,040,180"})
                    (if (> F 0) {:obj 8 :param "#000000,270,103,F"} {:obj 8 :param "#000000,120,103,F"})]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FBAF []
  "Gaya Gesek 1"
  ;(C2A2FBAF-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C2A2FBAF-" x))))))

(defn C2A2FBAG-0 []
  "Gerak gesek"
  (let [data (read-string (slurp "data/fis1113/bab2/C2A2FBAG-0.txt"))
        datum (nth data (rand-int (count data)))
        F (nth datum 0) m (nth datum 1) alf (nth datum 2) mu (nth datum 3)
        salf (nth datum 4) calf (nth datum 5) fg (nth datum 6) a (nth datum 7)
        rd (rand-int 2)
        angka (cond
                (= rd 0) a
                (= rd 1) fg
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah balok bermassa " m " kg yang berada pada lantai kasar horisontal diberi
                          gaya " F " newton yang membentuk sudut " alf "$^o$ terhadap horisontal seperti pada gambar.
                          Jika koefisien gesekan antara permukaan balok dengan lantai adalah " mu "
                          maka percepatan benda adalah ... $m/s^2$. (cos " alf "$^o$ = " calf " ; sin " alf "$^o$ = " salf ").")
                 (= rd 1) (str "Sebuah balok bermassa " m " kg yang berada pada lantai kasar horisontal diberi
                          gaya " F " newton yang membentuk sudut " alf "$^o$ terhadap horisontal seperti pada gambar.
                          Jika koefisien gesekan antara permukaan balok dengan lantai adalah " mu "
                          maka gaya gesek pada balok adalah ... N. (cos " alf "$^o$ = " calf " ; sin " alf "$^o$ = " salf ").")
                )
         :pictures [{:obj 4 :param "#000000,175,075,225,125"},
                    {:obj 9 :param "#939393,000,126,400"},
                    {:obj 3 :param "#000000,140,040,050,315"},
                    {:obj 8 :param "#000000,145,070,F"}]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FBAG-1 []
  "Gerak gesek"
  (let [data (read-string (slurp "data/fis1113/bab2/C2A2FBAG-1.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) m2 (nth datum 1) u (nth datum 2) h (nth datum 3)
        a (nth datum 4) v (nth datum 5) t (nth datum 6)
        rd (rand-int 3)
        angka (cond
                (= rd 0) a
                (= rd 1) v
                (= rd 2) t
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Dua balok A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg, dihubungkan dengan
                               tali melalui sebuah katrol seperti pada gambar. Jika koefisien gesekan antara balok B dengan
                               lantai adalah " u " dan jarak antara balok A dengan lantai di bawahnya adalah " h " m,
                               maka percepatan balok A adalah ... $m/s^2$.")
                 (= rd 1) (str "Dua balok A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg, dihubungkan dengan
                               tali melalui sebuah katrol seperti pada gambar. Jika koefisien gesekan antara balok B dengan
                               lantai adalah " u " dan jarak antara balok A dengan lantai di bawahnya adalah " h " m,
                               maka kecepatan balok A sesaat sebelum menumbuk lantai adalah ... m/s.")
                 (= rd 2) (str "Dua balok A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg, dihubungkan dengan
                               tali melalui sebuah katrol seperti pada gambar. Jika koefisien gesekan antara balok B dengan
                               lantai adalah " u " dan jarak antara balok A dengan lantai di bawahnya adalah " h " m,
                               maka waktu yang dibutuhkan  balok A untuk sampai di lantai adalah ... s.")
                )
         :pictures [{:obj 1 :param "#000000,000,040,200,040"}, {:obj 1 :param "#000000,200,040,200,190"},
                    {:obj 1 :param "#000000,200,190,400,190"},{:obj 4 :param "#000000,050,009,080,039"}
                    {:obj 6 :param "#000000,210,030,010"}, {:obj 4 :param "#000000,205,080,235,110"}
                    {:obj 1 :param "#000000,080,020,210,020"}, {:obj 1 :param "#000000,220,030,220,080"}
                    {:obj 1 :param "#000000,195,040,210,030"}, {:obj 1 :param "#000000,200,045,210,030"}
                    {:obj 8 :param "#000000,060,030,B"} {:obj 8 :param "#000000,215,100,A"}
                    ]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FBAG-2 []
  "Gerak gesek"
  (let [data (read-string (slurp "data/fis1113/bab2/C2A2FBAG-2.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) alf (nth datum 1) u (nth datum 2) salf (nth datum 3)
        calf (nth datum 4) a (nth datum 5)
        rd (rand-int 0)
        angka (cond
                (= rd 0) a
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah balok bermassa " m " kg diletakkan pada bidang miring kasar  yang
                               koefisien gesekannya " u ". Jika sudut elevasi bidang miring terhadap
                               horisontal adalah " alf "$^o$ maka percepatan balok sepanjang bidang miring adalah ... m/s$^2$.
                               (cos " alf "$^o$ = " calf " , sin " alf "$^o$ = " salf ").")
                )
         :pictures [{:obj 2 :param "#000000,200,180,270,150"}, {:obj 1 :param "#000000,200,180,400,180"},
                    {:obj 2 :param "#000000,030,080,030,330"}, {:obj 2 :param "#000000,030,080,030,060"}
                    {:obj 2 :param "#000000,056,095,030,060"}, {:obj 2 :param "#000000,045,054,030,330"}
                    ]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FBAG []
  "Gaya Gesek 2"
  ;(C2A2FBAG-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C2A2FBAG-" x))))))

(defn C2A2FBCA-0 []
  "Gerak gravitasi"
  (let [data (read-string (slurp "data/fis1113/bab2/C2A2FBCA-0.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) m2 (nth datum 1) r (nth datum 2) F (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) F
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Gaya gravitasi antara benda A dan B yang massanya berturut-turut " m1 " kg dan
                               " m2 " kg bila jarak antara kedua benda " r " m adalah ... x 10$^{-11}$ N.
                               (tetapan gravitasi = 6.672 x 10$^{-11}$ Nm$^2$/kg$^2$).")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FBCA-1 []
  "Gerak gravitasi"
  (let [data (read-string (slurp "data/fis1113/bab2/C2A2FBCA-1.txt"))
        datum (nth data (rand-int (count data)))
        xr (nth datum 0) xA (nth datum 1) xB (nth datum 2) xF (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) xF
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Dua benda yang berjarak r meter satu sama lain bermassa masing-masing A dan B sehingga
                               gaya gravitasi yang bekerja pada masing-masing benda adalah C. Gaya gravitasi yang bekerja
                               pada dua benda lain yang jaraknya " xr "r dan massanya berturut-turut " xA "A dan " xB "B
                               adalah ...C.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FBCA []
  "Gaya Gravitasi"
  ;(C2A2FBCA-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C2A2FBCA-" x))))))

(defn C2A2FBEA-0 []
  "Gerak gravitasi"
  (let [data (read-string (slurp "data/fis1113/bab2/C2A2FBEA-0.txt"))
        datum (nth data (rand-int (count data)))
        xm (nth datum 0) xr (nth datum 1) xF (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) xF
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bermassa m berada di permukaan bumi yang jejarinya R sehingga mendapat gaya
                               gravitasi bumi sebesar F. Benda lain yang bermassa " xm " m yang berjarak " xr " R
                               dari pusat bumi akan mengalami gaya gravitasi bumi sebesar ...F.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FBEA-1 []
  "Gerak gravitasi"
  (let [data (read-string (slurp "data/fis1113/bab2/C2A2FBEA-1.txt"))
        datum (nth data (rand-int (count data)))
        xR (nth datum 0) h (nth datum 1) xg (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) h
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Percepatan gravitasi yang dialami benda di permukaan bumi yang berjejari R adalah g. Jika
                               benda tersebut berada di ketinggian h dari permukaan bumi maka percepatan gravitasinya
                               adalah " xg " g. Besar h adalah ... R.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FBEA []
  "Gaya Gravitasi Bumi"
  ;(C2A2FBEA-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C2A2FBEA-" x))))))

(defn C2A2FBEB-0 []
  "Gerak gravitasi"
  (let [data (read-string (slurp "data/fis1113/bab2/C2A2FBEB-0.txt"))
        datum (nth data (rand-int (count data)))
        xm (nth datum 0) xR (nth datum 1) xg (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) xg
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Percepatan gravitasi di permukaan bumi adalah g. Percepatan gravitasi di permukaan planet
                               yang massanya " xm " kali massa bumi dan jejarinya " xR " kali jejari bumi adalah ... g.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FBEB []
  "Gaya Gravitasi Bumi"
  (C2A2FBEB-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C2A2FBEB-" x))))))

(defn C2A2FBGC-0 []
  "Hukum Kepler 3"
  (let [data (read-string (slurp "data/fis1113/bab2/C2A2FBGC-0.txt"))
        datum (nth data (rand-int (count data)))
        T1 (nth datum 0) T2 (nth datum 1) R1 (nth datum 2) R2 (nth datum 3)
        rd (rand-int 4)
        angka (cond
                (= rd 0) T2
                (= rd 1) T1
                (= rd 2) R2
                (= rd 3) R1
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Periode revolusi suatu planet  dalam suatu sistem tata surya adalah " T1 " tahun dan jarak planet
                               itu ke bintang yang diorbitnya adalah " R1 " au. Planet lain yang berjarak " R2 " au
                               pada sistem tata surya tersebut memiliki periode revolusi ... tahun.")
                 (= rd 1) (str "Periode revolusi suatu planet  dalam suatu sistem tata surya adalah " T2 " tahun dan jarak planet
                               itu ke bintang yang diorbitnya adalah " R2 " au. Planet lain yang berjarak " R1 " au
                               pada sistem tata surya tersebut memiliki periode revolusi ... tahun.")
                 (= rd 2) (str "Jarak rata-rata suatu planet ke bintang yang diorbitnya dalam suatu sistem tata surya
                               adalah " R1 " SA dan periode revolusinya adalah  " T1 " tahun. Planet lain
                               pada sistem tata surya tersebut memiliki periode revolusi " T2 " tahun, maka jarak
                               rata-ratanya ke bintang yang diorbitnya adalah ... SA.")
                 (= rd 3) (str "Jarak rata-rata suatu planet ke bintang yang diorbitnya dalam suatu sistem tata surya
                               adalah " R2 " SA dan periode revolusinya adalah  " T2 " tahun. Planet lain
                               pada sistem tata surya tersebut memiliki periode revolusi " T1 " tahun, maka jarak
                               rata-ratanya ke bintang yang diorbitnya adalah ... SA.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FBGC []
  "Gravitasi"
  (C2A2FBGC-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C2A2FBGC-" x))))))

(defn C2A2FCAB-0 []
  "Usaha 1"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCAB-0.txt"))
        datum (nth data (rand-int (count data)))
        F (nth datum 0) s1 (nth datum 1) s2 (nth datum 2) W (nth datum 3)
        rd (rand-int 4)
        angka (cond
                (= rd 0) F
                (= rd 1) s1
                (= rd 2) s2
                (= rd 3) W
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Suatu benda bergerak lurus dari posisi " s1 " m ke posisi " s2 " m akibat sebuah gaya
                               yang bekerja searah dengan gerak benda. Jika usaha yang dilakukan gaya tersebut adalah
                               " W " joule, maka besarnya gaya adalah ... N.")
                 (= rd 1) (str "Suatu benda bergerak lurus dari posisi awal ke posisi " s2 " m akibat sebuah gaya " F " N
                               yang bekerja searah dengan gerak benda. Jika usaha yang dilakukan gaya tersebut adalah
                               " W " joule, maka posisi awal benda adalah ... m.")
                 (= rd 2) (str "Suatu gaya sebesar " F " N melakukan usaha " W " joule terhadap suatu benda sehingga
                                benda berpindah dari posisi awal " s1 " m. Jika arah gaya searah dengan perpindahan benda
                               maka posisi akhir benda adalah ... m.")
                 (= rd 3) (str "Benda yang awalnya berada pada posisi " s1 " m berpindah dalam lintasan lurus menuju
                               posisi " s2 " m akibat suatu gaya " F " N yang searah perpindahan benda. Usaha yang
                               dilakukan gaya tersebut adalah ... joule.")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCAB []
  "Usaha - Energi"
  (C2A2FCAB-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C2A2FCAB-" x))))))

(defn C2A2FCAC-0 []
  "Usaha 1"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCAC-0.txt"))
        datum (nth data (rand-int (count data)))
        F (nth datum 0) m (nth datum 1) t (nth datum 2) W (nth datum 3)
        rd (rand-int 4)
        angka (cond
                (= rd 0) F
                (= rd 1) m
                (= rd 2) t
                (= rd 3) W
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda " m " kg yang mula-mula diam pada lantai datar licin memperoleh usaha " W "
                               joule dari suatu gaya mendatar yang bekerja selama " t " detik. Besarnya gaya tersebut
                               adalah ... newton.")
                 (= rd 1) (str "Sebuah benda yang mula-mula diam pada lantai datar licin diberi ditarik dengan gaya
                               mendatar " F " newton selama " t " sekon. Jika usaha yang dilakukan gaya tersebut
                               adalah " W " J maka massa benda adalah ... kg.")
                 (= rd 2) (str "Usaha sebesar " W " J dilakukan oleh suatu gaya mendatar " F " N terhadap benda yang
                               mula-mula diam di bidang horisontal sehingga benda bergerak dalam lintasan lurus. Jika
                               massa benda tersebut adalah " m " kg maka gaya tersebut bekerja selama ... s.")
                 (= rd 3) (str "Gaya mendatar sebesar " F " newton bekerja pada benda " m " kg yang mula-mula diam pada lantai
                               mendatar. Jika benda kemudian bergerak dalam lintasan lurus selama " t " sekon, maka usaha
                               yang dilakukan gaya tersebut adalah ... newton.")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCAC []
  "Usaha - Energi"
  (C2A2FCAC-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C2A2FCAB-" x))))))

(defn C2A2FCAD-0 []
  "Usaha 1"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCAD-0.txt"))
        datum (nth data (rand-int (count data)))
        F (nth datum 0) alf (nth datum 1) salf (nth datum 2) calf (nth datum 3) ds (nth datum 4) W (nth datum 5)
        rd (rand-int 3)
        angka (cond
                (= rd 0) W
                (= rd 1) F
                (= rd 2) ds
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda yang mula-mula diam pada lantai mendatar diberi gaya sebesar
                               " F " newton yang membentuk sudut " alf "$^o$ terhadap horisontal seperti pada gambar.
                               Jika benda berpindah sejauh " ds " m, maka usaha yang dilakukan gaya tersebut adalah
                               ... J. (sin " alf "$^o$ = " salf ", cos " alf "$^o$ = " calf ").")
                 (= rd 1) (str "Sebuah benda yang mula-mula diam pada lantai datar licin diberi ditarik dengan gaya
                                yang membentuk sudut " alf "$^o$ terhadap horisontal seperti pada gambar.
                               Jika dalam perpindahannya sejauh " ds " m gaya melakukan usaha " W " J, maka besar
                               gaya tersebut adalah ... N. (sin " alf "$^o$ = " salf ", cos " alf "$^o$ = " calf ").")
                 (= rd 2) (str "Usaha sebesar " W " J dilakukan oleh suatu gaya  " F " N terhadap benda yang
                               mula-mula diam di bidang horisontal sehingga benda bergerak dalam lintasan lurus.
                               Jika sudut yang dibentuk gaya terhadap horisontal adalah " alf "$^o$ maka
                               besar perpindahan benda adalah ... m. (sin " alf "$^o$ = " salf ", cos " alf "$^o$ = " calf ").")
                )
         :pictures
                 [{:obj 4 :param "#000000,175,075,225,125"}, {:obj 2 :param "#d3d3d3,225,075,080,000"},
                  {:obj 3 :param "#000000,225,075,090,040"},
                  {:obj 13 :param "#939393,280,075,290,050,285,045,270,037"},
                  {:obj 9 :param "#d3d3d3,000,126,400"},
                  {:obj 8 :param "#000000,290,015,F"}, {:obj 8 :param "#000000,255,065,A"},
                  ;{:obj 8 :param "#000000,095,102,F2"}, {:obj 8 :param "#000000,195,187,F3"}
                  ]
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCAD []
  "Usaha - Energi"
  (C2A2FCAD-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C2A2FCAD-" x))))))

(defn C2A2FCAE-0 []
  "W sebagai luas di bawah kurva"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCAE-0.txt"))
        datum (nth data (rand-int (count data)))
        vF (nth datum 0) vs (nth datum 1) W (nth datum 2)
        ja (count vF)
        max1 (last vs)
        max2 (last (sort vF))
        rd (rand-int 0)
        angka (cond
                (= rd 0) W
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bergerak lurus setelah mengalami gaya seperti yang digambarkan pada
                               grafik F - s (gaya terhadap posisi) di bawah. Usaha yang dilakukan gaya tersebut
                               adalah ... joule (F dalam newton dan s dalam meter). ")
                )
         :grafik {:var1 "F" :var2 "s" :max1 max1 :max2 max2 :pair ja :datax vs :datay vF}
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCAE-1 []
  "W sebagai luas di bawah kurva"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCAE-1.txt"))
        datum (nth data (rand-int (count data)))
        vF (nth datum 0) vs (nth datum 1) W (nth datum 2)
        ja (count vF)
        max1 (last vs)
        max2 (last (sort vF))
        rd (rand-int 0)
        angka (cond
                (= rd 0) W
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bergerak lurus setelah mengalami gaya seperti yang digambarkan pada
                               grafik F - s (gaya terhadap posisi) di bawah. Usaha yang dilakukan gaya tersebut
                               adalah ... joule (F dalam newton dan s dalam meter). ")
                )
         :grafik {:var1 "F" :var2 "s" :max1 max1 :max2 max2 :pair ja :datax vs :datay vF}
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCAE []
  "Usaha - Energi"
  ;(C2A2FCAE-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C2A2FCAE-" x))))))

(defn C2A2FCAF-0 []
  "Usaha Negatif"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCAF-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) vo (nth datum 1) W (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) W
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bermassa " m " kg bergerak dengan kecepatan awal " vo " m/s pada lantai
                               kasar. Usaha oleh gaya gesek yang menyebabkan benda akhirnya berhenti adalah ... joule.")
                )
         ;:grafik {:var1 "F" :var2 "s" :max1 max1 :max2 max2 :pair ja :datax vs :datay vF}
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCAF-1 []
  "Usaha Negatif"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCAF-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) vo (nth datum 1)  vt (nth datum 2) W (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) W
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bermassa " m " kg ditembakkan vertikal ke atas dengan kecepatan awal
                               " vo " m/s. Usaha oleh gaya gravitasi sampai kecepatan benda menjadi " vt " m/s
                               adalah ... joule.")
                )
         ;:grafik {:var1 "F" :var2 "s" :max1 max1 :max2 max2 :pair ja :datax vs :datay vF}
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCAF-2 []
  "W negatif"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCAF-2.txt"))
        datum (nth data (rand-int (count data)))
        vF (nth datum 0) vs (nth datum 1) W (nth datum 2)
        ja (count vF)
        max1 (last vs)
        max2 (last (sort (map #(Math/abs %) vF)))
        rd (rand-int 0)
        angka (cond
                (= rd 0) W
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bergerak lurus setelah mengalami gaya seperti yang digambarkan pada
                               grafik F - s (gaya terhadap posisi) di bawah. Usaha yang dilakukan gaya tersebut
                               adalah ... joule (F dalam newton dan s dalam meter). ")
                )
         :grafik {:var1 "F" :var2 "s" :max1 max1 :max2 max2 :pair ja :datax vs :datay vF}
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCAF []
  "Usaha - Energi"
  ;(C2A2FCAF-2))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C2A2FCAF-" x))))))

(defn C2A2FCAG-0 []
  "W oleh beberapa gaya"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCAG-0.txt"))
        datum (nth data (rand-int (count data)))
        F (nth datum 0) mu (nth datum 1) m (nth datum 2) ds (nth datum 3) W (nth datum 4)
        rd (rand-int 0)
        angka (cond
                (= rd 0) W
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bermassa " m " kg berada pada lantai mendatar kasar yang koefisien
                               gesekannya adalah " mu ". Benda kemudian didorong dengan gaya konstan " F " newton
                               sejauh " ds " meter. Usaha total yang dialami benda tersebut adalah ... joule. ")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCAG-1 []
  "W oleh beberapa gaya"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCAG-1.txt"))
        datum (nth data (rand-int (count data)))
        F1 (nth datum 1) F2 (nth datum 2) mu (nth datum 3) m (nth datum 4) ds (nth datum 5)
        alf (nth datum 6) calf (nth datum 7) salf (nth datum 8) W (nth datum 9)
        rd (rand-int 0)
        angka (cond
                (= rd 0) W
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bermassa " m " kg berada pada lantai mendatar kasar yang koefisien
                               gesekannya adalah " mu ". Benda kemudian ditarik oleh dua gaya F1 = " F1 " N  dan F2
                               = " F2 " N dimana F1 membentuk sudut " alf "$^o$ dengan horisontal (lihat gambar).
                               Usaha total yang dialami benda sampai berpindah sejauh " ds " m adalah ... J.
                               (sin " alf "$^o$ = " salf ", cos " alf "$^o$ = " calf "). ")
                )
         :pictures
                 [{:obj 4 :param "#000000,175,075,225,125"}, {:obj 2 :param "#d3d3d3,225,075,080,000"},
                  {:obj 3 :param "#000000,225,075,090,040"}, {:obj 3 :param "#000000,175,100,060,180"}
                  {:obj 13 :param "#939393,280,075,290,050,285,045,270,037"},
                  {:obj 9 :param "#d3d3d3,000,126,400"},
                  {:obj 8 :param "#000000,290,015,F1"}, {:obj 8 :param "#000000,255,065,A"},
                  {:obj 8 :param "#000000,095,102,F2"},
                  ]
         :pilihan (fnc/create-option3 angka 1 jwb)
         :jawaban jwb
         }))
(defn C2A2FCAG []
  "Usaha - Energi"
  ;(C2A2FCAG-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C2A2FCAG-" x))))))

(defn C2A2FCCB-0 []
  "Energi kinetik"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCCB-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) v (nth datum 1) Ek (nth datum 2)
        rd (rand-int 3)
        angka (cond
                (= rd 0) Ek
                (= rd 1) m
                (= rd 2) v
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Energi kinetik benda bermassa " m " kg yang bergerak dengan laju " v" m/s
                               adalah ... joule. ")
                 (= rd 1) (str "Suatu benda yang kecepatannya " v " m/s memiliki energi kinetik " Ek " J.
                               Massa benda tersebut adalah ... kg.")
                 (= rd 2) (str "Suatu benda yang massanya " m " kg memiliki energi kinetik " Ek " J.
                               Laju benda tersebut adalah ... m/s.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCCB-1 []
  "Energi kinetik"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCCB-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) h (nth datum 1) g (nth datum 2) Ek (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ek
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bermassa " m " kg jatuh bebas dari ketinggian " h " meter dari permukaan tanah.
                               Jika percepatan gravitasi bumi adalah " g " m/s$^2$ maka energi kinetik benda
                               sesaat sebelum menyentuh tanah adalah ... joule.")
                )
         :pilihan (fnc/create-option3 angka 1 jwb)
         :jawaban jwb
         }))
(defn C2A2FCCB-2 []
  "Energi kinetik"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCCB-2.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) vo (nth datum 1) alf (nth datum 2) Ek (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ek
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bermassa " m " kg ditembakkan dengan sudut elevasi " alf "$^o$
                               dari permukaan tanah. Jika kecepatan awal benda adalah " vo " m/s maka energi
                               kinetik benda pada titik tertingginya adalah ... J.")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCCB []
  "Energi"
  ;(C2A2FCCB-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C2A2FCCB-" x))))))

(defn C2A2FCCC-0 []
  "Energi potensial"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCCB-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) h (nth datum 1) g (nth datum 2) Ep (nth datum 3)
        rd (rand-int 3)
        angka (cond
                (= rd 0) Ep
                (= rd 1) m
                (= rd 2) h
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bermassa " m " kg dilempar ke atas dari permukaan tanah. Ketika mencapai
                               ketinggian " h " meter, energi potensial gravitasinya adalah ... joule (g = " g " m/s$^2$).")
                 (= rd 1) (str "Suatu benda yang berada pada ketinggian " h " meter memiliki energi potensial gravitasi
                               sebesar " Ep " joule. Massa benda tersebut adalah ... kg (g = " g " m/s$^2$).")
                 (= rd 2) (str "Suatu benda yang massanya " m " kg memiliki energi potensial gravitasi " Ep " J.
                               Ketinggian benda dari acuan adalah ... meter (g = " g " m/s$^2$).")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCCC-1 []
  "Energi potensial"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCCB-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) vo (nth datum 1) Ep (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ep
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bermassa " m " kg ditembakkan vertikal ke atas dengan kecepatan awal
                               " vo " m/s dari permukaan tanah. Energi potensial gravitasi benda ketika mencapai
                               titik tertingginya adalah ... joule.")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCCC-2 []
  "Energi potensial"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCCC-2.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) vo (nth datum 1) alf (nth datum 2) Ep (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ep
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bermassa " m " kg ditembakkan dengan sudut elevasi " alf "$^o$
                               dari permukaan tanah. Jika kecepatan awal benda adalah " vo " m/s maka energi
                               potensial benda pada titik tertingginya adalah ... J.")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCCC []
  "Energi"
  ;(C2A2FCCC-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C2A2FCCC-" x))))))

(defn C2A2FCCD-0 []
  "Energi Mekanik"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCCD-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) ho (nth datum 1) h1 (nth datum 2) g (nth datum 3) Ek1 (nth datum 4)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ek1
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bermassa " m " kg jatuh bebas dari ketinggian " ho " meter
                               dari permukaan tanah. Energi kinetik benda ketika ketinggiannya " h1 " meter
                               adalah ... J (g = " g " m/s$^2$).")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCCD-1 []
  "Energi Mekanik"
  (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCCD-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) vo (nth datum 1) v1 (nth datum 2) alf (nth datum 3) Ep (nth datum 4)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ep
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bermassa " m " kg dilontarkan dari permukaan tanah dengan sudut elevasi
                               " alf "$^o$. Jika laju awal benda adalah " vo " m/s maka energi potensial benda
                               ketika lajunya " v1 " m/s adalah  ... J.")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCCD-2 []
  "Energi Mekanik"
    (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCCD-2.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) so (nth datum 1) alf (nth datum 2) salf (nth datum 3)
        calf (nth datum 4) Ek (nth datum 5)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ek
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah balok bermassa " m " kg diletakkan pada bidang miring licin dengan
                               jarak awal " so " m dari kaki bidang miring seperti pada gambar. Jika sudut
                               kemiringan bidang adalah " alf "$^o$ terhadap horisontal maka energi kinetik benda
                               ketika sampai pada kaki bidang miring adalah ... joule.
                               (cos " alf "$^o$ = " calf " , sin " alf "$^o$ = " salf ").")
                )
         :pictures [{:obj 2 :param "#000000,200,180,270,150"}, {:obj 1 :param "#000000,200,180,400,180"},
                    {:obj 2 :param "#000000,030,080,030,330"}, {:obj 2 :param "#000000,030,080,030,060"}
                    {:obj 2 :param "#000000,056,095,030,060"}, {:obj 2 :param "#000000,045,054,030,330"}
                    ]
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCCD []
  "Energi"
  ;(C2A2FCCD-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C2A2FCCD-" x))))))

(defn C2A2FCCG-0 []
  "Hubungan Usaha dan energi"
    (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCCG-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) vo (nth datum 1) F (nth datum 2) ds (nth datum 3) Ek (nth datum 4)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ek
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah balok bermassa " m " kg mula-mula bergerak dengan kecepatan konstan " vo " m/s
                               pada lantai datar licin. Kemudian benda tersebut dipercepat dengan gaya mendatar " F "
                               newton. Energi kinetik benda setelah menempuh jarak " ds " meter adalah ... joule.")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCCG-1 []
  "Hubungan Usaha dan energi"
    (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCCG-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) vo (nth datum 1) mu (nth datum 2) s (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) s
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah balok bermassa " m " kg mula-mula bergerak dengan kecepatan konstan " vo " m/s
                               pada lantai datar licin. Kemudian benda tersebut masuk ke lantai kasar dengan koefisien
                               gesekan antara balok dengan lantai " mu ". Jarak yang ditempuh balok sampai berhenti
                               pada lantai kasar tersebut adalah ... meter.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FCCG-2 []
  "Hubungan Usaha dan energi"
    (let [data (read-string (slurp "data/fis1113/bab3/C2A2FCCG-2.txt"))
        datum (nth data (rand-int (count data)))
        so (nth datum 0) alf (nth datum 1) salf (nth datum 2) calf (nth datum 3)
        mu (nth datum 4) v (nth datum 5)
        rd (rand-int 0)
        angka (cond
                (= rd 0) v
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah balok diletakkan pada bidang miring kasar (koefisien
                               gesekan antara balok dengan bidang miring " mu ") dengan
                               jarak awal " so " m dari kaki bidang miring seperti pada gambar. Jika sudut
                               kemiringan bidang adalah " alf "$^o$ terhadap horisontal maka kecepatan benda
                               ketika sampai pada kaki bidang miring adalah ... joule.
                               (cos " alf "$^o$ = " calf " , sin " alf "$^o$ = " salf ").")
                )
         :pictures [{:obj 2 :param "#000000,200,180,270,150"}, {:obj 1 :param "#000000,200,180,400,180"},
                    {:obj 2 :param "#000000,030,080,030,330"}, {:obj 2 :param "#000000,030,080,030,060"}
                    {:obj 2 :param "#000000,056,095,030,060"}, {:obj 2 :param "#000000,045,054,030,330"}
                    ]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FCCG []
  "Energi"
  ;(C2A2FCCG-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C2A2FCCG-" x))))))

(defn C2A2FDAE-0 []
  "Persamaan GHS"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAE-0.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) s (nth datum 1) y (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) y
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu benda bergetar harmonis sederhana dengan simpangan awal 0 cm, amplitudo
                               " A " cm, dan arah gerak awal ke sumbu-x positif. Simpangan benda ketika sudut
                               fasenya " s "$^o$ adalah ... cm. ")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FDAE-1 []
  "Persamaan GHS"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAE-1.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) s (nth datum 1) y (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) y
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu benda bergetar harmonis sederhana dengan simpangan awal 0 cm, amplitudo
                               " A " cm, dan arah gerak awal ke sumbu-x positif. Simpangan benda ketika sudut
                               fasenya " s " $\\pi$ rad adalah ... cm. ")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FDAE-2 []
  "Persamaan GHS"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAE-2.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) s (nth datum 1) y (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) y
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu benda bergetar harmonis sederhana dengan simpangan awal +" A " cm, dan amplitudo
                               " A " cm. Simpangan benda ketika sudut
                               fasenya " s "$^o$ adalah ... cm. ")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FDAE-3 []
  "Persamaan GHS"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAE-3.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) s (nth datum 1) y (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) y
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu benda bergetar harmonis sederhana dengan simpangan awal +" A " cm, dan amplitudo
                               " A " cm. Simpangan benda ketika sudut
                               fasenya " s " $\\pi$ rad adalah ... cm. ")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FDAE []
  "Getaran Harmonis"
  ;(C2A2FDAE-3))
  (let [x (rand-int 4)] ((resolve (symbol my-ns (str "C2A2FDAE-" x))))))

(defn C2A2FDAF-0 []
  "Persamaan GHS"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAF-0.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) the (nth datum 1) t (nth datum 2) y (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) y
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu getaran harmonis sederhana dinyatakan dengan persamaan
                               \\[ y = " A " \\sin(\\pi t + \\frac{ \\pi}{" the "}) \\]
                               Simpangan getaran pada detik ke " t " adalah ... cm (y dalam cm).")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FDAF-1 []
  "Persamaan GHS"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAF-1.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) the1 (nth datum 1) the2 (nth datum 2) t (nth datum 3) y (nth datum 4)
        rd (rand-int 0)
        angka (cond
                (= rd 0) y
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu getaran harmonis sederhana dinyatakan dengan persamaan
                               \\[ y = " A " \\cos \\frac{\\pi}{2}(t + \\frac{" the1 "}{" the2 "}) \\]
                               Simpangan getaran pada detik ke " t " adalah ... cm (y dalam cm).")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FDAF []
  "Getaran Harmonis"
  ;(C2A2FDAF-1))
  (let [x (rand-int 4)] ((resolve (symbol my-ns (str "C2A2FDAF-" x))))))

(defn C2A2FDAH-0 []
  "Perioda dan frekuensi"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAH-0.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) xT (nth datum 1) xp (nth datum 2) f (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) f
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu getaran harmonis sederhana dinyatakan dengan persamaan
                               \\[ y = " A " \\cos(\\frac{\\pi}{" xT "} t + \\frac{ \\pi}{" xp "}) \\]
                               Frekuensi getaran tersebut adalah ... Hertz (y dalam cm dan t dalam sekon).")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FDAH-1 []
  "Perioda dan frekuensi"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAH-1.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) xT (nth datum 1) xp (nth datum 2) T (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) T
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu getaran harmonis sederhana dinyatakan dengan persamaan
                               \\[ y = " A " \\cos \\frac{\\pi}{" xT "}(4t + \\frac{2}{" xp "}) \\]
                               Perioda getaran tersebut adalah ... Hertz (y dalam cm dan t dalam sekon).")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FDAH-2 []
  "Perioda dan frekuensi"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAH-2.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) T (nth datum 1) y (nth datum 2) vt (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) vt
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu benda bergetar dimulai dari simpangan maksimumnya dengan perioda " T " ms dan
                               amplitudo " A " cm. Waktu pertama dan kedua yang menghasilkan simpangan sebesar " y "
                               cm adalah ... ms dan ... ms.")
                )
         :pilihan (fnc/create-option5 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FDAH []
  "Getaran Harmonis"
  ;(C2A2FDAH-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C2A2FDAH-" x))))))

(defn C2A2FDAI-0 []
  "Kecepatan dan percepatan"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAI-0.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) t (nth datum 1) v (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) v
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu benda bergetar harmonis sederhana dinyatakan dengan persamaan
                               \\[ y = \\frac{" A "}{\\pi} \\sin \\pi t \\]
                               kecepatan benda pada detik ke " t " adalah ... cm/s (y dalam cm, t dalam sekon).")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FDAI-1 []
  "Kecepatan dan percepatan"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAI-1.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) t (nth datum 1) a (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) a
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu benda bergetar harmonis sederhana dinyatakan dengan persamaan
                               \\[ y = \\frac{" A "}{\\pi} \\sin \\pi t \\]
                               percepatan benda pada detik ke " t " adalah ... cm/s$^2$ (y dalam cm, t dalam sekon).")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FDAI-2 []
  "Kecepatan dan percepatan"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAI-2.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) xT (nth datum 1) xs (nth datum 2) vmax (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) vmax
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu benda bergetar harmonis sederhana dinyatakan dengan persamaan
                               \\[ y = \\frac{" A "}{\\pi} \\cos (\\frac{2 \\pi}{" xT "} t  + \\frac{\\pi}{" xs "})\\]
                               Kecepatan maksimum benda adalah  ... cm/s (y dalam cm, t dalam sekon).")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FDAI-3 []
  "Kecepatan dan percepatan"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAI-3.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) x1 (nth datum 1) x2 (nth datum 2) amax (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) amax
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu benda bergetar harmonis sederhana dinyatakan dengan persamaan
                               \\[ y = " A " \\sin " x1 " (3 + " x2 "t)\\]
                               Percepatan maksimum benda adalah  ... cm/s$^2$ (y dalam cm, t dalam sekon).")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FDAI-4 []
  "Kecepatan dan percepatan"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAI-4.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) f (nth datum 1) vmax (nth datum 2)
        var "$\\pi$"
        rd (rand-int 0)
        angka (cond
                (= rd 0) vmax
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah benda bergetar harmonis dengan amplitudo " A " cm dan frekuensi " f " Hz.
                               Kecepatan maksimum benda itu adalah ... cm/s$^2$.")
                )
         :pilihan (fnc/create-option4 angka var jwb)
         :jawaban jwb
         }))
(defn C2A2FDAI []
  "Getaran Harmonis"
  ;(C2A2FDAI-4))
  (let [x (rand-int 5)] ((resolve (symbol my-ns (str "C2A2FDAI-" x))))))

(defn C2A2FDAJ-0 []
  "tetapan pegas"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAJ-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) f (nth datum 1) k (nth datum 2)
        var "${\\pi}^2$"
        rd (rand-int 0)
        angka (cond
                (= rd 0) k
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah benda bermassa " m " kg digantungkan pada suatu pegas kemudian diberi simpangan
                               awal sehingga bergetar dengan frekuensi " f " Hz. Konstanta pegas tersebut adalah ... N/m.")
                )
         :pilihan (fnc/create-option4 angka var jwb)
         :jawaban jwb
         }))
(defn C2A2FDAJ-1 [] ;;; harus cek dulu
  "tetapan pegas"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAJ-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) y (nth datum 1) T (nth datum 2)
        var "${\\pi}$"
        rd (rand-int 0)
        angka (cond
                (= rd 0) T
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah benda bermassa " m " gram digantungkan pada suatu pegas sehingga pegas memanjang " y " cm.
                               . Jika pegas kemudian digetarkan maka periodenya adalah ... sekon.")
                )
         :pilihan (fnc/create-option4 angka var jwb)
         :jawaban jwb
         }))
(defn C2A2FDAJ []
  "Getaran Harmonis"
  ;(C2A2FDAJ-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C2A2FDAJ-" x))))))

(defn C2A2FDAK-0 []
  (C2A2FDAI-2))
(defn C2A2FDAK-1 []
  (C2A2FDAI-3))
(defn C2A2FDAK-2 []
  (C2A2FDAI-4))
(defn C2A2FDAK []
  "Getaran Harmonis"
  ;(C2A2FDAK-1))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C2A2FDAK-" x))))))

(defn C2A2FDAKA-0 [] ;;; harus cek dulu
  "Energi getaran pegas"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAKA-0.txt"))
        datum (nth data (rand-int (count data)))
        k (nth datum 0) A (nth datum 1) EM (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) EM
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah benda digantungkan pada pegas yang konstanta pegasnya " k " N/m.
                               Jika kemudian benda diberi simpangan " A " cm lalu dilepaskan maka sistem benda
                               dan pegas ini akan memiliki energi mekanik getaran sebesar ... joule." )
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C2A2FDAKA-1 [] ;;; harus cek dulu
  "Energi getaran pegas"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAKA-1.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) k (nth datum 1) t (nth datum 2) Ep (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ep
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu benda bergetar harmonis sederhana dengan konstanta getaran " k " N/m dan simpangan
                               yang memenuhi persamaan \\[ y = " A " \\sin \\pi t \\]
                               Energi potensial getaran benda pada detik ke " (fnc/cf (str t) 1) " adalah ... J (y dalam cm dan t dalam s).")
                )
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn C2A2FDAKA-2 [] ;;; harus cek dulu
  "Energi getaran pegas"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAKA-2.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) k (nth datum 1) t (nth datum 2) Ek (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ek
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu benda bergetar harmonis sederhana dengan konstanta getaran " k " N/m dan simpangan
                               yang memenuhi persamaan \\[ y = " A " \\sin \\pi t \\]
                               Energi kinetik getaran benda pada detik ke " (fnc/cf (str t) 1) " adalah ... J (y dalam cm dan t dalam s).")
                )
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn C2A2FDAKA-3 [] ;;; harus cek dulu
  "Energi getaran pegas"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAKA-3.txt"))
        datum (nth data (rand-int (count data)))
        frak (nth datum 0) P (nth datum 1)
        rd (rand-int 0)
        angka (cond
                (= rd 0) P
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Perbandingan energi kinetik dengan energi potensial getaran benda ketika simpangannya " (fnc/cf (str frak) 1) "
                               amplitudo getaran adalah ... ")
                )
         :pilihan (fnc/create-option9 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FDAKA []
  "Getaran Harmonis"
  ;(C2A2FDAKA-3))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C2A2FDAKA-" x))))))

(defn C2A2FDAL-0 [] ;;; harus cek dulu
  "Energi getaran pegas"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAL-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) k1 (nth datum 1) k2 (nth datum 2) y (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) y
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Dua buah pegas yang konstantanya berturut-turut " k1 " Nm$^{-1}$ dan " k2 " Nm$^{-1}$
                               dihubungkan secara seri kemudian digantungi balok bermassa " m " kg. Pertambahan
                               panjang susunan pegas itu adalah ... m.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FDAL-1 [] ;;; harus cek dulu
  "Energi getaran pegas"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAL-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) k1 (nth datum 1) k2 (nth datum 2) y (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) y
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Dua buah pegas yang konstantanya berturut-turut " k1 " Nm$^{-1}$ dan " k2 " Nm$^{-1}$
                               dihubungkan secara paralel kemudian digantungi balok bermassa " m " kg. Pertambahan
                               panjang susunan pegas itu adalah ... m.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C2A2FDAL-2 [] ;;; harus cek dulu
  "Energi getaran pegas"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAL-2.txt"))
        datum (nth data (rand-int (count data)))
        y (nth datum 0) k1 (nth datum 1) k2 (nth datum 2) F (nth datum 3)
        rd (rand-int 2)
        angka (cond
                (= rd 0) F
                (= rd 1) y
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Dua buah pegas yang konstantanya berturut-turut " k1 " N/m dan " k2 " N/m
                               dihubungkan secara seri. Untuk menarik susunan ini agar bertambah panjang " y " cm
                               dibutuhkan gaya sebesar ... N.")
                 (= rd 1) (str "Dua buah pegas yang konstantanya berturut-turut " k1 " N/m dan " k2 " N/m
                               dihubungkan secara seri. Apabila susunan pegas ini ditekan dengan gaya " F " maka
                               susunan ini akan memendek sebesar ... cm.")
                )
         :pilihan (fnc/create-option3 angka 1 jwb)
         :jawaban jwb
         }))
(defn C2A2FDAL-3 [] ;;; harus cek dulu
  "Energi getaran pegas"
    (let [data (read-string (slurp "data/fis1113/bab4/C2A2FDAL-3.txt"))
        datum (nth data (rand-int (count data)))
        y (nth datum 0) k1 (nth datum 1) k2 (nth datum 2) F (nth datum 3)
        rd (rand-int 2)
        angka (cond
                (= rd 0) F
                (= rd 1) y
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Dua buah pegas yang konstantanya berturut-turut " k1 " N/m dan " k2 " N/m
                               dihubungkan secara paralel. Untuk menarik susunan ini agar bertambah panjang " y " cm
                               dibutuhkan gaya sebesar ... N.")
                 (= rd 1) (str "Dua buah pegas yang konstantanya berturut-turut " k1 " N/m dan " k2 " N/m
                               dihubungkan secara paralel. Apabila susunan pegas ini ditekan dengan gaya " F " maka
                               susunan ini akan memendek sebesar ... cm.")
                )
         :pilihan (fnc/create-option3 angka 1 jwb)
         :jawaban jwb
         }))
(defn C2A2FDAL []
  "Getaran Harmonis"
  ;(C2A2FDAL-3))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C2A2FDAL-" x))))))

;; Momentum - Impuls - Tumbukan

;;Momentum
(defn C2A2FEAB []
  (fis11b/bC2A2FEAB))

;;Kekekalan Momentum
(defn C2A2FEAC []
  (fis11b/bC2A2FEAC))

;;Energi Kinetik Tumbukan
(defn C2A2FEAD []
  (fis11b/bC2A2FEAD))

;;Koefisien restitusi
(defn C2A2FEAE []
  (fis11b/bC2A2FEAE))

;;Tumbukan lenting sempurna
(defn C2A2FEAF []
  (fis11b/bC2A2FEAF))

;;Tumbukan tidak lenting sama sekali
(defn C2A2FEAG []
  (fis11b/bC2A2FEAG))

;;Tumbukan lenting sebagian
(defn C2A2FEAH []
  (fis11b/bC2A2FEAH))

;;Impuls
(defn C2A2FEAI []
  (fis11b/bC2A2FEAI))

;;Impuls dan gaya
(defn C2A2FEAJ []
  (fis11b/bC2A2FEAJ))

;;Impuls dan gaya
(defn C2A2FEAK []
  (fis11b/bC2A2FEAK))

;;;; Keseimbangan benda tegar

;;Besar Torsi
(defn C2A2FFAD []
  (fis11b/bC2A2FFAD))

;;Arah Torsi
(defn C2A2FFAE []
  (fis11b/bC2A2FFAE))

;;Keseimbangan 1
(defn C2A2FFAF []
  (fis11b/bC2A2FFAF))

;;Keseimbangan 2
(defn C2A2FFAG []
  (fis11b/bC2A2FFAG))

;;Keseimbangan 2
(defn C2A2FFAGA []
  (fis11b/bC2A2FFAGA))

;;Dinamikan rotasi (benda titik)
(defn C2A2FFCB []
  (fis11b/bC2A2FFCB))

;;Dinamikan rotasi (benda titik)
(defn C2A2FFCC []
  (fis11b/bC2A2FFCC))

;;Dinamikan rotasi (benda tegar)
(defn C2A2FFCD []
  (fis11b/bC2A2FFCD))

;;Dinamika rotasi (benda tegar)
(defn C2A2FFCE []
  (fis11b/bC2A2FFCE))

;;Dinamika rotasi (benda tegar)
(defn C2A2FFCEA []
  (fis11b/bC2A2FFCEA))

;;Dinamika rotasi (benda tegar)
(defn C2A2FFCEB []
  (fis11b/bC2A2FFCEB))

;;Dinamika rotasi (energi kinetik rotasi)
(defn C2A2FFCF []
  (fis11b/bC2A2FFCF))

;;Dinamika rotasi (energi kinetik translasi dan rotasi)
(defn C2A2FFCG []
  (fis11b/bC2A2FFCG))

;;;Fluida Dinamis
;;Debit
(defn C2A2FGAB []
  (fis11b/bC2A2FGAB))

;;;Fluida Dinamis
;;Kontinuitas
(defn C2A2FGAC []
  (fis11b/bC2A2FGAC))

;;Bernoulli
(defn C2A2FGAD []
  (fis11b/bC2A2FGAD))

;;Bernoulli
(defn C2A2FGAF []
  (fis11b/bC2A2FGAF))

;;Bernoulli
(defn C2A2FGAG []
  (fis11b/bC2A2FGAG))

;;Teori Kinetik Gas
(defn C2A2FHAA []
  (fis11b/bC2A2FHAA))

;;Teori Kinetik Gas
(defn C2A2FHAB []
  (fis11b/bC2A2FHAB))

;;Teori Kinetik Gas
(defn C2A2FHAC []
  (fis11b/bC2A2FHAC))

;;Teori Kinetik Gas
(defn C2A2FHAE []
  (fis11b/bC2A2FHAE))

;;Teori Kinetik Gas
(defn C2A2FHAF []
  (fis11b/bC2A2FHAF))

;;Teori Kinetik Gas
(defn C2A2FHAG []
  (fis11b/bC2A2FHAG))

;;Teori Kinetik Gas
(defn C2A2FHAH []
  (fis11b/bC2A2FHAH))
