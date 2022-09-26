fun main() {

    print("Enter month in numeric form: ")
    val month = Integer.valueOf(readln())

    print("Enter day: ")
    val day = Integer.valueOf(readln())

    print("Enter two-digit year: ")
    val year = Integer.valueOf(readln())

    if (day * month == year) {
        println("The date is magic")
    } else {
        println("The date is not magic")
    }
}