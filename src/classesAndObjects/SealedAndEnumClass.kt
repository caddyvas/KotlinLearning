package classesAndObjects

/**
 * Restrictive Inheritance: All subclasses of sealed class are known at compile time. Subclasses must be declared within
 * the same file as the sealed itself. It is commonly used in network operations or database queries where you might have
 * a Result type representing success, error or loading states
 *
 * Enum contains pre-defined constants (hardcoded). It cannot be changed later. To overcome this, we have sealed classes
 *
 * Subclasses of Sealed class can be a data class, regular class, object class, even another selaed class, sealed interface
 */
sealed class SealedClassShape {
    data class Circle(var radius: Float) : SealedClassShape()
    class Rectangle(var length: Int, var breadth: Int) : SealedClassShape()
    object notAShape : SealedClassShape()

}

fun displayShape(shape: SealedClassShape) {
    when (shape) {
        is SealedClassShape.Circle -> println("Circle area is ${shape.radius}")
        is SealedClassShape.Rectangle -> println("Rectangle area is ${shape.length} and ${shape.breadth}")
        SealedClassShape.notAShape -> println("Not a shape")
    }
}

fun main() {
    var circle = SealedClassShape.Circle(3.5f)
    var square = SealedClassShape.Rectangle(3, 5)
    displayShape(circle)

}