package com.example.gui_login_registro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class Login : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        if (checkPersonList() != null)
            findViewById<TextView>(R.id.textPruebas).text = checkPersonList()

        findViewById<Button>(R.id.registro).setOnClickListener {
            val intent = Intent(this, Registro::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.login).setOnClickListener {

            for (i in listaPersona)
                if (findViewById<EditText>(R.id.editTextTextPassword).text.toString() == i.pw && findViewById<EditText>(
                        R.id.user2
                    ).text.toString() == i.nombre
                ) {
                    val intent = Intent(this, Bienvenida::class.java)
                    intent.putExtra("nombreUsuario", findViewById<EditText>(R.id.user2).text.toString())
                    startActivity (intent)
                }
            else if (findViewById<EditText>(R.id.user2).text.toString() == findViewById<EditText>(R.id.editTextTextPassword).text.toString() && findViewById<EditText>(
                    R.id.user2
                ).text.toString() != ""
            ) {
                val intent = Intent(this, Bienvenida::class.java)
                intent.putExtra("nombreUsuario", findViewById<EditText>(R.id.user2).text.toString())
                startActivity(intent)
            } else
                Toast.makeText(this, "El usuario y la contraseña no coinciden", Toast.LENGTH_SHORT)
                    .show()
        }
    }
}