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
class ListHolder(itemView : View) : RecyclerView.ViewHolder(itemView) {
    private val articleImageView: ImageView = itemView.findViewById<ImageView>(R.id.result_icon)
    private val titleTextView: TextView = itemView.findViewById<TextView>(R.id.result_title)
}