fun main() {
    print("Enter the first name: ")
    val name1 = readln()

    print("Enter the second name: ")
    val name2 = readln()

    print("Enter the third name: ")
    val name3 = readln()

    if ((name1.compareTo(name2)) < 0 && (name1.compareTo(name3)) < 0) {
        println(name1)
        if ((name1.compareTo(name3) < 0)) {
            println(name2)
            println(name3)
        } else {
            println(name3)
            println(name2)
        }
    } else if ((name2.compareTo(name3)) < 0 && (name2.compareTo(name1)) < 0) {
        println(name2)
        if ((name2.compareTo(name1) < 0)) {
            println(name3)
            println(name1)
        } else {
            println(name1)
            println(name3)
        }

    } else if ((name3.compareTo(name1)) < 0 && (name3.compareTo(name2)) < 0) {
        println(name3)
        if ((name3.compareTo(name2) < 0)) {
            println(name1)
            println(name2)
        } else {
            println(name2)
            println(name1)
        }
    }
}