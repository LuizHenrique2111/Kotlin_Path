fun main() {

    val user1 = User("João", "Cesar", true)

    println(user1.component1())

    val (lastName, name, isAdmin) = user1 // Segue o construtor padrão da classe
    println("Meu nome é $name $lastName, sou adm? $isAdmin")

}

data class User(var name: String, var lastName: String, var isAdmin: Boolean) {

    fun desc(): String = "Meu nom é $name"
}
