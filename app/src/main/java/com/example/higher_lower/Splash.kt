package com.example.higher_lower

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.os.Handler
import android.widget.ImageView
import kotlinx.coroutines.delay
import androidx.appcompat.app.AppCompatActivity

class Splash: Activity(){
    private lateinit var image : ImageView
    private val SPLASH_TIME_OUT: Long = 3000

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.splash)
        image = findViewById(R.id.imgSplash)
        image.setImageResource(R.drawable.splash)

        Handler().postDelayed({
            val intent = Intent(this, Lobby::class.java)
            startActivity(intent)
            finish()
        }, SPLASH_TIME_OUT)
    }

}