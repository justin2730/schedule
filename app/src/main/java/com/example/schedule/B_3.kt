package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class B_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_3)
    }

    fun page_b_2(view: View){
        val intent = Intent(this, B_2::class.java )
        startActivity(intent)
    }

    fun page_b_4(view: View){
        val intent = Intent(this, B_4::class.java )
        startActivity(intent)
    }
}