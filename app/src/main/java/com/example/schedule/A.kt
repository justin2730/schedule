package com.example.schedule

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class A : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a)
    }

    fun page0(view: View){
        val intent = Intent(this, MainActivity::class.java )
        startActivity(intent)
    }

    fun page_a_2(view: View){
        val intent = Intent(this, A_2::class.java )
        startActivity(intent)
    }
}