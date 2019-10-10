package oopsConcepts

/*

Inheritance makes justice to code re-usability. It allows a class (child) to inherit the properties or features of
another class (parent or base or super)

All classes in Kotlin have a common base class called Any. It corresponds to the Object class in Java.

By default, all classes in Kotlin are final (non-inheritable)

Every class you create in kotlin implicitly inherits from "Any"

class person - implicitly inherits from the default super class

Ex: equals(), hashCode(), toString() belong to super class - Any


 */

fun main() {

    val laptop = Laptop2("Apple", 6.5)
    println("Super Class Model Year: ${laptop.modelYear}")
    println(laptop.printModelYear())

    val savingsAccount = SavingsAccount("4354", "Deepak", 6.0)
    savingsAccount.depositMoney(100.0)
    savingsAccount.depositInterest()

    // print balance
    println("Balance Money: ${savingsAccount.balance}")
    // print balance using method of super class
    println("Balance Money from method: ${savingsAccount.withDrawMoney()}")


}


// super class or parent class or base class
open class Computer(val brand: String) {  // implicitly inherits from Any

    var modelYear: Int = 2018

    // method to be overridden
    open fun printModelYear() {
        println("Model Year in Super class: $modelYear")
    }
}

// child class or sub class or derived class
// Note that child class has the responsibility to initialize the parent class. if the child class has a primary constructor
// it must initialize the parent class right in the class header with parameters passed to its primary constructor
class Laptop(brand: String) : Computer(brand) {

}

// If child class does not have a primary constructor, then all of its secondary constructors have to initialize the parent
// class either by calling the super keyword
class Laptop2 : Computer {

    val batteryLife: Double

    constructor(brand: String, batteryLife: Double) : super(brand) {
        this.batteryLife = batteryLife
    }

    override fun printModelYear() {
        modelYear = 2017
        println("model year changed in child class: $modelYear")
    }

}

// Let do an example with properties and member functions
open class BankAccount(val accountNumber: String, val accountName: String) {
    var balance: Double = 0.0

    fun depositMoney(amount: Double): Boolean {
        if (amount > 0) {
            balance += amount
            return true
        } else {
            return false
        }
    }

    // To override this in child class, use "open", so this can be overridden
    fun withDrawMoney(): Double {

        // withdraw money is chargeable - servicefee = 1
        return balance - 1
    }
}

class SavingsAccount(accountNumber: String, accountName: String, private val interestRate: Double) :
    BankAccount(accountNumber, accountName) {

    // Savings account class inherits accountNumber, accountName, balance, depositMoney() from super class
    fun depositInterest() {
        val interest = balance * interestRate / 100
        this.depositMoney(interest)
    }

}