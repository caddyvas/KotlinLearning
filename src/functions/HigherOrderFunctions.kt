package functions

/**
 * Higher Order Functions: High order function is a function which accepts function as a parameter or returns a function
 * or can do both. Means, instead of passing Int, String, or other types as a parameter in a function, we can pass a
 * function as a parameter in other function
 */

fun main() {
    val values = listOf<Int>(1, 2, 3, 4)

    // function println passed as a parameter
    values.forEach { println(it) }

    higherOrderFunction(2.0, 3.0, ::add)

    // lambda function
    val myLambdaFunction: (Int) -> Unit = { s: Int -> println("The Sum is $s") }

    addUsingLambdaAsParameter(3, 5, myLambdaFunction)
}

fun add(a: Double, b: Double): Double {
    println("Inside Add Function")
    println("Executing other operations......")
    return a + b
}

fun addUsingLambdaAsParameter(a: Int, b: Int, lambdaFunction: (Int) -> Unit) {
    val sum = a + b
    lambdaFunction(sum)
}

fun higherOrderFunction(a: Double, b: Double, function: (Double, Double) -> Double) {
    println(function(a, b))
}