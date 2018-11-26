package com.example.garoz.fitsquared.Activities

import android.support.v7.app.AppCompatActivity
import android.support.v4.view.ViewPager
import android.os.Bundle
import android.widget.Button
import com.example.garoz.fitsquared.Adapters.RoutinesAdapter
import com.example.garoz.fitsquared.R
import android.content.Intent

class Main2Activity : AppCompatActivity() {
    //para una manera diferente de mostrar las rutinas
    //private lateinit var viewPager: ViewPager
    //private lateinit var pagerAdapter: RoutinesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_routines)

        val persRoutineButton = findViewById<Button>(R.id.persR)
        val preRoutineButton = findViewById<Button>(R.id.preR)
        //viewPager = findViewById(R.id.viewPager)

        persRoutineButton.setOnClickListener{

        }

        preRoutineButton.setOnClickListener{
            val intent = Intent(this, PersRoutineActivity::class.java)
            startActivity(intent)
        }
    }
}
