package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class A_photo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_photo)
    }
    fun page_a_8(view: View){
        val intent = Intent(this, A_8::class.java )
        startActivity(intent)
    }

    fun main(view: View){
        val intent = Intent(this,MainActivity ::class.java )
        startActivity(intent)
    }
}