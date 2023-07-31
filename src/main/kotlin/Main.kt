fun main() {

    val obj: Any = getObject(3)

//    val cast = obj as String
//    println(cast.length)

    showView()
}

fun showView() {
    try {
        val res = applyDiscount(220.00, 52)
        println(res)
    } catch (e: IllegalArgumentException) {
        println(e.message)
    }
}

fun applyDiscount(price: Double, value: Int): Double {
    if (value > 50) {
        throw IllegalArgumentException("Desconto muito alto!")
    }
    val discount = value * price / 100
    return price - discount
}

fun getObject(value: Int): Any {
    return when(value) {
        1 -> 1
        2 -> "Aula"
        3 -> true
        else -> 1.0
    }
}