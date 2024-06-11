package com.example.helloo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.helloo.databinding.ActivityMyThirdBirdBinding
import com.squareup.picasso.Picasso


class my_third_bird : AppCompatActivity() {
    lateinit var binding: ActivityMyThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev2.setOnClickListener {
            finish()
        }
        binding.btnNext3.setOnClickListener {
            val intent = Intent(this, my_fourth_bird::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://media.istockphoto.com/id/673375228/photo/nicobar-pigeon-bronx-zoo-nyc.jpg?s=612x612&w=0&k=20&c=tg4LPisrnr4YdP2E2qgTBDsE7z5KTudHOyald44EBJ0=")
            .into(binding.imageView3)
    }
}
