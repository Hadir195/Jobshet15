package com.example.jobshet15

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Toast.makeText(this, "Aplikasi Berjalan", Toast.LENGTH_SHORT).show()

        val tombol = findViewById<Button>(R.id.TombolToast)
        tombol.setOnClickListener {
            Toast.makeText(this, "Hadir sastra imam p", Toast.LENGTH_SHORT).show()

            val tombol = findViewById<Button>(R.id.Tombol2Toast)
            tombol.setOnClickListener {
                Toast.makeText(this,"223256", Toast.LENGTH_SHORT).show()

                val tombol = findViewById<Button>(R.id.Tombol3Toast)
                tombol.setOnClickListener {
                    Toast.makeText(this,"XI PPLG 1",Toast.LENGTH_SHORT).show()
                }
            }
        }
    }
}