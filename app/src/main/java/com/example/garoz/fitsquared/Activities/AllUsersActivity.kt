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
import android.util.Log
import android.widget.Adapter
import com.example.garoz.fitsquared.Classes.Singletons.userPersistency
import com.example.garoz.fitsquared.Adapters.UsersAdapter
import com.example.garoz.fitsquared.Classes.Singleton.Users
import com.google.android.gms.tasks.OnCompleteListener
import com.google.android.gms.tasks.Tasks
import com.google.firebase.database.FirebaseDatabase
import com.google.firebase.database.core.Tag
import com.google.firebase.firestore.DocumentSnapshot
import com.google.firebase.firestore.FirebaseFirestore
import com.google.firebase.firestore.QuerySnapshot
import com.google.firebase.firestore.auth.User
import android.content.ContentValues.TAG
import com.google.firebase.firestore.QueryDocumentSnapshot
import com.google.android.gms.tasks.Task
import android.support.annotation.NonNull
import com.example.garoz.fitsquared.Classes.History


class AllUsersActivity : AppCompatActivity() {

    var guardados = FirebaseFirestore.getInstance()

    private lateinit var linearLayoutManager: LinearLayoutManager
    private lateinit var adapter: UsersAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        val users = ArrayList<com.example.garoz.fitsquared.Classes.User?>()
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_all_users)

        val text = findViewById<TextView>(R.id.titulo)

        guardados.collection("users")
                .get()
                .addOnCompleteListener(OnCompleteListener<QuerySnapshot> { task ->
                    if (task.isSuccessful) {
                        for (document in task.result!!) {
                            Log.d(TAG, document.id + " => " + document.data)
                            var prueba2 = document.toObject(com.example.garoz.fitsquared.Classes.User::class.java)
                            users.add(prueba2)
                        }
                    } else {
                        Log.d(TAG, "Error getting documents: ", task.exception)
                        text.text = "Not"
                    }
                })

        val prueba = ArrayList<com.example.garoz.fitsquared.Classes.User?>()
        prueba.add(com.example.garoz.fitsquared.Classes.User(
                "Jaime",
                2,
                3,
                5.0,
                6.0,
                History()
        ))

        linearLayoutManager = LinearLayoutManager(this)
        rv.layoutManager = linearLayoutManager
        adapter = UsersAdapter(users)
        rv.adapter = adapter
        //val nameVariable = findViewById<TextView>(R.id.personTest)

        //nameVariable.text = userPersistency.currentUser?.name
    }
}
