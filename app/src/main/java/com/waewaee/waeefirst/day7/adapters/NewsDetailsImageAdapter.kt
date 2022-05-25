package com.waewaee.waeefirst.day7.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.waeefirst.R
import com.waewaee.waeefirst.day7.views.holders.NewsDetailsImageViewHolder
import com.waewaee.waeefirst.day7.views.items.NewsDetailsImageViewItem

class NewsDetailsImageAdapter(private val imageList: List<Int>): RecyclerView.Adapter<NewsDetailsImageViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NewsDetailsImageViewHolder {
        val itemView = LayoutInflater.from(parent.context).inflate(R.layout.day7_view_item_news_details_image, parent, false)
        return NewsDetailsImageViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: NewsDetailsImageViewHolder, position: Int) {
        val image = imageList[position]
        holder.bind(image)
    }

    override fun getItemCount(): Int {
        return imageList.size
    }
}