fun main() {
    print("Is anyone in your party a vegetarian?: ")
    val vegetarian = readln()

    print("Is anyone in your party a vegan?: ")
    val vegan = readln()

    print("Is anyone in your party gluten-free?: ")
    val glutenFree = readln()

    if (vegetarian == "yes")
        (vegan == "yes")
    (glutenFree == "yes")
    run {
        println("Here are your restaurant choices: \n" + "Corner Cafe\n" + "The Chef's Kitchen")
    }
    if (vegetarian == "yes" || vegetarian == "no")
        (vegan == "no")
    (glutenFree == "yes" || glutenFree == "no")
    run {
        println("Here are your restaurant choices: \n" + "Mama’s Fine Italian\n" + "Main Street Pizza Company\n" + "Main Street Pizza Company")
    }
    if (vegetarian == "yes" || vegetarian == "no")
        (vegan == "yes" || vegan == "no")
    (glutenFree == "no")
    run {
        println("Here are your restaurant choices: \n" + "Mama’s Fine Italian\n" + "Joe’s Gourmet Burgers\n")
    }
    if (vegetarian == "no")
        (vegan == "no")
    (glutenFree == "no")
    run {
        println("Here are your restaurant choice: \n" + "Joe’s Gourmet Burgers" )
    }
}


