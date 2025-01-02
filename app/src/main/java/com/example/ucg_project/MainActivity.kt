package com.example.ucg_project

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.ucg_project.presentation.Auth.Login
import com.example.ucg_project.presentation.Auth.SignIn
import com.example.ucg_project.ui.theme.UCG_projectTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity)


        val loginButton: Button = findViewById(R.id.login)

        loginButton.setOnClickListener {
            val intent = Intent(this@MainActivity, Login::class.java)
            startActivity(intent)
        }

        val signinButton: Button = findViewById(R.id.sign)
        signinButton.setOnClickListener{
            val intent=Intent(this@MainActivity, SignIn::class.java)
            startActivity(intent)
        }
    }
}