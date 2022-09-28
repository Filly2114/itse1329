fun main(args: Array<String>) {
    val sales = IntArray(5)
    var index = 0
        while (index < sales.size) {
            print("Enter today's sales for store " + (index + 1) + ":")
            sales[index] = Integer.valueOf(readln())
            index += 1
        }

    println("SALES BAR CHART")
    var sal = 0
    while (sal < sales.size) {
        print("Store " + (sal + 1) + ":")
        val stars = sales[sal] / 100
        var star = 1
        while (star <= stars) {


            print("*")
            star += 1
        }
        println()
        sal += 1
    }
}
