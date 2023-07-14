class Hero(var name: String, var power: String) {

    private val MAX_HEROS = 15

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