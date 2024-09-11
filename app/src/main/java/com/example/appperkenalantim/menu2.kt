package com.example.appperkenalantim

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class menu2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu2)


        val projectManagerTextView: TextView = findViewById(R.id.eri)
        val npmTextView: TextView = findViewById(R.id.eri_npm)
        val imageView: ImageView = findViewById(R.id.imageView6)
        val nextButton: Button = findViewById(R.id.next_2)


        projectManagerTextView.text = "Eriana Erawati"
        npmTextView.text = "2120501041"


        nextButton.setOnClickListener {
            val intent = Intent(this@menu2, menu3::class.java)
            startActivity(intent)
        }
    }
}