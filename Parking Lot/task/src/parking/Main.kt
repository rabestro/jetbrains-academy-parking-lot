package parking

fun main() {
    val scanner = java.util.Scanner(System.`in`)
    var parkingLot = ParkingLot(0)

    menu@
    while (true) {
        val command = scanner.next()

        when (command) {
            "exit" -> return
            "create" -> {
                parkingLot = ParkingLot(scanner.nextInt())
                continue@menu
            }
            else -> if (parkingLot.isNotCreated()) {
                println("Sorry, a parking lot has not been created.")
                continue@menu
            }
        }

        when (command) {
            "park" -> parkingLot.park(Car(scanner.next(), scanner.next()))
            "leave" -> parkingLot.leave(scanner.nextInt())
            "status" -> parkingLot.status()
            "reg_by_color" -> parkingLot.regByColor(scanner.next())
            "spot_by_color" -> parkingLot.spotByColor(scanner.next())
            "spot_by_reg" -> parkingLot.spotByReg(scanner.next())
        }

    }
}
