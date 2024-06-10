package com.example.myweatherapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lateinit var textNameofapp:TextView
        lateinit var btnMainscreen : Button

        //textNameofapp = findViewById<TextView>(R.id.textNameofApp)
        btnMainscreen = findViewById<Button>(R.id.btnMainscreen)

    }
   }
