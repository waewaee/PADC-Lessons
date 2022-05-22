package com.waewaee.waeefirst.day5

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.view.get
import com.google.android.material.tabs.TabLayoutMediator
import com.waewaee.waeefirst.R
import kotlinx.android.synthetic.main.day5_activity_tabs.*

class TabsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day5_activity_tabs)

        val vpAdapter = DifferentScreensViewPagerAdapter(this)
        vpDifferentScreens.adapter = vpAdapter

        TabLayoutMediator(tabLayoutDifferentScreens, vpDifferentScreens) {tab, position ->
            when (position) {
                0 -> {
                    // labels for Tabs
                    tab.text = "Home"
//                    val pos = vpDifferentScreens[position] as HomeFragment
                }
                1 -> {
                    // labels for Tabs
                    tab.text = "Shorts"
                }
                else -> {
                    // labels for Tabs
                    tab.text = "Subscriptions"
                }
            }
        }.attach()
    }
}