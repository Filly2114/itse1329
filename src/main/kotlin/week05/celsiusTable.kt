package week05
// function to convert fahrenheit to celsius
fun celsius(ftemp:Int) : Double {
    var ctemp = (5.0/9.0)*(ftemp-32);
    return ctemp;
}

fun main() {
    println("Fahrenheit\tCelsius");
    // looping from 0 to 20
    for (i in 0..20) {
        // calling function
        var ctemp = celsius(i);
        // printing temperature and celsius values
        println("$i\t\t$ctemp");
    }
}