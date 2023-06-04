package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class C_7 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_c_7)
    }

    fun page_c_6(view: View){
        val intent = Intent(this, C_6::class.java )
        startActivity(intent)
    }

    fun page_c_photo(view: View){
        val intent = Intent(this, C_photo::class.java )
        startActivity(intent)
    }
}