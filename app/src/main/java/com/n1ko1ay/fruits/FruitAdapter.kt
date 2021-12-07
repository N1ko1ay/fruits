package com.n1ko1ay.fruits

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class FruitAdapter(private val fruitList: List<Fruit>) : RecyclerView.Adapter<FruitViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FruitViewHolder {
        val itemView =
            LayoutInflater.from(parent.context).inflate(R.layout.fruit_list_item, parent, false)
        return FruitViewHolder(itemView)
    }

    override fun onBindViewHolder(holder: FruitViewHolder, position: Int) {
        val fruit = fruitList[position]
        holder.bind(fruit)
    }

    override fun getItemCount(): Int {
        return fruitList.size
    }
}