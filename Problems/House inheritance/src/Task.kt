import kotlin.math.roundToInt

fun main() {
    val rooms = readLine()!!
    val price = readLine()!!

    val house = House(rooms.toInt(), price.toInt())
    println(totalPrice(house))
}

class House(val rooms: Int, val price: Int) { }

fun totalPrice(house: House) :Int {

    val coefficient = when {
        house.rooms < 2 -> 1.00
        house.rooms < 4 -> 1.20
        house.rooms < 5 -> 1.25
        house.rooms < 8 -> 1.40
        else -> 1.6
    }
    val basePrice = if (house.price < 0) 0 else 1_000_000.coerceAtMost(house.price)

    return (basePrice * coefficient).roundToInt()
}