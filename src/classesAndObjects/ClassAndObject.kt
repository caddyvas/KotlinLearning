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

    fun printEmpInObject() {
        println("EmpName inside Object: " + Employee.empName)
        Employee.empName = "DifferentName"
        println("ChangedName inside Object: " + Employee.displayEmployeeName())
    }

    fun printEmpInCompanionObject() {
        println("Employee from Companion Object: $empName")
    }

    // There are times we need to use a companion object to define class members that are going to be used
    // independently of any instance of that class
    companion object EmployeeInsideClass {
        const val empName: String = "Robert"
    }
}

fun main() {
    val obj = ClassAndObject() // create obj object of ClassAndObject class
    obj.printString()
    // display object elements
    obj.printEmpInObject()
    obj.printEmpInCompanionObject()

    // null safety
    var word: String? = "abc"
    // null assertion
    println(word!!.length)
    word = null
    println("NullSafety: $word")
    println(word?.equals("abd"))

}

// TODO - definition
object Employee {

    var empName: String = "Deepak"

    fun displayEmployeeName(): String {
        return "EmpName is $empName"
    }
}

