package classesAndObjects

/**
 * Object expression is similar to Java's Anonymous Inner Classes
 *
 * It allows user to create anonymous objects with customized behaviour and properties. It is useful when user needs to
 * create one-time object without explicitly declaring a new named class.
 *
 * It can also extend Interface, abstract method
 */
abstract class Vehicle {
    open fun runsOn() {
        println("This vehicle runs on Fuel")
    }

    abstract fun mileage()
}

interface TypeOfDrive {
    fun isAllWheelDrive(): Boolean
}

// with object expressions, usage of this class can be avoided
class ElectricVehicle : Vehicle() {
    override fun runsOn() {
        println("This is an electric vehicle")
    }

    override fun mileage() {
        println("Mileage is 30kmsFor1hourCharge")
    }
}

fun main() {
    val vehicle = object : Vehicle(), TypeOfDrive {
        override fun runsOn() {
            println("This is an Hydrogen vehicle")
        }

        override fun mileage() {
            println("Mileage is 22kms/litre")
        }

        override fun isAllWheelDrive(): Boolean {
            return false
        }
    }
    vehicle.runsOn()
    vehicle.mileage()
    println("Is All Wheel Drive: ${vehicle.isAllWheelDrive()}")
}
