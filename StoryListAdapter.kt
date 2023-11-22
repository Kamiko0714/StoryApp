package com.example.storyapp

import android.animation.AnimatorInflater
import android.view.View
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class StoryListAdapter(private val stories: List<Story>, private val listener: StoryClickListener) :
    RecyclerView.Adapter<StoryListAdapter.StoryViewHolder>() {

    // ...

    override fun onBindViewHolder(holder: StoryViewHolder, position: Int) {
        val currentStory = stories[position]
        holder.bind(currentStory)
    }

    inner class StoryViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        init {
            // Tambahkan listener untuk menangani klik pada item
            itemView.setOnClickListener {
                val position = adapterPosition
                if (position != RecyclerView.NO_POSITION) {
                    val clickedStory = stories[position]
                    listener.onStoryClick(clickedStory)
                }
            }
        }

        fun bind(story: Story) {
            // Bind data cerita ke tampilan di sini
            itemView.findViewById<TextView>(R.id.tv_item_name).text = story.userName
            // Tambahkan kode untuk mengatur gambar atau item lainnya
        }
    }


    // ...
}
