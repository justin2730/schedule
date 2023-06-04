package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class A_8 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_8)
    }

    fun page_a_7(view: View){
        val intent = Intent(this, A_7::class.java )
        startActivity(intent)
    }

    fun page_a_p(view: View){
        val intent = Intent(this, A_photo::class.java )
        startActivity(intent)
    }
}