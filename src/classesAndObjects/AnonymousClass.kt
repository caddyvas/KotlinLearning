package classesAndObjects

/*
Anonymous inner class is a pretty good concept that makes the life of programmer very easy.
Whenever we are implementing an interface, the concept of anonymous inner block comes into
picture. The concept of creating an object of interface using runtime object reference is
known as anonymous class.
 */

fun main() {
    val programmer: Animal = object : Animal {
        override fun animalName() {
            println("I am a dog")
        }
    }
    programmer.animalName()
}

interface Animal {
    fun animalName()
}