package com.amiigood.introkotlin903.ejemplo1

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
        enableEdgeToEdge()
        nombre = findViewById(R.id.nombre)
        cantidadCompradores = findViewById(R.id.cantidad)
        siRadio = findViewById(R.id.si)
        noRadio = findViewById(R.id.no)
        cantidadBoletos = findViewById(R.id.cantidadBoletos)
        resultado = findViewById(R.id.boletos)
        button = findViewById(R.id.calcular)

        setContentView(R.layout.activity_cinepolis)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun calcular(view: android.view.View){

    }
}