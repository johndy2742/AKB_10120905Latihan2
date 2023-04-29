package com.example.a10120905latihan2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton

//<!-- 28 April 10102905 Johndy Panca IF10k--> //

class RegisterActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        val buttonRegister = findViewById<MaterialButton>(R.id.btnRegister)
        buttonRegister.setOnClickListener {
            startActivity(Intent(this,VerifyActivity::class.java))
        }
    }
}