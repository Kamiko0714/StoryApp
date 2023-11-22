package com.example.storyapp

import android.animation.ObjectAnimator
import android.view.View

object AnimationUtils {

    fun applySlideInAnimation(view: View) {
        val slideIn = ObjectAnimator.ofFloat(view, "translationY", 1000f, 0f)
        slideIn.duration = 500
        slideIn.start()
    }
}
