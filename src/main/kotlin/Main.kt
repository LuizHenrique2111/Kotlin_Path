fun main() {

    val obj: Any = getObject(3)

//    val cast = obj as String
//    println(cast.length)

    divide("10","0")
}

fun divide(x: String, y: String) {
    try {
        println(x.toInt() / y.toInt())
    } catch (e: Exception) {
        println("Formulário Invalido")
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