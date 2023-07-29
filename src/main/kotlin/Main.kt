fun main() {

    val products = mutableMapOf(
        "Android" to "Google",
        "iOS" to "Apple",
        "Windows" to "Microsoft"
    )

//    val res = products["iOS"]
//    val res = products.getOrDefault("Android2", "Não existe empresa com este SO")
//    val res = products.getOrElse("Andoid2") {
//        println("você envia para o servidor")
//        "Não existe empresa com este SO"
//    }
//    println(res)

//    val hasWindows = products.containsKey("Windows")
//    if(hasWindows) {
//        println("Faça algo")
//    }

//    println(products.keys)
//    println(products.values)
//
//    products["iOS"] = "Amazon"
//    println()
//
//    println(products.keys)
//    println(products.values)
//
//    products.remove("Windows")
//    println()
//
//    println(products.keys)
//    println(products.values)
//
//    products.clear()
//    println()
//
//    println(products.keys)
//    println(products.values)
//
//    if (products.isEmpty()) {
//        println("Não existem produtos cadastrados.")
//    }

//    val r = products.filter { it.value.contains("e") }
//                    .map { it.value.substring(0, 1) }
//    println(r)

    val cars = Car.createCars(10)
    println(cars.map { it.brand.uppercase() })

}