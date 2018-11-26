package com.example.garoz.fitsquared.Classes

import com.example.garoz.fitsquared.Classes.Exercises.Exercise

abstract class PreRoutine(name:String, description:String){
    val name = name
    val description = description
    var listOfExercise: ArrayList<Exercise> = ArrayList()
}