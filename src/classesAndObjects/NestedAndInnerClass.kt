package classesAndObjects

/*
When a class has been created inside another class, then it is called as nested class.
In Kotlin, nested class is by default static, hence it, can be accessed without creating
any object of that class.
 */

class OuterDemo {
    class Nest {
        fun printString() {
            println("Welcome to my world - Nested Class Ex")
        }

        fun foo() = "Another method - Nested Class Ex"
    }
}

fun main() {
    // Nested class
    OuterDemo.Nest().printString()
    println(OuterDemo.Nest().foo())

    println()

    // Inner class
    InnerDemo().Nest().printString()
    println(InnerDemo().Nest().foo())
}

/*
When a nested class is marked as a "inner", then it will be called as an inner class. An inner
class can be accessed by the data member of the outer class.
 */

class InnerDemo {
    private val message = "Welcome to my world - Inner Class Ex"
    inner class Nest {
        fun printString() {
            println(message)
        }

        fun foo() = "Another method - Inner Class Ex"
    }
}