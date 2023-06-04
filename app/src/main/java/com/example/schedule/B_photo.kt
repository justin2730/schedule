package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class B_photo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_photo)
    }
    fun page_b_7(view: View){
        val intent = Intent(this, B_7::class.java )
        startActivity(intent)
    }

    fun main(view: View){
        val intent = Intent(this,MainActivity ::class.java )
        startActivity(intent)
    }
}