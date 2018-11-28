package com.simpleapp.mizan.kfitness.view

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import com.simpleapp.mizan.kfitness.R
import kotlinx.android.synthetic.main.toolbar.*

class ProfileFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_profile, container, false)
    }

    override fun onResume() {
        super.onResume()
        val toolbarTitle = activity!!.toolbar.findViewById<View>(R.id.toolbar_title) as TextView
        toolbarTitle.text = "PROFILE"
    }
}
