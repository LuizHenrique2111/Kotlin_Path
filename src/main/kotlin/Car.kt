data class Car(var name: String, var hasPower: Boolean) {

    fun power(): Boolean {
        println("O carro $name é da marca $hasPower e tem 200 cavalos de potência")
        return true
    }

    fun toDrive(driver: Driver) {
        if(power()) {
            println("Sendo dirigido pelo ${driver.name}")
        } else {
            println("Potência não inserida")
        }
        when(name) {
            "Civic" -> println("VRUMMMMVRUMMMMM")
            "Siena" -> println("PIPIPIPOPOPO")
            "Corolla" -> println("VIIIIIIIUUUUUUMMMMMMMM")
        }
    }

}

/*class Siena(name: String, brand: String) : Car(name, brand) {
    override fun power(): Boolean {
        println("O carro $name é da marca $brand e tem 200 cavalos de potência")
        return true
    }
}

class Corolla(name: String, brand: String) : Car(name, brand) {
    override fun power(): Boolean {
        println("O carro $name é da marca $brand e tem 400 cavalos de potência")
        return false
    }
}

class Civic(name: String, brand: String) : Car(name, brand) {
    override fun power(): Boolean {
        println("O carro $name é da marca $brand e tem 350 cavalos de potência")
        return true
    }
}*/

class Driver(val name: String)