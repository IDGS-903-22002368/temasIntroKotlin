package com.amiigood.introkotlin903.temasKotlin

fun main() {
    var opcion = 0
    do {
        println("Ingrese una opcion")
        println("1. Suma")
        println("2. Resta")
        println("3. Multiplicacion")
        println("4. Division")
        println("5. Salir")
        opcion = readln().toInt()
        if (opcion != 5){
            println("Ingrese el primer numero")
            val numero1 = readln().toDouble()
            println("Ingrese el segundo numero")
            val numero2 = readln().toDouble()
            if (opcion == 1){
                val suma = numero1 + numero2
                println("La suma de ambos numeros es $suma")
            }else if (opcion == 2){
                val resta = numero1 - numero2
                println("La resta de ambos numeros es $resta")
            }else if (opcion == 3){
                val multiplicacion = numero1 * numero2
                println("La multiplicacion de ambos numeros es $multiplicacion")
            }else if (opcion == 4){
                val division = numero1 / numero2
                println("La division de ambos numeros es $division")
            }
        }
    }while(opcion!= 5)
}