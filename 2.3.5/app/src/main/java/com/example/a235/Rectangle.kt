package com.example.a235

class Rectangle(h:Int, w:Int) {
    public var h: Int = h
    var w: Int = w
}

class Rectangle1(h:Int, w:Int) {
    public var h: Int
    var w: Int

    init{
        this.h = h
        this.w = w
    }
}


class Rectangle2(public var h:Int, var w:Int)
