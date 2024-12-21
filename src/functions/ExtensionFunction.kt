package functions

/**
 * Kotlin's extension function provides a facility to "add" methods to class without  inheriting a class or using any
 * type of design pattern. The created extension function are used as a regular function inside that class.
 */

fun main() {

    val code = Code()
    code.myName = "Deepak"
    code.printName()

    val code1 = Code()
    code1.myName = "Karthik"
    code1.printName()

    val code2 = code.add(code1)
    code2.printName()
}

// create an extension function
fun Code.add(codeParams: Code): Code {
    val newCode = Code()
    newCode.myName = this.myName + " "+ codeParams.myName
    return newCode
}

class Code {
    var myName: String? = null

    fun printName() {
        println("The name is $myName")
    }
}