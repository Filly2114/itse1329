fun main(args: Array<String>) {
       print("Enter number of cookies eaten: ")
    val number = Integer.valueOf(readLine())
    val calories = 300 / 4
    val total = number * calories
    println("Your calorie intake was: $total")

}
