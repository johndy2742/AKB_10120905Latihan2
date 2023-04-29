package com.example.a10120905latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

//<!-- 28 April 10102905 Johndy Panca IF10k--> //

class VerifyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_verify)
        val btnVerify = findViewById<MaterialButton>(R.id.btnVerify)
        btnVerify.setOnClickListener {
            startActivity(Intent(this,HomeActivity::class.java))
        }
    }
}