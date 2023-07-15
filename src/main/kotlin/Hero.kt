class Hero(var name: String, var power: String) {

    companion object { //Compartilha entre todas as CLASSES tudo que for colocado em seu escopo
        const val MAX_HEROS = 15

    }

    init {
        println("HERÓI")

        if (name == "Batman") {
            println("Eu sou o mais preparado")
        }
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