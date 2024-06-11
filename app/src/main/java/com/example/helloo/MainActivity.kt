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
            .load("https://media.istockphoto.com/id/1666290146/photo/bee-eater-portrait-at-lake-manyara-tanzania.jpg?s=612x612&w=0&k=20&c=lipeLV0gs69V6w0kqSMCg03uky1uj552aHIM50BWiZo=")
            .into(binding.imageView)

    }
}
