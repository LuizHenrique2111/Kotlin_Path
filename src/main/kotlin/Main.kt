fun main() {

    val cars = setOf(
        "Jorge",
        "Jorge",
        "Matheus",
        "Bruce"
    )

    cars.forEach {
        println(it) // Só vai imprimir apenas uma vez o conteúdo repetido
    }
}