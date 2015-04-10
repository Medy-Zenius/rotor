(ns rotor.soal.C2A2Fb
  (:require [compojure.core :refer :all]
            [rotor.models.genfunc :as fnc]
            [rotor.soal.C1X1F :as fis10]
            ))

(def my-ns "rotor.soal.C2A2Fb")

(defn bC2A2FEAB-0 []
  "Momentum"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAB-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) v (nth datum 1) P (nth datum 2)
        rd (rand-int 3)
        angka (cond
                (= rd 0) P
                (= rd 1) v
                (= rd 2) m
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah benda bermassa " m " kg bergerak pada suatu garis lurus (sumbu x) dengan kecepatan
                               " v " m/s. Momentum benda tersebut adalah ... kg.m/s.")
                 (= rd 1) (str "Suatu benda yang bergerak dalam suatu garis lurus memiliki momentum " P " kg.m/s.
                               Jika massa benda itu adalah " m " kg, maka kecepatannya adalah ... m/s.")
                 (= rd 2) (str "Suatu benda yang bergerak dalam suatu garis lurus memiliki momentum " P " kg.m/s.
                               Jika kecepatan benda itu adalah " v " m/s, maka massanya adalah ... kg.")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAB-1 []
  "Momentum"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAB-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) vo (nth datum 1) a (nth datum 2) t (nth datum 3) P (nth datum 4)
        rd (rand-int 3)
        angka (cond
                (= rd 0) P
                (= rd 1) m
                (= rd 2) a
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah benda bermassa " m " kg bergerak pada suatu garis lurus (sumbu x) dengan kecepatan
                               awal " vo " m/s. Benda kemudian mengalami percepatan " a " m/s$^2$ selama " t " detik. Momentum
                               akhir benda adalah ... kg.m/s.")
                 (= rd 1) (str "Sebuah benda bermassa  bergerak pada suatu garis lurus (sumbu x) dengan kecepatan
                               awal " vo " m/s. Benda kemudian mengalami percepatan " a " m/s$^2$ selama " t " detik sehingga
                               momentumnya berubah menjadi " P " kg.m/s. Massa benda tersebut adalah ... kg.")
                 (= rd 2) (str "Sebuah benda bermassa " m " kg bergerak pada suatu garis lurus (sumbu x) dengan kecepatan
                               awal " vo " m/s. Benda kemudian mengalami percepatan selama " t " detik sehingga
                               momentumnya menjadi " P " kg.m/s. Percepatan benda adalah ... m/s$^2$.")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAB-2 []
  "Momentum"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAB-2.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) vo (nth datum 1) alf (nth datum 2) P (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) P
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah benda bermassa " m " kg ditembakkan dari permukaan tanah dengan kecepatan
                               awal " vo " m/s dan sudut elevasi " alf "$^o$. Momentum benda pada titik tertingginya
                               adalah ... kg.m/s.")
                )
         :pilihan (fnc/create-option3 angka 1 jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAB-3 []
  "Momentum"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAB-3.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) vo (nth datum 1) a (nth datum 2) t (nth datum 3) dP (nth datum 4)
        rd (rand-int 0)
        angka (cond
                (= rd 0) dP
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah benda bermassa " m " kg bergerak pada suatu garis lurus (sumbu x) dengan kecepatan
                               awal " vo " m/s. Benda kemudian mengalami percepatan " a " m/s$^2$ selama " t " detik.
                               Perubahan momentum benda adalah ... kg.m/s.")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAB-4 []
  "Momentum"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAB-4.txt"))
        datum (nth data (rand-int (count data)))
        fr (nth datum 0) fdP (nth datum 1)
        var " mv"
        rd (rand-int 0)
        angka (cond
                (= rd 0) fdP
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah benda bermassa m jatuh vertikal kemudian menumbuk lantai dengan kecepatan v.
                               Jika laju pantulan benda adalah " fr " v maka perubahan momentum benda adalah ... ")
                )
         :pilihan (fnc/create-option4 angka var jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAB []
  "Momentum-Impuls-Tumbukan"
  ;(bC2A2FEAB-4))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "bC2A2FEAB-" x))))))

(defn bC2A2FEAC-0 []
  "Momentum"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAC-0.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) v2 (nth datum 1)
        rd (rand-int 2)
        angka (cond
                (= rd 0) [v2 1]
                (= rd 1) [v2 0]
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah benda bermassa M yang mula-mula diam di atas lantai kemudian meledak menjadi dua bagian.
                               Pecahan pertama bermassa " m1 " M bergerak dengan kecepatan v ke kiri. Pecahan kedua bergerak
                               dengan kecepatan ... v ke ...")
                 (= rd 1) (str "Sebuah benda bermassa M yang mula-mula diam di atas lantai kemudian meledak menjadi dua bagian.
                               Pecahan pertama bermassa " m1 " M bergerak dengan kecepatan v ke kanan. Pecahan kedua bergerak
                               dengan kecepatan ... v ke ...")
                )
         :pilihan (fnc/create-option6 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAC-1 []
  "Momentum"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAC-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) v (nth datum 1) P1 (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) P1
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah benda bermassa " m " kg ditembakkan vertikal ke atas. Ketika kecepatannya " v " m/s
                               benda meledak menjadi 2 bagian dengan massa yang sama. Besar momentum salah satu pecahan
                               adalah ... kg.m/s.")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAC-2 []
  "Momentum"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAC-2.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) m2 (nth datum 1) v1 (nth datum 2) v2 (nth datum 3)
        v11 (nth datum 4) v21 (nth datum 5)
        mv1 (Math/abs v1) mv2 (Math/abs v2) mv11 (Math/abs v11) mv21 (Math/abs v21)
        av1 (if (> v1 0) "kanan" "kiri")
        av2 (if (> v2 0) "kanan" "kiri")
        av11 (if (> v11 0) "kanan" "kiri")
        av21 (if (> v21 0) "kanan" "kiri")
        aav11 (if (> v11 0) 1 0)
        aav21 (if (> v21 0) 1 0)
        rd (rand-int 2)
        angka (cond
                (= rd 0) [mv21 aav21]
                (= rd 1) [mv11 aav11]
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Dua buah benda A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg bertumbukan
                               sentral lurus. Kecepatan A dan B sesaat sebelum tumbukan adalah " mv1 " m/s ke
                               " av1 " dan " mv2 " m/s ke " av2 ". Jika kecepatan A setelah tumbukan adalah " mv11 " m/s
                               ke " av11 " maka kecepatan benda B setelah tumbukan adalah ... m/s ke ...")
                 (= rd 1) (str "Dua buah benda A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg bertumbukan
                               sentral lurus. Kecepatan A dan B sesaat sebelum tumbukan adalah " mv1 " m/s ke
                               " av1 " dan " mv2 " m/s ke " av2 ". Jika kecepatan B setelah tumbukan adalah " mv21 " m/s
                               ke " av21 " maka kecepatan benda A setelah tumbukan adalah ... m/s ke ...")
                )
         :pilihan (fnc/create-option6 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAC []
  "Momentum-Impuls-Tumbukan"
  ;(bC2A2FEAC-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FEAC-" x))))))

(defn bC2A2FEAD-0 []
  "Energi kinetik"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAD-0.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) m2 (nth datum 1) v1 (nth datum 2) v2 (nth datum 3)
        v11 (nth datum 4) v21 (nth datum 5) Ek21 (nth datum 7)
        mv1 (Math/abs v1) mv2 (Math/abs v2) mv11 (Math/abs v11) mv21 (Math/abs v21)
        av1 (if (> v1 0) "kanan" "kiri")
        av2 (if (> v2 0) "kanan" "kiri")
        av11 (if (> v11 0) "kanan" "kiri")
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ek21
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Dua buah benda A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg bertumbukan
                               sentral lurus. Kecepatan A dan B sesaat sebelum tumbukan adalah " mv1 " m/s ke
                               " av1 " dan " mv2 " m/s ke " av2 ". Jika kecepatan A setelah tumbukan adalah " mv11 " m/s
                               ke " av11 " maka energi kinetik benda B setelah tumbukan adalah ... joule.")
                )
         :pilihan (fnc/create-option3 angka 1 jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAD-1 []
  "Momentum"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAD-1.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) m2 (nth datum 1) v1 (nth datum 2) v2 (nth datum 3)
        v11 (nth datum 4) v21 (nth datum 5) dEk (nth datum 7)
        mv1 (Math/abs v1) mv2 (Math/abs v2) mv11 (Math/abs v11) mv21 (Math/abs v21)
        av1 (if (> v1 0) "kanan" "kiri")
        av2 (if (> v2 0) "kanan" "kiri")
        av11 (if (> v11 0) "kanan" "kiri")
        rd (rand-int 0)
        angka (cond
                (= rd 0) dEk
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Dua buah benda A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg bertumbukan
                               sentral lurus. Kecepatan A dan B sesaat sebelum tumbukan adalah " mv1 " m/s ke
                               " av1 " dan " mv2 " m/s ke " av2 ". Jika kecepatan A setelah tumbukan adalah " mv11 " m/s
                               ke " av11 " maka selisih energi kinetik total benda-benda sebelum dan setelah
                               tumbukan adalah ... joule.")
                )
         :pilihan (fnc/create-option3 angka 1 jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAD []
  "Momentum-Impuls-Tumbukan Energi Kinetik"
  ;(bC2A2FEAD-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "bC2A2FEAD-" x))))))

(defn bC2A2FEAE-0 []
  "Koefisien restitusi"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAE-0.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) m2 (nth datum 1) v1 (nth datum 2) v2 (nth datum 3)
        v11 (nth datum 4) v21 (nth datum 5) e (nth datum 6)
        mv1 (Math/abs v1) mv2 (Math/abs v2) mv11 (Math/abs v11) mv21 (Math/abs v21)
        av1 (if (> v1 0) "kanan" "kiri")
        av2 (if (> v2 0) "kanan" "kiri")
        av11 (if (> v11 0) "kanan" "kiri")
        rd (rand-int 0)
        angka (cond
                (= rd 0) e
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Dua buah benda A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg bertumbukan
                               sentral lurus. Kecepatan A dan B sesaat sebelum tumbukan adalah " mv1 " m/s ke
                               " av1 " dan " mv2 " m/s ke " av2 ". Jika kecepatan A setelah tumbukan adalah " mv11 " m/s
                               ke " av11 " maka koefisien restitusi tumbukan adalah ...")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAE []
  "Momentum-Impuls-Tumbukan Energi Kinetik"
  (bC2A2FEAE-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "bC2A2FEAE-" x))))))

