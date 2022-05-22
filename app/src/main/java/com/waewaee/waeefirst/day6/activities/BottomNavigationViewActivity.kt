package com.waewaee.waeefirst.day6.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.fragment.app.Fragment
import androidx.fragment.app.commit
import androidx.fragment.app.replace
import com.waewaee.waeefirst.R
import com.waewaee.waeefirst.day4.UIHomeworkActivity
import com.waewaee.waeefirst.day6.fragments.HomeFragment
import com.waewaee.waeefirst.day6.fragments.NotificationsFragment
import com.waewaee.waeefirst.day6.fragments.ProfileFragment
import kotlinx.android.synthetic.main.day6_activity_bottom_navigation_view.*

class BottomNavigationViewActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, BottomNavigationViewActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day6_activity_bottom_navigation_view)

        switchFragment(HomeFragment())

        bottomNavigation.setOnItemSelectedListener { menuItem: MenuItem ->
            when(menuItem.itemId){
                R.id.actionHome -> {
                    switchFragment(HomeFragment())
                    return@setOnItemSelectedListener true
                }

                R.id.actionNotifications -> {
                    switchFragment(NotificationsFragment())
                    return@setOnItemSelectedListener true
                }

                R.id.actionProfile -> {
                    switchFragment(ProfileFragment())
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }

    private fun switchFragment(fragment: Fragment) {
        supportFragmentManager.beginTransaction()
            .replace(R.id.fgContainer, fragment)
            .commit()
//        supportFragmentManager.commit {
//            replace(R.id.fgContainer, fragment)
//        }
    }
}