package com.example.appperkenalantim

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class menu3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_menu3)  // Menggunakan layout yang sudah Anda buat (pastikan nama filenya "activity_menu3.xml")

        // Inisialisasi elemen-elemen UI
        val backEndTextView: TextView = findViewById(R.id.fakhri)
        val npmTextView: TextView = findViewById(R.id.fakhri_npm)
        val imageView: ImageView = findViewById(R.id.imageView7)
        val nextButton: Button = findViewById(R.id.next_3)

        // Set teks dan gambar (pastikan gambar "Fakhri" ada di drawable)
        backEndTextView.text = "M Fakhri Ramadhan"
        npmTextView.text = "2140501121"


        nextButton.setOnClickListener {
            val intent = Intent(this@menu3, menu4::class.java)
            startActivity(intent)
        }
    }
}
