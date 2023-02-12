package com.example.a334zyrianov

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class development : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_development)
    }

    fun back(view: View)
    {
        val intent = Intent(this@development, UserProfile::class.java)
        startActivity(intent)
        finish()
    }

    fun klaus(view: View) {
        val intent = Intent(this@development, toolbar::class.java)
        startActivity(intent)
        finish()
    }
}