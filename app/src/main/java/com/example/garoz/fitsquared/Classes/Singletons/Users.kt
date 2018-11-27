package com.example.garoz.fitsquared.Classes.Singleton
import java.io.Serializable
import com.google.gson.*
import com.example.garoz.fitsquared.Classes.User

object Users:Serializable {
    var newG = Gson()
    var users: ArrayList<User?> = ArrayList()
    var test = "Hola"

    fun serializeData():String{
        var dataAsJson = newG.toJson(users)
        return dataAsJson
    }
}