fun main() {

    println(CreditCard.MASTER.ordinal)

    val creditCardAPIName = "elo"

    val card = CreditCard.valueOf(creditCardAPIName.uppercase())

    println(card)

    if (card == CreditCard.ELO) {
        println("DESCONTO de ${card.descount}%")
    } else {
        println("MAIS DESCONTO")
    }

    println(CreditCard.values().size)

}

enum class CreditCard(val label: String, val descount: Int) {

    VISA("Visa", 10),
    MASTER("Mastercard", 15),
    ELO("Elo", 7),
    AMEX("American Express", 12)
}
