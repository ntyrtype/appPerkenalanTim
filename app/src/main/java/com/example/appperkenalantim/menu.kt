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

class menu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu)

        val projectManagerTextView: TextView = findViewById(R.id.fajrul)
        val npmTextView: TextView = findViewById(R.id.fajrul_npm)
        val imageView: ImageView = findViewById(R.id.imageView5)
        val nextButton: Button = findViewById(R.id.next_1)


        projectManagerTextView.text = "Fajrul Falah A"
        npmTextView.text = "2120501053"


        nextButton.setOnClickListener {
            val intent = Intent(this@menu, menu2::class.java)
            startActivity(intent)
        }
    }
}