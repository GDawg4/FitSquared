package com.example.garoz.fitsquared.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.example.garoz.fitsquared.Classes.MyApp
import com.example.garoz.fitsquared.Classes.Singletons.userPersistency
import com.example.garoz.fitsquared.R

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        val backButton = findViewById<Button>(R.id.backButton)
        /*
        val name = findViewById<TextView>(R.id.name)
        val data = findViewById<TextView>(R.id.data)
        */


        //name.text = MyApp.permUser.name
        //data.text = MyApp.permUser.age.toString()

        backButton.setOnClickListener{
            //val intent = Intent(this, Main2Activity::class.java)
            //println(userPersistency.currentUser?.name)
        }
    }
}
