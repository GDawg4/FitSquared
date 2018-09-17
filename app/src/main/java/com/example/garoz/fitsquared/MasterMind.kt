package com.example.garoz.fitsquared

class MasterMind(
        var selectedUser: User
){
    fun createNewRoutine():PersRoutine{
        val createdRoutine = PersRoutine()
        return createdRoutine
    }
}