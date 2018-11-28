package com.simpleapp.mizan.kfitness.adapter

import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.simpleapp.mizan.kfitness.R
import com.simpleapp.mizan.kfitness.model.Challenge

class ChallengeAdapter(var items: ArrayList<Challenge>) : RecyclerView.Adapter<ChallengeAdapter.ViewHolder>() {
    override fun onCreateViewHolder(p0: ViewGroup, p1: Int): ViewHolder {
        val itemView = LayoutInflater.from(p0.context).inflate(R.layout.challenge_list_row, p0, false)
        return ViewHolder(itemView)
    }

    override fun getItemCount(): Int {
        return items.size
    }

    override fun onBindViewHolder(p0: ViewHolder, p1: Int) {
        var challenge = items[p1]
        p0.txtTitle?.text = challenge.title
        p0.txtDescription?.text = challenge.description
        p0.txtDistance?.text = challenge.distance
        p0.txtTimeLeft?.text = challenge.timeLeft
        p0.txtLike?.text = challenge.like
    }

    class ViewHolder(row: View) : RecyclerView.ViewHolder(row) {

        var img: ImageView? = null
        var txtTitle: TextView? = null
        var txtDescription: TextView? = null
        var txtDistance: TextView? = null
        var txtTimeLeft: TextView? = null
        var txtLike: TextView? = null
        init {
            this.img = row?.findViewById(R.id.challenge_image)
            this.txtTitle = row?.findViewById(R.id.challenge_title)
            this.txtDescription = row?.findViewById(R.id.challenge_description)
            this.txtTimeLeft = row?.findViewById(R.id.challenge_time_left)
            this.txtDistance = row?.findViewById(R.id.challenge_distance)
            this.txtLike = row?.findViewById(R.id.challenge_likes)
        }
    }
}