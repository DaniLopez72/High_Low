package com.example.higher_lower

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.Button


class Lobby:Activity() {
    private lateinit var coches: Button
    private lateinit var animales: Button
    private lateinit var deporte: Button
    private lateinit var random: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.lobby)

        coches=findViewById(R.id.a0)
        animales=findViewById(R.id.a1)
        deporte=findViewById(R.id.a2)
        random=findViewById(R.id.a3)


    }
    public fun coches(view: View){
        GameManager.quizType=0
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }public fun animales(view: View){
        GameManager.quizType=1
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }public fun deporte(view: View){
        GameManager.quizType=2
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }public fun random(view: View){
        GameManager.quizType=3
        val i = Intent(this, MainActivity::class.java)
        startActivity(i)
    }
}