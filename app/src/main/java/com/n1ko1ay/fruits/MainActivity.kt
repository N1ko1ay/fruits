package com.n1ko1ay.fruits

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {

    lateinit var fruitRecyclerView: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        fruitRecyclerView = findViewById(R.id.fruit_recycler_view)

        val fruitList: List<Fruit> = listOf(
            Fruit("apple", R.drawable.apple),
            Fruit("garnet", R.drawable.garnet),
            Fruit("lime", R.drawable.lime),
            Fruit("peach", R.drawable.peach),
            Fruit("plum", R.drawable.plum)
        )

        fruitRecyclerView.layoutManager =
            LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        fruitRecyclerView.adapter = FruitAdapter(fruitList)


    }
}