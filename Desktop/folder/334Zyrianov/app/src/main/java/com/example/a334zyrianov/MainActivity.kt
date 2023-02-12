package com.example.a334zyrianov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.content.Intent

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val timer = object : CountDownTimer(8000,1000)
        {
            override fun onTick(millisUntilFinised: Long) {}

            override fun onFinish()
            {
                val intent = Intent (this@MainActivity,Signin::class.java)
                startActivity(intent)
                finish()
            }
        }
        timer.start()
    }
}