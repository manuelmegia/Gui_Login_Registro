package com.example.gui_login_registro

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Bienvenida : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bienvenida)

        var biUsuario = intent.getStringExtra("nombreUsuario")
        findViewById<TextView>(R.id.textView9).text = "Bienvenido " + biUsuario
    }
}