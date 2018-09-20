package com.example.garoz.fitsquared.Classes

import android.app.Application

class MyApp: Application() {
    companion object {
        lateinit var permUser: User
    }

    /*fun ss(newUser:User){
        permUser = newUser
    }
    */
    override fun onCreate() {
        super.onCreate()
    }
}