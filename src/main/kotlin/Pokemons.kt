class Pokemons(var name: String, var tipe: String, var level: Int) {

    constructor(name: String) : this(name, "Fogo", 85) {
        println("c2")
    }

    fun updateName(newName: String) {
        name = newName
    }

    fun updateTipe(newTipe: String) {
        tipe = newTipe
    }

    fun updateLevel(newLevel: Int) {
        level = newLevel
    }

    fun printPokemon(): String {
        return "O pokemon $name é do tipo $tipe e está no level $level"
    }

}