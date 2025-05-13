package com.amiigood.introkotlin903.temasKotlin

fun saludo(){
    println("Hola")
}

fun sum(x: Int, y: Int):Int{
    return x+y
}

/*
funcion en linea
 */
fun sum2(x:Int, y: Int) = x+y

fun main() {
    saludo()
    println(sum(1,2))
    println(sum2(1,2))
}