package com.example.garoz.fitsquared

class MasterMind{
    val selectedUser: User = User()
    //objeto que creará cada lista personalizada

    fun createNewRoutine():PersRoutine{
        val createdRoutine = PersRoutine()
        return createdRoutine
    }
}