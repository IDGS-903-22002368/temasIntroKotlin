package com.amiigood.introkotlin903.temasKotlin

fun detectarEmocion(texto: String): String {
    val textoMinusculas = texto.lowercase()

    val emociones = mapOf(
        "alegria" to listOf("feliz", "contento", "alegre", "encantado", "sonrisa"),
        "tristeza" to listOf("triste", "deprimido", "llorar", "melancolía", "pena"),
        "enojo" to listOf("enfadado", "molesto", "irritado", "furioso", "rabia"),
        "miedo" to listOf("asustado", "temeroso", "pánico", "terror", "miedo")
    )

    val resultados = mutableMapOf<String, Int>()

    for ((emocion, palabras) in emociones) {
        var contador = 0
        for (palabra in palabras) {
            if (textoMinusculas.contains(palabra)) {
                contador++
            }
        }
        resultados[emocion] = contador
    }

    val emocionDominante = resultados.maxByOrNull { it.value }

    if (emocionDominante == null || emocionDominante.value == 0) {
        return "neutral"
    }

    return emocionDominante.key
}

fun main() {
    val frases = listOf(
        "Me siento muy feliz",
        "Estoy muy molesto",
        "Tengo miedo de fallar",
        "Me siento triste porque no esta",
        "El clima esta agradable hoy"
    )

    for (frase in frases) {
        val emocion = detectarEmocion(frase)
        println("Frase: '$frase'")
        println("Emocion detectada: $emocion")
    }
}