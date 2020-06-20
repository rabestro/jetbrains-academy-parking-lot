import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)

    val x = hashSetOf(1, 2, 3, 4, 5)
    val y = hashSetOf(1, 2, 3, 4, 5)

    repeat(3) {
        x.remove(input.nextInt())
        y.remove(input.nextInt())
    }

    println(x.joinToString(" "))
    println(y.joinToString(" "))
}