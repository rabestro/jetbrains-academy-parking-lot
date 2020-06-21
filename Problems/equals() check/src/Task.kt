import java.util.Scanner

data class Client(val name: String, val age: Int, val balance: Int) {
    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (javaClass != other?.javaClass) return false

        other as Client

        if (name != other.name) return false
        if (age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val c1 = Client(input.next(), input.nextInt(), input.nextInt())
    val c2 = Client(input.next(), input.nextInt(), input.nextInt())
    println(c1 == c2)
}