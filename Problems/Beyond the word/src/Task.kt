import java.util.Scanner

fun main(args: Array<String>) {
    val input = Scanner(System.`in`)
    val word = input.nextLine()

    for (c in 'a'..'z') {
        if (c in word) {
            continue
        }
        print(c)
    }
}