package week03
fun main(){
    val baseFee = 10
    var total = 0.0
    print("Enter number of checks: ")
    val numOfChecks = Integer.valueOf(readLine())

    if(numOfChecks < 20){
        total = baseFee + (baseFee * 0.10)
    }else if (numOfChecks >= 20 && numOfChecks <= 39) {
        total = baseFee + (baseFee * 0.8)
    }else if (numOfChecks >= 40 && numOfChecks <= 59) {
        total = baseFee + (baseFee * 0.6)
    }else {
        total = baseFee + (baseFee * 0.4)
    }

    println("Service fees for the month: $total")


}