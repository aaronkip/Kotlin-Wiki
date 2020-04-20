package com.kenova.wiki.activities

import android.os.Bundle
import com.google.android.material.bottomnavigation.BottomNavigationView
import androidx.appcompat.app.AppCompatActivity
import com.kenova.wiki.R
import com.kenova.wiki.fragments.ExploreFragment
import com.kenova.wiki.fragments.FavoritesFragment
import com.kenova.wiki.fragments.HistoryFragment
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private val exploreFragment : ExploreFragment
    private val historyFragment : HistoryFragment
    private val favoritesFragment : FavoritesFragment

    init {
        exploreFragment = ExploreFragment()
        historyFragment = HistoryFragment()
        favoritesFragment = FavoritesFragment()
    }

    private val mOnNavigationItemSelectedListener = BottomNavigationView.OnNavigationItemSelectedListener {item ->

        val transaction = supportFragmentManager.beginTransaction()
        transaction.setCustomAnimations(android.R.anim.fade_in, android.R.anim.fade_out)

        when(item.itemId)
        {
            R.id.navigation_explore -> transaction.replace(R.id.fragment_container, exploreFragment)
            R.id.navigation_history -> transaction.replace(R.id.fragment_container, historyFragment)
            R.id.navigation_favorites -> transaction.replace(R.id.fragment_container, favoritesFragment)
        }

        transaction.commit()
        true
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setSupportActionBar(toolbar)

        nav_view.setOnNavigationItemSelectedListener(mOnNavigationItemSelectedListener)

        val transaction = supportFragmentManager.beginTransaction()
        transaction.add(R.id.fragment_container, exploreFragment)
    }
}
