package com.waewaee.waeefirst.day6.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import androidx.viewpager2.widget.ViewPager2
import com.waewaee.waeefirst.R
import com.waewaee.waeefirst.day4.UIHomeworkActivity
import com.waewaee.waeefirst.day6.adapters.BottomNavigationViewPagerAdapter
import kotlinx.android.synthetic.main.day6_activity_bottom_navigation_with_view_pager.*

class BottomNavigationWithViewPagerActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, BottomNavigationWithViewPagerActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day6_activity_bottom_navigation_with_view_pager)

        val adapter = BottomNavigationViewPagerAdapter(this)
        viewPagerForFragments.adapter = adapter

        viewPagerForFragments.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                when(position) {
                    0 -> bottomNavigation.selectedItemId = R.id.actionHome
                    1 -> bottomNavigation.selectedItemId = R.id.actionNotifications
                    2 -> bottomNavigation.selectedItemId = R.id.actionProfile
                }
            }
        })

        bottomNavigation.setOnItemSelectedListener { menuItem: MenuItem ->
            when(menuItem.itemId) {
                R.id.actionHome -> {
                    viewPagerForFragments.currentItem = 0
                    return@setOnItemSelectedListener true
                }
                R.id.actionNotifications -> {
                    viewPagerForFragments.currentItem = 1
                    return@setOnItemSelectedListener true
                }
                R.id.actionProfile -> {
                    viewPagerForFragments.currentItem = 2
                    return@setOnItemSelectedListener true
                }
            }
            false
        }
    }
}