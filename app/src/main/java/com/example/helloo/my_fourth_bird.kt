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
            .load("https://media.istockphoto.com/id/1441187813/photo/front-view-of-blue-peacock-with-colorful-open-feathers.jpg?s=612x612&w=0&k=20&c=QMVECId8DY8xlQXqVzsAS1gM67Q6ZfbwJzvyjTldlRk=")
            .into(binding.imageView4)

    }
}