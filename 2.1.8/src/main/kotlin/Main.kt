fun main() {
    var s: String = "5"
    println(7 + s.toInt()) // returns 12
//    s.toDouble()
//    s.toLong()
//    s.toShort()
//    s.toFloat()
//    s.toString()

    /*
        Based on stepik comment:
        https://stepik.org/lesson/63224/step/8?discussion=566790&unit=40332
        Thanks, Alexey Abrosimov
     */
    var age: String = "25"

    println("1. Age: age")
    println("2. Age: $age")
    println("3. Age: ${age}")
    println("4. Age: ${age + 5}")
    println("5. Age: ${age.toInt() + 5}")
    println("6. Age: " + age + 5)
    println("7. Age: " + age.toInt() + 5)
    println("8. Age: " + (age.toInt() + 5))

    print("9. Age: ")
    println(age.toInt() + 5)

    print("10. Age: "); println(age.toInt() + 5)
}