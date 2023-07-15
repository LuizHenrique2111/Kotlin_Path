class Hero(var name: String, var power: String) {

    private val MAX_HEROS = 15

    companion object { //Compartilha entre todas as CLASSES tudo que for colocado em seu escopo
        var count = 0

        fun powerfull() {
            if (count > 2) {
                println("Eu sou o mais poderoso!")
            }
        }
    }

    init {
        println("HERÓI")
        count ++
        println(count)
        powerfull()

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