package com.example.prevyearmidsemquesbank

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnSubmit=findViewById<Button>(R.id.btn_submit)
        val editName=findViewById<EditText>(R.id.edit_text)
        btnSubmit.setOnClickListener{
            if(editName.text.isEmpty()){
                Toast.makeText(this, "Please Enter Your name first.", Toast.LENGTH_SHORT).show()
            }else{
                val intent= Intent(this, years_Activity::class.java)
                startActivity(intent)
                finish()
            }
        }
    }
}