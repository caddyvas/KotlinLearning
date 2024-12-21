package basicConcepts

// In Kotlin, you can declare variables in 2 ways - val and var
/*
*  val - Immutable reference. After initialization, val cannot be reassigned and treated as a final variable
*
*  var - Mutable reference. The value of such variable can be reassigned or changed
* */

fun main() {
    val digit = 1
    var str = "keerthi"
    println("val : $digit")

    // below value cannot be reassigned - immutable
    //digit = 6;
    println("var : $str")

    // mutable
    str = "deepak"
    println("var changed: $str")

    // Variable type may come after the name, separated by colon. Just like java, Kotlin
    // is a statically typed language, but the compiler is able to determine the type from
    // the context, this is called type inference

    val hello: String = "hello" // Explicit
    val hell = "hello"          // Inferred

    println("Explicit - $hello ---  Inferred - $hell")

    val i = 42  // Int
    val l = 42L // Long
    val d = 42.3// Double
    val f = 42f // Float

    println("Int: $i -- Long: $l -- double: $d -- float: $f")

    /* Unlike Java, Kotlin's == operator compares two objects by calling equals under the hood.
    For reference comparison, you can use the === operator instead
     */

    val a = Pair("key", 42)
    val b = Pair("key", 42)

    println(a == b) // true
    println(a === b) // false

    val int_a = 43
    val int_b = 43

    println(int_a == int_b)

    /*
    Null Safety - The first and most important difference between Kotlin and Java is kotlin's explicit
    support for nullable types. Putting a question mark after the type name explicitly allows the variable
    to contains null:
     */

    var nickName: String? = null
    var name: String = "John"

    println()
    println("null : $nickName ---- name: $name")

    // A type without a question mark denotes that the variable of such type cannot store null references

    /*
    Safe call operator - to deal with nullable types
     */
    val uppercase = nickName?.toUpperCase()  // returns null if nickname is null

    println()
    println(uppercase)

    val safe = nickName ?: "unknown"  // return "unknown" if nickname is null
    println(safe)

    // if you are missing null pointer exception, throw an exception if the value is null
    //val length = nickName!!.length // throw an npe if nickName is null

    println()
    //println(length)

    /*
    String templates - kotlin allows you to refer to local variables in string literals
    Concatenation
     */

    val name1 = "deepak"
    val hello1 = "hello $name1"
    println()
    println(hello1)

    // Lazy allows you to declare a property and initialize it lazily when it is accessed for the first time.
    // The initialization code is executed only once, and the result is cached for subsequent accesses.
    val lazyValue: String by lazy {
        println("Initializing lazyValue")
        "Lazy Value"
    }

    println(lazyValue) // prints line 97 and 98
    println(lazyValue) // prints only 98
}