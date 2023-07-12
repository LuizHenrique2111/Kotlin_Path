fun main() {

    println("Qual o seu nome? ")
    var name = readLine()
    println("Olá, $name! \nQual operação você quer fazer agora? (soma/subtracao/divisao/multiplicacao)")
    var operator = readLine()
    println(calc(operator.toString()))

}

fun calc(op: String): Double {

    if (op == "soma") {
        print("Digite o primeiro número: ")
        var num1 = readLine()
        print("Digite o segundo número: ")
        var num2 = readLine()
        return num1!!.toDouble() + num2!!.toDouble()
    }

    return 1.0
}

fun soma(x: Double, y: Double): Double {
    var answer = x + y
    return answer
}

fun subtracao(x: Double, y: Double): Double {
    var answer = x - y
    return answer
}

fun divisao(x: Double, y: Double): Double {
    var answer = x / y
    return answer
}

fun multiplicacao(x: Double, y: Double): Double {
    var answer = x * y
    return answer
}