package com.waewaee.waeefirst.day6.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.waewaee.waeefirst.R
import kotlinx.android.synthetic.main.day6_activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day6_activity_main)

        btnBottomNavigation.setOnClickListener {
            startActivity(BottomNavigationViewActivity.newIntent(this))
        }

        btnBottomNavigationWithVP.setOnClickListener {
            startActivity(BottomNavigationWithViewPagerActivity.newIntent(this))
        }

        btnBottomSheet.setOnClickListener {
            startActivity(BottomSheetActivity.newIntent(this))
        }

        btnBottomAppBar.setOnClickListener {
            startActivity(BottomAppBarActivity.newIntent(this))
        }

        btnCollapsingToolbar.setOnClickListener {
            startActivity(CollapsingToolbarLayoutActivity.newIntent(this))
        }

        btnCoordinatorLayout.setOnClickListener {
            startActivity(CoordinatorLayoutActivity.newIntent(this))
        }

        btnDrawerLayout.setOnClickListener {
            startActivity(DrawerLayoutActivity.newIntent(this))
        }

        btnOtherCommonUIComponents.setOnClickListener {
            startActivity(OtherCommonUIComponentsActivity.newIntent(this))
        }

        btnConstraintLayout.setOnClickListener {
            startActivity(ConstraintLayoutActivity.newIntent(this))
        }
    }
}