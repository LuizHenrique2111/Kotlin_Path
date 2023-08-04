fun buscarInstrumento(): Playable {
    return Violino()
}

fun main() {

    val musico1 = Musician("Tiago")
    musico1.playable = buscarInstrumento()
    musico1.startPlay()

}

class Musician(val nome: String) {

    lateinit var playable: Playable

    fun startPlay() {
        playable.play()
    }
}

interface Playable {
    fun play()
}

class Guitar: Playable {
    override fun play() {
        println("tocando guitarra")
    }
}

class Bateria: Playable {
    override fun play() {
        println("tocando bateria")
    }
}

class Violino:  Playable {
    override fun play() {
        println("tocando violino")
    }
}