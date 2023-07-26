fun main() {

    val cars = mutableSetOf(
        "Jorge",
        "Jorge",
        "Matheus",
        "Bruce"
    )

    calc(6, 7, ::sum)
    calc(6, 4, ::minus)
    calc(8, 2, ::divide)

}

fun sum(x: Int, y: Int): Int {
    return x + y
}

fun minus(x: Int, y: Int): Int {
    return x - y
}

fun divide(x: Int, y: Int): Int {
    return x / y
}

fun calc(a: Int, b: Int, operation: (Int, Int) -> Int) {
    val result = operation(a, b)
    println("Resultado da operação $a com $b foi $result")
}