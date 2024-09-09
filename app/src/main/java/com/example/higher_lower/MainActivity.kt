package com.example.higher_lower

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    private lateinit var title1:TextView
    private lateinit var title2:TextView
    private lateinit var views:TextView
    private lateinit var topimage:ImageView
    private lateinit var botimage:ImageView
    private lateinit var higher: Button
    private lateinit var lower: Button
    private lateinit var testInfo:Array<Info>



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        testInfo= GameManager.GetNewInfo(GameManager.quizType)
        title1 = findViewById(R.id.title1)
        title2 = findViewById(R.id.title2)
        topimage = findViewById(R.id.topimage)
        botimage = findViewById(R.id.botimage)
        views = findViewById(R.id.views1)
        higher= findViewById(R.id.higher)
        lower=findViewById(R.id.lower)




        printStage()


    }
    private fun printStage(){
        title1.setText(testInfo[GameManager.currentQuiz].name)
        title2.setText(testInfo[GameManager.currentQuiz+1].name)
        views.setText(testInfo[GameManager.currentQuiz].views.toString())
        topimage.setImageResource(testInfo[GameManager.currentQuiz].image)
        botimage.setImageResource(testInfo[GameManager.currentQuiz+1].image)
    }
    public fun checkHigher(view: View){
        if (testInfo[GameManager.currentQuiz].views<=testInfo[GameManager.currentQuiz+1].views){
            GameManager.currentQuiz++
            if (GameManager.currentQuiz+1>=testInfo.size){
                val s = Intent(this,Win::class.java)
                startActivity(s)
                return
            }
            printStage()
        }
        else{
            val i = Intent(this,Lose::class.java)
            startActivity(i)
        }

    }
    public fun checklower(view: View) {
        if (testInfo[GameManager.currentQuiz].views >= testInfo[GameManager.currentQuiz+1].views) {
            GameManager.currentQuiz++
            if (GameManager.currentQuiz+1>=testInfo.size){
                val s = Intent(this,Win::class.java)
                startActivity(s)
                return
            }
            printStage()
        }
        else{
            val i = Intent(this,Lose::class.java)
            startActivity(i)
        }
    }

}