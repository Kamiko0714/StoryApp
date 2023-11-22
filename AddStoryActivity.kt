package com.example.storyapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class AddStoryActivity : AppCompatActivity() {

    private lateinit var edAddDescription: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add_story)

        edAddDescription = findViewById(R.id.ed_add_description)

        val btnAddStory: Button = findViewById(R.id.btn_add)
        btnAddStory.setOnClickListener {
            uploadStory()
        }
    }

    private fun uploadStory() {
        val description = edAddDescription.text.toString()
        // Lakukan logika upload foto dan deskripsi cerita ke server di sini

        // Setelah berhasil, kembali ke halaman daftar cerita
        navigateToStoryList()
    }

    private fun navigateToStoryList() {
        val intent = Intent(this, ListStoryActivity::class.java)
        startActivity(intent)
        finish()
    }
}
