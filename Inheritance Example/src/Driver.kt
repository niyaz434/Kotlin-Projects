class Driver : Person {
    constructor()
    constructor(age: String, name: String) : super(age, name)

    fun drive() {
        println("I can drive")
    }
}