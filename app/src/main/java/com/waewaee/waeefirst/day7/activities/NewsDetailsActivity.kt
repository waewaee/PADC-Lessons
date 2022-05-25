package com.waewaee.waeefirst.day7.activities

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.waewaee.waeefirst.R
import com.waewaee.waeefirst.day7.adapters.NewsDetailsImageAdapter
import kotlinx.android.synthetic.main.day7_activity_news.*
import kotlinx.android.synthetic.main.day7_activity_news_details.*

class NewsDetailsActivity : AppCompatActivity() {

    companion object {
        fun newIntent(context: Context): Intent {
            return Intent(context, NewsDetailsActivity::class.java)
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day7_activity_news_details)

        val imageList = listOf<Int>(
            R.drawable.news_details_img2,
            R.drawable.news_details_img3,
            R.drawable.news_details_img1,
        )

        val adapter = NewsDetailsImageAdapter(imageList)
        vpNewsDetailsImages.adapter = adapter

    }
}