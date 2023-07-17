fun main() {

    val t = Teacher("Tulio", "Rua Einstein")
    println(t.desc())

    val s = Student(20015, "Tulio", "Rua Einstein")
    println(s.desc())
}

open class Person(var name: String, var address: String) {
    fun desc() = "Meu nome é $name e meu endereço é $address"
}

class Teacher(name: String, address: String) : Person(name, address) {
}

class Student(var iD: Int, name: String, address: String) : Person(name, address) {
}

