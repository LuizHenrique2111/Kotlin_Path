abstract class Car(var name: String, var brand: String) {
    abstract fun power(power: Double)

    fun toDrive() {
        when(name) {
            "Civic" -> println("VRUMMMMVRUMMMMM")
            "Siena" -> println("PIPIPIPOPOPO")
            "Corolla" -> println("VIIIIIIIUUUUUUMMMMMMMM")
        }
    }

}

class Siena(name: String, brand: String) : Car(name, brand) {
    override fun power(power: Double) {
        println("O carro $name, da marca $brand e tem $power de potência")
    }
}

class Corolla(name: String, brand: String) : Car(name, brand) {
    override fun power(power: Double) {
        println("O carro $name, da marca $brand e tem $power de potência")
    }
}

class Civic(name: String, brand: String) : Car(name, brand) {
    override fun power(power: Double) {
        println("O carro $name, da marca $brand e tem $power de potência")
    }
}