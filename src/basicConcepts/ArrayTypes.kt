package basicConcepts

/*
Unlike Java, arrays are just classes in Kotlin. Arrays instances can be created using the
arrayOf, arrayOfNulls and emptyArray standard library functions:
 */

fun main() {

    // type 1
    val integers: Array<Int> = arrayOf(1, 2, 3)

    integers.forEach { i -> println(i) }

    println()

    // type 2
    val strs: Array<String?> = arrayOfNulls(3)
    strs.forEach { i -> println(i) }

    println()

    // type 3 - creates an empty array
    var empty: Array<Double> = emptyArray()
    println("Size of empty array : ${empty.size}")
    //empty = arrayOf(1.1, 2.2)

    // type 4 - creates an Array<Int> with values
    val asc = Array(5) { i -> (i) }
    asc.forEach { i -> println(i) }
    println()

    /*
Beware that type arguments of Array always become object types: an Array<Int> will compile to
java.lang.Integer[]. To represent an array of primitive types, kotlin provides separate array classes,
one for each primitive type: IntArray, DoubleArray, BooleanArray and so on:
 */

    // creates an int array with size 5
    var intar = IntArray(5)
    println("Size: " + intar.size)
    var intarray = intArrayOf(1, 3, 5, 6, 7)

    for (i in intarray) {
        print("$i ")
    }
    println()
    println("Index 1: " + intarray[1])


    // Array of int of size 5 with values [42, 42, 42, 42, 42]
    val arr = IntArray(5, { 42 })
    println()
    arr.forEach { i -> print("$i ") }
    println()

    // Array of int of size 5 with values [0,1,2,3,4] - initialize the values using a lambda
    val arri = IntArray(5, { it })
    arri.forEach { i -> print("$i ") }
    println()

}