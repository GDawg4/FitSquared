package com.example.garoz.fitsquared.Adapters

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentStatePagerAdapter
import com.example.garoz.fitsquared.Classes.Exercises.Exercise

class RoutinesAdapter(fragmentManager: FragmentManager, private val  routines:ArrayList<Exercise>):FragmentStatePagerAdapter(fragmentManager) {
    override fun getItem(position: Int): Fragment {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun getCount(): Int {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }
}