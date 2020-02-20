open class Person() {
    private var age: String = ""
    private var name: String = ""

    constructor(age: String, name: String) : this() {
        this.age = age
        this.name = name
    }

    fun walk() {
        println("Hi, I am $name and I am $age year old. I can able to walk and do the things")
    }

    fun speak() {
        println("Hi, Iam $name and I can able to speak")
    }

    fun setName(name: String) {
        this.name = name
    }

    fun setAge(age: String) {
        this.age = age
    }

    fun getName(): String {
        return this.name
    }

    fun getAge(): String {
        return this.age
    }

    override fun toString(): String {
        return "Person(name='$name', age='$age')"
    }


}