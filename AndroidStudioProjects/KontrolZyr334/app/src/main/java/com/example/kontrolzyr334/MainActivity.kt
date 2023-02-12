package com.example.kontrolzyr334

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun SwitchingToSigninActivity(view: View) {
        val intent = Intent (this@MainActivity, SigninActivity::class.java)
        startActivity(intent)
        finish()
    }

    fun SwitchingToRegActivity(view: View) {
        val intent = Intent(this@MainActivity, RegActivity::class.java)
        startActivity(intent)
        finish()
    }
}