package com.waewaee.waeefirst.day6.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.core.view.GravityCompat
import com.google.android.material.navigation.NavigationView
import com.waewaee.waeefirst.R
import com.waewaee.waeefirst.day4.UIHomeworkActivity
import kotlinx.android.synthetic.main.day6_activity_drawer_layout.*
import kotlinx.android.synthetic.main.day6_activity_drawer_layout.view.*

class DrawerLayoutActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, DrawerLayoutActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day6_activity_drawer_layout)

        setSupportActionBar(toolbar)

        val toggle = ActionBarDrawerToggle(
            this,
            drawerLayout,
            toolbar,
            R.string.drawer_open,
            R.string.drawer_close,
        )
        toggle.syncState()

        navigationView.setNavigationItemSelectedListener(NavigationView.OnNavigationItemSelectedListener {item: MenuItem ->
            when(item.itemId) {
                R.id.actionCamera -> {
                    Toast.makeText(this, "Camera opening...", Toast.LENGTH_SHORT).show()
                    drawerLayout.closeDrawer(GravityCompat.START)
                    toolbar.title = "Camera"
                }
                R.id.actionGallery -> {
                    Toast.makeText(this, "Gallery opening...", Toast.LENGTH_SHORT).show()
                    drawerLayout.closeDrawer(GravityCompat.START)
                    toolbar.title = "Gallery"
                }
                R.id.actionSlideShow -> {
                    Toast.makeText(this, "Slide show opening...", Toast.LENGTH_SHORT).show()
                    drawerLayout.closeDrawer(GravityCompat.START)
                    toolbar.title = "Slide Show"
                }
                R.id.actionTools -> {
                    Toast.makeText(this, "Tools opening...", Toast.LENGTH_SHORT).show()
                    drawerLayout.closeDrawer(GravityCompat.START)
                    toolbar.title = "Tools"
                }
            }
            return@OnNavigationItemSelectedListener true
        })

        swrl.setOnRefreshListener {
            Toast.makeText(this, "Refreshing...", Toast.LENGTH_LONG).show()
        }

        btnEndRefresh.setOnClickListener {
            swrl.isRefreshing = false
        }

    }

//    override fun onNavigationItemSelected(item: MenuItem): Boolean {
//        when(item.itemId) {
//            R.id.actionCamera -> {
//                Toast.makeText(this, "Camera opening...", Toast.LENGTH_SHORT).show()
//                drawerLayout.closeDrawer(GravityCompat.START)
//                toolbar.title = "Camera"
//            }
//            R.id.actionGallery -> {
//                Toast.makeText(this, "Gallery opening...", Toast.LENGTH_SHORT).show()
//                drawerLayout.closeDrawer(GravityCompat.START)
//                toolbar.title = "Gallery"
//            }
//            R.id.actionSlideShow -> {
//                Toast.makeText(this, "Slide show opening...", Toast.LENGTH_SHORT).show()
//                drawerLayout.closeDrawer(GravityCompat.START)
//                toolbar.title = "Slide Show"
//            }
//            R.id.actionTools -> {
//                Toast.makeText(this, "Tools opening...", Toast.LENGTH_SHORT).show()
//                drawerLayout.closeDrawer(GravityCompat.START)
//                toolbar.title = "Tools"
//            }
//        }
//        return true
//    }

    override fun onBackPressed() {
        when {
            drawerLayout.isDrawerOpen(GravityCompat.START) -> drawerLayout.closeDrawer(GravityCompat.START)
            else -> super.onBackPressed()
        }
    }
}