package parking

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
