fun main() {
    val x = 6
    when(x) {
        5->println("==5")
        6,7->println("6 or 7")
        in 1..10->println("1..10")
        in 200..202->{print("5");println("6")}
        else -> println("nothing")
    }

    when {
        x==5-> println("==5")
        x!=6->println("!=6")
        x==7 || x==8->println("7,8")
        else -> println("nothing")
    }
}