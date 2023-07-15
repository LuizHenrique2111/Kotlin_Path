fun main() {

    val bluePen = Musician()
    bluePen.desc()

    val guitar = bluePen.Guitar()
    guitar.desc()
}

// Nested Class
class Musician {

    var style: String = "Rock"

    fun desc() = println("Meu estilo é $style")

    inner class Guitar() {
        var strings = 6
        fun desc() = println("Tocando em uma guitarra com $strings cordas, e o estilo é $style")
    }
}