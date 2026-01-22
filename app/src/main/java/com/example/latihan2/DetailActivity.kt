package com.example.latihan2

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class DetailActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)

        val tvNama = findViewById<TextView>(R.id.tvNama)
        val tvNim = findViewById<TextView>(R.id.tvNim)
        val tvProdi = findViewById<TextView>(R.id.tvProdi)

        val mahasiswa =
            intent.getParcelableExtra<Mahasiswa>("EXTRA_MAHASISWA")

        tvNama.text = "Nama : ${mahasiswa?.nama}"
        tvNim.text = "NIM : ${mahasiswa?.nim}"
        tvProdi.text = "Prodi : ${mahasiswa?.prodi}"
    }
}
