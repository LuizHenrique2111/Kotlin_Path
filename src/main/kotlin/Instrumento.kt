open class Instrument(var color: String) {

    private lateinit var stringing: Stringing

    fun console() {
        println("Esse instrumento é da cor $color e tem ${stringing.stringNumber} cordas")
    }

    fun addStringing(num: Int, marca: String) {
        stringing = Stringing(6, "NIG")
    }
}

internal class Stringing(var stringNumber: Int, var marca: String)

class Guitar(color: String) : Instrument(color) {

}