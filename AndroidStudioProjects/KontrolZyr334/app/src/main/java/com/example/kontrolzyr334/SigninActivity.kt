package com.example.kontrolzyr334

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.content.Intent
import android.widget.EditText
import androidx.appcompat.app.AlertDialog

class SigninActivity : AppCompatActivity() {
    lateinit var login:EditText
    lateinit var pass:EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_signin)
        login = findViewById(R.id.loginText)
        pass = findViewById(R.id.passText)
    }

    fun Continue(view: View) {
        if(login.text.toString().isNotEmpty()&&pass.text.toString().isNotEmpty())
        {
            val intent = Intent(this@SigninActivity, PatchActivity::class.java)
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
    fun RecoverPassword(view: View) {
        val intent = Intent(this@SigninActivity, RecoveryActivity::class.java)
        startActivity(intent)
        finish()
    }
}