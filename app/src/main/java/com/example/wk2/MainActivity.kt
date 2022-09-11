package com.example.wk2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.RadioGroup

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main) // 레이아웃을 사용하거나
// setContentView(MyCanvas(this)) // 커스텀뷰 객체를 직접 생성하여 지정

        val radioGroup = findViewById<RadioGroup>(R.id.shape)
        val myView = findViewById<MyView>(R.id.view)

        radioGroup.setOnCheckedChangeListener { radioGroup, i ->
            when(i){
                R.id.squareBtn -> myView.rand =0
                R.id.circleBtn -> myView.rand = 1
                R.id.triangleBtn -> myView.rand = 2
            }
        }
    }


}