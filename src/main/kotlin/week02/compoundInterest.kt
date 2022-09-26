fun main(args: Array<String>) {

    print("TEnter the amount of principal originally deposited into the account : ")
    val principal = readLine()!!.toDouble()

    print("Enter the annual interest rate paid by the account : ")
    val interest = readLine()!!.toDouble()
    val rate = interest/100

    print("Enter the number of times per year that the interest is compounded : ")
    val number = readLine()!!.toDouble()

    print("Enter the number of years the account will be left to earn interest : ")
    val time = readLine()!!.toDouble()

    var balance = principal * Math.pow((1 +(rate / number)).toDouble(), (number * time).toDouble())
            println ("Total amount after $time years: $balance")


}