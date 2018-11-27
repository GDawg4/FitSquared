package com.example.garoz.fitsquared.Adapters
import android.content.Intent
import android.provider.ContactsContract
import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.View
import android.view.ViewGroup
import com.example.garoz.fitsquared.Activities.UserActivity
import com.example.garoz.fitsquared.Classes.Singletons.userPersistency
import com.example.garoz.fitsquared.Classes.User
import com.example.garoz.fitsquared.R
import kotlinx.android.synthetic.main.recyclerview_item_row.*
import kotlinx.android.synthetic.main.recyclerview_item_row.view.*
import java.util.*
import kotlin.collections.ArrayList


class UsersAdapter(private val users: ArrayList<User?>):RecyclerView.Adapter<UsersAdapter.PhotoHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int):UsersAdapter.PhotoHolder {
        val inflatedView = parent.inflate(R.layout.recyclerview_item_row, false)
        return PhotoHolder(inflatedView)
    }

    override fun getItemCount(): Int {
        return users.size
    }

    override fun onBindViewHolder(holder: UsersAdapter.PhotoHolder, position: Int) {
        val itemUser = users[position]
        holder.bindUser(itemUser)
    }

    class PhotoHolder(v: View) : RecyclerView.ViewHolder(v), View.OnClickListener {
        private var view: View = v
        private var user: User? = null

        fun bindUser(user:User?){
            this.user = user
            view.itemDate.text = user?.userName
        }

        init {
            v.setOnClickListener(this)
        }

        override fun onClick(v: View) {
            val context = itemView.context
            val showPhotoIntent = Intent(context,UserActivity::class.java)
            userPersistency.currentUser = this.user
            showPhotoIntent.putExtra(PHOTO_KEY, "")
            context.startActivity(showPhotoIntent)
        }

        companion object {
            //5
            const val PHOTO_KEY = "PHOTO"
        }
    }

}