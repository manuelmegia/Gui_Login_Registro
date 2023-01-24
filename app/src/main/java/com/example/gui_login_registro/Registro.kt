package com.example.gui_login_registro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)
        findViewById<Button>(R.id.cancelar).setOnClickListener { cambioPagina() }
        findViewById<Button>(R.id.registrar).setOnClickListener { cambioPagina2() }
    }

    private fun cambioPagina() {
        val intent = Intent(this, Login::class.java)
        startActivity(intent)
    }
    private fun cambioPagina2() {
        val intent = Intent(this, Bienvenida::class.java)
        startActivity(intent)
    }
}