(defn bC2A2FEAF-0 []
  "Tumbukan lenting sempurna"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAF-0.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) m2 (nth datum 1) v1 (nth datum 2) v2 (nth datum 3)
        v11 (nth datum 4) v21 (nth datum 5) Ek11 (nth datum 7) Ek21 (nth datum 8)
        mv1 (Math/abs v1) mv2 (Math/abs v2) mv11 (Math/abs v11) mv21 (Math/abs v21)
        av1 (if (> v1 0) "ke kanan" (if (= v1 0) "(diam)" "ke kiri"))
        av2 (if (> v2 0) "ke kanan" (if (= v2 0) "(diam)" "ke kiri"))
        av11 (if (> v11 0) "kanan" "kiri")
        rd (rand-int 2)
        angka (cond
                (= rd 0) Ek11
                (= rd 1) Ek21
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Dua buah benda A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg bertumbukan
                               sentral lurus dan lenting sempurna. Kecepatan A dan B sesaat sebelum tumbukan adalah " mv1 " m/s
                               " av1 " dan " mv2 " m/s  " av2 ". Energi kinetik benda A setelah bertumbukan adalah ... m/s.")
                 (= rd 1) (str "Dua buah benda A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg bertumbukan
                               sentral lurus dan lenting sempurna. Kecepatan A dan B sesaat sebelum tumbukan adalah " mv1 " m/s
                               " av1 " dan " mv2 " m/s  " av2 ". Energi kinetik benda B setelah bertumbukan adalah ... m/s.")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAF-1 []
  "Tumbukan lenting sempurna"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAF-0.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) m2 (nth datum 1) v1 (nth datum 2) v2 (nth datum 3)
        v11 (nth datum 4) v21 (nth datum 5) Ek11 (nth datum 7) Ek21 (nth datum 8)
        mv1 (Math/abs v1) mv2 (Math/abs v2) mv11 (Math/abs v11) mv21 (Math/abs v21)
        av1 (if (> v1 0) "ke kanan" (if (= v1 0) "(diam)" "ke kiri"))
        av2 (if (> v2 0) "ke kanan" (if (= v2 0) "(diam)" "ke kiri"))
        av11 (if (> v11 0) "ke kanan" (if (= v11 0) "(diam)" "ke kiri"))
        av21 (if (> v21 0) "ke kanan" (if (= v21 0) "(diam)" "ke kiri"))
        aav11 (if (> v11 0) 1 0)
        aav21 (if (> v21 0) 1 0)
        rd (rand-int 2)
        angka (cond
                (= rd 0) [mv21 aav21]
                (= rd 1) [mv11 aav11]
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Dua buah benda A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg bertumbukan
                               sentral lurus dan lenting sempurna. Kecepatan A dan B sesaat sebelum tumbukan adalah " mv1 " m/s
                               " av1 " dan " mv2 " m/s  " av2 ".Kecepatan B setelah tumbukan  ... m/s ke ...")
                 (= rd 1) (str "Dua buah benda A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg bertumbukan
                               sentral lurus dan lenting sempurna. Kecepatan A dan B sesaat sebelum tumbukan adalah " mv1 " m/s
                               " av1 " dan " mv2 " m/s  " av2 ".Kecepatan A setelah tumbukan  ... m/s ke ...")
                )
         :pilihan (fnc/create-option6 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAF-2 []
  "Tumbukan lenting sempurna"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAF-2.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) m2 (nth datum 1) v1 (nth datum 2) v2 (nth datum 3)
        v11 (nth datum 4) v21 (nth datum 5)
        mv1 (Math/abs v1) mv2 (Math/abs v2) mv11 (Math/abs v11) mv21 (Math/abs v21)
        av1 (if (> v1 0) "ke kanan" (if (= v1 0) "(diam)" "ke kiri"))
        av2 (if (> v2 0) "ke kanan" (if (= v2 0) "(diam)" "ke kiri"))
        av11 (if (> v11 0) "ke kanan" (if (= v11 0) "(diam)" "ke kiri"))
        av21 (if (> v21 0) "ke kanan" (if (= v21 0) "(diam)" "ke kiri"))
        aav11 (if (> v11 0) 1 0)
        aav21 (if (> v21 0) 1 0)
        rd (rand-int 2)
        angka (cond
                (= rd 0) [mv21 aav21]
                (= rd 1) [mv11 aav11]
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Dua buah benda A dan B yang massanya sama yaitu " m1 " kg bertumbukan
                               sentral lurus dan lenting sempurna. Kecepatan A dan B sesaat sebelum tumbukan adalah " mv1 " m/s
                               " av1 " dan " mv2 " m/s  " av2 ".Kecepatan B setelah tumbukan  ... m/s ke ...")
                 (= rd 1) (str "Dua buah benda A dan B yang massanya sama yaitu " m1 " kg bertumbukan
                               sentral lurus dan lenting sempurna. Kecepatan A dan B sesaat sebelum tumbukan adalah " mv1 " m/s
                               " av1 " dan " mv2 " m/s  " av2 ".Kecepatan A setelah tumbukan  ... m/s ke ...")
                )
         :pilihan (fnc/create-option6 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAF []
  "Momentum-Impuls-Tumbukan Energi Kinetik"
  ;(bC2A2FEAF-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FEAF-" x))))))

(defn bC2A2FEAG-0 []
  "Tumbukan tidak lenting sama sekali"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAG-0.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) m2 (nth datum 1) v1 (nth datum 2) v2 (nth datum 3)
        v11 (nth datum 4) v21 (nth datum 5)
        mv1 (Math/abs v1) mv2 (Math/abs v2) mv11 (Math/abs v11) mv21 (Math/abs v21)
        av1 (if (> v1 0) "ke kanan" (if (= v1 0) "(diam)" "ke kiri"))
        av2 (if (> v2 0) "ke kanan" (if (= v2 0) "(diam)" "ke kiri"))
        av11 (if (> v11 0) "ke kanan" (if (= v11 0) "(diam)" "ke kiri"))
        av21 (if (> v21 0) "ke kanan" (if (= v21 0) "(diam)" "ke kiri"))
        aav11 (if (> v11 0) 1 0)
        aav21 (if (> v21 0) 1 0)
        rd (rand-int 0)
        angka (cond
                (= rd 0) [mv21 aav21]
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Dua buah benda A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg bertumbukan
                               tidak lenting sama sekali. Kecepatan A dan B sesaat sebelum tumbukan adalah " mv1 " m/s
                               " av1 " dan " mv2 " m/s  " av2 ".Kecepatan kedua benda setelah tumbukan  ... m/s ke ...")
                )
         :pilihan (fnc/create-option6 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAG-1 []
  "Tumbukan tidak lenting sama sekali"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAG-1.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) m2 (nth datum 1) v1 (nth datum 2) v2 (nth datum 3)
        v11 (nth datum 4) m1g (nth datum 6)
        rd (rand-int 0)
        angka (cond
                (= rd 0) v11
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah peluru bermassa " m1g " gram ditembakkan ke suatu balok bermassa " m2 " kg
                               yang diam pada lantai mendatar. Jika kecepatan peluru sebelum bersarang pada balok adalah
                               " v1 " m/s maka kecepatan balok setelah tumbukan adalah ... m/s.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAG []
  "Momentum-Impuls-Tumbukan Energi Kinetik"
  ;(bC2A2FEAG-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "bC2A2FEAG-" x))))))

(defn bC2A2FEAH-0 []
  "Tumbukan lenting sebagian"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAH-0.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) m2 (nth datum 1) v1 (nth datum 2) v2 (nth datum 3)
        v11 (nth datum 4) v21 (nth datum 5) e (nth datum 6)
        mv1 (Math/abs v1) mv2 (Math/abs v2) mv11 (Math/abs v11) mv21 (Math/abs v21)
        av1 (if (> v1 0) "ke kanan" (if (= v1 0) "(diam)" "ke kiri"))
        av2 (if (> v2 0) "ke kanan" (if (= v2 0) "(diam)" "ke kiri"))
        av11 (if (> v11 0) "ke kanan" (if (= v11 0) "(diam)" "ke kiri"))
        av21 (if (> v21 0) "ke kanan" (if (= v21 0) "(diam)" "ke kiri"))
        aav11 (if (> v11 0) 1 0)
        aav21 (if (> v21 0) 1 0)
        rd (rand-int 2)
        angka (cond
                (= rd 0) [mv21 aav21]
                (= rd 1) [mv11 aav11]
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Dua buah benda A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg bertumbukan
                               sentral lurus dengan koefisien restitusi " e ". Kecepatan A dan B sesaat sebelum tumbukan adalah " mv1 " m/s
                               " av1 " dan " mv2 " m/s  " av2 ".Kecepatan B setelah tumbukan  ... m/s ke ...")
                 (= rd 0) (str "Dua buah benda A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg bertumbukan
                               sentral lurus dengan koefisien restitusi " e ". Kecepatan A dan B sesaat sebelum tumbukan adalah " mv1 " m/s
                               " av1 " dan " mv2 " m/s  " av2 ".Kecepatan A setelah tumbukan  ... m/s ke ...")
                )
         :pilihan (fnc/create-option6 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAH []
  "Momentum-Impuls-Tumbukan Energi Kinetik"
  (bC2A2FEAH-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "bC2A2FEAH-" x))))))

