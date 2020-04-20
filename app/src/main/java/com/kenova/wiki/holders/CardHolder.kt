package com.kenova.wiki.holders

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.kenova.wiki.R

/**
Created by Aaron at 4/19/2020
Copyright (c) 2020 Kenova
 **/
class CardHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    private val articleImageView: ImageView = itemView.findViewById<ImageView>(R.id.article_image)
    private val titleTextView: TextView = itemView.findViewById<TextView>(R.id.article_title)
}