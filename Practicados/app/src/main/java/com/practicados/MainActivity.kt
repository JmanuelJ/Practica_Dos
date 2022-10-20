package com.practicados

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageView
import android.widget.Toast


class MainActivity : AppCompatActivity() {
    private var imageDragon: ImageView? = null
    private var randomNumber: Int? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
    }
    private fun initView(){
        imageDragon = findViewById(R.id.image)
    }
    fun showImage(view: View){
        randomNumber = (1..4).random()
        when(randomNumber){
            1 -> imageDragon?.setImageDrawable(getDrawable(R.drawable.gohan))
            2 -> imageDragon?.setImageDrawable(getDrawable(R.drawable.goku))
            3 -> imageDragon?.setImageDrawable(getDrawable(R.drawable.piccolo))
            4 -> imageDragon?.setImageDrawable(getDrawable(R.drawable.vegeta))
            else -> Toast.makeText(this,"Error",Toast.LENGTH_SHORT).show()
        }
    }
}