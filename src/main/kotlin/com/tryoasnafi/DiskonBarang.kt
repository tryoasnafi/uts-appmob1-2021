package com.tryoasnafi

import java.util.Scanner

fun main() {
    val input = Scanner(System.`in`)

    print("Jenis = ")
    val jenisBarang = input.next().toUpperCase()
    print("Kode = ")
    val kodeBarang = input.next()
    print("Harga = ")
    val hargaBarang = input.nextInt()

    var diskon = 0.0

    if (jenisBarang == "A") {
        diskon = 0.2
    } else if (jenisBarang == "B") {
        diskon = 0.25
    } else if (jenisBarang == "C") {
        diskon = 0.3
    }

    val hargaBarangSetelahDiskon= hargaBarang * (1 - diskon)

    println("""
        Jenis barang $jenisBarang mendapat diskon = ${(diskon * 100).toInt()}%.
        Harga setelah diskon didiskon = ${hargaBarangSetelahDiskon.toInt()}
    """.trimIndent())

}