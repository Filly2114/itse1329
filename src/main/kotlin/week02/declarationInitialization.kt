fun main() {

    // 1. constant myAge variable
    val myAge = 26

    // 2. declare averageAge and initialize it with the myAge value
    var averageAge = myAge.toDouble()

    // calculate the average
    averageAge = (averageAge+30)/2

    println("Average Age: "+averageAge)

    // 3. declare constant testNumber and evenOdd variable
    val testNumber = 10
    val evenOdd = testNumber % 2

    // display values of testNumber and evenOdd variable
    println("testNumber: "+testNumber)
    println("evenOdd: "+evenOdd)

    // 4. declare answer variable
    var answer = 0

    // increment the answer by 1
    answer++
    println("Answer: "+answer)

    // add 10 to the answer
    answer += 10
    println("Answer: "+answer)

    // multiply the answer by 10
    answer *= 10
    println("Answer: "+answer)

    // shift the answer to right by 3
    answer = answer shr 3
    println("Answer: "+answer)


}