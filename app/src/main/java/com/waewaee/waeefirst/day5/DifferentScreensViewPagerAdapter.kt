package com.waewaee.waeefirst.day5

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.waewaee.waeefirst.day5.HomeFragment.Companion.KEY_HOME_DESCRIPTION
import com.waewaee.waeefirst.day5.ShortsFragment.Companion.KEY_SHORTS_DESCRIPTION
import com.waewaee.waeefirst.day5.SubscriptionsFragment.Companion.KEY_SUBSCRIPTIONS_DESCRIPTION

class DifferentScreensViewPagerAdapter(fragmentActivity: FragmentActivity): FragmentStateAdapter(fragmentActivity) {
    override fun getItemCount(): Int {
        return 3
    }

    override fun createFragment(position: Int): Fragment {
        when(position) {
            0 -> {
                val homeFragment = HomeFragment()
                val bundle = Bundle()
                // Data Pass
                bundle.putString(KEY_HOME_DESCRIPTION, "This is Home Fragment Description!")
                homeFragment.arguments = bundle

                return homeFragment
            }
            1 -> {
                val shortsFragment = ShortsFragment()
                // Data Pass
                val bundle = Bundle().apply {
                    this.putString(KEY_SHORTS_DESCRIPTION, "This is Shorts Fragment Description!")
                }
                shortsFragment.arguments = bundle

                return shortsFragment
            }
            else -> {
                val subscriptionsFragment = SubscriptionsFragment()
                val bundle = Bundle()
                // Data Pass
                bundle.putString(KEY_SUBSCRIPTIONS_DESCRIPTION, "This is Subscriptions Fragment Description!")
                subscriptionsFragment.arguments = bundle

                return subscriptionsFragment
            }
        }
    }
}