package com.example.garoz.fitsquared

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class Main2Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val persButton = findViewById<Button>(R.id.persButton)

        persButton.setOnClickListener{

        }
    }
}
