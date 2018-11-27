package com.example.garoz.fitsquared.Activities

import android.app.Activity
import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.SeekBar
import android.widget.TextView
import com.example.garoz.fitsquared.Classes.History
import com.example.garoz.fitsquared.Classes.MasterMind
import com.example.garoz.fitsquared.Classes.Singleton.Users
import com.example.garoz.fitsquared.Classes.Singletons.userPersistency
import com.example.garoz.fitsquared.R
import com.example.garoz.fitsquared.Classes.User
import kotlinx.android.synthetic.main.activity_data_input.*
import kotlinx.android.synthetic.main.activity_data_input.view.*
import java.io.IOException
import java.io.OutputStream
import java.io.OutputStreamWriter

class DataInput : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_data_input)

        val email = intent.getStringExtra("email")


        val levelOfExercise = findViewById<SeekBar>(R.id.par1)
        val age = findViewById<EditText>(R.id.ageInput)
        val weight = findViewById<EditText>(R.id.weightInput)
        val height = findViewById<EditText>(R.id.heightInput)
        val button = findViewById<Button>(R.id.dataButton)


        button.setOnClickListener {
            val intent = Intent(this, UserActivity::class.java)
            val ageAsInt = age.getText().toString().toInt()
            val weightAsInt = weight.getText().toString().toDouble()
            val heightAsInt = height.getText().toString().toDouble()
            val levelOfExerciseAsInt = levelOfExercise.getProgress()

            //TODO no olvidar cambiar esto para que acepte los valores externos
            val newUser = User(
                    email,
                    ageAsInt,
                    levelOfExerciseAsInt,
                    weightAsInt,
                    heightAsInt,
                    History()
            )
            userPersistency.currentUser = newUser
            Users.users.add(newUser)

            val newUserAdded = Users.serializeData()
            try {
                val file = OutputStreamWriter (openFileOutput("test1", Activity.MODE_PRIVATE))
                file.write(newUserAdded)
                file.flush()
                file.close()
            }catch (e: IOException){

            }
            startActivity(intent)
        }

    }
}
