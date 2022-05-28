package com.waewaee.waeefirst.day7.views.holders

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.waeefirst.day7.delegates.NewsItemDelegate

class SmallNewsViewHolder(itemView: View, delegate: NewsItemDelegate) : BaseNewsViewHolder(itemView) {
    init {
        itemView.setOnClickListener {
            delegate.onTapNews()
        }
    }
}