package com.example.garoz.fitsquared.Activities

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import com.example.garoz.fitsquared.Classes.Singleton.Users
import com.example.garoz.fitsquared.Classes.Singletons.userPersistency
import com.example.garoz.fitsquared.Classes.User
import com.example.garoz.fitsquared.R

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newUserButton = findViewById<Button>(R.id.newUserButton)
        val oldUserButton = findViewById<Button>(R.id.oldUserButton)
        val newUser = findViewById<EditText>(R.id.userIn)
        val newPassword = findViewById<EditText>(R.id.passwordIn)

        Users.users = ArrayList()

        val test = false

        oldUserButton.setOnClickListener {
            val intent = Intent(this, AllUsersActivity::class.java)
        }

        newUserButton.setOnClickListener {
            val newMail = newUser.text
            val newPassword = newPassword.text
            //TODO serialize and store everything
            val intent = Intent(this, DataInput::class.java)
            intent.putExtra("email",newMail)
            intent.putExtra("password",newPassword)
            startActivity(intent)
        }
    }
}
