package com.amiigood.introkotlin903.temasKotlin

fun main() {
    for(num in 1..5){
        println(num)
    }

    val frutas = listOf<String>("Manzana","Pera","Uva")

    for (fruta in frutas) {
        println(fruta)
    }

    val n = 10
    var d = 0

    while (d<n){
        println(d)
        d++
    }
}