package com.waewaee.waeefirst.day7.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.waeefirst.R
import com.waewaee.waeefirst.day7.delegates.NewsItemDelegate
import com.waewaee.waeefirst.day7.views.holders.BaseNewsViewHolder
import com.waewaee.waeefirst.day7.views.holders.NewsViewHolder
import com.waewaee.waeefirst.day7.views.holders.SmallNewsViewHolder

class NewsAdapter(private val delegate: NewsItemDelegate): RecyclerView.Adapter<BaseNewsViewHolder>() {

    val VIEW_TYPE_BIG = 1
    val VIEW_TYPE_SMALL = 2

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BaseNewsViewHolder {

       when(viewType) {
           VIEW_TYPE_BIG -> {
               val itemView = LayoutInflater.from(parent.context).inflate(R.layout.day7_view_item_news, parent, false)
               return NewsViewHolder(itemView, delegate)
           }
           VIEW_TYPE_SMALL -> {
               val itemView = LayoutInflater.from(parent.context).inflate(R.layout.day7_view_item_news_small, parent, false)
               return SmallNewsViewHolder(itemView, delegate)
           }
           else -> {
               val itemView = LayoutInflater.from(parent.context).inflate(R.layout.day7_view_item_news, parent, false)
               return NewsViewHolder(itemView, delegate)
           }
       }
    }

    override fun getItemCount(): Int {
        return 12
    }

    override fun onBindViewHolder(holder: BaseNewsViewHolder, position: Int) {

    }

    override fun getItemViewType(position: Int): Int {
        return when {
            position % 3 == 0 -> VIEW_TYPE_SMALL
            else -> VIEW_TYPE_BIG
        }
    }
}