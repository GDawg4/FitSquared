package com.example.garoz.fitsquared.Classes

class Achievement{
    var isEarned: Boolean = false
    var name: String = ""
    var description: String = ""
    override fun toString(): String {
        if(isEarned){
            return "El logro $name fue desbloqueado. Felicitaciones! "
        }
        return """El logro $name no ha sido desbloqueado.
            |Necesitas hacer $description para lograrlo
            |Vamos!""".trimMargin()
    }


}