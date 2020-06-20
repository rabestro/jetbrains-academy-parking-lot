import java.util.*

fun main(args: Array<String>) {
    val scanner = Scanner(System.`in`)

    var balance = scanner.nextLong()

    while (scanner.hasNext()) {
        val itemPrice = scanner.nextLong()
        if (itemPrice > balance) {
            println("Error, insufficient funds for the purchase. You have $balance, but you need $itemPrice.")
            return
        }
        balance -= itemPrice
    }
    println("Thank you for choosing us to manage your account! You have $balance money.")
}
