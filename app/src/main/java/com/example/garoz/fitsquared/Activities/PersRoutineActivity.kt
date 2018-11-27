package com.example.garoz.fitsquared.Activities

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.pers_routine.rv
import com.example.garoz.fitsquared.Adapters.PersRoutineAdapter
import com.example.garoz.fitsquared.Adapters.UsersAdapter
import com.example.garoz.fitsquared.Classes.Exercises.DefaultRoutines.defRoutine1
import com.example.garoz.fitsquared.Classes.Singleton.Users
import com.example.garoz.fitsquared.R
import android.widget.TextView
import com.example.garoz.fitsquared.Classes.Singletons.userPersistency

class PersRoutineActivity:AppCompatActivity() {
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: PersRoutineAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pers_routine)

        linearLayoutManager = LinearLayoutManager(this)
        rv.layoutManager = linearLayoutManager
        adapter = PersRoutineAdapter(defRoutine1.routines)
        rv.adapter = adapter


    }
}