fun main() {
    try {
        // DaNgEr!
        callMagic()
        println("Success")
    } catch (re: RuntimeException) {
        println("Runtime exception")
    } catch (aioobe: ArrayIndexOutOfBoundsException) {
        println("Out of bounds")
    } finally {
        println("Prints each time no matter what happened")
    }
}

fun callMagic() {
//    throw RuntimeException()
    arrayOf("")[19]
}
