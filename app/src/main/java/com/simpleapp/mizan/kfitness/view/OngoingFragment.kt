package com.simpleapp.mizan.kfitness.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.support.v7.widget.DefaultItemAnimator
import android.support.v7.widget.LinearLayoutManager
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.simpleapp.mizan.kfitness.R
import com.simpleapp.mizan.kfitness.adapter.ChallengeAdapter
import com.simpleapp.mizan.kfitness.model.Challenge

class OngoingFragment : Fragment() {

    private var recyclerView: RecyclerView? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_ongoing, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        recyclerView = view?.findViewById<View>(R.id.ongoing_recyclerview) as RecyclerView
        var adapter = ChallengeAdapter(generateData())
        recyclerView?.layoutManager = LinearLayoutManager(activity?.applicationContext)
        recyclerView?.itemAnimator = DefaultItemAnimator()
        recyclerView?.adapter = adapter
        adapter.notifyDataSetChanged()
    }

    private fun generateData(): ArrayList<Challenge> {
        var result = ArrayList<Challenge>()

        for(i in 0..3){
            var challenge = Challenge("60 miles marathon","Deliver your best 2 miles","","Distance: 17 mi","17 days left","189")
            result.add(challenge)
        }

        return result
    }

}
