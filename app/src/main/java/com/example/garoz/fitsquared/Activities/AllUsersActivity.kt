package com.example.garoz.fitsquared.Activities

import android.app.ListActivity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.RecyclerView
import android.widget.ArrayAdapter
import com.example.garoz.fitsquared.R
import android.widget.ListView
import android.widget.TextView
import android.support.v7.widget.LinearLayoutManager
import com.example.garoz.fitsquared.Classes.Singletons.userPersistency

class AllUsersActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_users)
        val recyclerView = findViewById<RecyclerView>(R.id.rv)
        recyclerView.setHasFixedSize(true)
        list.layoutManager = LinearLayoutManager(this)

        val nameVariable = findViewById<TextView>(R.id.personTest)

        //nameVariable.text = userPersistency.currentUser?.name
    }
}
