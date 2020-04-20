fun main() {
    var nullDouble: Double?
    var nullInt: Int?
    var nullString: String?

    var nonNullDouble: Double
    var nonNullInt: Int
    var nonNullString: String



    val string = readLine()
//    println(string.length) // error: type String?

    // prints length if not null. Do nothing otherwise
    if (string != null) println(string.length)

    // prints length or null
    println(string?.length)

    // prints length or throw exception and crash
    println(string!!.length)



    // return readLine output or "" if readLine returns null
    val safeString = readLine() ?: ""
}

