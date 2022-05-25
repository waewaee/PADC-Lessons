package com.waewaee.waeefirst.day7.views.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.waeefirst.day7.delegates.NewsItemDelegate

class NewsViewHolder(itemView: View, delegate: NewsItemDelegate) : RecyclerView.ViewHolder(itemView) {

    init {
        itemView.setOnClickListener {
            delegate.onTapNews()
        }
    }

}