package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class C_photo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c_photo)
    }
    fun page_c_7(view: View){
        val intent = Intent(this, C_7::class.java )
        startActivity(intent)
    }

    fun main(view: View){
        val intent = Intent(this,MainActivity ::class.java )
        startActivity(intent)
    }
}