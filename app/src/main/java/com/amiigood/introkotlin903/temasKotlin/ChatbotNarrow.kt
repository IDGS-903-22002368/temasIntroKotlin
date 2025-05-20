package com.amiigood.introkotlin903.temasKotlin

fun main() {
    val chatbot = NarrowChatbot()

    println("Asistente Virtual: ¡Hola! ¿En que puedo ayudarte hoy?")
    while (true) {
        print("Tu: ")
        val userInput = readLine()?.lowercase()?.trim() ?: break

        if (userInput == "salir") {
            println("Asistente Virtual: ¡Gracias por tu visita!")
            break
        }

        val response = chatbot.respondToUser(userInput)
        println("Asistente Virtual: $response")
    }
}

class NarrowChatbot {

    fun respondToUser(message: String): String {
        val intent = detectIntent(message)

        return when (intent) {
            Intent.GREETING -> "¡Hola! ¿Como puedo ayudarte?"
            Intent.PRICING -> "Nuestros precios varian según el producto. ¿Qeé deseas consultar?"
            Intent.SCHEDULE -> "Nuestro horario es de lunes a viernes, de 9 AM a 6 PM."
            Intent.FAREWELL -> "¡Hasta luego! Que tengas un buen dia."
            Intent.UNKNOWN -> "Lo siento, no entendi tu mensaje. ¿Puedes reformularlo?"
        }
    }

    private fun detectIntent(message: String): Intent {
        return when {
            message.contains("hola") || message.contains("buenos dias") || message.contains("buenas") -> Intent.GREETING
            message.contains("precio") || message.contains("cuánto cuesta") || message.contains("vale") -> Intent.PRICING
            message.contains("horario") || message.contains("hora") || message.contains("abren") -> Intent.SCHEDULE
            message.contains("adios") || message.contains("hasta luego") || message.contains("gracias") -> Intent.FAREWELL
            else -> Intent.UNKNOWN
        }
    }

    enum class Intent {
        GREETING, PRICING, SCHEDULE, FAREWELL, UNKNOWN
    }
}
