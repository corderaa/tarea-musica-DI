package com.example.musicaapp_xml

import android.os.Bundle
import android.view.View
import android.widget.ImageButton
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var isPlaying = false

        val playButton: ImageButton = findViewById(R.id.playButton)

        playButton.setOnClickListener {
            if (isPlaying) {
                playButton.setImageResource(R.drawable.pause_4349515)
                isPlaying = false
            } else {
                playButton.setImageResource(R.drawable.play_12052806)
                isPlaying = true
            }
        }
    }
}
