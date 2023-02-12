package com.example.a334zyrianov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class UserProfile : AppCompatActivity() {
    lateinit var online:TextView
    lateinit var green:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_user_profile)
        online = findViewById(R.id.textView7)
        green = findViewById(R.id.textView9)
        val qwert:RecyclerView=findViewById(R.id.resview)
        qwert.adapter=Content_adapter(this, content_all().list_cont)
    }

    fun more(view: View) {
        online.text = "онлайн \n зарегистрирован(а) 20 янв,2022"
    }
}