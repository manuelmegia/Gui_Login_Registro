package com.example.gui_login_registro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        findViewById<Button>(R.id.registro).setOnClickListener { cambioPagina() }

    }

    private fun cambioPagina() {
        val intent = Intent(this, Registro::class.java)
        startActivity(intent)
    }
}