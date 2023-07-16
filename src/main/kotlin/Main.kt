fun main() {

    val hero1 = Hero("Wolverine", "Garras")

    when(hero1.name) {
        "Batman" -> {
            println("Eu sou o mais preparado")
        }
        "Wolverine" -> {
            println("Maldição aaaaaaaa")
        }
        "Spiderman" -> {
            println("Vai teia")
        }
        else -> println("Não foi informado nenhum dos heróis esperados")
    }

    val hero2 = Hero("Superman", "Rico")

    val heros = when {
        (hero2.name == "Superman") -> "POwerfulll"
        else -> "Preparado"
    }
    println(heros)
}
