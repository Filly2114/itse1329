/*fun main() {
    val rock = 0
    val paper = 1
    val scissor = 2
    println("Enter 0,1, or 2 to start the game: ")
    println("player 1: ")
    var player1 = readLine()!!.toInt()
    println("player 2: ")
    var player2 = readLine()!!.toInt()
    }
 */


    import java.util.Scanner

    fun rand(start: Int, end: Int): Int {
        require(start <= end) { "Invalid" }
        return (start..end).random()
    }

    fun main() {
        var start = 1
        var end = 3
        var CPU = rand(start, end)
        val scan = Scanner(System.`in`)
        var HUMAN:Int = scan.nextInt()
        println("Enter 1 for rock, 2 for paper and 3 for scissors: ")
        println("You:" + HUMAN)
        println("CPU:" + CPU)
        if (CPU == 1) {
            if (HUMAN == 1)
            {
                println("CPU choses rock!")
                println("It is a tie!")
            }
            else if (HUMAN == 2)
            {
                println("CPU choses paper!")
                println("It is a tie!")

            }
            else if (HUMAN == 3)
            {
                println("CPU choses scissors!")
                println("It is a tie!")
            }
            else
            {
                println("Wrong option! Type 1 for rock, 2 for paper and 3 for scissors!")
            }
        }
        else if (CPU == 2) {
            if (HUMAN == 1)
            {
                println("CPU choses paper!")
                println("Game over! Paper beats rock!")

            }
            else if (HUMAN == 2)
            {
                println("CPU choses scissors!")
                println("Game over! Scissors beat paper!")

            }
            else if (HUMAN == 3)
            {
                println("CPU choses rock!")
                println("Game over! Rock beats scissors!")
            }
            else
            {
                println("YWrong option! Type 1 for rock, 2 for paper and 3 for scissors!")
            }
        }
        else if (CPU == 3) {
            if (HUMAN == 1) {
                println("CPU choses scissors!")
                println("You win! You got luck from this game! Rock beats scissors!")

            }
            else if (HUMAN == 2) {
                println("CPU choses rock!")
                println("You win! You got luck from this game! Paper beats rock!")
            }
            else if (HUMAN == 3) {
                println("CPU choses paper!")
                println("You win! You got luck from this game! Scissors beat paper!")

            }
            else {
                println("Invalid choice! Type 1 for rock, 2 for paper and 3 for scissors!")

            }

        }

    }