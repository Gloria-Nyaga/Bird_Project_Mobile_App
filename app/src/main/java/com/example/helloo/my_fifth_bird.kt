package com.example.helloo

import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.helloo.databinding.ActivityMyFifthBirdBinding
import com.example.helloo.databinding.ActivityMyFourthBirdBinding
import com.squareup.picasso.Picasso

class my_fifth_bird : AppCompatActivity() {
    lateinit var binding: ActivityMyFifthBirdBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMyFifthBirdBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnPrev4.setOnClickListener {
            finish()
        }

    Picasso
     .get()
     .load("https://media.istockphoto.com/id/1368240023/photo/hummingbird-in-flight.jpg?s=612x612&w=0&k=20&c=4iLonr9VjvQTwio7vfWlQJULMaLGp7EXGLn0Vdp10Qg=")
     .into(binding.imageView5)

}

}