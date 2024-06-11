package com.example.helloo

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.example.helloo.databinding.ActivityMainBinding
import com.squareup.picasso.Picasso

class MainActivity : AppCompatActivity() {
    lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.btnNext.setOnClickListener{
            val intent = Intent(this, my_second_bird::class.java)
            startActivity(intent)
        }

        Picasso
            .get()
            .load("https://media.istockphoto.com/id/517377711/photo/flamingo.jpg?s=612x612&w=0&k=20&c=424TcoirXoOOeljXGQb4Bq0OjE6d1q54t_RgHdR_Ck0=")
            .into(binding.imageView)

    }
}
