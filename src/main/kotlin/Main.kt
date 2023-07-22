fun main() {

    val cars = listOf<Car>(
        Car("Siena", "Fiat"),
        Car("Civic", "Honda"),
        Car("911", "Porsche")
    )
    cars.forEach { println(it) }

    println()

    println(cars.firstOrNull())

    println(cars.lastOrNull())

    println()

    val emptyList = emptyList<Car?>()

}

