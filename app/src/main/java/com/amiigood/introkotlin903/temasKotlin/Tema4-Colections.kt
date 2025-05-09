package com.amiigood.introkotlin903.temasKotlin

fun main() {
    /*
    List => val
    MutableList => var
    Set => val
    MutableSet => var
    Map => val
    MutableMap => var
     */

    println("Listas")
    val lista = listOf<String>("Lunes","Martes","Miercoles")
    println(lista)
    println(lista.size)
    println(lista.count())
    println(lista.indexOf("Miercoles"))
    println(lista.first())
    println(lista.last())
    println(lista.get(0))
    println(lista[1])

    println('\n')
    println("MutableList")
    var listaMutable = mutableListOf<String>("Lunes","Martes","Miercoles")
    println(listaMutable)
    listaMutable.add("Jueves")
    println(listaMutable)
    listaMutable.remove("Lunes")
    println(listaMutable)

    println('\n')
    println("Set")
    val set = setOf<String>("Lunes","Martes","Miercoles")
    println(set)

    println("\n")
    println("MutableSet")
    var setMutable= mutableSetOf<String>("Lunes","Martes","Miercoles")
    println(setMutable)
    setMutable.add("Jueves")
    println(setMutable)
    setMutable.remove("Lunes")
}