package com.example.garoz.fitsquared.Activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import com.example.garoz.fitsquared.Adapters.ExercisesAdapter
import com.example.garoz.fitsquared.Adapters.UsersAdapter
import com.example.garoz.fitsquared.Classes.Exercises.DefaultRoutines.defRoutine1
import com.example.garoz.fitsquared.Classes.Exercises.DefaultRoutines.preRoutine1
import com.example.garoz.fitsquared.Classes.Singleton.Users
import com.example.garoz.fitsquared.R
import kotlinx.android.synthetic.main.activity_all_routines.*

class RoutinesActivity : AppCompatActivity() {
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: ExercisesAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_routines)

        linearLayoutManager = LinearLayoutManager(this)
        rv.layoutManager = linearLayoutManager
        adapter = ExercisesAdapter(preRoutine1.listOfExercise)
        rv.adapter = adapter
    }
}
