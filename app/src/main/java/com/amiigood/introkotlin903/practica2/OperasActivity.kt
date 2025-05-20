package com.amiigood.introkotlin903.practica2

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.amiigood.introkotlin903.R

class OperasActivity : AppCompatActivity() {
    private lateinit var edt1: EditText
    private lateinit var edt2: EditText
    private lateinit var tv1: TextView
    private lateinit var btn1: Button
    private lateinit var sumarRadio: RadioButton
    private lateinit var restarRadio: RadioButton
    private lateinit var multiplicarRadio: RadioButton
    private lateinit var dividirRadio: RadioButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_operas)
        edt1 = findViewById(R.id.edt1)
        edt2 = findViewById(R.id.edt2)
        tv1 = findViewById(R.id.tv1)
        btn1 = findViewById(R.id.btn1)
        sumarRadio = findViewById(R.id.sumar)
        restarRadio = findViewById(R.id.restar)
        multiplicarRadio = findViewById(R.id.multiplicar)
        dividirRadio = findViewById(R.id.dividir)

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    fun calcular(view: android.view.View){
        val num1 = edt1.text.toString().toDouble()
        val num2 = edt2.text.toString().toDouble()
        var resultado = 0.0
        var operacion = ""
        if(sumarRadio.isChecked){
            operacion = "suma"
            resultado = num1 + num2
        }else if (restarRadio.isChecked){
            operacion = "resta"
            resultado = num1 - num2
        }else if(multiplicarRadio.isChecked){
            operacion = "multiplicacion"
            resultado = num1 * num2
        }else if(dividirRadio.isChecked){
            operacion = "division"
            resultado = num1 / num2
        }
        tv1.text = "Resultado $resultado"
    }
}