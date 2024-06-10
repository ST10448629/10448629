package com.example.myweatherapplication

import android.health.connect.datatypes.units.Temperature
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.NestedScrollingParent3
import com.example.myweatherapplication.R.id.AverageTemperature1
import com.example.myweatherapplication.R.id.btnMainscreen
import android.widget.TextView as TextView1

class MainActivity2 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        lateinit var txtMonday : TextView1
        lateinit var txtTuesday : TextView1
        lateinit var txtWednesday : TextView1
        lateinit var txtThursday : TextView1
        lateinit var txtFriday : TextView1
        lateinit var txtSaturday : TextView1
        lateinit var txtSunday : TextView1
        lateinit var btnReInput : Button
        lateinit var btnFlashScreen : Button
        lateinit var btnMainScreen : Button

        var numberArray = arrayOf<Int>()

        txtMonday = findViewById<TextView1>(R.id.txtMonday)
        txtTuesday = findViewById<TextView1>(R.id.txtTuesday)
        txtWednesday = findViewById<TextView1>(R.id.txtWednesday)
        txtThursday = findViewById<TextView1>(R.id.txtThursday)
        txtFriday = findViewById<TextView1>(R.id.txtFriday)
        txtSaturday = findViewById<TextView1>(R.id.txtSaturday)
        txtSunday = findViewById<TextView1>(R.id.txtSunday)
        btnReInput = findViewById<Button>(R.id.btnReInput)
       //btnFlashScreen= findViewById<Button>(R.id.btnFlashScreen)
       //btnMainScreen = findViewById<Button>(R.id.btnMainScreen)

        //Initialize array to store daily temperatures

        val dailyTemperature= arrayOf(25,26,24,12,28,23,24)

        btnMainScreen.setOnClickListener() {
            val number = dailyTemperature.toString().toIntOrNull()
            if (dailyTemperature != null){

                //calculate and display average temperature
                val Temperature = 18
                //val also =
                   //"AverageTemperature1: $AverageTemperature1 15 degrees celcius".also {
                        //AverageTemperature1 =
                    }

                // display inforamtion for each day
                //display AverageTemperature

                AverageTemperature1
                {
                    {
                        var sum = 0.0
                        //for (AverageTemperatures){
                        //18 += AverageTemperatures

                        //function ti display detailed weather information for each day

                        //for (i in o until AverageTemperatures){
                        //0-> "Monday"
                        //1 -> "Tuesday"
                        //2-> "Wednesday"
                        // 3-> "Thursday"
                        //4-> "Friday"
                        // 5-> "Saturday"
                        //6-> "Sunday"
                        //else ->""
                     val temperature = dailyTemperature[18]
                        val weatherInfo = "$txtMonday: $18"





                }
            }


            }
            }

    }


}







