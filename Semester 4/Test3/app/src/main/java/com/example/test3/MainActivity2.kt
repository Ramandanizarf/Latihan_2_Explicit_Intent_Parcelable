package com.example.test3

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity2 : AppCompatActivity() {

        private lateinit var etNama: EditText
        private lateinit var etUmur: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

            val etNama = findViewById<EditText>(R.id.etNama)
            val etUmur = findViewById<EditText>(R.id.etUmur)

            val nama = etNama.text.toString()
            val umur = etUmur.text.toString().toIntOrNull() ?: 0

            val intent = Intent(this, MainActivity3::class.java)
            intent.putExtra("EXTRA_NAMA", nama)
            intent.putExtra("EXTRA_UMUR", umur)

        }

    fun kirimData(view: View) {
        val nama = etNama.text.toString()
        val umur = etUmur.text.toString().toIntOrNull() ?: 0

        val intent = Intent(this, MainActivity3::class.java)
        intent.putExtra("EXTRA_NAMA", nama)
        intent.putExtra("EXTRA_UMUR", umur)
    }

}