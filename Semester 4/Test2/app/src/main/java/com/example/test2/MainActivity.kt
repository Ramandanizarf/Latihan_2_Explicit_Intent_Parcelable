package com.example.test2

import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import android.content.Intent
import android.net.Uri


class MainActivity : AppCompatActivity(), View.OnClickListener {

    private lateinit var btn1: Button
    private lateinit var btn2: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_main)

        btn1 = findViewById(R.id.btn1)
        btn2 = findViewById(R.id.btn2)

        btn1.setOnClickListener(this)
        btn2.setOnClickListener(this)

        Toast.makeText(this, "Activity: onCreate()", Toast.LENGTH_SHORT).show()
    }

    override fun onStart() {
        super.onStart()
        Toast.makeText(this, "Acivity: onStart()", Toast.LENGTH_SHORT).show()
    }

    override fun onPause() {
        super.onPause()
        Toast.makeText(this, "Activity: onPause()", Toast.LENGTH_SHORT).show()
    }

    override fun onStop() {
        super.onStop()
        Toast.makeText(this, "Activity: onStop()", Toast.LENGTH_SHORT).show()
    }

    override fun onResume() {
        super.onResume()
        Toast.makeText(this, "Acitivty: onResume()", Toast.LENGTH_SHORT).show()
    }


    override fun onClick(view: View) {
        when (view.id) {
            R.id.btn1 -> {
                val polmanActivity = Intent(Intent.ACTION_VIEW).apply {
                    data = Uri.parse("http://polman.com")
                }
                startActivity(polmanActivity)
            }

            R.id.btn2 -> {
                finish()
            }
        }
    }
}
