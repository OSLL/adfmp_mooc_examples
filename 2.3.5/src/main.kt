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


fun main() {
    val r = Rectangle(5, 4)
    val r1 = Rectangle1(5, 4)
    val r2 = Rectangle(5, 4)
}