package com.example.garoz.fitsquared.Classes.Exercises.DefaultRoutines

import com.example.garoz.fitsquared.Classes.Exercises.CalfRaises
import com.example.garoz.fitsquared.Classes.Exercises.Crunches
import com.example.garoz.fitsquared.Classes.Exercises.Exercise
import com.example.garoz.fitsquared.Classes.PreRoutine

object preRoutine2:PreRoutine(name = String(), description = String(), listOfExercise = ArrayList()) {
    init {
        preRoutine1.name = "Routine 2"
        preRoutine1.description = "Lol 2"
        preRoutine1.listOfExercise = ArrayList()
        preRoutine1.listOfExercise.add(CalfRaises())
    }
}