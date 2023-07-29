fun main() {

    val numbers = listOf(1, 2, 3, 4, 5, 6)
    val numbers2 = listOf(1, 2, 4, 8, 16, 32)
    val result = numbers.union(numbers2)

    /*result.forEachIndexed { index, el ->
        println("index: $index, id: $el")
    }*/

    for (number in numbers) {
        println(number)
    }

    println()

    for(index in 0 .. 4) {
        println("index: $index, id: ${numbers[index]}")
    }

    println()

    for(index in 0 until 4) {
        println("index: $index, id: ${numbers[index]}")
    }

    println()

    for(i in 0 until 20 step 2) {
        println("N#$i")
    }

    println()

    for(i in 400 downTo  0 step 50) {
        println("N#$i")
    }
}