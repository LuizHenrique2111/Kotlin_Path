fun main() {

    val cars = mutableSetOf(
        Car("Siena", true),
        Car("Onix", true),
        Car("Ford Ka", false)
    )

    calc(6, 7, ::sum)
    calc(6, 4, ::minus)
    calc(8, 2, ::divide)

    calc(8, 2) { a,b ->
        a * b
    }

    val newCars = cars.filter(::filtro)
    newCars.forEach {
        println(it)
    }

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

fun filtro(car: Car): Boolean {
    return car.name.lowercase().contains("ix")
}

fun calc(a: Int, b: Int, operation: (Int, Int) -> Int) {
    val result = operation(a, b)
    println("Resultado da operação $a com $b foi $result")
}