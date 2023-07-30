fun main() {

    val obj: Any = getObject(2)
//    if (obj is String) { // Só consegue manipular os atributos do tipo utilizando verificações
//        println(obj.length)
//    }

    val cast = obj as String // Consigo manipular fazendo a conversão(casting)
    println(cast.length)

}

fun getObject(value: Int): Any {
    return when(value) {
        1 -> 1
        2 -> "Aula"
        3 -> true
        else -> 1.0
    }
}