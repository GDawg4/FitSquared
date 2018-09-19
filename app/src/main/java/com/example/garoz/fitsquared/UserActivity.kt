package com.example.garoz.fitsquared

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class UserActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user)

        //val user = MasterMind.getInstance()
        val backButton = findViewById<Button>(R.id.backButton)

        backButton.setOnClickListener{
            val intent = Intent(this, Main2Activity::class.java)
        }
    }
}
