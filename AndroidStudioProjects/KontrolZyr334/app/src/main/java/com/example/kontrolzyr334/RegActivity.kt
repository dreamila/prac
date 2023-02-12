package com.example.kontrolzyr334

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class RegActivity : AppCompatActivity() {
    lateinit var login:EditText
    lateinit var pass:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
        login = findViewById(R.id.logoremail)
        pass = findViewById(R.id.passText)
    }

    fun Continue2(view: View) {
        if(login.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty())
        {
            val intent = Intent(this@RegActivity, PatchActivity::class.java)
            startActivity(intent)
            finish()
        }
        else
        {
            val alert = AlertDialog.Builder(this)
                .setTitle("Заполните текстовые поля")
                .setPositiveButton("OK", null)
                .create()
                .show()
        }
    }
    fun GoBack(view: View) {
        val intent = Intent(this@RegActivity, MainActivity::class.java)
        startActivity(intent)
        finish()
    }
    fun EmailConfirmation(view: View) {}
}