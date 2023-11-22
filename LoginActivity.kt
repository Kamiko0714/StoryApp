package com.example.storyapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat.startActivity

class LoginActivity : AppCompatActivity() {

    // ...

    private fun navigateToMainActivity() {
        // Navigasi ke halaman utama setelah login berhasil
        val intent = Intent(this, MainActivity::class.java)
        startActivity(intent)
        finish()
    }

    // ...
}
