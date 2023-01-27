package com.example.gui_login_registro

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.Button
import android.widget.CheckBox
import android.widget.EditText
import android.widget.RadioButton
import android.widget.Spinner
import android.widget.TextView

class Registro : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_registro)

        var sexo = ""
        var aficion = ""
        var cv = ""

        findViewById<Button>(R.id.registrar).isEnabled = false

        findViewById<EditText>(R.id.user).addTextChangedListener (object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                findViewById<Button>(R.id.registrar).isEnabled = findViewById<EditText>(R.id.user).text.toString() != "" && findViewById<EditText>(R.id.editTextTextPassword3).text.toString() != ""
            }
        })

        findViewById<EditText>(R.id.editTextTextPassword3).addTextChangedListener (object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                findViewById<Button>(R.id.registrar).isEnabled = findViewById<EditText>(R.id.user).text.toString() != "" && findViewById<EditText>(R.id.editTextTextPassword3).text.toString() != ""
            }
        })

        findViewById<EditText>(R.id.editTextTextPersonName).addTextChangedListener (object: TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun afterTextChanged(p0: Editable?) {}

            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {
                cv = findViewById<EditText>(R.id.editTextTextPersonName).text.toString()
            }
        })

        findViewById<RadioButton>(R.id.radioButton).setOnClickListener {
            findViewById<RadioButton>(R.id.radioButton2).isChecked = false
            sexo = "H"
        }

        findViewById<RadioButton>(R.id.radioButton2).setOnClickListener {
            findViewById<RadioButton>(R.id.radioButton).isChecked = false
            sexo = "M"
        }

        findViewById<Button>(R.id.cancelar).setOnClickListener {
            val intent = Intent(this, Login::class.java)
            startActivity(intent)
        }

        findViewById<Button>(R.id.registrar).setOnClickListener {
            var perN = Persona(findViewById<EditText>(R.id.user).text.toString(), findViewById<EditText>(R.id.editTextTextPassword3).text.toString())
            if (findViewById<CheckBox>(R.id.checkBox).isActivated)
                aficion += "tenis"
            if (findViewById<CheckBox>(R.id.checkBox2).isActivated)
                aficion += "futbol"
            perN.sexo = sexo
            perN.nacionalidad = findViewById<Spinner>(R.id.spinner3).selectedItem.toString()
            perN.aficion = aficion
            perN.cv = cv
            val intent = Intent(this, Login::class.java)
            newPersonOnList(perN)
            startActivity(intent)
        }
    }
}