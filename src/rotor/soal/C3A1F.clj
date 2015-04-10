(ns rotor.soal.C3A1F
  (:require [compojure.core :refer :all]
            ;[progen.views.layout :as layout]
            [rotor.models.genfunc :as fnc]
            [rotor.models.db :as db]
            ))

(def my-ns "rotor.soal.C3A1F")

(defn C3A1FAAH-0 []
  "panjang gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAH-0.txt"))
        datum (nth data (rand-int (count data)))
        sx (nth datum 0) x (nth datum 1) lambda (nth datum 2) sy (nth datum 3) y (nth datum 4) A (nth datum 5)
        ssx (str "$" (subs sx 0 1) "_" (subs sx 1 2) "$")
        ssy (str "$" (subs sy 0 1) "_" (subs sy 1 2) "$")
        rd (rand-int 2)
        angka (cond
                (= rd 0) lambda
                (= rd 1) x
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Simpangan dan jarak tempuh suatu gelombang sinusoidal digambarkan pada grafik y
                               terhadap x di bawah. Jika " ssx " = " x " m dan " ssy " = " y " cm, maka panjang gelombang
                               dari gelombang ini adalah ... m.")
                 (= rd 1) (str "Simpangan dan jarak tempuh suatu gelombang sinusoidal digambarkan pada grafik y
                               terhadap x di bawah. Jika " ssy " = " y " cm, panjang gelombang dari gelombang ini adalah
                               " lambda " m, maka " ssx " = ... m.")
                )
         :img "/img/fis12ktsp/bab1/C3A1FAAH-0.png"
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FAAH-1 []
  "frekuensi dan periode"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAH-1.txt"))
        datum (nth data (rand-int (count data)))
        st (nth datum 0) t (nth datum 1) T (nth datum 2) sy (nth datum 3) y (nth datum 4) A (nth datum 5)
        sst (str "$" (subs st 0 1) "_" (subs st 1 2) "$")
        ssy (str "$" (subs sy 0 1) "_" (subs sy 1 2) "$")
        ft (fnc/cf (str t) 1)
        rd (rand-int 2)
        angka (cond
                (= rd 0) T
                (= rd 1) t
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Simpangan dan waktu dari suatu gelombang sinusoidal digambarkan pada grafik y
                               terhadap t di bawah. Jika " sst " = " ft " s dan " ssy " = " y " cm, maka perioda
                               dari gelombang ini adalah ... sekon.")
                 (= rd 1) (str "Simpangan dan jarak tempuh suatu gelombang sinusoidal digambarkan pada grafik y
                               terhadap t di bawah. Jika " ssy " = " y " cm, periode dari gelombang ini adalah
                               " T " sekon, maka " sst " = ... s.")
                )
         :img "/img/fis12ktsp/bab1/C3A1FAAH-1.png"
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FAAH-2 []
  "frekuensi dan periode"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAH-2.txt"))
        datum (nth data (rand-int (count data)))
        st (nth datum 0) t (nth datum 1) f (nth datum 2)
        sst (str "$" (subs st 0 1) "_" (subs st 1 2) "$")
        ft (fnc/cf (str t) 1)
        rd (rand-int 0)
        angka (cond
                (= rd 0) f
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Simpangan dan waktu dari suatu gelombang sinusoidal digambarkan pada grafik y
                               terhadap t di bawah. Jika " sst " = " ft " s, maka frekuensi gelombang tersebut
                               adalah ... Hz")
                )
         :img "/img/fis12ktsp/bab1/C3A1FAAH-1.png"
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FAAH []
  "Gelombang Mekanik"
  ;(C3A1FAAH-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C3A1FAAH-" x))))))

(defn C3A1FAAI-0 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAI-0.txt"))
        datum (nth data (rand-int (count data)))
        f (nth datum 0) v (nth datum 1) T (nth datum 2) lambda (nth datum 3)
        rd (rand-int 2)
        angka (cond
                (= rd 0) lambda
                (= rd 1) lambda
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Gelombang dengan frekuensi " f " kHz memiliki cepat rambat " v " m/s. Gelombang ini memiliki
                               panjang gelombang ... meter.")
                 (= rd 1) (str "Gelombang dengan periode " T " ms memiliki cepat rambat " v " m/s. Gelombang ini memiliki
                               panjang gelombang ... meter.")
                )
         ;:img "/img/fis12ktsp/bab1/C3A1FAAH-1.png"
         :pilihan (fnc/create-option3a angka 4 jwb)
         :jawaban jwb
         }))
(defn C3A1FAAI-1 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAI-1.txt"))
        datum (nth data (rand-int (count data)))
        v (nth datum 0) dt (nth datum 1) s (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) s
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu gelombang dengan cepat rambat di udara " v " m/s dipancarkan ke arah suatu tebing
                               sehingga gelombang pantulnya diterima dalam selang waktu " dt " sekon sejak dipancarkan.
                               Jarak tebing ke pemancar gelombang adalah ... m.")
                )
         ;:img "/img/fis12ktsp/bab1/C3A1FAAH-1.png"
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FAAI-2 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAI-2.txt"))
        datum (nth data (rand-int (count data)))
        n (nth datum 0) t (nth datum 1) lambda (nth datum 2) v (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) v
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Seorang pengamat melihat " n " gelombang merambat dalam " t " detik. Jika panjang
                               gelombang yang diamati tersebut adalah " lambda " cm maka cepat rambat gelombang
                               tersebut adalah ... m/s.")
                )
         ;:img "/img/fis12ktsp/bab1/C3A1FAAH-1.png"
         :pilihan (fnc/create-option3a angka 4 jwb)
         :jawaban jwb
         }))
