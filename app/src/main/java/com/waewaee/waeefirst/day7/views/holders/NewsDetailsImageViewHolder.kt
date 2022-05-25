package com.waewaee.waeefirst.day7.views.holders

import android.view.View
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.waewaee.waeefirst.R

class NewsDetailsImageViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val sliderImage = itemView.findViewById<ImageView>(R.id.ivNewsDetailsImage)

    fun bind(image: Int) {
        sliderImage.setImageResource(image)
    }
}