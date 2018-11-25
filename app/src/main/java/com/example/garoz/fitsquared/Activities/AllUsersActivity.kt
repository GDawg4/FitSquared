package com.example.garoz.fitsquared.Activities

import android.app.ListActivity
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_all_users.rv
import android.widget.ArrayAdapter
import com.example.garoz.fitsquared.R
import android.widget.ListView
import android.widget.TextView
import android.support.v7.widget.LinearLayoutManager
import android.widget.Adapter
import com.example.garoz.fitsquared.Classes.Singletons.userPersistency
import com.example.garoz.fitsquared.Adapters.UsersAdapter
import com.example.garoz.fitsquared.Classes.Singleton.Users

class AllUsersActivity : AppCompatActivity() {
    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: UsersAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_users)

        linearLayoutManager = LinearLayoutManager(this)
        rv.layoutManager = linearLayoutManager
        adapter = UsersAdapter(Users.users)
        rv.adapter = adapter
        //val nameVariable = findViewById<TextView>(R.id.personTest)

        //nameVariable.text = userPersistency.currentUser?.name
    }
}
