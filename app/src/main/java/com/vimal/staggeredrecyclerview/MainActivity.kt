package com.vimal.staggeredrecyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val postsRecyclerView: RecyclerView = findViewById(R.id.postsRecyclerView)
        postsRecyclerView.layoutManager =
            StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL)

        val postItems: MutableList<PostItem> = mutableListOf()
        postItems.add(PostItem(R.drawable.first))
        postItems.add(PostItem(R.drawable.second))
        postItems.add(PostItem(R.drawable.third))
        postItems.add(PostItem(R.drawable.four))
        postItems.add(PostItem(R.drawable.first))
        postItems.add(PostItem(R.drawable.second))
        postItems.add(PostItem(R.drawable.third))
        postItems.add(PostItem(R.drawable.four))
        postItems.add(PostItem(R.drawable.first))
        postItems.add(PostItem(R.drawable.second))
        postItems.add(PostItem(R.drawable.third))
        postItems.add(PostItem(R.drawable.four))

        postsRecyclerView.adapter = PostsAdapter(this, postItems)
    }
}