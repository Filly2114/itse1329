fun main() {
    /*for (i in 0..2) {   // for loop to take the input for three runners
        print("Enter a name of runner " + (i + 1) + " : ")
        val names = readln()!!
        print("Enter a time in minutes: ")
        val time = Integer.valueOf(readln())
    }*/
    print("Enter a name of runner1:  ")
        val name1 = readln ()
    print("Enter a time in minutes: ")
    val time1 = Integer.valueOf(readln())

    print("Enter a name of runner2:  ")
    val name2 = readln ()
    print("Enter a time in minutes: ")
    val time2 = Integer.valueOf(readln())

    print("Enter a name of runner3:  ")
    val name3 = readln ()
    print("Enter a time in minutes: ")
    val time3 = Integer.valueOf(readln())

    println("\nThe racers have completed the race in following order: ") // message for result
    if (time1 < time2 && time1 < time3) {    // if first user completes the race first
        println("1." + name1)
        if (time2 < time3) {     // if second user completed the race on second number
            println("2." + name2)
            println("3." + name3)
        } else {                      // else second user completed the reace on third number
            println("2." + name3)
            println("3." + name2)
        }
    } else if (time2 < time1 && time2 < time3) { // if second user completes the race first
        println("1." + name2)
        if (time1 < time3) {         // if first user completed the race on second number
            println("2." + name1)
            println("3." + name3)
        } else {                          // else first user completed the reace on third number
            println("2." + name3)
            println("3." + name1)
        }
    } else {                          // if third user completes the race first
        println("1." + name3)
        if (time2 < time1) {      // if second user completed the race on second number
            println("2." + name2)
            println("3." + name1)
        } else {                         // else second user completed the reace on third number
            println("2." + name1)
            println("3." + name2)
        }
    }
}






