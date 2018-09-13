package com.example.garoz.fitsquared

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newUserButton = findViewById<Button>(R.id.newUserButton)
        val newUser = findViewById<EditText>(R.id.userIn)
        val newPassword = findViewById<EditText>(R.id.passwordIn)

        newUserButton.setOnClickListener {
            val newName = newUser.text
            val newPassword = newPassword.text
            val intent = Intent(this, DataInput::class.java)
            startActivity(intent)
        }
    }
}
