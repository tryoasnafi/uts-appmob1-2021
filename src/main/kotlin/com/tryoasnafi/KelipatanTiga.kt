package com.tryoasnafi

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    print("Nilai Awal \t: ")
    val nilaiAwal = input.nextInt()
    print("Nilai Akhir : ")
    val nilaiAkhir = input.nextInt()

    print("Kelipatan 3 :")
    for (num in nilaiAwal..nilaiAkhir) {
        if (num % 3 == 0) print(" $num")
    }
}