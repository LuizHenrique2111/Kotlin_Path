fun main() {

    val cars = arrayOf(
        Car("Siena", "Fiat"),
        Car("Civic", "Honda"),
        Car("911", "Porsche")
    )
    cars.forEach { println(it) }

    println("--------------------")

    val newList = cars.plus(Car("Rampage", "Dogde"))

    newList.forEach { println(it) }

    println("--------------------")

    println(newList[3])

    println("--------------------")

    newList[0] = Car("Onix", "Chevrolet")
    newList.forEach { println(it) }

}

