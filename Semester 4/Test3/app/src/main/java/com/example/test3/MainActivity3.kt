package com.example.test3

import android.os.Bundle
import android.renderscript.Sampler
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main3)

        val tvNama = findViewById<TextView>(R.id.tvNama)
        val tvUmur = findViewById<TextView>(R.id.tvUmur)

        val nama = intent.getStringExtra("EXTRA_NAMA")
        val umur = intent.getIntExtra("EXTRA_UMUR", 0)
    }
}