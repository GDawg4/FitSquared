package com.example.garoz.fitsquared.Adapters

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.example.garoz.fitsquared.Activities.RoutinesActivity
import com.example.garoz.fitsquared.Activities.UserActivity
import com.example.garoz.fitsquared.Classes.Exercises.Exercise
import com.example.garoz.fitsquared.Classes.PersRoutine
import com.example.garoz.fitsquared.Classes.PreRoutine
import com.example.garoz.fitsquared.Classes.Singletons.userPersistency
import com.example.garoz.fitsquared.Classes.User
import com.example.garoz.fitsquared.R
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*
import kotlinx.android.synthetic.main.recyclerview_routine_row.view.*
import java.util.*
import kotlin.collections.ArrayList

class PersRoutineAdapter(private val routines: ArrayList<PreRoutine>):RecyclerView.Adapter<PersRoutineAdapter.RoutineHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):PersRoutineAdapter.RoutineHolder {
        val inflatedView = parent.inflate(R.layout.recyclerview_routine_row, false)
        return RoutineHolder(inflatedView)
    }

    override fun getItemCount(): Int {
        return routines.size
    }

    override fun onBindViewHolder(holder: PersRoutineAdapter.RoutineHolder, position: Int) {
        val itemUser = routines[position]
        holder.bindUser(itemUser)
    }

    class RoutineHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        private var view: View = v
        private var routine: PreRoutine? = null

        fun bindUser(routine:PreRoutine){
            this.routine = routine
            view.routineName.text = routine.name
            view.routineDescription.text = routine.description
        }

        init {
            v.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            val context = itemView.context
            val showPhotoIntent = Intent(context, RoutinesActivity::class.java)
            showPhotoIntent.putExtra(PHOTO_KEY, "")
            context.startActivity(showPhotoIntent)
        }

        companion object {
            //5
            const val PHOTO_KEY = "PHOTO"
        }
    }
}