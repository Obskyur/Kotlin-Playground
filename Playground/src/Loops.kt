fun main() {
    for (n in 1..100)
        println(n)
    var count = 0
    while (count < 100)
        println(count++)
    do {
        println(count--)
    } while (count > 0)
}