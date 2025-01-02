package com.example.ucg_project.presentation.Auth

import android.os.Bundle
import android.view.View
import android.widget.Toolbar
import androidx.activity.ComponentActivity
import com.example.ucg_project.R
import androidx.appcompat.app.AppCompatActivity;

class Login : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.login)


        // assigning ID of the toolbar to a variable
        setSupportActionBar(findViewById<View>(R.id.toolbar) as androidx.appcompat.widget.Toolbar?)
        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
    }
}