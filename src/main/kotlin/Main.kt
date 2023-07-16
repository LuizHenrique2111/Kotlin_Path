fun main() {

    val user1 = User("João", true)
    val user2 = User("João", true)

    println(user1 == user2)
    println(user1)
    println(user2)

    val user3 = User1("João", true)
    val user4 = User1("João", true)

    println(user3 == user4)
    println(user3)
    println(user4)

}

class User(var name: String, var isAdmini: Boolean) {

}

data class User1(var name: String, var isAdmini: Boolean) {

}