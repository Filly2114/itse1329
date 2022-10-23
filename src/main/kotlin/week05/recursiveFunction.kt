package week05
import java.math.BigInteger


fun main(args: Array<String>) {
    val f = BigInteger("0") //for the first value it will be 0
    val s = BigInteger("1") // and second value will be 1 so s is 1

    println(fibonacci(1, f, s)) // this is the function to do fibonacci operation
    println(fibonacci(2, f, s))
    println(fibonacci(3, f, s))
    println(fibonacci(4, f, s))
    println(fibonacci(5, f, s))
    println(fibonacci(6, f, s))
    println(fibonacci(7, f, s))
    println(fibonacci(10, f, s))
}

tailrec fun fibonacci(m: Int, a: BigInteger, b: BigInteger): BigInteger {

    return if (m == 0) a else fibonacci(m-1, b, a+b) // it will return 0 if we paas 0 otherwise it will print the sum of given number in fibonacci series.
}