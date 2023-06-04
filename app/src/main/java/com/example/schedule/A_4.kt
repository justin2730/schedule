package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class A_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_4)
    }

    fun page_a_3(view: View){
        val intent = Intent(this, A_3::class.java )
        startActivity(intent)
    }

    fun page_a_5(view: View){
        val intent = Intent(this, A_5::class.java )
        startActivity(intent)
    }
}