fun main() {
    print("Is anyone in your party a vegetarian?: ")
    val vegetarian = readln()!!

    print("Is anyone in your party a vegan?: ")
    val vegan = readln()!!

    print("Is anyone in your party gluten-free?: ")
    val glutenFree = readln()!!

    if (vegetarian == "yes" && vegan == "yes" && glutenFree == "yes") {

        println("Here are your restaurant choices: \n" + "Corner Cafe\n" + "The Chef's Kitchen")
    }
    else if (vegetarian == "yes"  && vegan =="no" && glutenFree == "yes" )


    {
        println("Here are your restaurant choices: \n" + "Mama’s Fine Italian\n" + "Main Street Pizza Company")
    }
    else if (vegetarian == "yes" && vegan == "yes"  && glutenFree == "no")

    {
        println("Here are your restaurant choices: \n" + "Mama’s Fine Italian\n" + "Joe’s Gourmet Burgers\n")
    }
    else if (vegetarian == "no"|| vegetarian == "yes" && vegan == "no" && glutenFree == "no")

    {
        println("Here are your restaurant choice: \n" + "Joe’s Gourmet Burgers" )
    }

}


