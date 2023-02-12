package com.example.a334zyrianov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AlertDialog


class Signin : AppCompatActivity()
{
    lateinit var mail:EditText
    lateinit var pass:EditText
//    val pattern = ("[a-z]{1,100}" + "@" + "[a-z]{1,6}" + "\\." + "[a-z]{1,5}")
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        mail=findViewById(R.id.emailText)
        pass=findViewById(R.id.passText)
    }
//    fun emailValid(text:String):Boolean
//    {
//        return Pattern.compile(pattern).matcher(text).matches()
//    }
//
//    fun but(view: View) {
//        if(mail.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty())
//        {
//            if (emailValid(mail.text.toString()))
//            {
//                val intent = Intent (this@Signin,development::class.java)
//                startActivity(intent)
//                finish()
//            }
//            else {
//                Toast.makeText(this,"ошибка при заполнении поля e-mail", Toast.LENGTH_SHORT).show()
//            }
//        }
//        else
//        {
//            val alert = AlertDialog.Builder(this)
//                .setTitle("Заполните текстовые поля")
//                .setPositiveButton("OK",null)
//                .create()
//                .show()
//        }
//    }
    fun next (view: View)
    {
        if(mail.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty())
        {
            val intent = Intent(this@Signin, development::class.java)
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
        val intent = Intent (this@Signin, Reg::class.java)
        startActivity(intent)
        finish()
    }
}