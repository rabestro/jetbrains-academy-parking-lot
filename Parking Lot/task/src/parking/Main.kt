package parking

class Car(val number: String, val color: String)

class ParkingLot(private val size: Int) {
    val spots = Array<Car?>(size) { null }


}

fun main() {
    println("Hello, World!")
}
