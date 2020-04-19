package com.example.a224

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

fun func1(): Int?
{
    return null
}

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var x = 6
        while(x>0) {
            x--
        }


        do{
            val y = func1()
        } while (y != null)


        val arr = Array(5){-1*it}
        for (el in arr)
        {
            println(el)
        }


        for (i in 0..5)
        {
            println(i)
        }


        for (i in 0..5 step 2)
        {
            println(i)
        }


        for (i in 5 downTo 0)
        {
            println(i)
        }


        // for(int i=0; i<length;i++)
        for(i in 0 until 5)
        {
            println(arr[i])
        }
    }
}
