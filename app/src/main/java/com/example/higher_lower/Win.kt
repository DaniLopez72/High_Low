package com.example.higher_lower

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button

private lateinit var btn:Button
class Win:Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.win)

        btn=findViewById(R.id.win)


    }
    public fun menu(view: View){
        val i =Intent(this, Splash::class.java)
        startActivity(i)
    }
}