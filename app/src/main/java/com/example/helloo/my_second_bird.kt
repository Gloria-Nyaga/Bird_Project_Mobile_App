package com.example.helloo

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.helloo.databinding.ActivityMainBinding
import com.example.helloo.databinding.ActivityMySecondBirdBinding
import com.squareup.picasso.Picasso

class my_second_bird : AppCompatActivity() {
    lateinit var binding: ActivityMySecondBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMySecondBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev.setOnClickListener {
            val intent = Intent(this, ActivityMainBinding::class.java)
            finish()
        }
        binding.btnNext2.setOnClickListener{
            val intent = Intent(this, my_third_bird::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://media.istockphoto.com/id/172941521/photo/soon-eagle.jpg?s=612x612&w=0&k=20&c=aXdX6Vzh5FCfFCkSl9TXChiqwFbSxaXpR1zOPLb1iaU=")
            .into(binding.imageView2)
    }
}
