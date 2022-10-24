package week05
fun main() {

    //Loop from 1 to 10
    for (i in 1..10) {
        val distance = fallingDistance(i.toDouble())

        println("Time: " + i + "s: The distance is = " + distance.toInt() + "m")
    }
}

//Method/function to calculate distance
fun fallingDistance(time: Double): Double {
    val g = 9.8
    return 0.5 * g * (time * time)
}
