fun main() {

    val cars = mutableListOf<Car>(
        Car("Siena", "Fiat"),
        Car("Civic", "Honda"),
        Car("911", "Porsche")
    )
    cars.forEach { println(it) }

    println()

    println(cars.firstOrNull())

    println(cars.lastOrNull())

    println()

    println(cars.isEmpty())
    cars[1] = Car("Renegade", "Jeep")
    cars.forEach { println(it) }

    println()

    cars.add(Car("Toro", "Fiat"))
    cars.forEach { println(it) }

    println()

    val emptyList = emptyList<Car?>()

}

