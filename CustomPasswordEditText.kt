package com.example.storyapp

import android.content.Context
import android.text.Editable
import android.text.TextWatcher
import android.util.AttributeSet
import androidx.appcompat.widget.AppCompatEditText

class CustomPasswordEditText(context: Context, attrs: AttributeSet) : AppCompatEditText(context, attrs) {

    init {
        // Menambahkan TextWatcher untuk memeriksa panjang password
        addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {}

            override fun afterTextChanged(s: Editable?) {
                // Menampilkan pesan error jika panjang password kurang dari 8 karakter
                if (s?.length ?: 0 < 8) {
                    error = "Password must be at least 8 characters long."
                } else {
                    error = null
                }
            }
        })
    }
}

