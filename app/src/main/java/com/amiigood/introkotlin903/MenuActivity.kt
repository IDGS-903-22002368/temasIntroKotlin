package com.amiigood.introkotlin903

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.amiigood.introkotlin903.Cinepolis.CinepolisActivity
import com.amiigood.introkotlin903.practica1.saludoActivity
import com.amiigood.introkotlin903.practica2.OperasActivity
import com.amiigood.introkotlin903.practica3.Ejemplo3Activity
import com.amiigood.introkotlin903.practica4.ArchivosActivity

class MenuActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_menu)
        val btnSaludo = findViewById<Button>(R.id.btn1)
        val btnOperas = findViewById<Button>(R.id.btn2)
        val btnCinepolis = findViewById<Button>(R.id.btn3)
        val btnEjemplo3 = findViewById<Button>(R.id.btn4)
        val btnArchivos = findViewById<Button>(R.id.btn5)

        btnSaludo.setOnClickListener {navigateToSaludo()}
        btnOperas.setOnClickListener { navigateToOperas() }
        btnCinepolis.setOnClickListener { navigateToCinepolis() }
        btnEjemplo3.setOnClickListener { navigateToEjemplo3() }
        btnArchivos.setOnClickListener { navigateToArchivos() }

        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }
    }

    private fun navigateToSaludo() {
        val intent = Intent(this, saludoActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToOperas(){
        val intent = Intent(this, OperasActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToCinepolis(){
        val intent = Intent(this, CinepolisActivity::class.java)
        startActivity(intent)
    }

    private fun navigateToEjemplo3(){
        val intent = Intent(this, Ejemplo3Activity::class.java)
        startActivity(intent)
    }

    private fun navigateToArchivos(){
        val intent = Intent(this, ArchivosActivity::class.java)
        startActivity(intent)
    }

}