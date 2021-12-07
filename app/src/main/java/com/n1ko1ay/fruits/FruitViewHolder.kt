package com.n1ko1ay.fruits

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class FruitViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    private val fruitImageView: ImageView = itemView.findViewById(R.id.fruit_image_view)
    private val nameTextView: TextView = itemView.findViewById(R.id.name_text_view)

    fun bind(fruit: Fruit) {
        nameTextView.text = fruit.name
        fruitImageView.setImageResource(fruit.image)
    }
}