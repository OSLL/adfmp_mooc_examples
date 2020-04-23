
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

fun main() {
    val r = Rectangle(5, 6)
    println(r.sq())
    val mR = magicRect(5, 6)
    println(mR.sq())
    val mmR = magicMagicRect(5, 6)
    println(mmR.sq())

}
