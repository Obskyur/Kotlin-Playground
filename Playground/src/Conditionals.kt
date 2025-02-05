fun main() {
    val x: Int = 20
    val y: Int = 30

    val result = if (x == y) {
        "Are equal"
    }
    else {
        "Are not equal"
    }
    println(result)

    val explanation = when {
        x > y -> "x > y"
        x < y -> "x < y"
        else -> "x == y"
    }
    println(explanation)

    val range = when {
        x < 0 -> "x is less than 0"
        x in 0..4 -> "x is less than 5"
        x in 5..9 -> "x is less than 10"
        else -> "x is greater than or equal to 10"
    }
    println(range)
}