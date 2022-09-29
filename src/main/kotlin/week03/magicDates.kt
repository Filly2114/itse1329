fun main() {

    print("Enter month in numeric form: ")
    val month = Integer.valueOf(readLine())

    print("Enter day: ")
    val day = Integer.valueOf(readLine())

    print("Enter two-digit year: ")
    val year = Integer.valueOf(readLine())

    if (day * month == year) {
        println("The date is magic")
    } else {
        println("The date is not magic")
    }
}