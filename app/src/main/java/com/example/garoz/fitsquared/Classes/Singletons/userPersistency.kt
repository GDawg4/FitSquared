package com.example.garoz.fitsquared.Classes.Singletons

import com.example.garoz.fitsquared.Classes.PreRoutine
import com.example.garoz.fitsquared.Classes.User

//@Serializable
object userPersistency {
    var currentUser: User? = null
    var currentRoutine: PreRoutine? = null
}