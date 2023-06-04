package com.example.schedule

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class D : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d)
    }

    fun page0(view: View){
        val intent = Intent(this, MainActivity::class.java )
        startActivity(intent)
    }

    fun page_d_2(view: View){
        val intent = Intent(this, D_2::class.java )
        startActivity(intent)
    }
}