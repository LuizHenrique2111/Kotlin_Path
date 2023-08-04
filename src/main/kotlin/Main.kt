fun buscarInstrumento(): Playable {
    return Violino()
}

fun getMenu(): Menu {
    return burguerKing()
}

fun main() {

    val musico1 = Musician("Tiago")
    musico1.playable = buscarInstrumento()
    //musico1.startPlay()
    musico1.menu = getMenu()
    musico1.fazerPedido()

}

class Musician(val nome: String) {

    lateinit var playable: Playable
    lateinit var menu: Menu

    fun startPlay() {
        playable.play()
    }

    fun fazerPedido() {
        val combo = menu.comboDoDia()
        println(combo)
    }

}

interface Menu {
    fun comboDoDia(): String
}

class mcDonald: Menu {
    override fun comboDoDia(): String {
        return "BigMac"
    }
}

class burguerKing: Menu {
    override fun comboDoDia(): String {
        return "Whopper"
    }
}

class excaliBurguer: Menu {
    override fun comboDoDia(): String {
        return "São Critovão"
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