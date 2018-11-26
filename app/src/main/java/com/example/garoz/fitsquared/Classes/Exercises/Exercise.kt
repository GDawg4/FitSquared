package com.example.garoz.fitsquared.Classes.Exercises

import kotlin.reflect.KClass

abstract class Exercise(
        var name: String,
        var areaWorked:String,
        //in seconds
        var duration: Int,
        var numberOfReps: Int,
        var extraWeight: Boolean,
        var description: String = ""
        //var example: URL ya sea a YouTube o local
        //para mostrar cómo realizar los ejercicios
){
    fun getAllExercises():Collection<KClass<*>>{
        return Exercise::class.nestedClasses
    }
}