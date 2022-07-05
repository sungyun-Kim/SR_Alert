package com.niforances.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvDate = findViewById<TextView>(R.id.tv_date)

        // getter
        val tvDateStr = tvDate.text

        // setter
        tvDate.text = "3일 후에 알람이 울려요"


    }
}