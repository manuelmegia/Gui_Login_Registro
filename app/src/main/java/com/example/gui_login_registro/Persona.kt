package com.example.gui_login_registro

class Persona (var nombre: String, var pw: String): java.io.Serializable{
    var sexo = ""
    var nacionalidad = ""
    var aficion = ""
    var cv = ""

    override fun toString(): String {
        return "Persona(nombre= '$nombre', contraseña= '$pw' sexo='$sexo', nacionalidad='$nacionalidad', aficion='$aficion', cv='$cv')"
    }
}