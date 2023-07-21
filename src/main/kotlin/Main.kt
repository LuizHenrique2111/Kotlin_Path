fun main() {

    val btn = Button("Salvar", 0XFFF0000, Pair(20, 30))
    btn.render()

    val link = Link("Entrar", Pair(15, 20))
    link.render()

}

abstract class Component {
    abstract fun position() : Pair<Int, Int>

    open fun render() {
        println("tela: ${position().first} por ${position().second}")
    }
}

abstract class Text(val text: String) : Component() {
    override fun render() {
        super.render()
        println("Desenhando o texto: $text")
    }
}

class Button(text: String, val backgroundColor: Int, val pos: Pair<Int, Int>) : Text(text) {
    override fun position(): Pair<Int, Int> {
        return pos
    }

    override fun render() {
        super.render()
        println("Pintando o fundo de $backgroundColor")
    }
}

class Link(text: String, val pos: Pair<Int, Int>) : Text(text) {
    override fun position(): Pair<Int, Int> {
        return pos
    }
}
