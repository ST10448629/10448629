package com.example.myweatherapplication

import android.health.connect.datatypes.units.Temperature
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)

        lateinit var txtDaysOfTheWeek : TextView
        lateinit var txtDailyTemperatures: TextView
        lateinit var btnReturn : Button

        //txtDailyTemperatures= findViewById<TextView>(R.id.txtDailyTemperatures)
        //txtDaysOfTheWeek = findViewById<TextView>(R.id.txtDaysOfTheWeek)
        //btnReturn = findViewById<Button>(R.id.btnReturn)
    }
}