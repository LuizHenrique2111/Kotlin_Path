fun main() {

    // val cordinates = Pair("Pedro", 50)
    val cordinates = "Pedro" to 50
    
    println(cordinates.first)
    println(cordinates.second)

    val triple = Triple(200, 20, 120)

    println(triple.first)
    println(triple.second)
    println(triple.third)
}

data class Cordinate(var x: Int, var y: Int)

data class Game3d(var x: Int, var y: Int, var z: Int)

data class User(var name: String, var lastName: String, var isAdmin: Boolean) {

    fun desc(): String = "Meu nom é $name"
}
