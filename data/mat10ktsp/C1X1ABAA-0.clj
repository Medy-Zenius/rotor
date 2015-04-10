(let [data (read-string (slurp "data/mat10ktsp/C1X1ABAA-0.txt"))
        datum (nth data (rand-int (dec (count data))))
        a (nth datum 0)
        b (nth datum 1)
        angka (nth datum 2)
        jwb (nth datum 3)
        bobot (last data)
       ]
        {:soal (str "$" a "^{" b "}$")
         :pilihan (fnc/create-option1 angka jwb)
         :jawaban jwb
         :score bobot
         })
