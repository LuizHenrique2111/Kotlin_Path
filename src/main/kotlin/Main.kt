import java.lang.NumberFormatException

fun main() {

    val obj: Any = getObject(3)

//    val cast = obj as String
//    println(cast.length)

    divide("a","3")
}

fun divide(x: String, y: String) {
    try {
        println(x.toInt() / y.toInt())
    } catch (e: NumberFormatException) {
      println("Foi digitado um texto ao invez de um número inteiro.")
    } catch (e: ArithmeticException) {
        println("Divisão por zero invalida.")
    }
}

fun getObject(value: Int): Any {
    return when(value) {
        1 -> 1
        2 -> "Aula"
        3 -> true
        else -> 1.0
    }
}