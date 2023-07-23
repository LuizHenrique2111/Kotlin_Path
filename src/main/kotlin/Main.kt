fun main() {

    val a = mutableListOf("Jorge", "Maria")
    val b = listOf("João", "Fadua", "Henrique")

    b.filterTo(a, { it.contains("u") && it.contains("a")})
    println(a)

    println()

    val c = listOf("A", "B")
    val d = listOf("E", "F")
    val all = listOf(c, d)
    println(all)
    println(all.flatten())

}

