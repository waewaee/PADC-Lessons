package com.waewaee.waeefirst.day7.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.waeefirst.R
import com.waewaee.waeefirst.day7.delegates.NewsItemDelegate
import com.waewaee.waeefirst.day7.views.holders.NewsViewHolder

class NewsAdapter(private val delegate: NewsItemDelegate): RecyclerView.Adapter<NewsViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsViewHolder {
       val itemView = LayoutInflater.from(parent.context).inflate(R.layout.day7_view_item_news, parent, false)
        return NewsViewHolder(itemView, delegate)
    }

    override fun onBindViewHolder(holder: NewsViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return 5
    }
}