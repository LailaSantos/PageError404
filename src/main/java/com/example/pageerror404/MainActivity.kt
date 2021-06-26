package com.example.pageerror404

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnClick = findViewById<Button>(R.id.btn_home)

        btnClick.setOnClickListener {
            Toast.makeText(applicationContext, "BOTÃO CLICADO", Toast.LENGTH_SHORT).show()
        }
    }
}
