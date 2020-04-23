fun main() {
    val a = 7
    /* error: a = 10 */
    var b = 8
    b = 9
    var c: Int
    c = 11

    val double: Double = 10.0   // 8 bytes
    val float: Float = 10.0f    // 4 bytes
    val long : Long = 10L       // 8 bytes
    val long1: Long = 10        // 8 bytes
    val int: Int = 10           // 4 bytes
    val short: Short = 10       // 2 byte
    val byte: Byte = 10         // 1 byte
}