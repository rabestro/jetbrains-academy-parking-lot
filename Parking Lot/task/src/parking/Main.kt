package parking

class Car(val number: String, val color: String)

class ParkingLot(size: Int) {
    private var spots: Array<Car?> = Array(size) { null }

    init {
        if (size > 0) {
            println("Created a parking lot with $size spots.")
        }
    }

    fun park(car: Car) {
        if (!hasCreated()) {
            return
        }
        val spot = spots.indexOf(null)
        if (spot == -1) {
            println("Sorry, the parking lot is full.")
        } else {
            spots[spot] = car
            println("${car.color} car parked in spot ${spot + 1}.")
        }
    }

    private fun hasCreated() = if (spots.isEmpty()) {
        println("Sorry, a parking lot has not been created.")
        false
    } else {
        true
    }

    fun leave(spot: Int) {
        if (!hasCreated()) {
            return
        }
        if (spots[spot - 1] == null) {
            println("There is no car in spot $spot.")
        } else {
            spots[spot - 1] = null
            println("Spot $spot is free.")
        }
    }

    fun status() {
        if (!hasCreated()) {
            return
        }
        var isEmpty = true
        for ((spot, car) in spots.withIndex()) {
            if (car != null) {
                isEmpty = false
                println("${spot + 1} ${car.number} ${car.color}")
            }
        }
        if (isEmpty) {
            println("Parking lot is empty.")
        }
    }
}

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    var parkingLot = ParkingLot(0)

    while (true) {
        when (scanner.next()) {
            "exit" -> return
            "create" -> parkingLot = ParkingLot(scanner.nextInt())
            "park" -> parkingLot.park(Car(scanner.next(), scanner.next()))
            "leave" -> parkingLot.leave(scanner.nextInt())
            "status" -> parkingLot.status()
        }
    }
}
