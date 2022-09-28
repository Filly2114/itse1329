import kotlin.math.roundToInt
fun main() {

    val number = (Math.random() * 99).roundToInt()
    println("I'm thinking of a number from 0 to 99 - enter a guess: ")

    var count = 0
    //val result = ""
    val done = false
    while (!done) {
        count++

        val guess = Integer.valueOf(readln())
        if (guess < number) {
            println("Too low, please try again.")

        } else if (guess > number) {
            println("Too high, please try again.")

        } else {
            println("Congrats, you did it.")
        }
    }
}
