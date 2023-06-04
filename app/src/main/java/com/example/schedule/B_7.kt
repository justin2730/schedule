package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class B_7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_b_7)
    }

    fun page_b_6(view: View){
        val intent = Intent(this, B_6::class.java )
        startActivity(intent)
    }

    fun page_b_p(view: View){
        val intent = Intent(this, B_photo::class.java )
        startActivity(intent)
    }
}