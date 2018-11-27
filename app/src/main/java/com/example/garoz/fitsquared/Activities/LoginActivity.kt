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
import com.example.garoz.fitsquared.Classes.History
import com.example.garoz.fitsquared.R
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.firestore.CollectionReference
import com.google.firebase.firestore.DocumentReference
import com.google.firebase.firestore.FirebaseFirestore

class MainActivity : AppCompatActivity() {

    var db = FirebaseFirestore.getInstance()

    override fun onCreate(savedInstanceState: Bundle?) {
        var newUserL = User(
                "Rodrigo",
                12,
                5,
                180.0,
                1.75,
                History()
        )

        var dbNew = db.collection("users")


        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val newUserButton = findViewById<Button>(R.id.newUserButton)
        val oldUserButton = findViewById<Button>(R.id.oldUserButton)
        val text = findViewById<TextView>(R.id.textView)

        val newUser = findViewById<EditText>(R.id.userIn)


        dbNew.add(newUserL).addOnSuccessListener {
            text.text = "Yay"
        }.addOnFailureListener {
            text.text = "Nay"
        }

        Users.users = ArrayList()

        val test = false

        oldUserButton.setOnClickListener {
            val intent = Intent(this, AllUsersActivity::class.java)
            startActivity(intent)
        }

        newUserButton.setOnClickListener {
            val newMail = newUser.getText().toString()
            val intent = Intent(this, DataInput::class.java)
            intent.putExtra("email",newMail)
            startActivity(intent)
        }
    }
}
