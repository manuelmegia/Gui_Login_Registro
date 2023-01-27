package com.example.gui_login_registro

var listaPersona = arrayListOf<Persona>()

fun newPersonOnList(nuevaPersona: Persona){
    listaPersona.add(nuevaPersona)
}

fun checkPersonList(): String{
    var todoTexto = ""
    for (i in listaPersona)
        todoTexto +=  i.toString() + "\n"

    return todoTexto
}