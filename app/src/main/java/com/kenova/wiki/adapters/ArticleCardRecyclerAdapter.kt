package com.kenova.wiki.adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.kenova.wiki.R
import com.kenova.wiki.holders.CardHolder

/**
Created by Aaron at 4/19/2020
Copyright (c) 2020 Kenova
 **/
class ArticleCardRecyclerAdapter : RecyclerView.Adapter<CardHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardHolder {

        var cardItem = LayoutInflater.from(parent?.context).inflate(R.layout.article_card_item, parent, false)
        return CardHolder(cardItem)
    }

    override fun getItemCount(): Int {
       return 15 //temporary
    }

    override fun onBindViewHolder(holder: CardHolder, position: Int) {

    }

}