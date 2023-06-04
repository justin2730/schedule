package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class A_6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_6)
    }

    fun page_a_5(view: View){
        val intent = Intent(this, A_5::class.java )
        startActivity(intent)
    }

    fun page_a_7(view: View){
        val intent = Intent(this,A_7::class.java )
        startActivity(intent)
    }
}