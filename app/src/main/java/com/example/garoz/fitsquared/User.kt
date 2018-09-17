package com.example.garoz.fitsquared

class User(
        var email: String,
        var password:String,
        var age: Int,
        var levelOfExercise: Int,
        var name: String,
        var weight: Float,
        val history:History = History()
) {

}