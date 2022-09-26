fun main(){
    val randomColor = arrayOf<String>("Red", "Green", "Blue", "Orange", "Yellow")
    var count = 0
    println("Try to guess may random color from: Red, Green, Blue, Orange, Yellow")
    println("You have 10 guesses, try to challenge me!" )
    
    for (i in 1..10){
        val color = randomColor.random()
        println("Enter a color: ")
        val inputColor = readln()
        if (inputColor== color){
            println("Congrats!!!")
            count++
        }else{
            println("Try again, the color was $color ")
        }
    }
}