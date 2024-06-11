package com.example.helloo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.helloo.databinding.ActivityMyFourthBirdBinding
import com.example.helloo.databinding.ActivityMyThirdBirdBinding
import com.squareup.picasso.Picasso

class my_fourth_bird : AppCompatActivity() {
    lateinit var binding: ActivityMyFourthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyFourthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext4.setOnClickListener {
            val intent = Intent(this, my_fifth_bird::class.java)
            startActivity(intent)
        }
        binding.btnPrev3.setOnClickListener {
            val intent = Intent(this, my_third_bird::class.java)
            startActivity(intent)
        }
        Picasso
            .get()
            .load("https://images.unsplash.com/photo-1612024782955-49fae79e42bb?w=500&auto=format&fit=crop&q=60&ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8MTZ8fHBhcnJvdHxlbnwwfHwwfHx8MA%3D%3D")
            .into(binding.imageView4)

    }
}