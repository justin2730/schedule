package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class C_3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c_3)
    }

    fun page_c_2(view: View){
        val intent = Intent(this, C_2::class.java )
        startActivity(intent)
    }

    fun page_c_4(view: View){
        val intent = Intent(this, C_4::class.java )
        startActivity(intent)
    }
}