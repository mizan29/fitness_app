package com.simpleapp.mizan.kfitness.adapter

import android.support.v4.app.Fragment
import android.support.v4.app.FragmentManager
import android.support.v4.app.FragmentPagerAdapter


class TabViewPager(fragmentManager: FragmentManager) : FragmentPagerAdapter(fragmentManager) {

    var fManager = fragmentManager
    var mFragmentItems: ArrayList<Fragment> = arrayListOf()
    var mFragmentTitles: ArrayList<String> = arrayListOf()

    fun addFragments(fragmentItem: Fragment, fragmentTitle: String) {
        mFragmentItems.add(fragmentItem)
        mFragmentTitles.add(fragmentTitle)
    }

    override fun getItem(p0: Int): Fragment {
        return mFragmentItems[p0]
    }

    override fun getCount(): Int {
       return mFragmentItems.size
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return mFragmentTitles[position]
    }

}