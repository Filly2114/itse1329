fun main(){
    print("Enter weight in pounds: ")
    val weight = readLine()!!.toDouble()
    print("Enter height in inches ")
    val height = readLine()!!.toDouble()

    val bmi = (weight*(703))/((height*(height)))

        if (bmi < 18.5) {
            println("Underweight")

        } else {
            println("Overweight")
        }
    }



