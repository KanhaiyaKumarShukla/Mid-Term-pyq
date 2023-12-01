package com.example.prevyearmidsemquesbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class year_20_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_year20)
        val sem_1_btn=findViewById<Button>(R.id.sem_1_btn)
        val sem_2_btn=findViewById<Button>(R.id.sem_2_btn)
        val sem_3_btn=findViewById<Button>(R.id.sem_3_btn)
        val sem_4_btn=findViewById<Button>(R.id.sem_4_btn)
        val sem_5_btn=findViewById<Button>(R.id.sem_5_btn)
        val sem_6_btn=findViewById<Button>(R.id.sem_6_btn)
        val sem_7_btn=findViewById<Button>(R.id.sem_7_btn)
        val sem_8_btn=findViewById<Button>(R.id.sem_8_btn)
        sem_1_btn.setOnClickListener{
            val intent= Intent(this, subject_20_1_Activity::class.java)
            startActivity(intent)
            finish()
        }
        sem_2_btn.setOnClickListener{
            val intent= Intent(this, subject_20_2_Activity::class.java)
            startActivity(intent)
            finish()
        }
        sem_3_btn.setOnClickListener{
            val intent= Intent(this, subject_20_3_Activity::class.java)
            startActivity(intent)
            finish()
        }
        sem_4_btn.setOnClickListener{
            val intent= Intent(this, subject_20_4_Activity::class.java)
            startActivity(intent)
            finish()
        }
        sem_5_btn.setOnClickListener{
            val intent= Intent(this, subject_20_5_Activity::class.java)
            startActivity(intent)
            finish()
        }
        sem_6_btn.setOnClickListener{
            val intent= Intent(this, subject_20_6_Activity::class.java)
            startActivity(intent)
            finish()
        }
        sem_7_btn.setOnClickListener{
            val intent= Intent(this, subject_20_7_Activity::class.java)
            startActivity(intent)
            finish()
        }
        sem_8_btn.setOnClickListener{
            val intent= Intent(this, subject_20_8_Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}