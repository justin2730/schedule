package com.example.schedule

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class D_photo : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d_photo)
    }

    fun page_d_6(view: View){
        val intent = Intent(this, D_lunch::class.java )
        startActivity(intent)
    }

    fun page0(view: View){
        val intent = Intent(this,MainActivity ::class.java )
        startActivity(intent)
    }
}