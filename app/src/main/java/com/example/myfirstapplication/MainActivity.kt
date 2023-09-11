package com.example.myfirstapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val myName = "Haniel"
        val textView = findViewById<TextView>(R.id.textView)
        val welcomeMessage = getString(R.string.welcome_message, myName)
        textView.text = welcomeMessage
    }
}