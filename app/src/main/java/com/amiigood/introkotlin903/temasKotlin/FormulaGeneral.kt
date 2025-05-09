package com.amiigood.introkotlin903.temasKotlin

fun main() {
    var continuar = true

    do {
        println("Ingrese el valor de a")
        val a = readln().toDouble()

        if (a == 0.0) {
            println("El valor de a no puede ser 0")
            continue
        }

        println("Ingrese el valor de b")
        val b = readln().toDouble()
        println("Ingrese el valor de c")
        val c = readln().toDouble()

        val discriminante = b * b - 4 * a * c

        when {
            discriminante > 0 -> {
                val x1 = (-b - Math.sqrt(discriminante)) / (2 * a)
                val x2 = (-b + Math.sqrt(discriminante)) / (2 * a)
                println("Las x son $x1 y $x2")
                continuar = false
            }
            else -> {
                println("No es posible calcular las x")
            }
        }

    } while (continuar)
}
