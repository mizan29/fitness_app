package com.simpleapp.mizan.kfitness.view

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.simpleapp.mizan.kfitness.R
import com.simpleapp.mizan.kfitness.adapter.TabViewPager
import kotlinx.android.synthetic.main.toolbar.*


class ExploreFragment : Fragment() {

    var pagerAdapter: TabViewPager? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_explore, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pagerView = view?.findViewById<View>(R.id.explore_view_pager) as ViewPager
        val tabLayout = view?.findViewById<View>(R.id.explore_tab_layout) as TabLayout

        pagerAdapter = TabViewPager(childFragmentManager)
        pagerAdapter!!.addFragments(ChallengesFragment(), "CHALLENGES")
        pagerAdapter!!.addFragments(OngoingFragment(), "ONGOING")
        pagerView.adapter = pagerAdapter
        tabLayout.setupWithViewPager(pagerView)
    }

    override fun onResume() {
        super.onResume()
        val toolbarLeftIcon = activity!!.toolbar.findViewById<View>(R.id.left_icon) as ImageView
        val toolbarTitle = activity!!.toolbar.findViewById<View>(R.id.toolbar_title) as TextView
        toolbarTitle.text = "EXPLORE"
        toolbarLeftIcon.setImageResource(R.drawable.add_circle_black_18)
        toolbarLeftIcon.setColorFilter(R.color.splash_bg)
    }
}
