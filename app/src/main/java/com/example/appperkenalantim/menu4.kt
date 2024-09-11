package com.example.appperkenalantim

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class menu4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu4)  // Pastikan nama file XML adalah "activity_menu4.xml"

        // Inisialisasi elemen-elemen UI
        val uiUxTextView: TextView = findViewById(R.id.haidar)
        val npmTextView: TextView = findViewById(R.id.haidar_npm)
        val imageView: ImageView = findViewById(R.id.imageView8)
        val nextButton: Button = findViewById(R.id.next_4)

        // Set teks dan gambar
        uiUxTextView.text = "Haidar Rahman H"
        npmTextView.text = "2120501054"


        nextButton.setOnClickListener {
            val intent = Intent(this@menu4, menu::class.java)
            startActivity(intent)
        }
    }
}
