package com.example.test3

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun panggil(view: View) {
        val nomor = "081222886240"
        val panggil = Intent(Intent.ACTION_DIAL).apply{
            data = Uri.fromParts("tel", nomor, null)
        }
        startActivity(panggil)
    }

    fun buka(view: View) {
        val url = "https://polman-bandung.ac.id"
        val bukaBrowser = Intent(Intent.ACTION_VIEW).apply{
            data = Uri.parse(url)
        }
        startActivity(bukaBrowser)
    }

    // 3. KIRIM SMS
    fun kirimSms(view: View) {
        val nomor = "081234567890"
        val smsIntent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("smsto:$nomor")
            putExtra("sms_body", "Halo, ini contoh SMS dari Intent Implisit")
        }
        startActivity(smsIntent)
    }

    // 4. KIRIM EMAIL
    fun kirimEmail(view: View) {
        val emailIntent = Intent(Intent.ACTION_SENDTO).apply {
            data = Uri.parse("mailto:haryantoalvin932@gmail.com")
            putExtra(Intent.EXTRA_SUBJECT, "Latihan Intent")
            putExtra(Intent.EXTRA_TEXT, "Ini contoh email menggunakan Intent Implisit")
        }
        startActivity(emailIntent)
    }

    // 5. SHARE TEKS
    fun share(view: View) {
        val shareIntent = Intent(Intent.ACTION_SEND).apply {
            type = "text/plain"
            putExtra(Intent.EXTRA_TEXT, "Belajar Intent Implisit Android")
        }
        startActivity(Intent.createChooser(shareIntent, "Bagikan ke"))
    }

    // 6. BUKA MAP
    fun bukaMap(view: View) {
        val lokasi = "geo:-6.890400,107.610000"
        val mapIntent = Intent(Intent.ACTION_VIEW).apply {
            data = Uri.parse(lokasi)
        }
        startActivity(mapIntent)
    }

    fun MainActivity2(view: View) {
        val intent = Intent(this, MainActivity2::class.java)
        startActivity(intent)
    }

}