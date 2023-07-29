data class Car(var name: String, var brand: String) {

    companion object {
        private val cars = mutableListOf<Car>()
        fun createCars(count: Int) : List<Car> {
            for (i in 0 .. count) {
                cars.add(Car("Camaro", "Chevrolet"))
            }
            return cars
        }
    }

}