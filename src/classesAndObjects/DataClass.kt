/*
Class's primary purpose is to hold the data/state. A class can contain getters, setters and mandatory equals(), hashcode().
We can also have a boiler plate code to generate getters and setters and sometimes, in need, we need to override equals and
Hashcode method.

Kotlin's Data class has a better solution to hold data/state. The compiler automatically generates a default getter and setter
for all mutable properties and a getter (only) for all the read-only properties of the DATA class. It derives the implementation
of standard methods like equal(), hashcode() and toString()
 */

fun main() {

    // print both data class and normal class to see the difference
    val sampleWithData = DataSample("deepak")
    println("Get Sample_DataClass: $sampleWithData")

    val sampleWithoutData = WithoutDataSample("Keerthi")
    println("Get Sample_NormalClass: $sampleWithoutData")

    // getting a property
    println("Get Name: ${sampleWithData.name}")
    println("Get NAme: ${sampleWithoutData.name}")

    val sampleWithData1 = DataSample("deepak")

    if(sampleWithData == sampleWithData1) {
        println("DATA CLASS OBJECTS EQUAL")
    } else {
        println("DATA CLASS OBJECTS NOT EQUAL")
    }

    // check the above in normal class
    val sampleWithoutData1 = WithoutDataSample("Keerthi")

    if(sampleWithoutData == sampleWithoutData1) {
        println("Normal CLASS OBJECTS EQUAL")
    } else {
        println("Normal CLASS OBJECTS NOT EQUAL")
    }

    // hashcode
    println("Hashcode for DataClass: ${sampleWithData.hashCode()} ---- ${sampleWithData1.hashCode()}")
    println("Hashcode for NormalClass: ${sampleWithoutData.hashCode()} ---- ${sampleWithoutData1.hashCode()})")

    // Kotlin also generates a copy() and componentN() for all data classes.
    // Copy() is to copy an existing object into a new object and modify properties while keeping original unchanged
    val newSample = sampleWithData.copy("Karthik")

    println("Prop modified: $newSample")
    println("Prop Original: $sampleWithData")

    // Component matches parameters in the constructor
    println("Component: ${sampleWithData.component1()}")

}

// data class must have one primary constructor parameter (val / var)
data class DataSample(val name: String) {

}

private class WithoutDataSample(val name: String) {

}