(defn C3A1FAAI []
  "Gelombang Mekanik"
  ;(C3A1FAAI-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C3A1FAAI-" x))))))

(defn C3A1FAAJ-0 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAJ-0.txt"))
        datum (nth data (rand-int (count data)))
        x (nth datum 0) v (nth datum 1) to (nth datum 2) f (nth datum 3) tP (nth datum 4) n (nth datum 5)
        rd (rand-int 2)
        angka (cond
                (= rd 0) tP
                (= rd 1) n
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str "Suatu titik P berjarak " x " cm dari sumber gelombang yang bergetar dengan frekuensi
                               " f " Hz. Jika cepat rambat gelombang " v " cm/s dan sumber gelombang telah bergetar selama
                               " to " sekon, maka titik P telah bergetar selama ... sekon.")
                 (= rd 1) (str "Suatu titik P berjarak " x " cm dari sumber gelombang yang bergetar dengan frekuensi
                               " f " Hz. Jika cepat rambat gelombang " v " cm/s dan sumber gelombang telah bergetar selama
                               " to " sekon, maka titik P telah bergetar sebanyak ... kali.")
                )
         :img "/img/fis12ktsp/bab1/C3A1FAAJ-0.png"
         :pilihan (fnc/create-option3 angka 3 jwb)
         :jawaban jwb
         }))
(defn C3A1FAAJ-1 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAJ-1.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) a (nth datum 1) b (nth datum 2) T (nth datum 3) lamb (nth datum 4) v (nth datum 5)
        sa (fnc/cf (str a) 2) sb (fnc/cf (str b) 2)
        rd (rand-int 4)
        angka (cond
                (= rd 0) T
                (= rd 1) lamb
                (= rd 2) v
                (= rd 3) A
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan:
                               \\[ y = " A " \\sin\\left(" sa " \\pi t - " sb " \\pi x \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Periode gelombang tersebut adalah ...sekon.")
                 (= rd 1) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan
                               \\[ y = " A " \\sin\\left(" sa " \\pi t - " sb " \\pi x \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Panjang gelombang dari gelombang tersebut adalah ...cm.")
                 (= rd 2) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan
                               \\[ y = " A " \\sin\\left(" sa " \\pi t - " sb " \\pi x \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Cepat rambat gelombang tersebut adalah ...cm/s.")
                 (= rd 3) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan
                               \\[ y = " A " \\sin\\left(" sa " \\pi t - " sb " \\pi x \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Amplitudo gelombang tersebut adalah ...cm.")

                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FAAJ-2 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAJ-2.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) a (nth datum 1) b (nth datum 2) T (nth datum 3) lamb (nth datum 4) v (nth datum 5) c (nth datum 6)
        sa (fnc/cf (str a) 2) sb (fnc/cf (str b) 2) sc (fnc/cf (str c) 2)
        rd (rand-int 4)
        angka (cond
                (= rd 0) T
                (= rd 1) lamb
                (= rd 2) v
                (= rd 3) A
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan:
                               \\[ y = " A " \\cos\\left(" sa " \\pi t - " sb " \\pi x + " sc " \\pi  \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Periode gelombang tersebut adalah ...sekon.")
                 (= rd 1) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan
                               \\[ y = " A " \\cos\\left(" sa " \\pi t - " sb " \\pi x + " sc " \\pi  \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Panjang gelombang dari gelombang tersebut adalah ...cm.")
                 (= rd 2) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan
                               \\[ y = " A " \\cos\\left(" sa " \\pi t - " sb " \\pi x + " sc " \\pi  \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Cepat rambat gelombang tersebut adalah ...cm/s.")
                 (= rd 3) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan
                               \\[ y = " A " \\cos\\left(" sa " \\pi t - " sb " \\pi x + " sc " \\pi  \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Amplitudo gelombang tersebut adalah ...cm.")

                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FAAJ-3 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAJ-2.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) a (nth datum 1) b (nth datum 2) T (nth datum 3) lamb (nth datum 4) v (nth datum 5) c (nth datum 6)
        sa (fnc/cf (str a) 2) sb (fnc/cf (str b) 2) sc (fnc/cf (str c) 2)
        rd (rand-int 4)
        angka (cond
                (= rd 0) T
                (= rd 1) lamb
                (= rd 2) v
                (= rd 3) A
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan:
                               \\[ y = " A " \\cos\\left(" sb " \\pi x - " sa " \\pi t + " sc " \\pi  \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Periode gelombang tersebut adalah ...sekon.")
                 (= rd 1) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan
                               \\[ y = " A " \\cos\\left(" sb " \\pi x - " sa " \\pi t + " sc " \\pi  \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Panjang gelombang dari gelombang tersebut adalah ...cm.")
                 (= rd 2) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan
                               \\[ y = " A " \\cos\\left(" sb " \\pi x - " sa " \\pi t + " sc " \\pi  \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Cepat rambat gelombang tersebut adalah ...cm/s.")
                 (= rd 3) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan
                               \\[ y = " A " \\cos\\left(" sb " \\pi x - " sa " \\pi t + " sc " \\pi  \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Amplitudo gelombang tersebut adalah ...cm.")

                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FAAJ-4 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAJ-4.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) a (nth datum 1) b (nth datum 2) T (nth datum 3) lamb (nth datum 4) v (nth datum 5) c (nth datum 6)
        sa (fnc/cf (str a) 2) sb (fnc/cf (str b) 2) sc (fnc/cf (str c) 2)
        rd (rand-int 4)
        angka (cond
                (= rd 0) T
                (= rd 1) lamb
                (= rd 2) v
                (= rd 3) A
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan:
                               \\[ y = " A " \\sin\\pi\\left(" sb " x - " sa " t + " sc "  \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Periode gelombang tersebut adalah ...sekon.")
                 (= rd 1) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan
                               \\[ y = " A " \\sin\\pi\\left(" sb " x - " sa " t + " sc "  \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Panjang gelombang dari gelombang tersebut adalah ...cm.")
                 (= rd 2) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan
                               \\[ y = " A " \\sin\\pi\\left(" sb " x - " sa " t + " sc "  \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Cepat rambat gelombang tersebut adalah ...cm/s.")
                 (= rd 3) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan
                               \\[ y = " A " \\sin\\pi\\left(" sb " x - " sa " t + " sc "  \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Amplitudo gelombang tersebut adalah ...cm.")

                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FAAJ-5 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAJ-4.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) a (nth datum 1) b (nth datum 2) T (nth datum 3) lamb (nth datum 4) v (nth datum 5) c (nth datum 6)
        sa (fnc/cf (str a) 2) sb (fnc/cf (str b) 2) sc (fnc/cf (str c) 2)
        rd (rand-int 4)
        angka (cond
                (= rd 0) T
                (= rd 1) lamb
                (= rd 2) v
                (= rd 3) A
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan:
                               \\[ y = - " A " \\cos\\pi\\left(" sb " x - " sa " t \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Periode gelombang tersebut adalah ...sekon.")
                 (= rd 1) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan
                               \\[ y = - " A " \\cos\\pi\\left(" sb " x - " sa " t \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Panjang gelombang dari gelombang tersebut adalah ...cm.")
                 (= rd 2) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan
                               \\[ y = - " A " \\cos\\pi\\left(" sb " x - " sa " t \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Cepat rambat gelombang tersebut adalah ...cm/s.")
                 (= rd 3) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan
                               \\[ y = - " A " \\cos\\pi\\left(" sb " x - " sa " t \\right) \\]
                              x dan y dalam cm dan t dalam sekon. Amplitudo gelombang tersebut adalah ...cm.")

                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FAAJ []
  "Gelombang Mekanik"
  ;(C3A1FAAJ-5))
  (let [x (rand-int 6)] ((resolve (symbol my-ns (str "C3A1FAAJ-" x))))))

(defn C3A1FAAK-0 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAK-0.txt"))
        datum (nth data (rand-int (count data)))
        t (nth datum 0) x (nth datum 1) a (nth datum 2) b (nth datum 3) y (nth datum 4) A (nth datum 5)
        sa (fnc/cf (str a) 2) sb (fnc/cf (str b) 2) ay (Math/abs y)
        sx (fnc/cf (str x) 1) st (fnc/cf (str t) 1)
        rd (rand-int 0)
        angka (cond
                (= rd 0) ay
              )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan:
                               \\[ y = " A " \\sin\\pi\\left(" sa " t - " sb " x \\right) \\]
                              x dalam m, y dalam cm, dan t dalam sekon. Besar simpangan suatu partikel yang berada
                                " sx " m dari pusat gelombang ketika pusat gelombang sudah bergetar " st " sekon
                                adalah ... cm.")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C3A1FAAK-1 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAK-1.txt"))
        datum (nth data (rand-int (count data)))
        t (nth datum 0) x (nth datum 1) a (nth datum 2) b (nth datum 3) v (nth datum 4) A (nth datum 5)
        sa (fnc/cf (str a) 2) sb (fnc/cf (str b) 2)
        sx (fnc/cf (str x) 1) st (fnc/cf (str t) 1)
        var "$\\pi$"
        rd (rand-int 0)
        angka (cond
                (= rd 0) v
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan:
                               \\[ y = " A " \\sin\\pi\\left(" sa " t - " sb " x \\right) \\]
                              x dalam m, y dalam cm, dan t dalam sekon. Kecepatan suatu partikel yang berada
                                " sx " m dari pusat gelombang ketika pusat gelombang sudah bergetar " st " sekon
                                adalah ... cm/s.")
                )
         :pilihan (fnc/create-option4 angka var jwb)
         :jawaban jwb
         }))
(defn C3A1FAAK-2 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAK-2.txt"))
        datum (nth data (rand-int (count data)))
        t (nth datum 0) x (nth datum 1) a (nth datum 2) b (nth datum 3) aa (nth datum 4) A (nth datum 5)
        sa (fnc/cf (str a) 2) sb (fnc/cf (str b) 2)
        sx (fnc/cf (str x) 1) st (fnc/cf (str t) 1)
        var "$\\pi^2$"
        rd (rand-int 0)
        angka (cond
                (= rd 0) aa
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond

                 (= rd 0) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan:
                               \\[ y = " A " \\sin\\pi\\left(" sa " t - " sb " x \\right) \\]
                              x dalam m, y dalam cm, dan t dalam sekon. Percepatan suatu partikel yang berada
                                " sx " m dari pusat gelombang ketika pusat gelombang sudah bergetar " st " sekon
                                adalah ... cm/s$^2$.")
                )
         :pilihan (fnc/create-option4 angka var jwb)
         :jawaban jwb
         }))
(defn C3A1FAAK-3 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAK-3.txt"))
        datum (nth data (rand-int (count data)))
        A (nth datum 0) a (nth datum 1) b (nth datum 2) c (nth datum 3) ym (nth datum 4) vm (nth datum 5) am (nth datum 6)
        rd (rand-int 3)
        angka (cond
                (= rd 0) ym
                (= rd 1) vm
                (= rd 2) am
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan:
                               \\[ y = - " A " \\cos(" a " x + " b " t + " c ") \\]
                              x dalam m, y dalam cm, dan t dalam sekon. Simpangan maksimum gelombang tersebut adalah ... cm.")
                 (= rd 1) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan:
                               \\[ y = - " A " \\cos(" a " x + " b " t + " c ") \\]
                              x dalam m, y dalam cm, dan t dalam sekon. Kecepatan maksimum partikel pada gelombang
                                tersebut adalah ... cm/s.")
                 (= rd 2) (str  "Suatu gelombang berjalan dinyatakan dengan persamaan:
                               \\[ y = - " A " \\cos(" a " x + " b " t + " c ") \\]
                              x dalam m, y dalam cm, dan t dalam sekon. Percepatan maksimum partikel pada gelombang tersebut
                                adalah ... cm/$s^2$.")
                )
         :pilihan (fnc/create-option3a angka 2 jwb)
         :jawaban jwb
         }))
(defn C3A1FAAK []
  "Gelombang Mekanik"
  ;(C3A1FAAK-3))
  (let [x (rand-int 4)] ((resolve (symbol my-ns (str "C3A1FAAK-" x))))))

(defn C3A1FAAL-0 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAL-0.txt"))
        datum (nth data (rand-int (count data)))
        A2 (nth datum 0) a (nth datum 1) b (nth datum 2) f (nth datum 3) v (nth datum 4) A (nth datum 5)
        ;sa (fnc/cf (str a) 2) sb (fnc/cf (str b) 2)
        rd (rand-int 3)
        angka (cond
                (= rd 0) A
                (= rd 1) f
                (= rd 2) v
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu gelombang stasioner (berdiri) memiliki persamaan:
                               \\[ y =  " A2 " \\sin(" a "\\pi x)\\cos(" b "\\pi t) \\]
                              x dalam m, y dalam cm, dan t dalam sekon. Gelombang tersebut dihasilkan dari suatu superposisi
                              gelombang sumber dan gelombang pantul. Amplitudo gelombang sumbernya adalah ... cm.")
                 (= rd 1) (str  "Suatu gelombang stasioner (berdiri) memiliki persamaan:
                               \\[ y =  " A2 " \\sin(" a "\\pi x)\\cos(" b "\\pi t) \\]
                              x dalam m, y dalam cm, dan t dalam sekon. Gelombang tersebut dihasilkan dari suatu superposisi
                              gelombang sumber dan gelombang pantul. Frekuensi gelombang sumbernya adalah ... Hz.")
                 (= rd 2) (str  "Suatu gelombang stasioner (berdiri) memiliki persamaan:
                               \\[ y =  " A2 " \\sin(" a "\\pi x)\\cos(" b "\\pi t) \\]
                              x dalam m, y dalam cm, dan t dalam sekon. Gelombang tersebut dihasilkan dari suatu superposisi
                              gelombang sumber dan gelombang pantul. Cepat rambat gelombang sumbernya adalah ... m/s.")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C3A1FAAL-1 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAL-1.txt"))
        datum (nth data (rand-int (count data)))
        A2 (nth datum 0) a (nth datum 1) b (nth datum 2) x (nth datum 3) As (nth datum 4) lamb (nth datum 5)
        aAs (Math/abs As)
        sa (fnc/cf (str a) 2) sb (fnc/cf (str b) 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) aAs
                (= rd 1) lamb
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu gelombang stasioner (berdiri) memiliki persamaan:
                               \\[ y =  " A2 " \\cos\\left(" sa "\\pi x \\right)\\sin \\left(" sb "\\pi t \\right) \\]
                              x dalam m, y dalam cm, dan t dalam sekon. Gelombang tersebut dihasilkan dari suatu superposisi
                              gelombang sumber dan gelombang pantul. Amplitudo stasioner titik yang berjarak
                                " x " m dari titik pantul adalah ... cm.")
                 (= rd 1) (str  "Suatu gelombang stasioner (berdiri) memiliki persamaan:
                               \\[ y =  " A2 " \\cos\\left(" sa "\\pi x \\right)\\sin \\left(" sb "\\pi t \\right) \\]
                              x dalam m, y dalam cm, dan t dalam sekon. Gelombang tersebut dihasilkan dari suatu superposisi
                              gelombang sumber dan gelombang pantul. Panjang gelombang dari gelombang sumbernya adalah ... m.")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C3A1FAAL []
  "Gelombang Mekanik"
  ;(C3A1FAAL-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C3A1FAAL-" x))))))

  (defn C3A1FAAM-0 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAM-0.txt"))
        datum (nth data (rand-int (count data)))
        A2 (nth datum 0) a (nth datum 1) b (nth datum 2) x (nth datum 3) t (nth datum 4) y (nth datum 5)
        sa (fnc/cf (str a) 2) sb (fnc/cf (str b) 2) sx (fnc/cf (str x) 1) st (fnc/cf (str t) 1)
        rd (rand-int 0)
        angka (cond
                (= rd 0) y
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu gelombang stasioner (berdiri) memiliki persamaan:
                               \\[ y =  " A2 " \\cos\\left(" sa "\\pi x \\right)\\sin \\left(" sb "\\pi t \\right) \\]
                              x dalam m, y dalam cm, dan t dalam sekon. Gelombang tersebut dihasilkan dari suatu superposisi
                              gelombang sumber dan gelombang pantul. Simpangan titik P yang berjarak " sx " m dari
                                titik pantul ketika titik pantul sudah bergetar selama " st " sekon adalah ...cm.")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C3A1FAAM-1 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAM-1.txt"))
        datum (nth data (rand-int (count data)))
        A2 (nth datum 0) a (nth datum 1) b (nth datum 2) x (nth datum 3) t (nth datum 4) v (nth datum 5)
        sa (fnc/cf (str a) 2) sb (fnc/cf (str b) 2) sx (fnc/cf (str x) 1) st (fnc/cf (str t) 1)
        var "$\\pi$"
        rd (rand-int 0)
        angka (cond
                (= rd 0) v
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu gelombang stasioner (berdiri) memiliki persamaan:
                               \\[ y =  " A2 " \\cos\\left(" sa "\\pi x \\right)\\sin \\left(" sb "\\pi t \\right) \\]
                              x dalam m, y dalam cm, dan t dalam sekon. Gelombang tersebut dihasilkan dari suatu superposisi
                              gelombang sumber dan gelombang pantul. Kecepatan partikel titik P yang berjarak " sx " m dari
                                titik pantul ketika titik pantul sudah bergetar selama " st " sekon adalah ...cm/s.")
                )
         :pilihan (fnc/create-option4 angka var jwb)
         :jawaban jwb
         }))
(defn C3A1FAAM-2 []
  "cepat rambat gelombang"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAM-2.txt"))
        datum (nth data (rand-int (count data)))
        A2 (nth datum 0) a (nth datum 1) b (nth datum 2) x (nth datum 3) t (nth datum 4) aa (nth datum 5)
        sa (fnc/cf (str a) 2) sb (fnc/cf (str b) 2) sx (fnc/cf (str x) 1) st (fnc/cf (str t) 1)
        rd (rand-int 0)
        angka (cond
                (= rd 0) aa
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu gelombang stasioner (berdiri) memiliki persamaan:
                               \\[ y =  " A2 " \\cos\\left(" sa "\\pi x \\right)\\sin \\left(" sb "\\pi t \\right) \\]
                              x dalam m, y dalam cm, dan t dalam sekon. Gelombang tersebut dihasilkan dari suatu superposisi
                              gelombang sumber dan gelombang pantul. Percepatan partikel titik P yang berjarak " sx " m dari
                                titik pantul ketika titik pantul sudah bergetar selama " st " sekon adalah ...cm/s$^2$.
                                ($\\pi^2$ didekati = 10).")
                )
         :pilihan (fnc/create-option3 angka 2 jwb)
         :jawaban jwb
         }))
(defn C3A1FAAM []
  "Gelombang Mekanik"
  ;(C3A1FAAM-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C3A1FAAM-" x))))))

(defn C3A1FAAN-0 []
  "Letak simpul dan perut"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAN-0.txt"))
        datum (nth data (rand-int (count data)))
        v (nth datum 0) T (nth datum 1) n (nth datum 2) sn (nth datum 3) pn (nth datum 4)
        sT (fnc/cf (str T) 1)
        rd (rand-int 2)
        angka (cond
                (= rd 0) sn
                (= rd 1) pn
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu gelombang stasioner ujung terikat memiliki cepat rambat dan periode sebesar
                                " v " meter dan " sT " detik. Jarak simpul ke " n " dari titik pantul adalah ... m.")
                 (= rd 1) (str  "Suatu gelombang stasioner ujung terikat memiliki cepat rambat dan periode sebesar
                                " v " meter dan " sT " detik. Jarak perut ke " n " dari titik pantul adalah ... m.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FAAN-1 []
  "Letak simpul dan perut"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAN-0.txt"))
        datum (nth data (rand-int (count data)))
        v (nth datum 0) T (nth datum 1) n (nth datum 2) sn (nth datum 3) pn (nth datum 4)
        sT (fnc/cf (str T) 1)
        rd (rand-int 2)
        angka (cond
                (= rd 0) pn
                (= rd 1) sn
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu gelombang stasioner ujung bebas memiliki cepat rambat dan periode sebesar
                                " v " meter dan " sT " detik. Jarak simpul ke " n " dari titik pantul adalah ... m.")
                 (= rd 1) (str  "Suatu gelombang stasioner ujung bebas memiliki cepat rambat dan periode sebesar
                                " v " meter dan " sT " detik. Jarak perut ke " n " dari titik pantul adalah ... m.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FAAN-2 []
  "Letak simpul dan perut"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAN-2.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) n (nth datum 2) sn (nth datum 3) pn (nth datum 4) A2 (nth datum 5)
        sa (fnc/cf (str a) 2) sb (fnc/cf (str b) 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) sn
                (= rd 1) pn
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu gelombang stasioner memiliki persamaan gelombang:
                                \\[ y =  " A2 " \\sin\\left(" sa "\\pi x \\right)\\cos \\left(" sb "\\pi t \\right) \\]
                                x dalam m, y dalam cm, dan t dalam sekon. Letak simpul ke " n " dari titik pantul adalah ... m.")
                 (= rd 1) (str  "Suatu gelombang stasioner memiliki persamaan gelombang:
                                \\[ y =  " A2 " \\sin\\left(" sa "\\pi x \\right)\\cos \\left(" sb "\\pi t \\right) \\]
                                x dalam m, y dalam cm, dan t dalam sekon. Letak perut ke " n " dari titik pantul adalah ... m.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FAAN-3 []
  "Letak simpul dan perut"
    (let [data (read-string (slurp "data/fis12ktsp/bab1/C3A1FAAN-2.txt"))
        datum (nth data (rand-int (count data)))
        a (nth datum 0) b (nth datum 1) n (nth datum 2) sn (nth datum 3) pn (nth datum 4) A2 (nth datum 5)
        sa (fnc/cf (str a) 2) sb (fnc/cf (str b) 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) pn
                (= rd 1) sn
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu gelombang stasioner memiliki persamaan gelombang:
                                \\[ y =  " A2 " \\sin\\left(" sb "\\pi t \\right)\\cos \\left(" sa "\\pi x \\right) \\]
                                x dalam m, y dalam cm, dan t dalam sekon. Letak simpul ke " n " dari titik pantul adalah ... m.")
                 (= rd 1) (str  "Suatu gelombang stasioner memiliki persamaan gelombang:
                                \\[ y =  " A2 " \\sin\\left(" sb "\\pi t \\right)\\cos \\left(" sa "\\pi x \\right) \\]
                                x dalam m, y dalam cm, dan t dalam sekon. Letak perut ke " n " dari titik pantul adalah ... m.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FAAN []
  "Gelombang Mekanik"
  ;(C3A1FAAN-3))
  (let [x (rand-int 4)] ((resolve (symbol my-ns (str "C3A1FAAN-" x))))))

(defn C3A1FBAB-0 []
  "cepat rambat"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAB-0.txt"))
        datum (nth data (rand-int (count data)))
        lamb (nth datum 0) f (nth datum 1) v (nth datum 2)
        rd (rand-int 2)
        angka (cond
                (= rd 0) v
                (= rd 1) f
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu gelombang bunyi memiliki frekuensi " f " Hz dan panjang gelombang " lamb " m.
                                Cepat rambat gelombang bunyi tersebut adalah ... m/s.")
                 (= rd 1) (str  "Suatu gelombang bunyi memiliki cepat rambat " v " m/s dan panjang gelombang " lamb " m.
                                Frekuensi gelombang bunyi tersebut adalah ... Hz.")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAB-1 []
  "cepat rambat"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAB-1.txt"))
        datum (nth data (rand-int (count data)))
        lamb (nth datum 0) T (nth datum 1) v (nth datum 2)
        sT (fnc/cf (str T) 1) slamb (fnc/cf (str lamb) 1)
        rd (rand-int 2)
        angka (cond
                (= rd 0) lamb
                (= rd 1) T
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu gelombang bunyi memiliki periode " sT " detik dan cepat rambat gelombang " v " m/s.
                                Panjang gelombang bunyi tersebut adalah ... m.")
                 (= rd 1) (str  "Suatu gelombang bunyi memiliki cepat rambat " v " m/s dan panjang gelombang " slamb " m.
                                Periode gelombang bunyi tersebut adalah ... sekon.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAB []
  "Bunyi"
  ;(C3A1FBAB-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C3A1FBAB-" x))))))

(defn C3A1FBAC-0 []
  "cepat rambat"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAC-0.txt"))
        datum (nth data (rand-int (count data)))
        l (nth datum 0) m (nth datum 1) F (nth datum 2) v (nth datum 3)
        rd (rand-int 4)
        angka (cond
                (= rd 0) v
                (= rd 1) F
                (= rd 2) m
                (= rd 3) l
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Tali dengan panjang " l " m ditarik dengan gaya " F " N. Jika massa tali " m " kg,
                                maka kelajuan gelombang transversal yang menjalar pada tali adalah ... m/s.")
                 (= rd 1) (str  "Tali dengan panjang " l " m memiliki massa " m " kg, jika kelajuan gelombang transversal
                                yang menjalar pada tali adalah " v " m/s, maka gaya tegangan tali adalah ... N.")
                 (= rd 2) (str  "Gelombang transversal dengan laju " v " m/s menjalar pada tali yang tegangannya " F " N dan
                                panjangnya " l " m. Massa tali tersebut adalah ... kg.")
                 (= rd 3) (str  "Gelombang transversal dengan laju " v " m/s menjalar pada tali yang tegangannya " F " N dan
                                massanya " m " kg. Panjang tali tersebut adalah ... m.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAC-1 []
  "cepat rambat"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAC-1.txt"))
        datum (nth data (rand-int (count data)))
        lamb (nth datum 0) f (nth datum 1) xE (nth datum 2) xR (nth datum 3) v2 (nth datum 4)
        sxE (fnc/cf (str xE) 1) sxR (fnc/cf (str xR) 1)
        rd (rand-int 0)
        angka (cond
                (= rd 0) v2

               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Pada medium zat padat yang modulus elastisitasnya E dan massa jenisnya R suatu gelombang
                                bunyi merambat dengan frekuensi " f " Hz dan panjang gelombang " lamb " m. Cepat rambat
                                gelombang bunyi tersebut pada medium yang modulus elastisitasnya " sxE "E dan massa jenisnya
                                " sxR "R adalah ... m/s.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAC-2 []
  "cepat rambat"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAC-2.txt"))
        datum (nth data (rand-int (count data)))
        lamb (nth datum 0) f (nth datum 1) v (nth datum 2) xT (nth datum 3) v2 (nth datum 4)
        sxT (fnc/cf (str xT) 1)
        rd (rand-int 2)
        angka (cond
                (= rd 0) v2
                (= rd 1) lamb
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Pada medium gas yang suhu mutlaknya T dan massa molarnya M suatu gelombang bunyi merambat
                                dengan frekuensi " f " Hz dan cepat rambat " v " m/s. Jika suhu gas berubah menjadi
                                " sxT "T dan massa molar tetap maka cepat rambat gelombang tersebut menjadi ... m/s.")
                 (= rd 1) (str  "Pada medium gas yang suhu mutlaknya T dan massa molarnya M suatu gelombang bunyi merambat
                                dengan frekuensi " f " Hz dan cepat rambat " v " m/s. Jika suhu gas berubah menjadi
                                " sxT "T dan massa molar tetap maka panjang gelombangnya akan berubah menjadi ... m.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAC []
  "Bunyi"
  ;(C3A1FBAC-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C3A1FBAC-" x))))))

(defn C3A1FBAD-0 []
  "cepat rambat"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAD-0.txt"))
        datum (nth data (rand-int (count data)))
        v (nth datum 0) vp (nth datum 1) fs (nth datum 2) fp (nth datum 3)
        ket_vp (if (> vp 0) "mendekati" "menjauhi")
        avp (Math/abs vp)
        rd (rand-int 3)
        angka (cond
                (= rd 0) fp
                (= rd 1) fs
                (= rd 2) avp
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Seorang pendengar bergerak " ket_vp " sumber bunyi berfrekuensi " fs " Hz dengan laju
                                " avp " m/s. Jika cepat rambat bunyi saat itu adalah " v " m/s maka frekuensi suara yang
                                didengar oleh pendengan adalah ... Hz.")
                 (= rd 1) (str  "Seorang pendengar bergerak " ket_vp " suatu sumber bunyi dengan laju
                                " avp " m/s. Jika cepat rambat bunyi saat itu adalah " v " m/s dan frekuensi suara yang
                                didengar oleh pendengan adalah " fp " Hz, maka frekuensi sumber bunyi adalah ... Hz.")
                 (= rd 2) (str  "Seorang pendengar yang bergerak "ket_vp " sumber bunyi berfrekuensi " fs " Hz, mendengar
                                bunyi dengan frekuensi " fp " Hz. Jika cepat rambat bunyi saat itu adalah " v " m/s maka
                                laju pendengar tersebut adalah ... m/s.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAD-1 []
  "cepat rambat"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAD-1.txt"))
        datum (nth data (rand-int (count data)))
        v (nth datum 0) vs (nth datum 1) fs (nth datum 2) fp (nth datum 3)
        ket_vs (if (< vs 0) "mendekati" "menjauhi")
        avs (Math/abs vs)
        rd (rand-int 3)
        angka (cond
                (= rd 0) fp
                (= rd 1) fs
                (= rd 2) avs
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Mobil ambulan yang membunyikan sirine dengan frekuensi " fs " Hz bergerak " ket_vs "
                                seseorang yang berdiri di pinggir jalan. Jika mobil ambulan bergerak dengan kecepatan
                                " avs " m/s dan cepat rambat bunyi di udara saat itu " v " m/s, maka frekuensi suara sirine
                                yang di dengar oleh orang tersebut adalah ... Hz.")
                 (= rd 1) (str  "Mobil ambulan yang membunyikan sirine bergerak " ket_vs " seseorang yang berdiri di pinggir
                                jalan dengan laju " avs " m/s. Jika orang tersebut mendengar bunyi sirine dengan frekuensi
                                " fp " Hz dan cepat rambat bunyi di udara saat itu adalah " v " m/s maka frekuensi bunyi
                                sirine sebenarnya adalah ... Hz.")
                 (= rd 2)  (str  "Mobil ambulan yang membunyikan sirine dengan frekuensi " fs " Hz bergerak " ket_vs "
                                seseorang yang berdiri di pinggir jalan. Jika frekuensi suara sirine
                                yang di dengar oleh orang tersebut adalah " fp " Hz,  maka  mobil ambulan bergerak dengan
                                 kecepatan ... m/s (cepat rambat bunyi di udara saat itu " v " m/s).")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAD-2 []
  "cepat rambat"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAD-2.txt"))
        datum (nth data (rand-int (count data)))
        v (nth datum 0) vp (nth datum 1) vs (nth datum 2) fs (nth datum 3) fp (nth datum 4)
        ket_vs (if (< vs 0) "ke kanan" "ke kiri")
        ket_vp (if (> vp 0) "ke kanan" "ke kiri")
        avs (Math/abs vs)
        avp (Math/abs vp)
        rd (rand-int 2)
        angka (cond
                (= rd 0) fp
                (= rd 1) fs
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Seseorang yang mengendarai sepeda motor dengan laju " avp " m/s " ket_vp " dan ambulan yang memiliki
                                laju " avs " m/s bergerak " ket_vs " dari depan sepeda motor. Jika ambulan membunyikan sirine dengan
                                frekuensi " fs " hz maka pengendara sepeda motor akan mendengar suara sirine tersebut dengan
                                frekuensi ... Hz (cepat rambat bunyi di udara saat itu " v " m/s).")
                 (= rd 1) (str  "Seseorang yang mengendarai sepeda motor dengan laju " avp " m/s " ket_vp " dan ambulan yang memiliki
                                laju " avs " m/s bergerak " ket_vs " dari depan sepeda motor. Jika ambulan membunyikan sirine dan
                                pengendara sepeda motor mendengar suara sirine tersebut dengan
                                frekuensi " fp " Hz, maka frekuensi sirine ambulan adalah ... Hz.
                                (cepat rambat bunyi di udara saat itu " v " m/s).")
                )
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAD []
  "Bunyi"
  ;(C3A1FBAD-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C3A1FBAD-" x))))))

(defn C3A1FBAE-0 []
  "cepat rambat"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAE-0.txt"))
        datum (nth data (rand-int (count data)))
        f1 (nth datum 0) fl (nth datum 1) f2 (nth datum 2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) f2
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Dua sumber bunyi yang berdekatan dibunyikan bersama-sama Jika frekuensi bunyi yang pertama
                                " f1 " Hz dan terjadi pelayangan dengan frekuensi " fl " Hz maka frekuensi sumber bunyi
                                kedua yang mungkin adalah ... Hz.")
                )
         :pilihan (fnc/create-option5 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAE-1 []
  "cepat rambat"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAE-1.txt"))
        datum (nth data (rand-int (count data)))
        f1 (nth datum 0) f2 (nth datum 1) v (nth datum 2) vp (nth datum 3)
        avp (Math/abs vp)
        rd (rand-int 0)
        angka (cond
                (= rd 0) avp
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Sebuah garpu tala yang diam bergetar dengan frekuensi " f1 " Hz. Seorang anak berlari membawa
                                garpu tala lain yang bergetar dengan frekuensi " f2 " Hz.
                                Jika anak tersebut tidak mendengar pelayangan maka laju larinya adalah ... m/s
                                (cepat rambat bunyi di udara saat itu " v " m/s).")
                )
         :pilihan (fnc/create-option1b angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAE []
  "Bunyi"
  ;(C3A1FBAE-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C3A1FBAE-" x))))))

(defn C3A1FBAG-0 []
  "Pipa organa terbuka"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAG-0.txt"))
        datum (nth data (rand-int (count data)))
        f (nth datum 0) vn (nth datum 1) v (nth datum 2) L (nth datum 3)
        n (first vn) ket_n (second vn)
        rd (rand-int 2)
        angka (cond
                (= rd 0) f
                (= rd 1) L
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu pipa organa terbuka memiliki panjang " L " cm. Jika cepat rambat bunyi saat itu adalah
                                " v " cm/s maka " ket_n " pipa organa itu adalah ... Hz.")
                 (= rd 1) (str  "Suatu pipa organa terbuka memiliki " ket_n " " f " Hz. Jika cepat rambat bunyi saat itu adalah
                                " v " cm/s maka panjang pipa organa itu adalah ... cm.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAG-1 []
  "Pipa organa terbuka"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAG-1.txt"))
        datum (nth data (rand-int (count data)))
        f (nth datum 0) vn (nth datum 1) v (nth datum 2) L (nth datum 3)
        n (first vn) ket_n (second vn)
        rd (rand-int 2)
        angka (cond
                (= rd 0) f
                (= rd 1) L
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu pipa organa terbuka memiliki panjang " L " cm. Jika cepat rambat bunyi saat itu adalah
                                " v " cm/s maka " ket_n " pipa organa itu adalah ... Hz.")
                 (= rd 1) (str  "Suatu pipa organa terbuka memiliki " ket_n " " f " Hz. Jika cepat rambat bunyi saat itu adalah
                                " v " cm/s maka panjang pipa organa itu adalah ... cm.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAG-2 []
  "Pipa organa terbuka"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAG-2.txt"))
        datum (nth data (rand-int (count data)))
        f (nth datum 0) vn (nth datum 1) v (nth datum 2) L (nth datum 3)
        n (first vn) ket_n (second vn)
        rd (rand-int 2)
        angka (cond
                (= rd 0) f
                (= rd 1) L
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu pipa organa terbuka memiliki panjang " L " cm. Jika cepat rambat bunyi saat itu adalah
                                " v " cm/s maka " ket_n " pipa organa itu adalah ... Hz.")
                 (= rd 1) (str  "Suatu pipa organa terbuka memiliki " ket_n " " f " Hz. Jika cepat rambat bunyi saat itu adalah
                                " v " cm/s maka panjang pipa organa itu adalah ... cm.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAG []
  "Bunyi"
  ;(C3A1FBAG-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C3A1FBAG-" x))))))

(defn C3A1FBAH-0 []
  "Pipa organa tertutup"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAH-0.txt"))
        datum (nth data (rand-int (count data)))
        f (nth datum 0) vn (nth datum 1) v (nth datum 2) L (nth datum 3)
        n (first vn) ket_n (second vn)
        rd (rand-int 2)
        angka (cond
                (= rd 0) f
                (= rd 1) L
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu pipa organa tertutup memiliki panjang " L " cm. Jika cepat rambat bunyi saat itu adalah
                                " v " cm/s maka " ket_n " pipa organa itu adalah ... Hz.")
                 (= rd 1) (str  "Suatu pipa organa tertutup memiliki " ket_n " " f " Hz. Jika cepat rambat bunyi saat itu adalah
                                " v " cm/s maka panjang pipa organa itu adalah ... cm.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAH-1 []
  "Pipa organa tertutup"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAH-1.txt"))
        datum (nth data (rand-int (count data)))
        f (nth datum 0) vn (nth datum 1) v (nth datum 2) L (nth datum 3)
        n (first vn) ket_n (second vn)
        rd (rand-int 2)
        angka (cond
                (= rd 0) f
                (= rd 1) L
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu pipa organa tertutup memiliki panjang " L " cm. Jika cepat rambat bunyi saat itu adalah
                                " v " cm/s maka " ket_n " pipa organa itu adalah ... Hz.")
                 (= rd 1) (str  "Suatu pipa organa tertutup memiliki " ket_n " " f " Hz. Jika cepat rambat bunyi saat itu adalah
                                " v " cm/s maka panjang pipa organa itu adalah ... cm.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAH-2 []
  "Pipa organa tertutup"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAH-2.txt"))
        datum (nth data (rand-int (count data)))
        f (nth datum 0) vn (nth datum 1) v (nth datum 2) L (nth datum 3)
        n (first vn) ket_n (second vn)
        rd (rand-int 2)
        angka (cond
                (= rd 0) f
                (= rd 1) L
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu pipa organa tertutup memiliki panjang " L " cm. Jika cepat rambat bunyi saat itu adalah
                                " v " cm/s maka " ket_n " pipa organa itu adalah ... Hz.")
                 (= rd 1) (str  "Suatu pipa organa tertutup memiliki " ket_n " " f " Hz. Jika cepat rambat bunyi saat itu adalah
                                " v " cm/s maka panjang pipa organa itu adalah ... cm.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAH []
  "Bunyi"
  ;(C3A1FBAH-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C3A1FBAH-" x))))))



(defn C3A1FBAI0-0 []
  "Dawai"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAI-0.txt"))
        datum (nth data (rand-int (count data)))
        f (nth datum 0) vn (nth datum 1) v (nth datum 2) L (nth datum 3)
        n (first vn) ket_n (second vn)
        rd (rand-int 2)
        angka (cond
                (= rd 0) f
                (= rd 1) L
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu dawai memiliki panjang " L " cm. Jika cepat rambat bunyi saat itu adalah
                                " v " cm/s maka " ket_n " dawai itu adalah ... Hz.")
                 (= rd 1) (str  "Suatu dawai memiliki " ket_n " " f " Hz. Jika cepat rambat bunyi saat itu adalah
                                " v " cm/s maka panjang dawai itu adalah ... cm.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAI0-1 []
  "Dawai"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAI-1.txt"))
        datum (nth data (rand-int (count data)))
        f (nth datum 0) vn (nth datum 1) v (nth datum 2) L (nth datum 3)
        n (first vn) ket_n (second vn)
        rd (rand-int 2)
        angka (cond
                (= rd 0) f
                (= rd 1) L
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu dawai memiliki panjang " L " cm. Jika cepat rambat bunyi saat itu adalah
                                " v " cm/s maka " ket_n " dawai itu adalah ... Hz.")
                 (= rd 1) (str  "Suatu dawai memiliki " ket_n " " f " Hz. Jika cepat rambat bunyi saat itu adalah
                                " v " cm/s maka panjang dawai itu adalah ... cm.")
                )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAI-0 []
  "Dawai"
  ;(C3A1FBAI0-0)
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C3A1FBAI0-" x))))))
(defn C3A1FBAI-1 []
  "Dawai"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAI-3.txt"))
        datum (nth data (rand-int (count data)))
        fo (nth datum 0) foa (nth datum 1) xF (nth datum 2)
        sfoa (fnc/cf (str foa) 1)
        rd (rand-int 3)
        angka (cond
                (= rd 0) foa
                (= rd 1) fo
                (= rd 2) xF
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu dawai memiliki nada dasar " fo " Hz. Jika tegangan dawai tersebut dijadikan
                                " xF " kali semula tanpa mengubah panjang dawai maka frekuensi nada dasarnya akan menjadi ... Hz.")
                 (= rd 1) (str  "Suatu dawai diubah tegangannya menjadi " xF " kali semula sehingga nada dasarnya menjadi " sfoa " Hz.
                                Nada dasar dawai mula-mula adalah ... Hz.")
                 (= rd 2) (str  "Suatu dawai diubah tegangannya sehingga frekuensi nada dasarnya berubah dari " fo " Hz menjadi
                                " sfoa " Hz. Perubahan tegangan itu adalah ... kali semula.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAI-2 []
  "Dawai"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAI-4.txt"))
        datum (nth data (rand-int (count data)))
        fo (nth datum 0) foa (nth datum 1) xL (nth datum 2)
        sfoa (fnc/cf (str foa) 1)
        rd (rand-int 3)
        angka (cond
                (= rd 0) foa
                (= rd 1) fo
                (= rd 2) xL
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu dawai memiliki nada dasar " fo " Hz. Jika panjang dawai tersebut dijadikan
                                " xL " kali semula tanpa mengubah tegangan dawai maka frekuensi nada dasarnya akan menjadi ... Hz.")
                 (= rd 1) (str  "Suatu dawai diubah panjangnya menjadi " xL " kali semula tanpa mengubah tegangannya
                                sehingga nada dasarnya menjadi " sfoa " Hz. Nada dasar dawai mula-mula adalah ... Hz.")
                 (= rd 2) (str  "Suatu dawai diubah panjangnya tanpa mengubah tegangannya sehingga frekuensi nada dasarnya
                                berubah dari " fo " Hz menjadi  " sfoa " Hz. Perubahan panjang itu adalah ... kali semula.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAI []
  "Bunyi"
  ;(C3A1FBAI-2))
  (let [x (rand-int 3)] ((resolve (symbol my-ns (str "C3A1FBAI-" x))))))

(defn C3A1FBAJ-0 []
  "Dawai"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAJ-0.txt"))
        datum (nth data (rand-int (count data)))
        fo (nth datum 0) vn (nth datum 1) v (nth datum 2) L (nth datum 3)
        ket_n (second vn)
        rd (rand-int 0)
        angka (cond
                (= rd 0) L
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu dawai yang memiliki nada dasar " fo " Hz beresonansi dengan " ket_n " suatu pipa
                                organa tertutup. Jika cepat rambat bunyi di udara saat itu " v " m/s maka panjang pipa
                                organa itu adalah ... m.")
                )
         :pilihan (fnc/create-option3 angka 4 jwb)
         :jawaban jwb
         }))
(defn C3A1FBAJ-1 []
  "Dawai"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAJ-1.txt"))
        datum (nth data (rand-int (count data)))
        fot (nth datum 0) vnt (nth datum 1) vnb (nth datum 2) v (nth datum 3) Lb (nth datum 4)
        ket_nt (second vnt) ket_nb (second vnb)
        rd (rand-int 0)
        angka (cond
                (= rd 0) Lb
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu pipa organa tertutup memiliki nada dasar " fot " Hz ketika cepat rambat bunyi di
                                udara " v " m/s. Panjang gelombang " ket_nt " pipa organa tertutup ini sama dengan panjang
                                gelombang " ket_nb " suatu pipa organa terbuka yang panjangnya ... meter.")
                )
         :pilihan (fnc/create-option3 angka 4 jwb)
         :jawaban jwb
         }))
(defn C3A1FBAJ []
  "Bunyi"
  ;(C3A1FBAJ-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C3A1FBAJ-" x))))))

(defn C3A1FBAJA-0 []
  "Tabung resonansi"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAJA-0.txt"))
        datum (nth data (rand-int (count data)))
        f (nth datum 0) vn1 (nth datum 1) vn2 (nth datum 2) v (nth datum 3) L1 (nth datum 4) L2 (nth datum 5)
        ket_n1 (second vn1) ket_n2 (second vn2)
        rd (rand-int 0)
        angka (cond
                (= rd 0) L2
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu tabung resonansi dicelupkan ke dalam air dan di atasnya digetarkan garpu tala yang
                                berfrekuensi " f " Hz. Resonansi " ket_n1 " terjadi ketika tinggi tabung di atas permukaan
                                air adalah " L1 " m. Jika cepat rambat bunyi di udara saat itu " v " m/s maka resonansi
                                " ket_n2 " akan terjadi ketika tinggi tabung di atas permukaan air adalah ... cm.")
                )
         :pilihan (fnc/create-option3 angka 4 jwb)
         :jawaban jwb
         }))
(defn C3A1FBAJA []
  "Bunyi"
  (C3A1FBAJA-0))
  ;(let [x (rand-int 2)] ((resolve (symbol my-ns (str "C3A1FBAK-" x))))))

(defn C3A1FBAK-0 []
  "Intensitas Bunyi"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAK-0.txt"))
        datum (nth data (rand-int (count data)))
        xd (nth datum 0) xP (nth datum 1) xI (nth datum 2)
        sxd (fnc/cf (str xd) 1) sxP (fnc/cf (str xP) 1) sxI (fnc/cf (str xI) 1)
        rd (rand-int 3)
        angka (cond
                (= rd 0) xI
                (= rd 1) xd
                (= rd 2) xP
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Suatu sumber bunyi yang memancar ke segala arah memiliki daya P watt. Bunyi itu dideteksi
                                dengan detektor memiliki intensitas I watt/m$^2$ pada jarak x meter dari sumber bunyi.
                                Jika daya sumber bunyi diubah menjadi " sxP "P dan jarak detektor menjadi " sxd "x maka
                                intensitas bunyi yang terdeteksi menjadi ...I.")
                 (= rd 1) (str  "Suatu sumber bunyi yang memancar ke segala arah memiliki daya P watt. Bunyi itu dideteksi
                                dengan detektor memiliki intensitas I watt/m$^2$ pada jarak x meter dari sumber bunyi.
                                Intensitas bunyi terdeteksi menjadi " sxI "I ketika daya  sumber bunyi diubah menjadi " sxP "P
                                dan jarak detektor menjadi ... x.")
                 (= rd 2) (str  "Suatu sumber bunyi yang memancar ke segala arah memiliki daya P watt. Bunyi itu dideteksi
                                dengan detektor memiliki intensitas I watt/m$^2$ pada jarak x meter dari sumber bunyi.
                                Intensitas bunyi terdeteksi menjadi " sxI "I ketika jarak detektor menjadi " sxd "x dan daya
                                sumber bunyi diubah menjadi ... P.")
                )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAK-1 []
  "Intensitas Bunyi"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAK-1.txt"))
        datum (nth data (rand-int (count data)))
        IA (nth datum 0) rA (nth datum 1) rAB (nth datum 2) IB (nth datum 3)
        rd (rand-int 0)
        angka (cond
                (= rd 0) IB
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Intensitas bunyi yang terdeteksi pada titik A yang berjarak " rA " m dari sumber bunyi S
                                adalah " IA " x 10$^{-3}$ W.m$^{-2}$. Titik B terletak pada jarak " rAB " m dari titik A dan
                                S - A - B membentuk segitiga siku-siku dengan sudut siku-siku di A. Intensitas bunyi yang
                                terdeteksi di titik B adalah ... x 10$^{-3}$ W.m$^{-2}$.")
               )
         :pilihan (fnc/create-option10 angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAK []
  "Bunyi"
  ;(C3A1FBAK-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C3A1FBAK-" x))))))

(defn C3A1FBAL-0 []
  "Intensitas Bunyi"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAL-0.txt"))
        datum (nth data (rand-int (count data)))
        TI1 (nth datum 0) xp (nth datum 1) TI2 (nth datum 2)
        rd (rand-int 3)
        angka (cond
                (= rd 0) TI2
                (= rd 1) TI1
                (= rd 2) xp
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Taraf Intensitas satu sumber bunyi yang diamati pada jarak tertentu adalah " TI1 " dB.
                                Jika " xp " sumber bunyi berbunyi bersama-sama maka taraf intensitas yang diamati pada
                                jarak tersebut adalah ... dB.")
                 (= rd 1) (str  "Taraf Intensitas " xp " sumber bunyi yang diamati pada jarak tertentu adalah " TI2 " dB.
                                Taraf intensitas satu sumber bunyinya adalah ... dB.")
                 (= rd 2) (str  "Taraf Intensitas satu sumber bunyi yang diamati pada jarak tertentu adalah " TI1 " dB.
                                Jika sumber bunyinya ditambah menjadi x kali taraf intensitas bertambah menjadi " TI2 " dB.
                                x = ... ")
               )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAL-1 []
  "Intensitas Bunyi"
    (let [data (read-string (slurp "data/fis12ktsp/bab2/C3A1FBAL-1.txt"))
        datum (nth data (rand-int (count data)))
        TI1 (nth datum 0) n2 (nth datum 1) n1 (nth datum 2) r2 (nth datum 3) r1 (nth datum 4) TI2 (nth datum 5)
        rd (rand-int 2)
        angka (cond
                (= rd 0) n2
                (= rd 1) r2
               )
        jwb (fnc/jawaban)
       ]
        {:soal (cond
                 (= rd 0) (str  "Taraf Intensitas " n1 " buah sumber bunyi yang diamati pada jarak " r1 " meter adalah " TI1 " dB.
                                Jika pada jarak " r2 " meter taraf intensitas yang diamati adalah " TI2 " dB maka jumlah sumber
                                bunyinya berubah menjadi ... buah.")
                 (= rd 1) (str  "Taraf Intensitas " n1 " buah sumber bunyi yang diamati pada jarak " r1 " meter adalah " TI1 " dB.
                                Jika jarak pengamatan diubah maka taraf intensitas yang dihasilkan oleh " n2 " buah sumber
                                bunyi adalah " TI2 " dB. Jarak tersebut adalah ... m.")
               )
         :pilihan (fnc/create-option1a angka jwb)
         :jawaban jwb
         }))
(defn C3A1FBAL []
  "Bunyi"
  ;(C3A1FBAL-1))
  (let [x (rand-int 2)] ((resolve (symbol my-ns (str "C3A1FBAL-" x))))))


(defn C3A1FCAA-0 []
  "Optika Fisis - Pemantulan dan Pembiasan"
  (let [data (db/get-data (str "select kodebutir, data, soal, gambar from datagen where kodebutir='C3A1FCAA-0'") 1)]
      (if data
        (let [data1 (read-string (data :data)) datum (nth data1 (rand-int (count data1)))
              jwb (fnc/jawaban)]
              {:soal (fnc/create-problem datum (data :soal))
               :pilihan (fnc/create-option3 (last datum) 2 jwb) :jawaban jwb
               }))))
(defn C3A1FCAA-1 []
  "Optika Fisis - Pemantulan dan Pembiasan"
  (let [data (db/get-data (str "select kodebutir, data, soal, gambar from datagen where kodebutir='C3A1FCAA-1'") 1)]
      (if data
        (let [data1 (read-string (data :data)) datum (nth data1 (rand-int (count data1)))
              jwb (fnc/jawaban)]
              {:soal (fnc/create-problem datum (data :soal))
               :pilihan (fnc/create-option1a (last datum) jwb) :jawaban jwb
               :img "/img/fis12ktsp/bab3/C3A1FCAA-1.png"
               }))))
(defn C3A1FCAA []
  "Optika Fisis - Pemantulan dan Pembiasan"
  (let [cs (:count (db/get-data "select count (*) from datagen where kodebutir like 'C3A1FCAA%'" 1))
        x (rand-int cs)]
       (C3A1FCAA-1)))
       ;((resolve (symbol my-ns (str "C3A1FCAA-" x))))))





