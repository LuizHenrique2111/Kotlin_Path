fun main() {

//    val verdadeiro : Any = true
//    val name : Any = "Luiz"
//    val age : Any = 25
//
//    println("$verdadeiro | $name | ${age::class}")

    val obj: Any = getObject(2)
    println(obj)
    if (obj is String) { // Só consegue manipular os atributos do tipo utilizando verificações
        println(obj.length)
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