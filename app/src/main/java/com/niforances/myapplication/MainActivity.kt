package com.niforances.myapplication

import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Switch
import android.widget.TextView
import androidx.appcompat.widget.SwitchCompat
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.core.content.ContextCompat
import com.google.android.material.floatingactionbutton.FloatingActionButton

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tvDate = findViewById<TextView>(R.id.tv_date)
        // 최상위 부모에서 카드뷰에 연결
        val cardAlert = findViewById<CardView>(R.id.card_alert)
        // 카드뷰에서 ConstraintLayout 으로 연결
        val cardCL = cardAlert.findViewById<ConstraintLayout>(R.id.card_cl)
        // ConstraintLayout 에서 스위치에 연결
        val swCard = cardCL.findViewById<Switch>(R.id.sw_alert)

        val fabAdd = findViewById<FloatingActionButton>(R.id.fabAdd)

        val tvTime = cardCL.findViewById<TextView>(R.id.tvTime)
        val tvTime_2 = cardCL.findViewById<TextView>(R.id.tvTime2)
        val tv_date = cardCL.findViewById<TextView>(R.id.tvDate)

        if (swCard.isChecked) {
            //활성화 됨
            tvTime.setTextColor(ContextCompat.getColor(this, R.color.black))
            tvTime_2.setTextColor(ContextCompat.getColor(this, R.color.black))
            tv_date.setTextColor(ContextCompat.getColor(this, R.color.black))
            tvDate.text = "3일 후에 알람이 울려요"
        } else {
            //안됨
            tvTime.setTextColor(ContextCompat.getColor(this, R.color.gray))
            tvTime_2.setTextColor(ContextCompat.getColor(this, R.color.gray))
            tv_date.setTextColor(ContextCompat.getColor(this, R.color.gray))
            tvDate.text = "예정된 알람 없음"
        }

        swCard.setOnCheckedChangeListener { compoundButton, b ->
            if (b) {
                //활성화 됨
                tvTime.setTextColor(ContextCompat.getColor(this, R.color.black))
                tvTime_2.setTextColor(ContextCompat.getColor(this, R.color.black))
                tv_date.setTextColor(ContextCompat.getColor(this, R.color.black))

                tvDate.text = "3일 후에 알람이 울려요"
            } else {
                //안됨
                tvTime.setTextColor(ContextCompat.getColor(this, R.color.gray))
                tvTime_2.setTextColor(ContextCompat.getColor(this, R.color.gray))
                tv_date.setTextColor(ContextCompat.getColor(this, R.color.gray))

                tvDate.text = "예정된 알람 없음"
            }
        }

        fabAdd.setOnClickListener {
            val intent = Intent(this, CreateAlertActivity::class.java)
            startActivity(intent)
        }

        // getter
        val tvDateStr = tvDate.text


    }
}
