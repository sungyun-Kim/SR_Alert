package com.niforances.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.ImageButton
import com.nex3z.togglebuttongroup.MultiSelectToggleGroup

class CreateAlertActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_create_alert)

        val iBBack = findViewById<ImageButton>(R.id.iBBack)

        val buttonGroup = findViewById<MultiSelectToggleGroup>(R.id.group_weekdays)

        buttonGroup.setOnCheckedChangeListener { group, checkedId, isChecked ->

            when (checkedId) {

                R.id.sun -> Log.i("log_activity", "sunday $isChecked clicked")
                R.id.mon -> Log.i("log_activity", "mon $isChecked clicked")
                R.id.tue -> Log.i("log_activity", "tue $isChecked clicked")
                R.id.wed -> Log.i("log_activity", "wed $isChecked clicked")
                R.id.tur -> Log.i("log_activity", "tur $isChecked clicked")
                R.id.fri -> Log.i("log_activity", "fri $isChecked clicked")
                R.id.sat -> Log.i("log_activity", "sat $isChecked clicked")

            }


        }

        iBBack.setOnClickListener {
            finish()
        }
    }
}