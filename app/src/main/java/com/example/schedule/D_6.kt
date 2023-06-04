package com.example.schedule

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class D_6 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d_6)
    }

    fun page_d_5(view: View){
        val intent = Intent(this, D_5::class.java )
        startActivity(intent)
    }

    fun page_d_lunch(view: View){
        val intent = Intent(this, D_lunch::class.java )
        startActivity(intent)
    }
}