package com.example.latihan2

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    private lateinit var etNama: EditText
    private lateinit var etNim: EditText
    private lateinit var etProdi: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        etNama = findViewById(R.id.etNama)
        etNim = findViewById(R.id.etNim)
        etProdi = findViewById(R.id.etProdi)
    }

    fun kirimData(view: View) {
        val mahasiswa = Mahasiswa(
            nama = etNama.text.toString(),
            nim = etNim.text.toString(),
            prodi = etProdi.text.toString()
        )

        val intent = Intent(this, DetailActivity::class.java)
        intent.putExtra("EXTRA_MAHASISWA", mahasiswa)
        startActivity(intent)
    }
}
