package com.example.schedule

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class D_4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d_4)
    }

    fun page_d_3(view: View){
        val intent = Intent(this, D_3::class.java )
        startActivity(intent)
    }

    fun page_d_5(view: View){
        val intent = Intent(this, D_5::class.java )
        startActivity(intent)
    }
}