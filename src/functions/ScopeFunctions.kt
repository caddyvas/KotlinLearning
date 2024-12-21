package functions

import java.util.*

/**
 * There are five scope functions that help us to execute block of code within the context of object
 *
 * with, let, apply, also, run
 */
class ScopeFunctions {

    var name: String? = null
    var age: Int? = null

}

fun main() {
    // ordinary code
    val person = ScopeFunctions()
    person.name = "deepak"
    person.age = 37

    /**
     * apply is used when you want to modify an object's properties or call its functions in a builder like manner.
     * Return type: return type of apply is the object itself
     */
    person.apply {
        name = "Deepak"
        age = 37
    }

    println("Apply - The name is: ${person.name}")

    /**
     * also is similar to apply but provides a way to perform additional actions on an object within a lambda block.
     * apply has no "it"
     * Return type: return type of also is the object itself.
     */

    val list = mutableListOf<Int>(1)
    val alsoName = "Deepak"

    val result = list.also {
        it.add(4)
        it.add(3)
        val newName = alsoName + "lastName"
        println("also - $newName")
    }
    println("also - $list")

    /**"let" is used to perform operations on a non-null object. It provides a safe call operator (?.) to perform
     * null-checking before executing the lambda block. It allows accessing the object using the "it" keyword within lambda
     *
     * Return type: result of the lambda expression
    */
    val name: String? = null
    // val name: String? = "KEERTHI"

    name?.let {
        val formattedName = it.uppercase(Locale.getDefault())
        println("let - $formattedName")
    }

    /**
     * with - is used to operate on an object without the need to call its members with a dot notation. It allows
     * accessing the object's properties and functions within the lambda block
     *Return type - is the result of the lambda expression
     */

    val listWith = mutableListOf<Int>(1)
    with(listWith) {
        listWith.add(4)
    }
    println("with - $listWith")
}