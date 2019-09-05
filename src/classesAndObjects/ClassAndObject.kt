package classesAndObjects

/*
In Kotlin, class declaration consists of a class header and a class body surrounded by curly
braces, similar to java
 */

class ClassAndObject {

    private var name: String = "deepak"

    fun printString() {
        println("My name is: $name")
    }
}

fun main() {
    val obj = ClassAndObject() // create obj object of ClassAndObject class
    obj.printString()

}

