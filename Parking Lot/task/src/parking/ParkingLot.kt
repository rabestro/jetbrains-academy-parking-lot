package parking

class ParkingLot(size: Int) {
    private var spots: Array<Car?> = Array(size) { null }

    init {
        if (size > 0) {
            println("Created a parking lot with $size spots.")
        }
    }

    fun park(car: Car) {
        val spot = spots.indexOf(null)
        if (spot == -1) {
            println("Sorry, the parking lot is full.")
        } else {
            spots[spot] = car
            println("${car.color} car parked in spot ${spot + 1}.")
        }
    }

    fun isNotCreated() = spots.isEmpty()

    fun leave(spot: Int) {
        if (spots[spot - 1] == null) {
            println("There is no car in spot $spot.")
        } else {
            spots[spot - 1] = null
            println("Spot $spot is free.")
        }
    }

    fun status() {
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

    fun spotByReg(number: String) {
        TODO("Not yet implemented")
    }

    fun regByColor(color: String) {
        val result = spots.filter { it!!.color.toUpperCase() == color.toUpperCase() }
        if (result.isEmpty()) {
            println("No cars with color $color were found.")
        } else {
            println(result.joinToString(", "))
        }
    }

    fun spotByColor(color: String) {
        var isEmpty = true
        for ((spot, car) in spots.withIndex()) {
            if (car != null) {
                isEmpty = false
                println("${spot + 1} ${car.number} ${car.color}")
            }
        }
        if (isEmpty) {
            println("No cars with color $color were found.")
        }
        val result = spots.filter { it!!.color.toUpperCase() == color.toUpperCase() }
        if (result.isEmpty()) {
            println("No cars with color $color were found.")
        } else {
            println(result.joinToString(", "))
        }
    }
}