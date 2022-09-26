fun main(args: Array<String>) {


    //Print the first half (Line 1,2,3 and 4)
    for (i in 1..4) {
        for (j in 1..7) {
            //conditions to print a "*"
            if (i + j >= 5 && j - i <= 3) {
                print("*")
            } else {
                print(" ")
            }
        }
        //move to the next line after printing a row
        println()
    }

    //second half of the pattern (line 4 , 5 and 6)
    for (i in 3 downTo 1) {
        for (j in 1..7) {
            //conditions to print a "*"
            if (i + j >= 5 && j - i <= 3) {
                print("*")
            } else {
                print(" ")
            }
        }
        //move to the next line after printing a row
        println()
    }
}