package parking

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    var parkingLot = ParkingLot(0)

    while (true) {
        val args = scanner.nextLine().split(" ")

        when (args[0]) {
            "exit" -> return
            "create" -> {
                parkingLot = ParkingLot(args[1].toInt())
            }
            else -> if (parkingLot.isNotCreated()) {
                println("Sorry, a parking lot has not been created.")
            } else {
                when (args[0]) {
                    "park" -> parkingLot.park(Car(args[1], args[2]))
                    "leave" -> parkingLot.leave(args[1].toInt())
                    "status" -> parkingLot.status()
                    "reg_by_color" -> parkingLot.regByColor(args[1])
                    "spot_by_color" -> parkingLot.spotByColor(args[1])
                    "spot_by_reg" -> parkingLot.spotByReg(args[1])
                }
            }
        }
    }
}
