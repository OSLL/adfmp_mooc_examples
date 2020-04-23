fun main() {
    println(sum(1, 2)) // returns 3
    println(sum(10)) // returns 17
    println(sum(a = 10)) // returns 17
    println(sum(b = -10)) // returns -10
    println(sum(b = 8, a = 5)) // returns 13
    println(sum(8, b = 13)) // returns 21
}

fun sum(a: Int = 0, b: Int = 7): Int {
    return a + b
}
