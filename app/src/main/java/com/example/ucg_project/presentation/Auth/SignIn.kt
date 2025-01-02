package com.example.ucg_project.presentation.Auth

import android.os.Bundle
import android.view.View
import android.widget.Toolbar
import androidx.activity.ComponentActivity
import com.example.ucg_project.R
import androidx.appcompat.app.AppCompatActivity;
import com.example.ucg_project.R.id.toolbar

class SignIn : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.signin)

       /* setSupportActionBar(findViewById<View>(toolbar) as androidx.appcompat.widget.Toolbar?)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)*/
    }
}