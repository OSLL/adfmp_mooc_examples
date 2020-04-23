class Rectangle {
    public var h: Int = 0      // default - public
    private var w: Int = 0
        get(){return field}        // override
        set(v){field=v}            // override

    public fun sq(): Int{      // method
        return h*w
    }

}

fun main() {
    val r = Rectangle()
    println("${r.h}")
    // u cant println("${r.w}") because w is private
}