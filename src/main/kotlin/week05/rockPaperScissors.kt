package week05
fun main(){

    var options = arrayOf("Rock", "Paper","Scissors")
    var gameChoice = getGameChoice(options)

    var userOptions = getUserOption(options)

    printResult(gameChoice, userOptions)


}
fun getGameChoice(optionParam: Array<String>)= optionParam[(Math.random()*optionParam.size).toInt()]

fun getUserOption(optionParam: Array<String>):String{
    var isValid = false
    var userChoice = ""

    while (!isValid) {
        println("Enter a valid choice")

        for (items in optionParam) println(items)
        println(".")

        var userInput = readLine()

        if (userInput != null && userInput in optionParam){
            isValid =  true

            userChoice = userInput.capitalize()
        }

        if (!isValid)
            println(" please enter a valid choice")
    }
    return userChoice
}

fun printResult(gameChoice: String, userChoice: String){

    var result: String
    if (gameChoice==userChoice) result="tie"

    else if ((gameChoice== "Scissors" && userChoice=="Paper")||
        (gameChoice== "Rock" && userChoice=="Scissors")||
        (gameChoice== "Paper" && userChoice=="Rock"))

        result = "You lost!"

    else
        result = "You Win!"

    println("The game choice $gameChoice and you chose $userChoice . The result is $result" )
}