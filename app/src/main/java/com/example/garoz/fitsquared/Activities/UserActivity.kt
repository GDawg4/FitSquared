package com.example.garoz.fitsquared.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.garoz.fitsquared.Classes.MyApp
import com.example.garoz.fitsquared.Classes.Singleton.Users
import com.example.garoz.fitsquared.Classes.Singletons.userPersistency
import com.example.garoz.fitsquared.R
import kotlinx.android.synthetic.main.activity_user.view.*

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val backButton = findViewById<Button>(R.id.backButton)
        val routineBotton = findViewById<Button>(R.id.rButton)
        var nameO = findViewById<TextView>(R.id.name)
        var lvl = findViewById<TextView>(R.id.name)

        nameO.text = userPersistency.currentUser?.name
        lvl.text = userPersistency.currentUser?.levelOfExercise

        routineBotton.setOnClickListener{
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }

        backButton.setOnClickListener{
            val intent = Intent(this, AllUsersActivity::class.java)
            startActivity(intent)
        }
    }
}
