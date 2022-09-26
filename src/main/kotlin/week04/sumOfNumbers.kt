fun main(args: Array<String>) {
    print("Enter a positive nonzero integer number: ")
    val num = Integer.valueOf(readln())
        var sum = 0

    for (i in 1..num) {
        // sum = sum+i;
        sum += i
    }

    println("Sum = $sum")
}
