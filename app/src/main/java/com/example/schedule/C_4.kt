package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class C_4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c_4)
    }

    fun page_c_3(view: View){
        val intent = Intent(this, C_3::class.java )
        startActivity(intent)
    }

    fun page_c_5(view: View){
        val intent = Intent(this, C_5::class.java )
        startActivity(intent)
    }
}