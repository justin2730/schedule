package com.example.schedule

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class D_2 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d_2)
    }

    fun page_d_1(view: View){
        val intent = Intent(this, D::class.java )
        startActivity(intent)
    }

    fun page_d_3(view: View){
        val intent = Intent(this, D_3::class.java )
        startActivity(intent)
    }
}