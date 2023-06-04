package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class A_7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_7)
    }
    fun page_a_6(view: View){
        val intent = Intent(this, A_6::class.java )
        startActivity(intent)
    }

    fun page_a_8(view: View){
        val intent = Intent(this, A_8::class.java )
        startActivity(intent)
    }
}