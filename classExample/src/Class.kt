fun main() {
    println("------------------------Learning class and constructor initialization------------------------------")
    creatingClass()
}

fun creatingClass() {
    val myClass = SimpleClass("Mohamed Niyaz", 10)
    // this is example for primary constructor
    println("MyClass primary constructor is ${myClass.getSimpleString()} + ${myClass.getSimpleInt()}")

    var mySecondaryConstructor = SecondaryConstructor()
    println("Class kt ${mySecondaryConstructor.getMyInt()} :: ${mySecondaryConstructor.getMyString()}")

    mySecondaryConstructor = SecondaryConstructor("Mohamed Niyaz", 1000)
    println("Class kt ${mySecondaryConstructor.getMyInt()} :: ${mySecondaryConstructor.getMyString()}")
}
