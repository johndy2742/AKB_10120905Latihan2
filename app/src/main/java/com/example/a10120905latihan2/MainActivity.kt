package com.example.a10120905latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

//<!-- 28 April 10102905 Johndy Panca IF10k--> //

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val txt_listener = findViewById<TextView>(R.id.registerA)
        txt_listener.setOnClickListener{
            startActivity(Intent(this,RegisterActivity::class.java))
        }
    }
}