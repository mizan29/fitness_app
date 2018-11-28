package com.simpleapp.mizan.kfitness

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.BottomNavigationView
import android.support.v4.app.Fragment
import android.support.v7.widget.Toolbar
import android.view.View
import com.simpleapp.mizan.kfitness.view.*

class MainActivity : AppCompatActivity() {

    val manager = supportFragmentManager
    private var toolbar: Toolbar? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        toolbar = findViewById(R.id.toolbar) as Toolbar
        setSupportActionBar(toolbar)

        val navigation = findViewById<View>(R.id.bottom_nav) as BottomNavigationView
        navigation.setOnNavigationItemSelectedListener { item ->
            when (item.itemId) {
                R.id.home ->
                    changeFragment(HomeFragment())
                R.id.search ->
                    changeFragment(ExploreFragment())
                R.id.record ->
                    changeFragment(RecordFragment())
                R.id.profile ->
                    changeFragment(ProfileFragment())
                R.id.settings ->
                    changeFragment(SettingsFragment())
            };true
        }

        navigation.selectedItemId = R.id.home
    }

    fun changeFragment(fragment: Fragment) {
        val transaction = manager.beginTransaction()
        transaction.replace(R.id.main_view_holder, fragment)
        transaction.addToBackStack(null)
        transaction.commit()

    }
}
