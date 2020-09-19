package com.hungnd.mypromusic.activity

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import androidx.fragment.app.FragmentManager
import androidx.viewpager.widget.ViewPager
import com.google.android.material.navigation.NavigationView
import com.google.android.material.tabs.TabLayout
import com.google.android.material.tabs.TabLayout.TabLayoutOnPageChangeListener
import com.hungnd.mypromusic.R
import com.hungnd.mypromusic.adapter.PagerAdapter
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private var drawerLayout: DrawerLayout? = null
    private var navMain: NavigationView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        addControl()
        val actionBar = supportActionBar
        actionBar?.title = "Music Player"
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
            actionBar.setDisplayShowHomeEnabled(true)
            actionBar.setHomeAsUpIndicator(R.drawable.ic_menu)
        }
        drawerLayout = findViewById(R.id.drawer)
        navMain = findViewById(R.id.nav_main)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (item.itemId == android.R.id.home) {
            if (drawerLayout!!.isDrawerOpen(GravityCompat.START)) {
                drawerLayout!!.closeDrawer(GravityCompat.START)
            } else {
                drawerLayout!!.openDrawer(GravityCompat.START)
            }
        }
        return super.onOptionsItemSelected(item)
    }

    private fun addControl() {

        val manager: FragmentManager = supportFragmentManager
        val adapter = PagerAdapter(manager)
        vpg_show_items.adapter = adapter
        tabLayout.setupWithViewPager(vpg_show_items)
        vpg_show_items.addOnPageChangeListener(TabLayoutOnPageChangeListener(tabLayout))
        tabLayout.setTabsFromPagerAdapter(adapter)
        tabLayout.addOnTabSelectedListener(TabLayout.ViewPagerOnTabSelectedListener(vpg_show_items))
    }
}







