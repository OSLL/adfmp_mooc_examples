class Rectangle(var h: Int, var w: Int) {
    constructor(x1:Int, y1:Int, x2:Int, y2:Int):
            this(y2-y1, x2-x1)
    {
        //code
        print("it's constructor's code!")
    }
}


fun main() {
    val r = Rectangle(5, 6)
    val rx = Rectangle(0, 0, 5, 6)
}