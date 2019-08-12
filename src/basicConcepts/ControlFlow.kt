package basicConcepts

/*
Control Flow: if, when, for, while

If expression
In kotlin, if is an expression, i.e. it returns a value. Therefore there is no ternary operator
(condition ? then : else), because ordinary "if" works fine in this role
 */

fun main() {

    val a = 4
    val b = 5

    // traditional usage
    if (a < b)
        println("b is bigger")
    else
        println("a is bigger")

    // as expression
    val max = if (a < b) b else a

    println("Max value is $max")


    /*
    "When" replaces the switch operator of C-like languages. In the simplest form it looks like this
     */

    val whenNo = 21
    when (whenNo) {
        4 -> println("4 is printed")
        in 6..10 -> println("in the range 6 - 10")
        5 -> println("5 is printed")
        11 -> println("11 is printed")
        in 20..25 -> println("range 20 - 25")
        else -> {
            println("a is neither 4 or 5")
        }

    }

    /*#
    For Loops
    for loop iterates through anything that provides an iterator. This is equivalent to the "foreach" loop
    in languages in C
     */
    println()
    for (i in 1..4) {
        print("$i ")
    }
    println()

    // for loop decrement
    for (i in 6 downTo 0) {
        print("$i ")
    }
    println()

    // for loop increment
    for (i in 0 until 10 step 1) {
        print("$i ")
    }
    println()

    // iterate array
    val array = intArrayOf(1, 2, 3, 4)
    for (i in array.indices) {
        print(" " + array[i])
    }

    println()

    // alternatively you can used the withIndex library function
    for ((index, value) in array.withIndex()) {
        println("the element at $index is $value")

    }

    /*
    while Loops

    while and do-while work as usual
     */
    var x = 5
    while (x > 0) {
        print("$x ")
        x--
    }
    println()

    x = 4
    do {
        print("$x-")
        x--
    } while (x > 0)
    println()

    /*
    Kotlin supports traditional break and continue operators in loops
     */
}