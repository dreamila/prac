package com.example.a334zyrianov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class Reg : AppCompatActivity() {
    lateinit var firstName:EditText
    lateinit var lastName:EditText
    lateinit var mail:EditText
    lateinit var password:EditText
    lateinit var repeatpass:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reg)
        firstName=findViewById(R.id.FirstNameText)
        lastName=findViewById(R.id.LastNameText)
        mail=findViewById(R.id.EmailText)
        password=findViewById(R.id.PasswordText)
        repeatpass=findViewById(R.id.RepeatPassText)
    }

    fun next(view: View)
    {
        if(firstName.text.toString().isNotEmpty()&&lastName.text.toString().isNotEmpty()&&mail.text.toString().isNotEmpty()
            &&password.text.toString().isNotEmpty()&&repeatpass.text.toString().isNotEmpty())
        {
            val intent = Intent(this@Reg, development::class.java)
            startActivity(intent)
            finish()
        }
        else
        {
            val alert = AlertDialog.Builder(this)
                .setTitle("Заполните текстовые поля")
                .setPositiveButton("OK",null)
                .create()
                .show()
        }
    }
    fun next2(view: View)
    {
        val intent = Intent(this@Reg, Signin::class.java)
        startActivity(intent)
        finish()
    }
}