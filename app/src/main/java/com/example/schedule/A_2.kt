package com.example.schedule

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class A_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_a_2)
    }

    fun page_a_1(view: View){
        val intent = Intent(this, A::class.java )
        startActivity(intent)
    }

    fun page_a_3(view: View){
        val intent = Intent(this, A_3::class.java )
        startActivity(intent)
    }
}