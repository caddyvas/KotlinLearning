package classesAndObjects

/*
There are two types of constructors - Primary and Secondary. A Kotlin class can have one primary constructor and can
contain one or more secondary constructors.

Java constructor initializes the member variables, however, in Kotlin the primary constructor initializes the class,
whereas the secondary constructor helps to include some additional logic while initializing the same
*/

fun main() {
    // usage of primary constructor
    val person1 = Person("Deepak", 32)
    println("FirstName and Age: ${person1.firstName}, ${person1.age}")

    val laptop = LapTops("sony", "caddyDeep")
    println("Primary Constructor Parameter in Laptop: " +laptop.userName)

    // in order to access secondary constructor's parameters, variables related to parameters should be declared inside the class
    println("Secondary constructor in Laptop: ${laptop.name}")

    val cal = Calc(4,3)

}


/*
Primary constructor can be declared at class header level as shown below.
Initializer blocks are used for initialization of code. At the period of
instance initialization, the initialized blocks are executed in the same
order as they appear in class body

val, var are optional
 */

private class Person(val firstName: String, var age: Int) {

    val eName: String
    val eId: Int

    init {
        eName = firstName
        eId = age
        println("FIRST_NAME: $eName")
    }
}

/*
Secondary constructor is created using "constructor" keyword. It is required when you want to create more than one
constructor or whenever you want to include more login in the primary constructor

val, var are not allowed in secondary constructor
 */
 class LapTops(var userName: String) {

    var name: String = "randomString"


    init {
        println("Inside Laptop Class - Init block - Name: $name")
    }

    // primary constructor call is expected so declare primary constructor parameter(s)
    // body of the secondary constructor is called after the init block
    constructor(name: String, userName: String) : this(userName)  {

        // if we dont declare this, calling class would display "randomString"
        this.name = name
        println("Inside Laptop Secondary Constructor - Name: $name")
        println("Inside Laptop Secondary Constructor - userName: $userName")
    }
}

private class Calc {
    constructor(a: Int, b: Int) {
        println("A+B: " + (a + b))
    }

    constructor(a: Int, b: Int, c: Int) {
        println("A+B: " + (a + b + c))
    }
}