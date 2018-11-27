package com.example.garoz.fitsquared.Classes.Exercises.DefaultRoutines

import com.example.garoz.fitsquared.Classes.Exercises.CalfRaises
import com.example.garoz.fitsquared.Classes.Exercises.Crunches
import com.example.garoz.fitsquared.Classes.Exercises.Exercise
import com.example.garoz.fitsquared.Classes.PersRoutine
import com.example.garoz.fitsquared.Classes.PreRoutine

object preRoutine1:PreRoutine(name = String(), description = String(), listOfExercise = ArrayList()) {
    init {
        name = "Routine 1"
        description = "Lol"
        listOfExercise = ArrayList()
        listOfExercise.add(Crunches())
    }

}