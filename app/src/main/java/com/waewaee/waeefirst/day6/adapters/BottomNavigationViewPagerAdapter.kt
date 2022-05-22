package com.waewaee.waeefirst.day6.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.waewaee.waeefirst.day6.fragments.HomeFragment
import com.waewaee.waeefirst.day6.fragments.NotificationsFragment
import com.waewaee.waeefirst.day6.fragments.ProfileFragment

class BottomNavigationViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> return HomeFragment()
            1 -> return NotificationsFragment()
            2 -> return ProfileFragment()
        }
        return HomeFragment()
    }
}