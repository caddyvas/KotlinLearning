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

}