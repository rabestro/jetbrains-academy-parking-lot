package parking

class Car(val number: String, val color: String)

class ParkingLot(private val size: Int) {
    private val spots = Array<Car?>(size) { null }

    fun park(car: Car) {
        val spot = spots.indexOf(null)
        if (spot == -1) {
            println("Sorry, the parking lot is full.")
        } else {
            spots[spot] = car
            println("${car.color} car parked in spot ${spot + 1}.")
        }
    }

    fun leave(spot: Int) {
        if (spots[spot - 1] == null) {
            println("There is no car in spot $spot.")
        } else {
            spots[spot - 1] = null
            println("Spot $spot is free.")
        }
    }
}

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    val parkingLot = ParkingLot(20)

    while(true) {
        val command =  scanner.next()

        if (command == "exit") {
            return
        }

        if (command == "park") {
            parkingLot.park(Car(scanner.next(), scanner.next()))
            continue
        }

        if (command == "leave") {
            parkingLot.leave(scanner.nextInt())
            continue
        }
    }
}
