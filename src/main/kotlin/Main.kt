fun main() {

    val car1 = Siena("Siena", "FIAT")
    car1.power()
    car1.toDrive(Driver("Marcos"))

    val car2 = Corolla("Corolla", "Toyota")
    car2.power()
    car2.toDrive(Driver("Rogerio"))

    val car3 = Civic("Civic", "Honda")
    car3.power()
    car3.toDrive(Driver("José"))
}
