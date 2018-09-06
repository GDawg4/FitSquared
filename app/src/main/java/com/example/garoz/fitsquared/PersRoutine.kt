package com.example.garoz.fitsquared

class PersRoutine{
    var exerciseList: ArrayList<Exercise> = ArrayList()

    override fun toString(): String {
        var finalString = ""
        var counter = 0
        exerciseList.forEach {
            finalString += counter.toString()
            finalString += it.name
            counter ++
        }
        return "$finalString"
    }


}