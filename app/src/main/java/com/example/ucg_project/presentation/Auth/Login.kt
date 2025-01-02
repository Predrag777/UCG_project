package com.example.ucg_project.presentation.Auth

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toolbar
import androidx.activity.ComponentActivity
import com.example.ucg_project.R
import androidx.appcompat.app.AppCompatActivity;
import com.example.ucg_project.presentation.news.News

class Login : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)


        val loginButton=findViewById<Button>(R.id.login)
        loginButton.setOnClickListener{
            val intent = Intent(this@Login, News::class.java)
            startActivity(intent)
        }
    }

}