package basicConcepts

/*
Unlike Java, Kotlin does not distinguish between primitive and wrapper types.
Following are the list of primitive types

Integer types - Byte, Short, Int, Long
Floating-point types - Float, Double
Character type - Char
Boolean type - Boolean

 */

/*
Another important difference between Kotlin and Java, is numeric conversions.
Kotlin does not automatically convert numbers from one type to another, the
conversion must be explicit.
 */

fun main() {

    val i = 42
    println("Int i: $i")
    // val l : Long = i // Error: Type Mismatch
    val c = "7"
    val f : Int = c.toInt()
    println("to Int: $f")

    /*
    Every number type supports the following conversions
    - toByte() : Byte
    - toShort() : Short
    - toInt() : Int
    .......
     */

}