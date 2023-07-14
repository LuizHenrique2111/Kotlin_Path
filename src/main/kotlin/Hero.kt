class Hero(var name: String, var power: String) {

    init {
        println("HERÓI")
    }

    constructor(power: String) : this("Batman", power) {
        println("CONSTRUCTOR 2")
    }

    constructor() : this("Rico") {
        println("CONSTRUCTOR 3")
    }

    override fun toString(): String {
        return "Herói: " + name + "\nSuper Poder: " + power
    }

}