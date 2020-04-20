package com.kenova.wiki.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kenova.wiki.R
import com.kenova.wiki.holders.CardHolder
import com.kenova.wiki.holders.ListHolder

/**
Created by Aaron at 4/19/2020
Copyright (c) 2020 Kenova
 **/
class ArticleListRecyclerAdapter : RecyclerView.Adapter<ListHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ListHolder {

        var listItem = LayoutInflater.from(parent?.context).inflate(R.layout.article_list_item, parent, false)
        return ListHolder(listItem)
    }

    override fun getItemCount(): Int {
       return 15 //temporary
    }

    override fun onBindViewHolder(holder: ListHolder, position: Int) {

    }

}