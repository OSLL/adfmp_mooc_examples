package com.example.a236

class Rectangle(var h: Int, var w: Int) {
    constructor(x1:Int, y1:Int, x2:Int, y2:Int):
            this(y2-y1, x2-x1)
    {
        //code
        print("!")
    }
}
