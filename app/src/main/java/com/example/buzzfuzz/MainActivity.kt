package com.example.buzzfuzz

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView
import java.util.Random

class MainActivity : AppCompatActivity() {

    var ListPrime = arrayOf(3,5,7,11,13)
    val rnd = (ListPrime).random()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.main_activity_layout)
    }




}