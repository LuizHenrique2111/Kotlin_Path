fun main() {

    val spiderman = Hero("Spiderman", "vai teia")
    println(spiderman.toString())
    println(Database.name)
    println(Database.heroLogged?.name)

    login(spiderman)
    println(Database.heroLogged?.name)

    val deadpool = Hero("Deadpool", "Imorrível")
    println(deadpool.toString())

    login(deadpool)
    println(Database.heroLogged?.name)
}

fun login(hero: Hero) {
    Database.heroLogged = hero
}