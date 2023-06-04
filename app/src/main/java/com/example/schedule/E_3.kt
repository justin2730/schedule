package com.example.schedule

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class E_3 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e_3)
    }

    fun page_e_2(view: View){
        val intent = Intent(this, E_2::class.java )
        startActivity(intent)
    }

    fun page_e_4(view: View){
        val intent = Intent(this, E_4::class.java )
        startActivity(intent)
    }
}