package com.example.appperkenalantim

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Handle window insets for padding
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Initialize UI elements
        val welcomeTextView: TextView = findViewById(R.id.welcome)
        val teamTextView: TextView = findViewById(R.id.team)
        val visitButton: Button = findViewById(R.id.btn_1)

        // Set text for TextViews and Button
        welcomeTextView.text = "INTRODUCING"
        teamTextView.text = "TEAM 2"
        visitButton.text = "VISIT TEAM"

        // Add listener for the Button
        visitButton.setOnClickListener {
            val intent = Intent(this@MainActivity, menu::class.java)
            startActivity(intent)
        }
    }
}
