package com.example.gui_login_registro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        findViewById<RadioButton>(R.id.radioButton).setOnClickListener {
            findViewById<RadioButton>(R.id.radioButton2)
        }

        findViewById<Button>(R.id.cancelar).setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.registrar).setOnClickListener {
            var perN = Persona(findViewById<EditText>(R.id.user).text.toString(), findViewById<EditText>(R.id.editTextTextPassword3).text.toString())
            val intent = Intent(this, Login::class.java)
            newPersonOnList(perN)
            startActivity(intent)
        }
    }
}