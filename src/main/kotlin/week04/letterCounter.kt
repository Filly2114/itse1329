import java.util.*
fun main(arg: Array<String>) {
// ask the user to enter string
    print("Enter the string: ")

// create scanner object
    val scan = Scanner(System.`in`)
    val valueOfString = scan.next()

// now ask user to enter character
    print("Enter the character to count: ")
    val character = scan.next()

// now extract character and find counts
    var counts = 0
    for (i in 0 until valueOfString.length) {
        if (character[0] == valueOfString[i]) {
            counts++
        }
    }

// print the count
    println("Count of $character in string $valueOfString is: $counts")
}


