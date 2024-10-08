package classesAndObjects

/**
 * There are five scope functions that help us to execute block of code within the context og object
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

    // using apply we can write more concise and more readable code
    person.apply {
        name = "Deepak"
        age = 37
    }
}