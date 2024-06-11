package com.example.helloo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.helloo.databinding.ActivityMainBinding
import com.example.helloo.databinding.ActivityMyThirdBirdBinding
import com.squareup.picasso.Picasso


class my_third_bird : AppCompatActivity() {
    lateinit var binding: ActivityMyThirdBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyThirdBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext3.setOnClickListener {
            val intent = Intent(this, my_fourth_bird::class.java)
            startActivity(intent)
        }
        binding.btnPrev2.setOnClickListener {
            val intent = Intent(this, my_second_bird::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://media.istockphoto.com/id/1634032086/photo/purple-finch-photo-and-image-finch-close-up-front-view-perched-on-a-branch-with-a-soft-brown.jpg?s=612x612&w=0&k=20&c=ZpSuKPceCGtXptFBSbdWwtXhgfGPZteYxXl_DxxYpLE=")
            .into(binding.imageView3)
    }
}
