package com.example.a232

class Rectangle {
    public var h: Int = 0      // default - public
    private var w: Int = 0
    get(){return field}        // override
    set(v){field=v}            // override

    public fun sq(): Int{      // method
        return h*w
    }

}