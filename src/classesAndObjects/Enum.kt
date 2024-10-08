package classesAndObjects

/**
 * Enumeration is a named list of constants. In Kotlin, like other programming languages, an enum has its own specialized
 * type. Unlike Java enums, Kotlin enums are classes.
 * In Kotlin, enum constants are not just collection of constants - these have properties, methods, etc
 */
enum class Days {
    Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday
}

fun displayDay(day: Days) {
    when (day) {
        Days.Sunday -> println("Today is Sunday")
        Days.Monday -> println("Today is Monday")
        Days.Tuesday -> println("Today is Tuesday")
        Days.Wednesday -> println("Today is Wednesday")
        Days.Thursday -> println("Today is Thursday")
        Days.Friday -> println("Today is Friday")
        Days.Saturday -> println("Today is Saturday")
    }
}

/**
 * Enum constants also behaves as anonymous classes by implementing their own functions along with overriding the abstract
 * functions of the class. It can also contain constructors, implement interface inside constants
 */

enum class Seasons(var weather: String, val degree: Int) {

    Summer("hot", 32) {
        // compile time error if no override
        override fun status() {
            println("It is hot")
        }
    },
    Winter("Cold", -22) {
        override fun status() {
            println("It is cold")
        }
    };

    abstract fun status()
}

fun main() {
    // simple demo of properties and methods
    println(Days.Sunday.ordinal)
    println(Days.Monday.name)

    // great advantage of enum classes in Kotlin is when they are combined with When Expression. else clause is completely eliminated
    displayDay(Days.Monday)
    Seasons.Summer.status()
    println(Seasons.Winter.degree)
}