package com.example.schedule

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class D_5 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_d_5)
    }

    fun page_d_4(view: View){
        val intent = Intent(this, A_4::class.java )
        startActivity(intent)
    }

    fun page_d_6(view: View){
        val intent = Intent(this, A_6::class.java )
        startActivity(intent)
    }
}