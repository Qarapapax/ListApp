package com.example.listapp.presentation.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.listapp.domain.ShopItem

class ShopItemDiffCallBack : DiffUtil.ItemCallback<ShopItem>() {
    override fun areItemsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        return oldItem.id == newItem.id
    }

    override fun areContentsTheSame(oldItem: ShopItem, newItem: ShopItem): Boolean {
        return oldItem == newItem
    }
}