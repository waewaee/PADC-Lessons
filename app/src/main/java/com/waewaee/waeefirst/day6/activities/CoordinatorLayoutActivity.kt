package com.waewaee.waeefirst.day6.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.waewaee.waeefirst.R
import com.waewaee.waeefirst.day4.UIHomeworkActivity
import kotlinx.android.synthetic.main.day6_activity_coordinator_layout.*

class CoordinatorLayoutActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, CoordinatorLayoutActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day6_activity_coordinator_layout)
    }
}