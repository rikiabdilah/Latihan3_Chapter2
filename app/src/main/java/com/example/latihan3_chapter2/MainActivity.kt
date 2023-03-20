package com.example.latihan3_chapter2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val signupBtn = findViewById<TextView>(R.id.signupTv)
        signupBtn.setOnClickListener {
            startActivity(Intent(this,Register::class.java))
        }

        val signUpTv1 = findViewById<Button>(R.id.btn1)
        signUpTv1.setOnClickListener {
            startActivity(Intent(this,Home ::class.java))
        }
    }
}