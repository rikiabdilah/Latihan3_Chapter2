package com.example.latihan3_chapter2

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Register : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val login = findViewById<TextView>(R.id.tvLogin)
        login.setOnClickListener {
            startActivity(Intent(this,MainActivity::class.java))
        }
    }
}