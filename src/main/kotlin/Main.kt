fun main() {

    val cars = mutableListOf(
        Car("Siena", "Fiat"),
        Car("Renagede", "Jeep")
    )

    val filtered = cars.filter { car ->
        car.name.lowercase().contains("de")
    }
    filtered.forEach { println(it) }

    println("----------------------------")

    val filteredNot = cars.filterNot { car ->
        car.name.lowercase().contains("si")
    }
    filteredNot.forEach { println(it) }

    println("----------------------------")

    val objFiltered = cars.firstOrNull() { it.name == "Siena" }
    val objFiltered2 = cars.firstOrNull() { it.name == "Renegade" }
    println(objFiltered)
    println(objFiltered2)
}

