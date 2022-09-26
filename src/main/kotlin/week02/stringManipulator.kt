fun main(args: Array<String>) {
    print("Enter the name of your favorite city: ")
    val favoriteCity = readLine()!!

    // display the number of characters in the city name
    println("Number of Characters: " + favoriteCity.length)

    var upper = favoriteCity.uppercase()
    println("City Name in Uppercase: " + upper)

    var lower = favoriteCity.lowercase()
    println("City Name in Lowercase: " + lower)

    println("First Character in City Name: " + favoriteCity[0])

}
