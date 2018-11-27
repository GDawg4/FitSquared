package com.example.garoz.fitsquared.Adapters

import android.content.Intent
import android.support.v7.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import com.example.garoz.fitsquared.Activities.UserActivity
import com.example.garoz.fitsquared.Classes.Exercises.Exercise
import com.example.garoz.fitsquared.Classes.Singletons.userPersistency
import com.example.garoz.fitsquared.Classes.User
import com.example.garoz.fitsquared.R
import kotlinx.android.synthetic.main.recyclerview_exercise_row.view.*

class ExercisesAdapter(private val exercises: ArrayList<Exercise>):RecyclerView.Adapter<ExercisesAdapter.PhotoHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):ExercisesAdapter.PhotoHolder {
        val inflatedView = parent.inflate(R.layout.recyclerview_exercise_row, false)
        return ExercisesAdapter.PhotoHolder(inflatedView)
    }

    override fun getItemCount(): Int {
        return exercises.size
    }

    override fun onBindViewHolder(holder: ExercisesAdapter.PhotoHolder, position: Int) {
        val itemUser = exercises[position]
        holder.bindUser(itemUser)
    }

    class PhotoHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        private var view: View = v
        private var exercise: Exercise? = null

        fun bindUser(exercise: Exercise){
            this.exercise = exercise
            view.titulo.text = exercise.name
            view.area.text = exercise.areaWorked
            view.duración.text = exercise.duration.toString()
            view.reps.text = exercise.numberOfReps.toString()
            if (exercise.extraWeight){
                view.peso.text = "Con peso extra"
            }
            else{
                view.peso.text = "Sin peso extra"
            }
            view.descripcion.text = exercise.description
        }

        init {
            v.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            val context = itemView.context
        }

        companion object {
            //5
            const val PHOTO_KEY = "PHOTO"
        }
    }

}