package com.example.a441

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        // using findViewById
        var tw_:TextView = findViewById(R.id.tw)
        Log.d("tw", tw_.text.toString())

        // using kotlinx
        Log.d("tw", tw.text.toString())
    }
}
