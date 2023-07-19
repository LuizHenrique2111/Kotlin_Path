fun main() {

    val car1 = Siena("Siena", "FIAT")
    car1.power(1.6)
    car1.toDrive()

    val car2 = Corolla("Corolla", "Toyota")
    car2.power(3.0)
    car2.toDrive()

    val car3 = Civic("Civic", "Honda")
    car3.power(2.0)
    car3.toDrive()
}
