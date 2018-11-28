package com.simpleapp.mizan.kfitness.view

import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v4.app.Fragment
import android.support.v4.view.ViewPager
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

import com.simpleapp.mizan.kfitness.R
import com.simpleapp.mizan.kfitness.adapter.TabViewPager
import kotlinx.android.synthetic.main.toolbar.*

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Activities that contain this fragment must implement the
 * [HomeFragment.OnFragmentInteractionListener] interface
 * to handle interaction events.
 * Use the [HomeFragment.newInstance] factory method to
 * create an instance of this fragment.
 *
 */
class HomeFragment : Fragment() {
    // TODO: Rename and change types of parameters

    var pagerAdapter: TabViewPager? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val pagerView = view?.findViewById<View>(R.id.home_view_pager) as ViewPager
        val tabLayout = view?.findViewById<View>(R.id.home_tab_layout) as TabLayout

        pagerAdapter = TabViewPager(childFragmentManager)
        pagerAdapter!!.addFragments(HomeFollowingFragment(), "Following")
        pagerAdapter!!.addFragments(HomeYouFragment(), "You")
        pagerView.adapter = pagerAdapter
        tabLayout.setupWithViewPager(pagerView)
    }

    override fun onResume() {
        super.onResume()
        val toolbarTitle = activity!!.toolbar.findViewById<View>(R.id.toolbar_title) as TextView
        toolbarTitle.text = "FEED"
    }
}
