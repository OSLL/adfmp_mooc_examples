package com.example.a2311

open class Rectangle(var h: Int, var w: Int){
    open fun sq()=h*w
}

class magicRect(h:Int, w:Int): Rectangle(h,w){
    final override fun sq()=42*super.sq()     // defualt - open, 'final' - can't override
}

class magicMagicRect(h:Int, w:Int): Rectangle(h,w), Magic{
    // using interface
    final override fun sq()=super<Magic>.Magic()*super<Rectangle>.sq()
}

interface Magic{
    fun Magic()=42
}
