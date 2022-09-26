package week04
fun main(args: Array<String>) {
    val sales = IntArray(5)
    val input = Integer.valueOf(readln())

        var index = 0
        while (index < sales.size) {
            print("Enter today's sales for store " + (index + 1) + ":")
            sales[index] = Integer.valueOf(readln())
            index += 1
        }

    println("SALES BAR CHART")
    //var sal = 0
    while (index < sales.size) {
        print("Store " + (index + 1) + ":")
        val stars = sales[index] / 100
        var star = 1
        while (star <= stars) {


            print("*")
            star += 1
        }
        println()
        index += 1
    }
}
