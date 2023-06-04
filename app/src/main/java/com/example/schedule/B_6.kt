package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class B_6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_6)
    }
    fun page_b_5(view: View){
        val intent = Intent(this, B_5::class.java )
        startActivity(intent)
    }

    fun page_b_7(view: View){
        val intent = Intent(this, B_7::class.java )
        startActivity(intent)
    }
}