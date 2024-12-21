package functions

/**
 * Lambda is a function which has no name. Lambda is defined with a curly braces {} which takes variable as a parameter
 * (if any) and body of function. The body of function is written after variable (if any) followed by  -> operator.
 *
 * In short, Lambda can be passed as a parameter, stored in a variable or even returned as a value. It is also known as
 * anonymous function.
 */

fun main() {
    val modOperation = { a: Int ->
        a % 2 == 0
    }

    println(modOperation(4))

    // see higher order functions file and continue
    // we can use lambda in the place of higher order function
    higherOrderFunction(2.0, 3.0, 4.0, { a: Double, b: Double, c: Double -> a + b + c })

    // tail lambda i.e. if lambda function act as a last parameter, it can be moved out of the brackets
    higherOrderFunction(2.0, 3.0, 4.0) { a: Double, b: Double, c: Double -> a + b + c }
}

fun higherOrderFunction(a: Double, b: Double, c: Double, function: (Double, Double, Double) -> Double) {
    println(function(a, b, c))
}