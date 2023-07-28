fun main() {

    val numbers = listOf(1, 2, 3, 5)
    val numbers2 = listOf(1, 2, 4, 8, 16)
    val result = numbers.union(numbers2)

    result.forEach { println(it) }
}