package week05
fun isNumberDivisible(number: Int, divisor: Int): Boolean {

    return ((number % divisor) == 0)
}
fun isPrime(number: Int): Boolean {
    if(number<0)
        return false
    var i = 2
    while (i < number) {
        if (isNumberDivisible(number,i)) {
            return false
        }
        ++i
    }
    return true
}

fun main(args: Array<String>) {
    val num = 13

    if (isPrime(num))
        println("$num is a prime number.")
    else
        println("$num is not a prime number.")
}