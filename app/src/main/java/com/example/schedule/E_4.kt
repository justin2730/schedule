package com.example.schedule

import android.content.Intent
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class E_4 : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_e_4)
    }

    fun page_e_3(view: View){
        val intent = Intent(this, E_3::class.java )
        startActivity(intent)
    }

    fun pagep_e_photo(view: View){
        val intent = Intent(this, E_photo::class.java )
        startActivity(intent)
    }
}