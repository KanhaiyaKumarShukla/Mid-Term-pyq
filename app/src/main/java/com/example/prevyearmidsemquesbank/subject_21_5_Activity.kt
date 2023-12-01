package com.example.prevyearmidsemquesbank

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class subject_21_5_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_subject215)
        val question1_btn=findViewById<Button>(R.id.subject1_Q_btn)
        val answert1_btn=findViewById<Button>(R.id.subject1_A_btn)

        val question2_btn=findViewById<Button>(R.id.subject2_Q_btn)
        val answert2_btn=findViewById<Button>(R.id.subject2_A_btn)

        val question3_btn=findViewById<Button>(R.id.subject3_Q_btn)
        val answert3_btn=findViewById<Button>(R.id.subject3_A_btn)

        val question4_btn=findViewById<Button>(R.id.subject4_Q_btn)
        val answert4_btn=findViewById<Button>(R.id.subject4_A_btn)

        val question5_btn=findViewById<Button>(R.id.subject4_A_btn)
        val ansert1_btn=findViewById<Button>(R.id.subject4_A_btn)
    }
}