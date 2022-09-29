fun main() {
    //declare variables needed
    var startingSize: Int
    var averageDailyIncrease: Double
    var numberOfDays: Int
    var population: Int

    //ask, read the starting size of the population
    println("Enter the starting size of the population: ")
    startingSize = readLine()!!.toInt()
    //loop as long as starting size is less than 2
    while (startingSize < 2) {
        //print error and read again
        println("Starting size must not be less than 2. Enter the starting size of the population: ")
        startingSize = readLine()!!.toInt()
    }

    //ask, read the average daily population increase
    //note: input is in percentage (i.e. enter 10 for 10%)
    println("Enter the average daily population increase percentage: ")
    averageDailyIncrease = readLine()!!.toDouble()

    //again, validate the value and loop as long as it is negative
    while (averageDailyIncrease < 0) {
        println("Average daily population increase must not be negative. Enter the average daily population increase: ")
        averageDailyIncrease = readLine()!!.toDouble()
    }

    //ask, read the number of days they will multiply
    println("Enter the number of days they will multiply: ")
    numberOfDays = readLine()!!.toInt()

    //again, validate the value and loop as long as it is less than 1
    while (numberOfDays < 1) {
        println("Number of days must not be less than 1. Enter the number of days they will multiply: ")
        numberOfDays = readLine()!!.toInt()
    }

    //set startingSize as initial population.
    population = startingSize

    //loop from 1 to numberOfDays
    for (i in 1..numberOfDays) {
        //add averageDailyIncrease % to population; and discard the fractional part
        population += (population * averageDailyIncrease/100.0).toInt()
        //print the population
        println("Day $i: $population")
    }
}