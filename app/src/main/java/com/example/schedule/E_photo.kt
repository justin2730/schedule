package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class E_photo : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e_photo)
    }
    fun page_e_4(view: View){
        val intent = Intent(this, E_4::class.java )
        startActivity(intent)
    }

    fun main(view: View){
        val intent = Intent(this,MainActivity ::class.java )
        startActivity(intent)
    }
}