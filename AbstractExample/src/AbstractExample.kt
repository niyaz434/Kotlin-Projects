abstract class AbstractExample {
    var nameOfAnimal: String = "Anjukundan"

    constructor()
    constructor(nameOfAnimal: String) {
        this.nameOfAnimal = nameOfAnimal
    }

    abstract var ageOfAbstractAnimal: Int

    abstract fun pleaseOverRide(ageOfAnimal: Int)

    fun canPrint() {
        println("Abstract class is created... ${nameOfAnimal}")
    }
}