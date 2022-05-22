package com.waewaee.waeefirst.day4

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.waewaee.waeefirst.R
import kotlinx.android.synthetic.main.day4_activity_ui_homework.*

class UIHomeworkActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, UIHomeworkActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day4_activity_ui_homework)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setDisplayShowHomeEnabled(true)

        rbRating.setOnRatingBarChangeListener { ratingBar, fl, b ->
            Toast.makeText(this, "Rating: $fl", Toast.LENGTH_SHORT).show()
        }
    }
}