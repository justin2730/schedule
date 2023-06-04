package com.example.schedule

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class B_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_2)
    }

    fun page_b_1(view: View){
        val intent = Intent(this, B::class.java )
        startActivity(intent)
    }

    fun page_b_3(view: View){
        val intent = Intent(this, B_3::class.java )
        startActivity(intent)
    }
}