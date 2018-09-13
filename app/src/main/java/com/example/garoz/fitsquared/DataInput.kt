package com.example.garoz.fitsquared

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView

class DataInput : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_input)

        val inputDataButton = findViewById<Button>(R.id.dataButton)
        val exercise = findViewById<SeekBar>(R.id.par1)
        val weight = findViewById<EditText>(R.id.weightInput)
        val age = findViewById<EditText>(R.id.ageInput)
        val currentValue = findViewById<TextView>(R.id.currentValue)

        inputDataButton.setOnClickListener {
            val exercise = exercise.toString()
            val weight = weight.toString().toFloat()
            val age = age.toString().toInt()

            currentValue.text = exercise

            val newUser = User()
            val intent = Intent(this, UserActivity::class.java)
            startActivity(intent)
        }
    }
}
