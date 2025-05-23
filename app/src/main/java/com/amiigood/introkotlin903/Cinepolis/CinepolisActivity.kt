package com.amiigood.introkotlin903.Cinepolis

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.amiigood.introkotlin903.R

class CinepolisActivity : AppCompatActivity() {
    private lateinit var nombre: EditText
    private lateinit var cantidadCompradores: EditText
    private lateinit var siRadio: RadioButton
    private lateinit var noRadio: RadioButton
    private lateinit var cantidadBoletos: EditText
    private lateinit var resultado: TextView
    private lateinit var button: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_cinepolis) // <-- PRIMERO

        enableEdgeToEdge()

        nombre = findViewById(R.id.nombre)
        cantidadCompradores = findViewById(R.id.cantidad)
        siRadio = findViewById(R.id.si)
        noRadio = findViewById(R.id.no)
        cantidadBoletos = findViewById(R.id.cantidadBoletos)
        resultado = findViewById(R.id.boletos)
        button = findViewById(R.id.calcular)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }


    fun calcular(view: View) {
        val nombreCliente = nombre.text.toString()
        val compradores = cantidadCompradores.text.toString().toIntOrNull()
        val cantidad = cantidadBoletos.text.toString().toIntOrNull()

        if(nombreCliente == ""){
            resultado.text = "Debe ingresar un nombre"
            return
        }

        if (compradores == null || compradores < 1) {
            resultado.text = "Debe ingresar al menos 1 comprador."
            return
        }

        if (cantidad == null || cantidad < 1) {
            resultado.text = "Debe ingresar al menos 1 boleto."
            return
        }

        val maxBoletos = compradores * 7

        if (cantidad > maxBoletos) {
            resultado.text = "Maximo permitido: $maxBoletos boletos para $compradores comprador(es)"
            return
        }

        val precioBoleto = 12000
        var total = cantidad * precioBoleto

        total -= when {
            cantidad > 5 -> (total * 0.15).toInt()
            cantidad in 3..5 -> (total * 0.10).toInt()
            else -> 0
        }

        if (siRadio.isChecked) {
            total -= (total * 0.10).toInt()
        }

        resultado.text = "$nombreCliente, su total a pagar: $${total}"
    }


}