package com.example.prevyearmidsemquesbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class years_Activity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_years)
        val btn_23=findViewById<Button>(R.id.btn_23)
        val btn_22=findViewById<Button>(R.id.btn_22)
        val btn_21=findViewById<Button>(R.id.btn_21)
        val btn_20=findViewById<Button>(R.id.btn_20)
        Toast.makeText(this, "Please select the year-", Toast.LENGTH_LONG).show()
        btn_23.setOnClickListener{
            val intent=Intent(this, year_23_Activity::class.java)
            startActivity(intent)
            finish()
        }
        btn_22.setOnClickListener{
            val intent=Intent(this, year_22_Activity::class.java)
            startActivity(intent)
            finish()
        }
        btn_21.setOnClickListener{
            val intent=Intent(this, year_21_Activity::class.java)
            startActivity(intent)
            finish()
        }
        btn_20.setOnClickListener{
            val intent=Intent(this, year_20_Activity::class.java)
            startActivity(intent)
            finish()
        }
    }
}