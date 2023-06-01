package com.example.schedule

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun page1(view: View){
        val intent = Intent(this, A::class.java )
        startActivity(intent)
    }
    fun page2(view: View){
        val intent = Intent(this, B::class.java )
        startActivity(intent)
    }
    fun page3(view: View){
        val intent = Intent(this, C::class.java )
        startActivity(intent)
    }
    fun page4(view: View){
        val intent = Intent(this, D::class.java )
        startActivity(intent)
    }
    fun page5(view: View){
        val intent = Intent(this, E::class.java )
        startActivity(intent)
    }


}