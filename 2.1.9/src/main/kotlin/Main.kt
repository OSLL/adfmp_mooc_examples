fun main() {
    val stringSafe = readLine()
    println(stringSafe)
    /*
     * NullPointerException error will be occurred
     * if input stream make some strange things
     * like redirecting or closing, but it's ok
     */
    val string = readLine()!!
    println(string)
}