(defn bC2A2FEAI-0 []
  "Tumbukan lenting sebagian"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAI-0.txt"))
        datum (nth data (rand-int (count data)))
        m1 (nth datum 0) m2 (nth datum 1) v1 (nth datum 2) v2 (nth datum 3)
        v11 (nth datum 4) v21 (nth datum 5) e (nth datum 6) I1 (nth datum 7) I2 (nth datum 8)
        mv1 (Math/abs v1) mv2 (Math/abs v2) mv11 (Math/abs v11) mv21 (Math/abs v21)
        av1 (if (> v1 0) "ke kanan" (if (= v1 0) "(diam)" "ke kiri"))
        av2 (if (> v2 0) "ke kanan" (if (= v2 0) "(diam)" "ke kiri"))
        av11 (if (> v11 0) "ke kanan" (if (= v11 0) "(diam)" "ke kiri"))
        av21 (if (> v21 0) "ke kanan" (if (= v21 0) "(diam)" "ke kiri"))
        aav11 (if (> v11 0) 1 0)
        aav21 (if (> v21 0) 1 0)
        rd (rand-int 2)
        angka (cond
                (= rd 0) I1
                (= rd 1) I2
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Dua buah benda A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg bertumbukan
                               sentral lurus dan lenting sempurna. Kecepatan A dan B sesaat sebelum tumbukan adalah " mv1 " m/s
                               " av1 " dan " mv2 " m/s  " av2 ". Besar impuls yang dialami benda A pada tumbukan tersebut
                               adalah ... N.s.")
                 (= rd 1) (str "Dua buah benda A dan B yang massanya berturut-turut " m1 " kg dan " m2 " kg bertumbukan
                               sentral lurus dan lenting sempurna. Kecepatan A dan B sesaat sebelum tumbukan adalah " mv1 " m/s
                               " av1 " dan " mv2 " m/s  " av2 ". Besar impuls yang dialami benda B pada tumbukan tersebut
                               adalah ... N.s.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAI-1 []
  "Impuls"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAI-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) v (nth datum 1) I (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) I
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah bola karet bermassa " m " kg jatuh vertikal ke lantai sehingga terjadi tumbukan
                               lenting sempurna antara bola dengan lantai. Jika kecepatan bola sesaat sebelum menumbuk
                               lantai adalah " v " m/s maka Impuls yang dialami bola dalam proses tumbukan tersebut
                               adalah ... N.s.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAI-2 []
  "Impuls"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAI-2.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) vo (nth datum 1) vf (nth datum 2) I (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) I
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Seorang anak melempar bola bermassa " m " kg ke anak lain yang siap memukul bola dengan
                               tongkat pemukul. Jika kecepatan bola sebelum dan sesudah terpukul adalah " vo " m/s dan
                               " vf " m/s dengan arah yang berlawanan, maka besar impuls yang dialami bola adalah ... N.s.")
                )
         :pilihan (fnc/create-option3 angka 1 jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAI []
  "Momentum-Impuls-Tumbukan Energi Kinetik"
  ;(bC2A2FEAI-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FEAI-" x))))))

(defn bC2A2FEAJ-0 []
  "Impuls dan Gaya"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAJ-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) vo (nth datum 1) dt (nth datum 2) F (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) F
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah bola karet bermassa " m " kg jatuh vertikal ke lantai sehingga terjadi tumbukan
                               lenting sempurna antara bola dengan lantai. Jika kecepatan bola sesaat sebelum menumbuk
                               lantai adalah " vo " m/s dan bola bersentuhan dengan lantai selama " dt " sekon
                               maka gaya rata-rata yang diberikan lantai terhadap bola adalah ... N.")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAJ-1 []
  "Impuls dan Gaya"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAJ-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) vo (nth datum 1) vf (nth datum 2) dt (nth datum 3) F (nth datum 4)
        rd (rand-int 0)
        angka (cond
                (= rd 0) F
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah bola kasti bermassa " m " kg dilemparkan menuju pemukul dengan kecepatan sesaat
                               sebelum dipukul " vo " m/s. Jika persentuhan bola dengan tongkat pemukul selama " dt " detik
                               dan kecepatan bola meninggalkan pemukul adalah " vf " m/s dengan arah berlawanan,
                               maka gaya rata-rata yang dialami bola adalah ... newton.")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAJ-2 []
  "Impuls dan Gaya"
    (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAJ-2.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) dt (nth datum 1) h (nth datum 2) F (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) F
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah bola bermassa " m " kg dilontarkan vertikal ke atas dengan pelontar pegas sehingga
                               mencapai tinggi maksimum " h " meter. Jika bola terdorong oleh pelontar selama " dt " detik
                               maka gaya rata-rata yang dialami bola adalah ... newton.")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAJ []
  "Momentum-Impuls-Tumbukan Energi Kinetik"
  ;(bC2A2FEAJ-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FEAJ-" x))))))

(defn bC2A2FEAK-0 []
  "Impuls dan gaya (Grafik)"
  (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAK-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) vF (nth datum 1) vt (nth datum 2) dP (nth datum 3) dv (nth datum 4)
        ja (count vF)
        max1 (last vt)
        max2 (second vF)
        rd (rand-int 2)
        angka (cond
                (= rd 0) dP
                (= rd 1) dv
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bermassa " m " kg mengalami gaya yang berubah terhadap waktu seperti di
                               gambarkan pada grafik di bawah (F dalam newton, t dalam milisekon). Perubahan momentum
                               yag dialami oleh benda adalah ... N.s.")
                 (= rd 1) (str "Sebuah benda bermassa " m " kg mengalami gaya yang berubah terhadap waktu seperti di
                               gambarkan pada grafik di bawah (F dalam newton, t dalam milisekon). Perubahan kecepatan
                               yag dialami oleh benda adalah ... m/s.")
                )
         :grafik {:var1 "F" :var2 "t" :max1 max1 :max2 max2 :pair ja :datax vt :datay vF}
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAK-1 []
  "Impuls dan gaya (Grafik)"
  (let [data (read-string (slurp "data/fis1113/bab5/C2A2FEAK-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) vo (nth datum 1) vF (nth datum 2) vt (nth datum 3) v (nth datum 4)
        ja (count vF)
        max1 (last vt)
        max2 (last (sort vF))
        rd (rand-int 0)
        angka (cond
                (= rd 0) v
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str "Sebuah benda bermassa " m " kg mengalami gaya yang berubah terhadap waktu seperti di
                               gambarkan pada grafik di bawah (F dalam newton, t dalam sekon). Jika kecepatan awal
                               benda adalah " vo " m/s maka kecepatan setelah diberi gaya adalah ... m/s.")

                )
         :grafik {:var1 "F" :var2 "t" :max1 max1 :max2 max2 :pair ja :datax vt :datay vF}
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FEAK []
  "Momentum-Impuls-Tumbukan Energi Kinetik"
  ;(bC2A2FEAK-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "bC2A2FEAK-" x))))))

;;;Keseimbangan benda tegar

(defn bC2A2FFAD-0 []
  "Besar Torsi"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFAD-0.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) F (nth datum 2) Ta (nth datum 3) Tb (nth datum 4)
        rd (rand-int 2)
        angka (cond
                (= rd 0) Ta
                (= rd 1) Tb
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu batang dengan massa diabaikan memperoleh gaya seperti pada gambar. Jika
                               panjang a = " a " m, b = " b " m dan besar F = " F " N maka besar
                               torsi (momen putar) terhadap titik A adalah ... N.m.")
                 (= rd 1) (str "Suatu batang dengan massa diabaikan memperoleh gaya seperti pada gambar. Jika
                               panjang a = " a " m, b = " b " m dan besar F = " F " N maka besar
                               torsi (momen putar) terhadap titik B adalah ... N.m.")
                )
         :pictures [{:obj 4 :param "#000000,100,100,300,110"}, {:obj 3 :param "#000000,300,110,060,270"},
                    {:obj 8 :param "#000000,295,182,F"}, {:obj 8 :param "#000000,150,122,a"}
                    {:obj 8 :param "#000000,250,122,b"}, {:obj 8 :param "#000000,095,098,A"}
                    {:obj 8 :param "#000000,195,098,B"}
                    {:obj 7 :param "#000000,100,105,003"}, {:obj 7 :param "#000000,200,105,003"}
                    ]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFAD-1 []
  "Besar Torsi"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFAD-1.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) F (nth datum 2) alf (nth datum 3) Ta (nth datum 4) Tb (nth datum 5)
        rd (rand-int 2)
        angka (cond
                (= rd 0) Ta
                (= rd 1) Tb
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu batang dengan massa diabaikan memperoleh gaya seperti pada gambar.
                               Panjang a = " a " m, b = " b " m dan besar F = " F " N. Jika sudut antara
                               batang dengan gaya adalah " alf "$^o$ maka besar
                               torsi (momen putar) terhadap titik A adalah ... N.m.")
                 (= rd 1) (str "Suatu batang dengan massa diabaikan memperoleh gaya seperti pada gambar.
                               Panjang a = " a " m, b = " b " m dan besar F = " F " N. Jika sudut antara
                               batang dengan gaya adalah " alf "$^o$ maka besar
                               torsi (momen putar) terhadap titik B adalah ... N.m.")
                )
         :pictures [{:obj 4 :param "#000000,100,100,300,110"}, {:obj 3 :param "#000000,300,110,060,315"},
                    {:obj 8 :param "#000000,340,142,F"}, {:obj 8 :param "#000000,150,122,a"}
                    {:obj 8 :param "#000000,250,122,b"}, {:obj 8 :param "#000000,095,098,A"}
                    {:obj 8 :param "#000000,195,098,B"}
                    {:obj 7 :param "#000000,100,105,003"}, {:obj 7 :param "#000000,200,105,003"}
                    ]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFAD-2 []
  "Besar Torsi"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFAD-2.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) F (nth datum 2) alf (nth datum 3) Ta (nth datum 4) Tb (nth datum 5)
        rd (rand-int 2)
        angka (cond
                (= rd 0) Ta
                (= rd 1) Tb
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu batang dengan massa diabaikan memperoleh gaya seperti pada gambar.
                               Panjang a = " a " m, b = " b " m dan besar F = " F " N. Jika sudut antara
                               batang dengan gaya adalah " alf "$^o$ maka besar
                               torsi (momen putar) terhadap titik A adalah ... N.m.")
                 (= rd 1) (str "Suatu batang dengan massa diabaikan memperoleh gaya seperti pada gambar.
                               Panjang a = " a " m, b = " b " m dan besar F = " F " N. Jika sudut antara
                               batang dengan gaya adalah " alf "$^o$ maka besar
                               torsi (momen putar) terhadap titik B adalah ... N.m.")
                )
         :pictures [{:obj 4 :param "#000000,100,100,300,110"}, {:obj 3 :param "#000000,200,105,060,135"},
                    {:obj 8 :param "#000000,150,062,F"}, {:obj 8 :param "#000000,150,122,a"}
                    {:obj 8 :param "#000000,250,122,b"}, {:obj 8 :param "#000000,095,098,A"}
                    {:obj 8 :param "#000000,295,098,B"}, {:obj 7 :param "#000000,200,105,003"}
                    {:obj 7 :param "#000000,100,105,003"}, {:obj 7 :param "#000000,300,105,003"}
                    ]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFAD []
  "Keseimbangan benda tegar"
  ;(bC2A2FFAD-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FFAD-" x))))))

(defn bC2A2FFAE-0 []
  "Arah Torsi"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFAE-0.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) F1 (nth datum 2) F2 (nth datum 3) F3 (nth datum 4)
          alf (nth datum 5) Ta (nth datum 6) Tb (nth datum 7) Tc (nth datum 8)
        rd (rand-int 3)
        angka (cond
                (= rd 0) Ta
                (= rd 1) Tb
                (= rd 2) Tc
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu batang dengan massa diabaikan memperoleh gaya seperti pada gambar.
                               Panjang a = " a " m, b = " b " m, F1 = " F1 " N, F2 = " F2 " N, F3 = " F3 " N,
                               dan sudut antara F2 dengan batang " alf " $^o$. Jika tanda arah menuju pembaca adalah +, maka
                               torsi yang ditimbulkan gaya-gaya tersebut terhadap titik A adalah ... N.m.")
                 (= rd 1) (str "Suatu batang dengan massa diabaikan memperoleh gaya seperti pada gambar.
                               Panjang a = " a " m, b = " b " m, F1 = " F1 " N, F2 = " F2 " N, F3 = " F3 " N,
                               dan sudut antara F2 dengan batang " alf " $^o$. Jika tanda arah menuju pembaca adalah + , maka
                               torsi yang ditimbulkan gaya-gaya tersebut terhadap titik B adalah ... N.m.")
                 (= rd 2) (str "Suatu batang dengan massa diabaikan memperoleh gaya seperti pada gambar.
                               Panjang a = " a " m, b = " b " m, F1 = " F1 " N, F2 = " F2 " N, F3 = " F3 " N,
                               dan sudut antara F2 dengan batang " alf " $^o$. Jika tanda arah menuju pembaca adalah + , maka
                               torsi yang ditimbulkan gaya-gaya tersebut terhadap titik C adalah ... N.m.")
                )
         :pictures [{:obj 4 :param "#000000,100,100,300,110"}, {:obj 3 :param "#000000,200,105,060,045"},
                    {:obj 8 :param "#000000,233,060,F2"}, {:obj 8 :param "#000000,150,122,a"}
                    {:obj 8 :param "#000000,250,122,b"}, {:obj 8 :param "#000000,095,098,A"}
                    {:obj 8 :param "#000000,195,098,B"}, {:obj 7 :param "#000000,200,105,003"}
                    {:obj 7 :param "#000000,100,105,003"}, {:obj 7 :param "#000000,300,105,003"}
                    {:obj 3 :param "#000000,100,105,050,270"}, {:obj 3 :param "#000000,300,105,070,270"}
                    {:obj 8 :param "#000000,095,167,F1"}, {:obj 8 :param "#000000,295,187,F3"}
                    {:obj 8 :param "#000000,295,098,C"}
                    ]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFAE-1 []
  "Arah Torsi"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFAE-1.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) F1 (nth datum 2) F2 (nth datum 3) F3 (nth datum 4)
        To (nth datum 5) Tb (nth datum 6) Tc (nth datum 7)
        rd (rand-int 3)
        angka (cond
                (= rd 0) To
                (= rd 1) Tb
                (= rd 2) Tc
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu bidang ABCD berpusat di O yang beratnya diabaikan diberi tiga gaya seperti pada gambar.
                               Jika sisi a = " a " m, sisi b = " b " m, F1 = " F1 " N, F2 = " F2 " N, F3 = " F3 " N, dan
                               tanda arah menuju pembaca adalah +, maka torsi yang ditimbulkan gaya-gaya tersebut
                               terhadap titik O adalah ... N.m.")
                 (= rd 1) (str "Suatu bidang ABCD berpusat di O yang beratnya diabaikan diberi tiga gaya seperti pada gambar.
                               Jika sisi a = " a " m, sisi b = " b " m, F1 = " F1 " N, F2 = " F2 " N, F3 = " F3 " N, dan
                               tanda arah menuju pembaca adalah +, maka torsi yang ditimbulkan gaya-gaya tersebut
                               terhadap titik B adalah ... N.m.")
                 (= rd 2) (str "Suatu bidang ABCD berpusat di O yang beratnya diabaikan diberi tiga gaya seperti pada gambar.
                               Jika sisi a = " a " m, sisi b = " b " m, F1 = " F1 " N, F2 = " F2 " N, F3 = " F3 " N, dan
                               tanda arah menuju pembaca adalah +, maka torsi yang ditimbulkan gaya-gaya tersebut
                               terhadap titik C adalah ... N.m.")
                )
         :pictures [{:obj 4 :param "#000000,150,060,250,140"}, {:obj 5 :param "#d3d3d3,151,061,098,78"}
                    {:obj 7 :param "#000000,150,060,003"}
                    {:obj 7 :param "#000000,250,060,003"}, {:obj 7 :param "#000000,250,140,003"}
                    {:obj 7 :param "#000000,150,140,003"}, {:obj 7 :param "#000000,200,100,003"}
                    {:obj 8 :param "#000000,145,055,A"}, {:obj 8 :param "#000000,255,060,B"},
                    {:obj 8 :param "#000000,245,157,C"}, {:obj 8 :param "#000000,145,157,D"},
                    {:obj 8 :param "#000000,197,095,O"}, {:obj 3 :param "#000000,150,140,050,180"}
                    {:obj 3 :param "#000000,200,100,080,270"}, {:obj 3 :param "#000000,250,060,050,090"}
                    {:obj 8 :param "#000000,080,143,F1"}, {:obj 8 :param "#000000,195,193,F2"},
                    {:obj 8 :param "#000000,258,015,F3"}, {:obj 8 :param "#000000,200,055,a"}
                    {:obj 8 :param "#000000,255,100,b"}
                    ]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFAE []
  "Keseimbangan benda tegar"
  ;(bC2A2FFAE-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "bC2A2FFAE-" x))))))

(defn bC2A2FFAF-0 []
  "Keseimbangan"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFAF-0.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) m (nth datum 2) F (nth datum 3)
        rd (rand-int 2)
        angka (cond
                (= rd 0) F
                (= rd 1) m
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah balok bermassa " m " kg diletakkan di salah satu ujung batang yang massanya diabaikan
                               seperti gambar di bawah. Jika a = " a " m dan b = " b " meter, maka besar gaya F yang diperlukan
                               agar sistem ini seimbang adalah ... N.")
                 (= rd 1) (str "Diperlukan gaya sebesar " F " newton untuk membuat sistem pada gambar di bawah seimbang. Jika
                               a = " a " m, b = " b " m dan massa batang diabaikan maka massa balok adalah ... kg.")
                )
         :pictures [{:obj 4 :param "#000000,100,095,300,105"}, {:obj 4 :param "#000000,100,065,129,094"}
                    {:obj 1 :param "#000000,200,106,220,146"}, {:obj 1 :param "#000000,220,146,180,146"}
                    {:obj 1 :param "#000000,180,146,200,106"}, {:obj 8 :param "#000000,148,117,a"}
                    {:obj 8 :param "#000000,248,117,b"}, {:obj 3 :param "#000000,300,105,050,270"}
                    {:obj 8 :param "#000000,296,168,F"}
                    ]
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFAF-1 []
  "Keseimbangan"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFAF-1.txt"))
        datum (nth data (rand-int (count data)))
        L (nth datum 0) m (nth datum 1) alf (nth datum 2) T (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) T
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Perhatikan sistem keseimbangan pada gambar di bawah. Jika batang homogen yang panjangnya
                               " L " m bermassa " m " kg dan sudut antara tali dengan batang adalah " alf "$^o$, maka
                               gaya tegangan tali adalah ... N.")
                )
         :pictures [{:obj 1 :param "#000000,103,095,250,095"}, {:obj 1 :param "#000000,250,095,250,105"}
                    {:obj 1 :param "#000000,250,105,103,105"}, {:obj 8 :param "#000000,102,120,E"}
                    {:obj 7 :param "#000000,101,100,02"}, {:obj 1 :param "#000000,250,095,100,010"}
                    {:obj 11 :param "#000000,100,000,200"}, {:obj 13 :param "#000000,100,091,107,097,107,103,100,109"}
                    ]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFAF-2 []
  "Keseimbangan"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFAF-2.txt"))
        datum (nth data (rand-int (count data)))
        L (nth datum 0) m (nth datum 1) alf (nth datum 2) E (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) E
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Perhatikan sistem keseimbangan pada gambar di bawah. Jika batang homogen yang panjangnya
                               " L " m bermassa " m " kg dan sudut antara tali dengan batang adalah " alf "$^o$, maka
                               gaya yang bekerja pada engsel E adalah ... N.")
                )
         :pictures [{:obj 1 :param "#000000,103,095,250,095"}, {:obj 1 :param "#000000,250,095,250,105"}
                    {:obj 1 :param "#000000,250,105,103,105"}
                    {:obj 7 :param "#000000,101,100,02"}, {:obj 1 :param "#000000,250,095,100,010"}
                    {:obj 11 :param "#000000,100,000,200"}, {:obj 13 :param "#000000,100,091,107,097,107,103,100,109"}
                    {:obj 8 :param "#000000,102,120,E"}
                    ]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFAF []
  "Keseimbangan benda tegar"
  ;(bC2A2FFAF-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FFAF-" x))))))

(defn bC2A2FFAG-0 []
  "Keseimbangan 2"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFAG-0.txt"))
        datum (nth data (rand-int (count data)))
        L (nth datum 0) mb (nth datum 1) mA (nth datum 2) alf (nth datum 3) T (nth datum 4)
        rd (rand-int 0)
        angka (cond
                (= rd 0) T
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Perhatikan sistem keseimbangan pada gambar di bawah. Batang homogen yang panjangnya
                               " L " m bermassa " mb " kg ditunjang oleh tali T yang sudutnya dengan batang adalah " alf "$^o$.
                               Ujung batang dihubungan dengan engsel ke tembok vertikal, dan ujung satunya lagi digantungi
                               beban dengan massa " mA " kg. Gaya tegangan tali T adalah ... N.")
                )
         :pictures [{:obj 1 :param "#000000,103,095,250,095"}, {:obj 1 :param "#000000,250,095,250,105"}
                    {:obj 1 :param "#000000,250,105,103,105"}, {:obj 1 :param "#000000,250,105,250,150"}
                    {:obj 7 :param "#000000,101,100,02"}, {:obj 1 :param "#000000,250,095,100,010"}
                    {:obj 4 :param "#000000,230,150,270,190"}
                    {:obj 11 :param "#000000,100,000,200"}, {:obj 13 :param "#000000,100,091,107,097,107,103,100,109"}
                    {:obj 8 :param "#000000,102,120,E"}, {:obj 8 :param "#000000,210,065,T"}
                    ]
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFAG-1 []
  "Keseimbangan 2"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFAG-1.txt"))
        datum (nth data (rand-int (count data)))
        L (nth datum 0) mb (nth datum 1) mC (nth datum 2) a (nth datum 3) NA (nth datum 4) NB (nth datum 5)
        rd (rand-int 2)
        angka (cond
                (= rd 0) NA
                (= rd 1) NB
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu batang homogen bermassa " mb " kg dan panjang " L " m ditopang diujung-ujungnya
                               dengan penopang A dan B (lihat gambar di bawah). Jika massa balok C " mC " kg dan jarak
                               a = " a " m, maka gaya normal yang dialami penopang A adalah ... N.")
                 (= rd 1) (str "Suatu batang homogen bermassa " mb " kg dan panjang " L " m ditopang diujung-ujungnya
                               dengan penopang A dan B (lihat gambar di bawah). Jika massa balok C " mC " kg dan jarak
                               a = " a " m, maka gaya normal yang dialami penopang B adalah ... N.")
                )
         :pictures [{:obj 4 :param "#000000,100,095,300,105"}, {:obj 4 :param "#000000,185,065,214,094"}
                    {:obj 1 :param "#000000,100,106,120,146"}, {:obj 1 :param "#000000,120,146,080,146"}
                    {:obj 1 :param "#000000,080,146,100,106"}, {:obj 1 :param "#000000,300,106,320,146"}
                    {:obj 1 :param "#000000,320,146,280,146"}, {:obj 1 :param "#000000,280,146,300,106"}
                    {:obj 8 :param "#000000,148,117,a"}, {:obj 8 :param "#000000,248,117,b"}
                    {:obj 8 :param "#000000,097,135,A"}, {:obj 8 :param "#000000,297,135,B"}
                    {:obj 8 :param "#000000,195,085,C"}, {:obj 1 :param "#333333,200,107,200,120"}
                    ]
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFAG-2 []
  "Keseimbangan 2"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFAG-2.txt"))
        datum (nth data (rand-int (count data)))
        mb (nth datum 0) talf (nth datum 1) N1 (nth datum 2) N2 (nth datum 3) umin (nth datum 4)
        rd (rand-int 3)
        angka (cond
                (= rd 0) N1
                (= rd 1) N2
                (= rd 2) umin
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu batang bermassa " mb " kg bersandar di dinding licin dan lantai kasar seperti pada
                               gambar di bawah. Jika tangen sudut antara batang dengan lantai adalah " talf " maka
                               besar gaya normal yang bekerja pada ujung bawah batang adalah ...")
                 (= rd 1) (str "Suatu batang bermassa " mb " kg bersandar di dinding licin dan lantai kasar seperti pada
                               gambar di bawah. Jika tangen sudut antara batang dengan lantai adalah " talf " maka
                               besar gaya normal yang bekerja pada ujung atas batang adalah ...")
                 (= rd 2) (str "Suatu batang bermassa " mb " kg bersandar di dinding licin dan lantai kasar seperti pada
                               gambar di bawah. Jika tangen sudut antara batang dengan lantai adalah " talf " maka
                               koefisien gesekan statis minimum antara lantai dan ujung batang bawah agar batang
                               tidak tergelincir adalah ... ")

                )
         :pictures [;{:obj 4 :param "#000000,100,095,300,105"}, {:obj 4 :param "#000000,185,065,214,094"}
                    {:obj 1 :param "#000000,100,030,240,170"}, {:obj 1 :param "#000000,100,030,110,020"}
                    {:obj 1 :param "#000000,110,020,250,160"}, {:obj 1 :param "#000000,250,160,240,170"}
                    ;{:obj 1 :param "#000000,320,146,280,146"}, {:obj 1 :param "#000000,280,146,300,106"}
                    ;{:obj 8 :param "#000000,148,117,a"}, {:obj 8 :param "#000000,248,117,b"}
                    ;{:obj 8 :param "#000000,097,135,A"}, {:obj 8 :param "#000000,297,135,B"}
                    ;{:obj 8 :param "#000000,195,085,C"}, {:obj 1 :param "#333333,200,107,200,120"}
                    {:obj 11 :param "#000000,100,000,170"} {:obj 9 :param "#000000,100,170,300"}
                    ]
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFAG []
  "Keseimbangan benda tegar"
  ;(bC2A2FFAG-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FFAG-" x))))))

(defn bC2A2FFAGA-0 []
  "Keseimbangan 2"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFAGA-0.txt"))
        datum (nth data (rand-int (count data)))
        mb (nth datum 0) ctalf (nth datum 1) x (nth datum 2) us (nth datum 3) mA (nth datum 4)
        rd (rand-int 3)
        angka (cond
                (= rd 0) mA
                (= rd 1) us
                (= rd 2) x
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu batang bermassa " mb " kg yang panjangnya L bersandar di dinding licin dan lantai kasar
                               seperti pada gambar di bawah. Batang tersebut digantungi beban yang berjarak " x " L
                               dari ujung bawah batang. Jika cotangen sudut antara ujung bawah batang dengan lantai adalah
                               " ctalf " dan koefisien gesekan statik lantai adalah " us " maka massa beban maksimum agar
                               batang tidak tergelincir adalah ... kg.")
                 (= rd 1) (str "Suatu batang bermassa " mb " kg bersandar di dinding licin dan lantai kasar seperti pada
                               gambar di bawah. Batang tersebut digantungi beban bermassa " mA " kg yang berjarak " x " L
                               dari ujung bawah batang. Jika cotangen sudut antara ujung bawah batang dengan lantai adalah
                               " ctalf " dan batang tepat akan tergelincir maka koefisien gesekan statik lantai adalah ...")
                 (= rd 2) (str "Suatu batang bermassa " mb " kg yang panjangnya L bersandar di dinding licin dan lantai kasar
                               seperti pada gambar di bawah. Batang tersebut digantungi beban bermassa " mA " kg yang
                               berjarak x dari ujung bawah batang. Jika cotangen sudut antara ujung bawah batang dengan
                               lantai adalah " ctalf " dan koefisien gesekan statik lantai adalah " us " maka nilai
                               maksimum x agar batang tidak tergelincir adalah ...L.")

                )
         :pictures [;{:obj 4 :param "#000000,100,095,300,105"},
                    {:obj 4 :param "#000000,120,095,150,125"} {:obj 1 :param "#000000,135,060,135,095"}
                    {:obj 1 :param "#000000,100,030,240,170"}, {:obj 1 :param "#000000,100,030,110,020"}
                    {:obj 1 :param "#000000,110,020,250,160"}, {:obj 1 :param "#000000,250,160,240,170"}
                    ;{:obj 1 :param "#000000,280,146,300,106"}
                    ;{:obj 8 :param "#000000,148,117,a"}, {:obj 8 :param "#000000,248,117,b"}
                    ;{:obj 8 :param "#000000,097,135,A"}, {:obj 8 :param "#000000,297,135,B"}
                    ;{:obj 8 :param "#000000,195,085,C"}, {:obj 1 :param "#333333,200,107,200,120"}
                    {:obj 11 :param "#000000,100,000,170"} {:obj 9 :param "#000000,100,170,300"}
                    ]
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFAGA []
  "Keseimbangan benda tegar"
  (bC2A2FFAGA-0))
  ;(let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FFAGA-" x))))))

(defn bC2A2FFCB-0 []
  "Benda titik"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCB-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) a (nth datum 1) b (nth datum 2) I (nth datum 3)
        rd (rand-int 2)
        angka (cond
                (= rd 0) I
                (= rd 1) m
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Dua benda titik masing-masing massanya " m " gram dihubungkan dengan batang yang
                               massanya diabaikan kemudian diputar pada poros seperti pada gambar di bawah. Jika
                               jarak a = " a " cm dan b = " b " cm maka momen inersia sistem ini adalah ... gr.cm$^2$.")
                 (= rd 1) (str "Dua benda titik masing-masing dihubungkan dengan batang yang
                               massanya diabaikan kemudian diputar pada poros seperti pada gambar di bawah. Jika
                               jarak a = " a " cm dan b = " b " cm dan  momen inersia sistem adalah " I " gr.cm$^2$,
                               maka massa masing-masing benda adalah ... gram.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCB-0.png"
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCB-1 []
  "Benda titik"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCB-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) a (nth datum 1) I (nth datum 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) I
                (= rd 1) m
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Empat benda titik yang masing-masing massanya " m " gram dihubungkan dengan kerangka segitiga
                               sama sisi yang massanya diabaikan seperti pada gambar di bawah. Jika sisi segitiga panjangnya " a " cm
                               lalu sistem ini diputar dengan poros putar berupa garis yang melalui C dan O maka momen
                               inersia sistem ini adalah ... gr.cm$^2$.")
                 (= rd 1) (str "Empat benda titik yang massanya masing-masing massanya m dihubungkan dengan kerangka segitiga
                               yang massanya diabaikan dan panjang sisi-sisinya " a " cm. Sistem ini jika diputar pada poros
                               yang melalui C dan O akan memiliki momen inersia sebesar " I " gr.cm$^2$. Massa masing-masing
                               benda adalah ... gr.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCB-1.png"
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCB-2 []
  "Benda titik"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCB-2.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) a (nth datum 1) I (nth datum 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) I
                (= rd 1) m
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Empat benda titik yang masing-masing massanya " m " gram dihubungkan dengan kerangka segitiga
                               sama sisi yang massanya diabaikan seperti pada gambar di bawah. Jika sisi segitiga panjangnya
                               " a "$\\sqrt{3}$ cm
                               lalu sistem ini diputar dengan poros putar berupa garis yang melalui A dan B maka momen
                               inersia sistem ini adalah ... gr.cm$^2$.")
                 (= rd 1) (str "Empat benda titik yang massanya masing-masing massanya m dihubungkan dengan kerangka segitiga
                               yang massanya diabaikan dan panjang sisi-sisinya " a "$\\sqrt{3}$ cm. Sistem ini jika diputar pada poros
                               yang melalui A dan B akan memiliki momen inersia sebesar " I " gr.cm$^2$. Massa masing-masing
                               benda adalah ... gr.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCB-1.png"
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCB-3 []
  "Benda titik"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCB-3.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) a (nth datum 1) I (nth datum 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) I
                (= rd 1) m
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Empat benda titik yang masing-masing massanya " m " gram dihubungkan dengan kerangka segitiga
                               sama sisi yang massanya diabaikan seperti pada gambar di bawah. Jika sisi segitiga panjangnya
                               " a "$\\sqrt{3}$ cm
                               lalu sistem ini diputar dengan poros putar tegak lurus bidang segitiga dan melalui O maka momen
                               inersia sistem ini adalah ... gr.cm$^2$.")
                 (= rd 1) (str "Empat benda titik yang massanya masing-masing massanya m dihubungkan dengan kerangka segitiga
                               yang massanya diabaikan dan panjang sisi-sisinya " a "$\\sqrt{3}$ cm. Sistem ini jika diputar pada poros
                               yang tegak lurus bidang segitiga dan melalui O akan memiliki momen inersia sebesar " I " gr.cm$^2$.
                               Massa masing-masing benda adalah ... gr.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCB-1.png"
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCB []
  "Dinamika Rotasi"
  ;(bC2A2FFCB-3))
  (let [x (rand-int 4)] ((resolve (symbol my-ns (str "bC2A2FFCB-" x))))))

(defn bC2A2FFCC-0 []
  "Benda titik"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCC-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) a (nth datum 1) I (nth datum 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) I
                (= rd 1) m
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Lima benda titik dihubungkan dengan kerangka persegi yang massanya diabaikan seperti pada
                               gambar di bawah. Jika sisi persegi panjangnya  " a "$\\sqrt{2}$ cm, m = " m " gram,
                               lalu sistem ini diputar dengan poros putar tegak lurus bidang persegi dan melalui O maka momen
                               inersia sistem ini adalah ... gr.cm$^2$.")
                 (= rd 1) (str "Lima benda titik dihubungkan dengan kerangka persegi yang massanya diabaikan  dan panjang
                               sisi perseginya adalah " a "$\\sqrt{2}$ cm.
                               Jika sistem ini diputar dengan poros putar tegak lurus bidang persegi dan melalui O maka momen
                               inersia sistem ini adalah " I " gr.cm$^2$. Besar m adalah ... gram.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCC-1.png"
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCC-1 []
  "Benda titik"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCC-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) a (nth datum 1) I (nth datum 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) I
                (= rd 1) m
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Lima benda titik dihubungkan dengan kerangka persegi yang massanya diabaikan seperti pada
                               gambar di bawah. Jika sisi persegi panjangnya  " a " cm, m = " m " gram,
                               lalu sistem ini diputar dengan poros berupa garis yang melalui benda A dan B maka momen
                               inersia sistem ini adalah ... gr.cm$^2$.")
                 (= rd 1) (str "Lima benda titik dihubungkan dengan kerangka persegi yang massanya diabaikan  dan panjang
                               sisi perseginya adalah " a " cm.
                               Jika sistem ini diputar dengan poros putar tegak lurus bidang persegi dan melalui O maka momen
                               inersia sistem ini adalah " I " gr.cm$^2$. Besar m adalah ... gram.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCC-1.png"
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCC []
  "Dinamika Rotasi"
  ;(bC2A2FFCC-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "bC2A2FFCC-" x))))))

(defn bC2A2FFCD-0 []
  "Benda tegar"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCD-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) L (nth datum 1) I (nth datum 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) I
                (= rd 1) m
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu batang homogen bermassa " m " kg diputar dengan poros putar seperti pada gambar.
                                Jika panjang batang adalah " L " m maka momen inersia sistem adalah ... kg.m$^2$.")
                 (= rd 1) (str "Suatu batang homogen yang panjangnya " L " meter diputar dengan poros putar seperti pada gambar.
                                Jika momen inersia sistem adalah " I " kg.m$^2$ maka massa batang adalah ... kg.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCD-0.png"
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCD-1 []
  "Benda tegar"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCD-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) L (nth datum 1) I (nth datum 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) I
                (= rd 1) m
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu batang homogen bermassa " m " kg diputar dengan poros putar di tengah-tengah batang
                               seperti pada gambar. Jika panjang batang adalah " L " m maka momen inersia sistem
                               adalah ... kg.m$^2$.")
                 (= rd 1) (str "Suatu batang homogen yang panjangnya " L " meter diputar dengan poros putar di tengah-tengah
                               batang seperti pada gambar. Jika momen inersia sistem adalah " I " kg.m$^2$ maka massa
                               batang adalah ... kg.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCD-1.png"
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCD-2 []
  "Benda tegar"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCD-2.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) R (nth datum 1) I (nth datum 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) I
                (= rd 1) m
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu tabung berongga tipis memiliki massa " m " kg dan jejari penampang " R " m.
                               Jika tabung ini diputar pada poros seperti pada gambar maka momen inersia sistem ini
                               adalah ... kg.m$^2$.")
                 (= rd 1) (str "Suatu tabung berongga tipis memiliki jejari penampang " R " m.
                               Jika tabung ini diputar pada poros seperti pada gambar maka momen inersia sistem ini
                               adalah " I " kg.m$^2$. Massa tabung adalah ... kg. ")
                )
         :img "/img/fis1113/bab6/bC2A2FFCD-2.png"
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCD-3 []
  "Benda tegar"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCD-3.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) R (nth datum 1) I (nth datum 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) I
                (= rd 1) m
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu tabung pejal memiliki massa " m " kg dan jejari penampang " R " m.
                               Jika tabung ini diputar pada poros seperti pada gambar maka momen inersia sistem ini
                               adalah ... kg.m$^2$.")
                 (= rd 1) (str "Suatu tabung pejal memiliki jejari penampang " R " m.
                               Jika tabung ini diputar pada poros seperti pada gambar maka momen inersia sistem ini
                               adalah " I " kg.m$^2$. Massa tabung adalah ... kg. ")
                )
         :img "/img/fis1113/bab6/bC2A2FFCD-3.png"
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCD-4 []
  "Benda tegar"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCD-4.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) R (nth datum 1) I (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) I
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu bola berongga tipis memiliki massa " m " kg dan jejari penampang " R " m.
                               Jika bola ini diputar pada poros yang melalui pusat bola maka momen inersia sistem ini
                               adalah ... kg.m$^2$.")
                )
         ;:img "/img/fis1113/bab6/bC2A2FFCD-3.png"
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCD-5 []
  "Benda tegar"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCD-5.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) R (nth datum 1) I (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) I
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu bola pejal memiliki massa " m " kg dan jejari penampang " R " m.
                               Jika bola ini diputar pada poros yang melalui pusat bola maka momen inersia sistem ini
                               adalah ... kg.m$^2$.")
                )
         ;:img "/img/fis1113/bab6/bC2A2FFCD-3.png"
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCD []
  "Dinamika Rotasi"
  ;(bC2A2FFCD-5))
  (let [x (rand-int 6)] ((resolve (symbol my-ns (str "bC2A2FFCD-" x))))))

(defn bC2A2FFCE-0 []
  "Benda tegar 2"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCE-0.txt"))
        datum (nth data (rand-int (count data)))
        mK (nth datum 0) mB (nth datum 1) a (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) a
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu benda A yang dihubungkan dengan gulungan tali ke katrol pejal K, bergerak turun setelah
                               dilepaskan (lihat gambar di bawah). Jika massa katrol " mK " kg dan massa benda " mB " kg,
                               maka percepatan benda bergerak ke bawah adalah ... m/s$^2$.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCE-0.png"
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCE-1 []
  "Benda tegar 2"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCE-1.txt"))
        datum (nth data (rand-int (count data)))
        mK (nth datum 0) mB (nth datum 1) T (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) T
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu benda A yang dihubungkan dengan gulungan tali ke katrol pejal K, bergerak turun setelah
                               dilepaskan (lihat gambar di bawah). Jika massa katrol " mK " kg dan massa benda " mB " kg,
                               maka gaya tegangan tali yang mengikat benda adalah ... N.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCE-0.png"
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCE-2 []
  "Benda tegar 2"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCE-2.txt"))
        datum (nth data (rand-int (count data)))
        mK (nth datum 0) mB (nth datum 1) t (nth datum 2) s (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) s
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu benda A yang dihubungkan dengan gulungan tali ke katrol pejal K, bergerak turun setelah
                               dilepaskan (lihat gambar di bawah). Jika massa katrol " mK " kg dan massa benda " mB " kg,
                               maka gaya jarak yang ditempuh benda setelah " t " detik adalah ... meter.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCE-0.png"
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCE []
  "Dinamika Rotasi"
  ;(bC2A2FFCE-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FFCE-" x))))))

(defn bC2A2FFCEA-0 []
  "Benda tegar 2"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCEA-0.txt"))
        datum (nth data (rand-int (count data)))
        mK (nth datum 0) mA (nth datum 1) mB (nth datum 2) a (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) a
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Benda A dan B yang massanya berturut-turut " mA " kg dan " mB " kg dihubungkan melalui
                               katrol pejal bermassa " mK " kg seperti pada gambar di bawah. Percepatan benda A dan B setelah
                               bergerak adalah ... m/s$^2$.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCE-3.png"
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCEA-1 []
  "Benda tegar 2"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCEA-1.txt"))
        datum (nth data (rand-int (count data)))
        mK (nth datum 0) mA (nth datum 1) mB (nth datum 2) s (nth datum 3) v (nth datum 4)
        rd (rand-int 0)
        angka (cond
                (= rd 0) v
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Benda A dan B yang massanya berturut-turut " mA " kg dan " mB " kg dihubungkan melalui
                               katrol pejal bermassa " mK " kg seperti pada gambar di bawah. Kecepatan benda A setelah
                               menempuh jarak " s " meter adalah ... m/s.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCE-3.png"
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCEA-2 []
  "Benda tegar 2"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCEA-2.txt"))
        datum (nth data (rand-int (count data)))
        mK (nth datum 0) mA (nth datum 1) mB (nth datum 2) T (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) T
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Benda A dan B yang massanya berturut-turut " mA " kg dan " mB " kg dihubungkan melalui
                               katrol pejal bermassa " mK " kg seperti pada gambar di bawah. Setelah bergerak tegangan
                               tali yang mengikat benda B adalah ... newton.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCE-3.png"
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCEA []
  "Dinamika Rotasi"
  ;(bC2A2FFCEA-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FFCEA-" x))))))

(defn bC2A2FFCEB-0 []
  "Benda tegar 2"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCEB-0.txt"))
        datum (nth data (rand-int (count data)))
        mK (nth datum 0) mA (nth datum 1) mB (nth datum 2) u (nth datum 3) a (nth datum 4)
        rd (rand-int 0)
        angka (cond
                (= rd 0) a
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Benda A dan B yang massanya berturut-turut " mA " kg dan " mB " kg dihubungkan melalui
                               katrol pejal bermassa " mK " kg seperti pada gambar di bawah. Jika koefisien gesekan
                               antara lantai dengan benda B adalah " u " maka percepatan A bergerak turun adalah
                               ... m/s$^2$.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCEB-0.png"
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCEB-1 []
  "Benda tegar 2"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCEB-1.txt"))
        datum (nth data (rand-int (count data)))
        mK (nth datum 0) mA (nth datum 1) mB (nth datum 2) u (nth datum 3) t (nth datum 4) v (nth datum 5)
        rd (rand-int 0)
        angka (cond
                (= rd 0) v
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Benda A dan B yang massanya berturut-turut " mA " kg dan " mB " kg dihubungkan melalui
                               katrol pejal bermassa " mK " kg seperti pada gambar di bawah. Jika koefisien gesekan
                               antara lantai dengan benda B adalah " u " maka kecepatan A setelah bergerak turun " t " sekon
                               adalah ... m/s.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCEB-0.png"
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCEB-2 []
  "Benda tegar 2"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCEB-2.txt"))
        datum (nth data (rand-int (count data)))
        mK (nth datum 0) mA (nth datum 1) mB (nth datum 2) u (nth datum 3) t (nth datum 4) Ek (nth datum 5)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ek
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Benda A dan B yang massanya berturut-turut " mA " kg dan " mB " kg dihubungkan melalui
                               katrol pejal bermassa " mK " kg seperti pada gambar di bawah. Jika koefisien gesekan
                               antara lantai dengan benda B adalah " u " maka Energi kinetik A setelah bergerak turun " t "
                               sekon adalah ... joule.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCEB-0.png"
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCEB []
  "Dinamika Rotasi"
  ;(bC2A2FFCEB-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FFCEB-" x))))))

(defn bC2A2FFCF-0 []
  "Energi kinetik rotasi"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCF-0.txt"))
        datum (nth data (rand-int (count data)))
        I (nth datum 0) omg (nth datum 1) Ek (nth datum 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) Ek
                (= rd 1) Ek
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu batang homogen diputar pada poros ditengah batang dengan kecepatan sudut " omg "
                               rad/s seperti pada gambar. Jika momen inersia batang yang berputar ini adalah " I " kg.m$^2$
                               maka energi kinetik rotasi batang adalah ... joule.")
                 (= rd 0) (str "Suatu batang homogen diputar pada poros ditengah batang dengan kecepatan sudut " omg "
                               rad/s seperti pada gambar. Jika momen inersia batang yang berputar ini adalah " I " kg.m$^2$
                               maka usaha yang dibutuhkan untuk menghentikan putaran batang tersebut adalah ... joule.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCF-0.png"
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCF-0 []
  "Energi kinetik rotasi"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCF-0.txt"))
        datum (nth data (rand-int (count data)))
        I (nth datum 0) omg (nth datum 1) Ek (nth datum 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) Ek
                (= rd 1) Ek
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu batang homogen diputar pada poros ditengah batang dengan kecepatan sudut " omg "
                               rad/s seperti pada gambar. Jika momen inersia batang yang berputar ini adalah " I " kg.m$^2$
                               maka energi kinetik rotasi batang adalah ... joule.")
                 (= rd 1) (str "Suatu batang homogen diputar pada poros ditengah batang dengan kecepatan sudut " omg "
                               rad/s seperti pada gambar. Jika momen inersia batang yang berputar ini adalah " I " kg.m$^2$
                               maka usaha yang dibutuhkan untuk menghentikan putaran batang tersebut adalah ... joule.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCF-0.png"
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCF-1 []
  "Energi kinetik rotasi"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCF-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) R (nth datum 1) omg (nth datum 2) Ek (nth datum 3)
        rd (rand-int 2)
        angka (cond
                (= rd 0) Ek
                (= rd 1) Ek
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu tabung berongga bermassa " m " kg diputar pada poros dengan kecepatan sudut
                               " omg " rpm seperti pada gambar. Jika jari-jari tabung adalah " R " cm, maka Energi
                               kinetik rotasi tabung adalah ... J.")
                 (= rd 1) (str "Suatu tabung berongga bermassa " m " kg diputar pada poros dengan kecepatan sudut
                               " omg " rpm seperti pada gambar. Jika jari-jari tabung adalah " R " cm, maka usaha
                               yang dibutuhkan untuk menghentikan tabung adalah ... J.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCD-2.png"
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCF-2 []
  "Energi kinetik rotasi"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCF-2.txt"))
        datum (nth data (rand-int (count data)))
        omg1 (nth datum 0) omg2 (nth datum 1) I (nth datum 2) W (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) W
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu bola pejal mula-mula berputar pada poros yang melalui pusat bola dengan laju anguler
                               $\\frac{" omg1 "}{\\pi}$ rpm dan momen inersia " I " kg.m$^2$. Untuk mempercepat putaran bola
                               tersebut menjadi
                               $\\frac{" omg2 "}{\\pi}$ rpm diperlukan usaha sebesar ... joule.")
                )
         ;:img "/img/fis1113/bab6/bC2A2FFCD-2.png"
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCF []
  "Dinamika Rotasi"
  ;(bC2A2FFCF-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FFCF-" x))))))

(defn bC2A2FFCG-0 []
  "Energi kinetik translasi dan rotasi"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCG-0.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) v (nth datum 1) Ek (nth datum 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) Ek
                (= rd 1) m
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu drum kosong yang bermassa " m " kg bergerak menggelinding tanpa slip pada lantai datar
                               dengan laju linier " v " m/s seperti pada gambar. Energi kinetik total drum tersebut
                               adalah ... joule.")
                 (= rd 1) (str "Suatu drum kosong menggelinding tanpa slip pada lantai datar
                               dengan laju linier " v " m/s seperti pada gambar. Jika energi kinetik total drum tersebut
                               adalah " Ek " joule, maka massa drum tersebut adalah ... kg.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCG-0.png"
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCG-1 []
  "Energi kinetik translasi dan rotasi"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCG-1.txt"))
        datum (nth data (rand-int (count data)))
        m (nth datum 0) v (nth datum 1) Ek (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ek
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah bola pejal yang bermassa " m " kg mula-mula menggelinding tanpa slip pada lantai datar
                               dengan laju linier " v " m/s. Akibat gesekan lantai bola bertambah pelan dan akhirnya berhenti.
                               Usaha oleh gaya gesekan lantai adalah ... J.")
                )
         ;:img "/img/fis1113/bab6/bC2A2FFCG-0.png"
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCG-2 []
  "Energi kinetik translasi dan rotasi"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCG-2.txt"))
        datum (nth data (rand-int (count data)))
        v (nth datum 0) h (nth datum 1)
        rd (rand-int 0)
        angka (cond
                (= rd 0) v
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah bola berongga menggelinding tanpa slip dari puncak bidang miring yang tingginya
                               h = " h " meter. Kecepatan linier bola sampai di kaki bidang miring adalah ... m/s.")
                )
         :img "/img/fis1113/bab6/bC2A2FFCG-2.png"
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCG-3 []
  "Energi kinetik translasi dan rotasi"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCG-3.txt"))
        datum (nth data (rand-int (count data)))
        benda1 (nth datum 0) benda2 (nth datum 1) pv_kuadrat (nth datum 2)
        ket_1 (second benda1) ket_2 (second benda2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) pv_kuadrat
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Sebuah " ket_1" dan " ket_2 " menggelinding tanpa slip dari puncak
                               bidang miring dengan ketinggian yang sama. Perbandingan kuadrat kecepatan " ket_1 " dengan
                               " ket_2 " di kaki bidang miring adalah ...")
                )
         ;:img "/img/fis1113/bab6/bC2A2FFCG-2.png"
         :pilihan (fnc/create-option9 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCG []
  "Dinamika Rotasi"
  ;(bC2A2FFCG-3))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FFCG-" x))))))

(defn bC2A2FFCH-0 []
  "Energi kinetik translasi dan rotasi"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCH-0.txt"))
        datum (nth data (rand-int (count data)))
        I (nth datum 0) w (nth datum 1) Ia (nth datum 2) wa (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) wa
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Seorang penari balet ketika membentangkan tangannya lebar-lebar memiliki momen inersia
                               dan kecepatan sudut berturut-turut " I " kg.m$^2$ dan " w " putaran/sekon. Jika kemudian
                               penari tersebut merapatkan tangannya ke badan momen inersianya berubah menjadi " Ia "
                               kg.m$^2$. Kecepatan sudutnya sekarang adalah ... putaran/sekon.")
                )
         ;:img "/img/fis1113/bab6/bC2A2FFCG-2.png"
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCH-1 []
  "Energi kinetik translasi dan rotasi"
    (let [data (read-string (slurp "data/fis1113/bab6/C2A2FFCH-1.txt"))
        datum (nth data (rand-int (count data)))
        I (nth datum 0) wa (nth datum 1) w (nth datum 2) Ia (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ia
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Seorang penari balet ketika membentangkan tangannya lebar-lebar memiliki momen inersia
                               dan kecepatan sudut berturut-turut " I " kg.m$^2$ dan " w " putaran/sekon. Jika kemudian
                               penari tersebut merapatkan tangannya ke badan, kecepatan sudutnya berubah menjadi " wa "
                               putaran/sekon. Momen inersianya sekarang adalah ... kg.m$^2$.")
                )
         ;:img "/img/fis1113/bab6/bC2A2FFCG-2.png"
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FFCH []
  "Dinamika Rotasi"
  ;(bC2A2FFCH-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "bC2A2FFCH-" x))))))

;;;; Fluida Dinamis
;;;;
;;;;

(defn bC2A2FGAB-0 []
  "Energi kinetik translasi dan rotasi"
    (let [data (read-string (slurp "data/fis1113/bab7/C2A2FGAB-0.txt"))
        datum (nth data (rand-int (count data)))
        r (nth datum 0) v (nth datum 1) Q (nth datum 2)
        angka Q
        jwb (fnc/jawaban)
       ]
        {:soal (str "Air mengalir pada pipa berjejari " r " cm dengan laju " v " m/s. Debit air pada pipa tersebut
                               adalah ... m$^3$/s.")
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FGAB-1 []
  "Energi kinetik translasi dan rotasi"
    (let [data (read-string (slurp "data/fis1113/bab7/C2A2FGAB-1.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) v (nth datum 1) t (nth datum 2) V (nth datum 3)
        angka V
        jwb (fnc/jawaban)
       ]
        {:soal (str "Air dengan laju " v " m/s mengucur dari keran berpenampang " A " cm$^2$ untuk mengisi suatu baskom
                    plastik. Jika waktu yang dibutuhkan agar baskom itu penuh adalah " t " sekon, maka volume baskom
                    adalah ... liter. ")
         :pilihan (fnc/create-option3a angka 4 jwb)
         :jawaban jwb
         }))
(defn bC2A2FGAB-2 []
  "Debit"
    (let [data (read-string (slurp "data/fis1113/bab7/C2A2FGAB-1.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) v (nth datum 1) t (nth datum 2) V (nth datum 3)
        rd (rand-int 3)
        angka (cond
                (= rd 0) A
                (= rd 1) v
                (= rd 2) t
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Air dengan laju " v " m/s mengucur dari keran untuk mengisi penuh wadah bervolume " V " liter.
                                Jika waktu yang dibutuhkan adalah " t " sekon maka luas penampang lubang keran adalah ... cm$^2$.")
                 (= rd 1)  (str "Untuk mengisi penuh wadah bervolume " V " liter dengan air keran dibutuhkan waktu " t " sekon.
                                Jika luas penampang lubang keran adalah " A " cm$^2$, maka kecepatan air yang keluar dari keran
                                adalah ... m/s.")
                 (= rd 2)  (str "Air dengan kecepatan alir " v " m/s mengucur dari keran berpenampang " A " cm$^2$ untuk mengisi
                                wadah bervolume " V " liter sampai penuh. Waktu yang dibutuhkan adalah ... detik. ")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FGAB []
  "Kontinuitas Debit"
  ;(bC2A2FGAB-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FGAB-" x))))))

(defn bC2A2FGAC-0 []
  "Kontinuitas Debit"
    (let [data (read-string (slurp "data/fis1113/bab7/C2A2FGAC-0.txt"))
        datum (nth data (rand-int (count data)))
        r1 (nth datum 0) r2 (nth datum 1) n (nth datum 2) v1 (nth datum 3) v2 (nth datum 4)
        rd (rand-int 0)
        angka (cond
                (= rd 0) v2
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Shower air yang lubangnya " n " buah masing-masing lubang berdiameter " r2 " cm. Shower ini
                                dialiri air dengan kecepatan " v1 " m/s dari selang yang diameternya " r1 " cm. Kecepatan
                                air yang keluar dari masing-masing lubang shower adalah ... m/s.")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FGAC-1 []
  "Kontinuitas debit"
    (let [data (read-string (slurp "data/fis1113/bab7/C2A2FGAC-1.txt"))
        datum (nth data (rand-int (count data)))
        d1 (nth datum 0) d2 (nth datum 1) p (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) p
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Tukang kebun lagi menyiram halaman dengan menggunakan selang air yang ujungnya bisa diubah-ubah
                                diameternya. Perbandingan kecepatan air yang keluar dari selang ketika diameternya " d1 " mm
                                dan " d2 " mm adalah ...")
                )
         :pilihan (fnc/create-option9 angka jwb)
         :jawaban jwb
         }))

(defn bC2A2FGAC []
  "Fluida Dinamis"
  ;(bC2A2FGAC-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "bC2A2FGAC-" x))))))

(defn bC2A2FGAD-0 []
  "Bernouli - venturimeter"
    (let [data (read-string (slurp "data/fis1113/bab7/C2A2FGAD-0.txt"))
        datum (nth data (rand-int (count data)))
        v2 (nth datum 0) v1 (nth datum 1) h (nth datum 2) A1pA2 (nth datum 3)
        rd (rand-int 3)
        angka (cond
                (= rd 0) v1
                (= rd 1) v2
                (= rd 2) h
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Suatu venturimeter mengukur kecepatan air yang masuk melalui penampang 1 (lihat gambar).
                                Jika perbandingan antara luas penampang 1 dan 2 adalah " (fnc/sbanding A1pA2) " dan
                                h = " h " mm maka laju air pada penampang 1 adalah ... cm/s.")
                 (= rd 1)  (str "Suatu venturimeter mengukur kecepatan air yang masuk melalui penampang 1 (lihat gambar).
                                Jika perbandingan antara luas penampang 1 dan 2 adalah " (fnc/sbanding A1pA2) " dan
                                h = " h " mm maka laju air pada penampang 2 adalah ... cm/s.")
                 (= rd 2)  (str "Suatu venturimeter mengukur kecepatan air yang masuk melalui penampang 1 (lihat gambar).
                                Jika perbandingan antara luas penampang 1 dan 2 adalah " (fnc/sbanding A1pA2) " dan
                                kecepatan air pada penampang 1 adalah " v1 " cm/s maka h = ... mm.")
                )
         :img "/img/fis1113/bab7/bC2A2FGAD-0.png"
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FGAD-1 []
  "Bernouli - venturimeter"
    (let [data (read-string (slurp "data/fis1113/bab7/C2A2FGAD-1.txt"))
        datum (nth data (rand-int (count data)))
        v2 (nth datum 0) v1 (nth datum 1) h (nth datum 2) A1pA2 (nth datum 3)
        rd (rand-int 3)
        angka (cond
                (= rd 0) v1
                (= rd 1) v2
                (= rd 2) h
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Suatu venturimeter mengukur kecepatan air yang masuk melalui penampang 1 (lihat gambar).
                                Jika perbandingan antara luas penampang 1 dan 2 adalah " (fnc/sbanding A1pA2) " dan
                                h = " h " mm maka laju air pada penampang 1 adalah ... cm/s.
                                (massa jenis raksa = 13600 kg/m$^3$, massa jenis air 1000 kg/m$^3$).")
                 (= rd 1)  (str "Suatu venturimeter mengukur kecepatan air yang masuk melalui penampang 1 (lihat gambar).
                                Jika perbandingan antara luas penampang 1 dan 2 adalah " (fnc/sbanding A1pA2) " dan
                                h = " h " mm maka laju air pada penampang 2 adalah ... cm/s.
                                (massa jenis raksa = 13600 kg/m$^3$, massa jenis air 1000 kg/m$^3$).")
                 (= rd 2)  (str "Suatu venturimeter mengukur kecepatan air yang masuk melalui penampang 1 (lihat gambar).
                                Jika perbandingan antara luas penampang 1 dan 2 adalah " (fnc/sbanding A1pA2) " dan
                                kecepatan air pada penampang 1 adalah " v1 " cm/s maka h = ... mm.
                                (massa jenis raksa = 13600 kg/m$^3$, massa jenis air 1000 kg/m$^3$).")
                )
         :img "/img/fis1113/bab7/bC2A2FGAD-1.png"
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FGAD []
  "Fluida Dinamis"
  ;(bC2A2FGAD-0))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "bC2A2FGAD-" x))))))

(defn bC2A2FGAF-0 []
  "Pipa Pitot"
    (let [data (read-string (slurp "data/fis1113/bab7/C2A2FGAF-0.txt"))
        datum (nth data (rand-int (count data)))
        h (nth datum 0) v (nth datum 1)
        rd (rand-int 0)
        angka (cond
                (= rd 0) v

               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Suatu pipa pitot (lihat gambar) dipergunakan untuk mengukur kecepatan pesawat udara. Jika
                                perbedaan tinggi raksa (h) adalah " h " mm maka kecepatan pesawat tersebut adalah ... m/s.
                                (massa jenis raksa = 13600 kg/m$^3$, massa jenis udara 1.2 kg/m$^3$).")
                )
         :img "/img/fis1113/bab7/bC2A2FGAF-0.png"
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))

(defn bC2A2FGAF-1 []
  "Bernoulli - gaya angkat"
    (let [data (read-string (slurp "data/fis1113/bab7/C2A2FGAF-1.txt"))
        datum (nth data (rand-int (count data)))
        dP (nth datum 0) A (nth datum 1) F (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) dP

               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Untuk menghasilkan gaya angkat sebesar " F " kN pilot pesawat mengatur kecepatan dan sayap
                                pesawat. Jika luas total permukaan sisi bawah sayap pesawat adalah " A " m$^2$ dan
                                pesawat terbang mendatar, maka perbedaan tekanan antara sisi atas sayap pesawat dan sisi
                                bawah sayap pesawat adalah ... Pa.")
                )
         ;:img "/img/fis1113/bab7/bC2A2FGAF-0.png"
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FGAF []
  "Fluida Dinamis"
  ;(bC2A2FGAF-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "bC2A2FGAF-" x))))))

(defn bC2A2FGAG-0 []
  "Teorema Toricelli"
    (let [data (read-string (slurp "data/fis1113/bab7/C2A2FGAG-0.txt"))
        datum (nth data (rand-int (count data)))
        h1 (nth datum 0) h2 (nth datum 1) v (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) v

               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Pada bak penampungan air terdapat lubang kecil sehingga air bocor dari lubang itu
                                (lihat gambar). Jika h$_1$ = " h1 " cm dan h$_2$ = " h2 " cm maka kecepatan air (v) yang keluar dari
                                lubang adalah ... cm/s.")
                )
         :img "/img/fis1113/bab7/bC2A2FGAG-0.png"
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FGAG-1 []
  "Teorema Toricelli"
    (let [data (read-string (slurp "data/fis1113/bab7/C2A2FGAG-0.txt"))
        datum (nth data (rand-int (count data)))
        h1 (nth datum 0) h2 (nth datum 1) x (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) x

               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Pada bak penampungan air terdapat lubang kecil sehingga air bocor dari lubang itu
                                (lihat gambar). Jika h$_1$ = " h1 " cm dan h$_2$ = " h2 " cm maka jarak terjauh jatuhnya
                                air dari dasar bak adalah ... cm.")
                )
         :img "/img/fis1113/bab7/bC2A2FGAG-0.png"
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FGAG []
  "Fluida Dinamis"
  ;(bC2A2FGAG-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "bC2A2FGAG-" x))))))

(defn bC2A2FHAA-0 []
  "Persamaan gas ideal"
    (let [data (read-string (slurp "data/fis1113/bab8/C2A2FHAA-0.txt"))
        datum (nth data (rand-int (count data)))
        P1 (nth datum 0) V1 (nth datum 1) P2 (nth datum 2) V2 (nth datum 3)
        sP1 (fnc/cf (str P1) 1) sV1 (fnc/cf (str V1) 1)
        sP2 (fnc/cf (str P2) 1) sV2 (fnc/cf (str V2) 1)
        rd (rand-int 2)
        angka (cond
                (= rd 0) P2
                (= rd 1) V2

               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Suatu gas ideal dalam ruang tertutup mula-mula bertekanan " sP1 " atm dan bervolume " sV1 "
                                liter. Jika volume gas diubah menjadi " sV2 " liter dengan mempertahankan suhunya, maka tekanan
                                gas menjadi ... atm.")
                (= rd 1)   (str "Suatu gas ideal dalam ruang tertutup mula-mula bertekanan " sP1 " atm dan bervolume " sV1 "
                                liter. Jika tekanan gas diubah menjadi " sP2 " atm dengan mempertahankan suhunya, maka volume
                                gas menjadi ... liter.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FHAA-1 []
  "Persamaan gas ideal"
    (let [data (read-string (slurp "data/fis1113/bab8/C2A2FHAA-1.txt"))
        datum (nth data (rand-int (count data)))
        P1 (nth datum 0) T1 (nth datum 1) P2 (nth datum 2) T2 (nth datum 3)
        sP2 (fnc/cf (str P2) 1)
        rd (rand-int 2)
        angka (cond
                (= rd 0) P2
                (= rd 1) T2

               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Suatu gas ideal dalam ruang tertutup mula-mula bertekanan " P1 " atm dan bersuhu " T1 "
                                $^o$C. Jika suhu gas diubah menjadi " T2 "$^o$C  pada volume tetap, maka tekanan
                                gas menjadi ... atm.")
                (= rd 1)   (str "Suatu gas ideal dalam ruang tertutup mula-mula bertekanan " P1 " atm dan suhu " T1 "
                                $^o$C. Jika tekanan gas diubah menjadi " sP2 " atm pada volume tetap, maka suhu
                                gas menjadi ... $^o$C.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FHAA-2 []
  "Persamaan gas ideal"
    (let [data (read-string (slurp "data/fis1113/bab8/C2A2FHAA-2.txt"))
        datum (nth data (rand-int (count data)))
        V1 (nth datum 0) T1 (nth datum 1) V2 (nth datum 2) T2 (nth datum 3)
        sV1 (fnc/cf (str V1) 1) sV2 (fnc/cf (str V2) 1)
        rd (rand-int 2)
        angka (cond
                (= rd 0) V2
                (= rd 1) T2

               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Suatu gas ideal dalam ruang tertutup mula-mula bervolume " sV1 " m$^3$ dan bersuhu " T1 "
                                $^o$C. Jika suhu gas diubah menjadi " T2 "$^o$C  pada tekanan tetap, maka volume
                                gas menjadi ... m$^3$.")
                 (= rd 1)  (str "Suatu gas ideal dalam ruang tertutup mula-mula bervolume " sV1 " m$^3$ dan bersuhu " T1 "
                                $^o$C. Jika volume gas diubah menjadi " sV2 " m$^3$  pada tekanan tetap, maka suhu
                                gas menjadi ... $^o$C.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FHAA []
  "Teori Kinetik Gas"
  ;(bC2A2FHAA-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FHAA-" x))))))

(defn bC2A2FHAB-0 []
  "Persamaan gas ideal"
    (let [data (read-string (slurp "data/fis1113/bab8/C2A2FHAB-0.txt"))
        datum (nth data (rand-int (count data)))
        P1 (nth datum 0) V1 (nth datum 1) T1 (nth datum 2) P2 (nth datum 3) V2 (nth datum 4) T2 (nth datum 5)
        sV1 (fnc/cf (str V1) 1) sV2 (fnc/cf (str V2) 1)
        rd (rand-int 2)
        angka (cond
                (= rd 0) V2
                (= rd 1) V1

               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Suatu gas ideal dalam ruang tertutup mula-mula memiliki tekanan, volume, dan suhu
                                berturut-turut " P1 " x 10$^5$ Pa, " sV1 " liter dan " T1 "$^o$C.
                                Gas mengalami proses sehingga tekanan dan suhu akhirnya adalah " P2 " x 10$^5$ Pa dan
                                " T2 "$^o$C. Volume akhir gas adalah ... dm$^3$.")
                 (= rd 1)  (str "Suatu gas ideal dalam ruang tertutup mula-mula memiliki tekanan  dan suhu
                                berturut-turut " P1 " x 10$^5$ Pa dan " T1 "$^o$C.
                                Gas mengalami proses sehingga tekanan, volume  dan suhu akhirnya adalah " P2 " x 10$^5$ Pa,
                                " sV2 " dm$^3$ dan " T2 "$^o$C. Volume awal gas adalah ... liter.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn bC2A2FHAB-1 []
  "Persamaan gas ideal"
    (let [data (read-string (slurp "data/fis1113/bab8/C2A2FHAB-1.txt"))
        datum (nth data (rand-int (count data)))
        P (nth datum 0) n (nth datum 1) T (nth datum 2) V (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) V
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Suatu gas ideal memiliki tekanan dan suhu berturut-turut " P " x 10$^5$ Pa dan suhu
                                " T " K. Jika terdapat " n " mol partikel pada gas tersebut, maka volume gas adalah ...
                                dm$^3$ (tetapan gas ideal = 8.314 J/mol.K).")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FHAB-2 []
  "Persamaan gas ideal"
    (let [data (read-string (slurp "data/fis1113/bab8/C2A2FHAB-2.txt"))
        datum (nth data (rand-int (count data)))
        V (nth datum 0) n (nth datum 1) T (nth datum 2) P (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) P
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Suatu gas ideal memiliki volume dan suhu berturut-turut " V " liter  dan suhu
                                " T " K. Jika terdapat " n " mol partikel pada gas tersebut, maka tekanan gas adalah ...
                                x 10$^5$ Pa (tetapan gas ideal = 8.314 J/mol.K).")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FHAB []
  "Teori Kinetik Gas"
  ;(bC2A2FHAB-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FHAB-" x))))))

(defn bC2A2FHAC-0 []
  "Persamaan gas ideal"
    (let [data (read-string (slurp "data/fis1113/bab8/C2A2FHAC-0.txt"))
        datum (nth data (rand-int (count data)))
        P (nth datum 0) T (nth datum 1) V (nth datum 2) N (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) N
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Suatu gas ideal pada tekanan " P " x 10$^5$ Pa, volume " V " liter, dan suhu " T " K
                                memiliki jumlah partikel sebanyak ... x 10$^{23}$ buah
                                (konstanta Boltzman = 1.38 x 10$^{-23}$ J/K).")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FHAC-1 []
  "Persamaan gas ideal"
    (let [data (read-string (slurp "data/fis1113/bab8/C2A2FHAC-1.txt"))
        datum (nth data (rand-int (count data)))
        n1 (nth datum 0) n2 (nth datum 1) Nk (nth datum 2) fP (nth datum 3) fT (nth datum 4)
        sfP (fnc/cf (str fP) 1) sfT (fnc/cf (str fT) 1)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Nk
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Suatu ruang kaku yang ada katupnya mula-mula berisi " n1 " mol gas ideal. Jika katup dibuka
                                sesaat kemudian ditutup lagi, tekanan gas berkurang menjadi " sfP " kali semula dan
                                suhu gas bertambah menjadi " sfT " kali semula. Jumlah partikel gas yang keluar dari ruang
                                tersebut adalah ... x 10$^{23}$ buah (bilangan Avogadro = 6.02 x 10$^{23}$ partikel/mol).")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FHAC []
  "Teori Kinetik Gas"
  ;(bC2A2FHAC-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "bC2A2FHAC-" x))))))

(defn bC2A2FHAE-0 []
  "Persamaan gas ideal"
    (let [data (read-string (slurp "data/fis1113/bab8/C2A2FHAE-0.txt"))
        datum (nth data (rand-int (count data)))
        n (nth datum 0) T (nth datum 1) Ektot (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ektot
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Energi kinetik total dari " n " mol gas ideal monoatomik pada suhu " T " K adalah ... joule
                                (bilangan Avogadro = 6.02 x 10$^{23}$ partikel/mol, konstanta Boltzman = 1.38 x 10$^{-23}$ J/K).")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FHAE-1 []
  "Persamaan gas ideal"
    (let [data (read-string (slurp "data/fis1113/bab8/C2A2FHAE-1.txt"))
        datum (nth data (rand-int (count data)))
        T (nth datum 0) Ek (nth datum 1)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ek
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Energi kinetik rata-rata partikel gas monoatomik pada suhu " T " kelvin
                                adalah ... x $10^{-21}$ joule (konstanta Boltzman = 1.38 x 10$^{-23}$ J/K).")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FHAE-2 []
  "Persamaan gas ideal"
    (let [data (read-string (slurp "data/fis1113/bab8/C2A2FHAE-2.txt"))
        datum (nth data (rand-int (count data)))
        T (nth datum 0) mo (nth datum 1) vrms (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) vrms
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Kecepatan akar kuadrat rata-rata (v$_{rms}$) partikel gas monoatomik yang bermassa " mo " x 10$^{-24}$ gram
                                pada suhu " T " K adalah ... m/s. (konstanta Boltzman = 1.38 x 10$^{-23}$ J/K).")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FHAE []
  "Teori Kinetik Gas"
  ;(bC2A2FHAE-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FHAE-" x))))))

(defn bC2A2FHAF-0 []
  "Persamaan gas ideal"
    (let [data (read-string (slurp "data/fis1113/bab8/C2A2FHAF-0.txt"))
        datum (nth data (rand-int (count data)))
        pT (nth datum 0) pT2 (nth datum 1)
        rd (rand-int 0)
        angka (cond
                (= rd 0) pT
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Jika suhu mutlak gas ditingkatkan menjadi " pT2 " kali suhu semula maka v$_{rms}$ partikel
                                gas tersebut akan menjadi ... kali semula.")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn bC2A2FHAF []
  "Teori Kinetik Gas"
  (bC2A2FHAF-0))
  ;(let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FHAE-" x))))))

(defn bC2A2FHAG-0 []
  "Persamaan gas ideal"
    (let [data (read-string (slurp "data/fis1113/bab8/C2A2FHAG-0.txt"))
        datum (nth data (rand-int (count data)))
        P (nth datum 0) M (nth datum 1) V (nth datum 2) vrms (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) vrms
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Pada ruangan yang bervolume " V " liter terdapat " M " gram gas yang bertekanan " P " atm.
                                Kelajuan rata-rata (v$_{rms}$) setiap partikel gas adalah ... m/s.")
                )
         :pilihan (fnc/create-option3 angka 1 jwb)
         :jawaban jwb
         }))
(defn bC2A2FHAG []
  "Teori Kinetik Gas"
  (bC2A2FHAG-0))
  ;(let [x (rand-int 3)] ((resolve (symbol my-ns (str "bC2A2FHAE-" x))))))

(defn bC2A2FHAH-0 []
  "Persamaan gas ideal"
    (let [data (read-string (slurp "data/fis1113/bab8/C2A2FHAH-0.txt"))
        datum (nth data (rand-int (count data)))
        vx (nth datum 0) vrms (nth datum 1)
        rd (rand-int 0)
        angka (cond
                (= rd 0) vrms
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Kecepatan rata-rata ke arah sumbu-x yang dimiliki suatu partikel gas monoatomik adalah
                                " vx " m/s. Kecepatan akar kuadrat rata-rata (v$_{rms}$) gas tersebut adalah ... m/s.")
                )
         :pilihan (fnc/create-option3 angka 1 jwb)
         :jawaban jwb
         }))
(defn bC2A2FHAH-1 []
  "Persamaan gas ideal"
    (let [data (read-string (slurp "data/fis1113/bab8/C2A2FHAH-1.txt"))
        datum (nth data (rand-int (count data)))
        d (nth datum 0) N (nth datum 1) T (nth datum 2) Ektot (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Ektot
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0)  (str "Suatu gas ideal diatomik dengan jumlah partikel " N " x 10$^{23}$ pada suhu " T " K memiliki " d "
                                derajat kebebasan. Energi kinetik total partikel tersebut adalah ... J
                                (konstanta Boltzman = 1.38 x 10$^{-23}$ J/K).")
                )
         :pilihan (fnc/create-option3 angka 1 jwb)
         :jawaban jwb
         }))
(defn bC2A2FHAH []
  "Teori Kinetik Gas"
  ;(bC2A2FHAH-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "bC2A2FHAH-" x))))))




