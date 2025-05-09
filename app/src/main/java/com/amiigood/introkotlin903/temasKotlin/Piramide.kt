package com.amiigood.introkotlin903.temasKotlin
/*
   practica piramide = imprimir una piramide de * segun el numero dado por el usuario
   cuando se captura un 0 terminar el programa utilizando puro do-while
*/
fun main() {
    do {
        println("Ingrese un numero:")
        var opcion = readln().toInt()
        if (opcion == 0){
            println()
            break
        }
        var i = 1
        do {
            var j = 1
            do {
                print("*")
                j++
            } while (j <= i)
            println()
            i++
        } while (i <= opcion)
    } while (opcion != 0)
}
