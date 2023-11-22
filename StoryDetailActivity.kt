package com.example.storyapp

import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class StoryDetailActivity : AppCompatActivity() {

    private lateinit var story: Story
    private lateinit var tvDetailName: TextView

    // ...

    private fun displayStoryDetail(story: Story) {
        // Inisialisasi objek story dan tvDetailName jika belum diinisialisasi
        this.story = story
        tvDetailName = findViewById(R.id.tv_detail_name)

        // Implementasi tampilan detail cerita
        tvDetailName.text = story.userName
        // Tambahkan kode untuk mengatur gambar dan deskripsi
    }

    // ...
}

