package com.waewaee.waeefirst.day7.activities

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.waewaee.waeefirst.R
import com.waewaee.waeefirst.day7.adapters.NewsAdapter
import com.waewaee.waeefirst.day7.delegates.NewsItemDelegate
import kotlinx.android.synthetic.main.day7_activity_news.*

class NewsActivity : AppCompatActivity(), NewsItemDelegate {

    private lateinit var adapter: NewsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.day7_activity_news)

        adapter = NewsAdapter(this)
        rvNews.adapter = adapter
        rvNews.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)
//        rvNews.layoutManager = GridLayoutManager(this, 2)
    }

    override fun onTapNews() {
        startActivity(NewsDetailsActivity.newIntent(this))
    }
}