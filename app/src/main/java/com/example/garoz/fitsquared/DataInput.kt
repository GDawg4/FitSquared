package com.example.garoz.fitsquared

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar

class DataInput : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_input)

        val inputDataButton = findViewById<Button>(R.id.dataButton)
        val exercise = findViewById<SeekBar>(R.id.par1)
        val weight = findViewById<EditText>(R.id.weightInput)
        val age = findViewById<EditText>(R.id.exerciseInput)

        inputDataButton.setOnClickListener {
            val exercise = exercise.toString().toInt()
            val weight = weight.toString().toFloat()
            val age = exercise.toString().toInt()

            val newUser = User()
            val intent = Intent(this, User::class.java)
            startActivity(intent)
        }
    }
}
