package com.example.garoz.fitsquared.Classes

import com.example.garoz.fitsquared.Classes.Exercises.Exercise

class MasterMind(
        var selectedUser: User = MyApp.permUser
){
    fun createNewRoutine(): PersRoutine {
        val createdRoutine = PersRoutine()
        return createdRoutine
    }
}