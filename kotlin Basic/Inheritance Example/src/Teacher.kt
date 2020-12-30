class Teacher : Person {
    constructor()
    constructor(age: String, name: String) : super(age, name)

    fun teach() {
        println("I can able to teach")
    }

    fun setPersonName(name: String) {
        setName(name)
    }

    fun setPersonAge(age: String) {
        setAge(age)
    }
}