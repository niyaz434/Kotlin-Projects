class Animal : AbstractExample {
    var ageOfNormalAnimal: String = ""

    constructor()
    constructor(ageOfNormalAnimal: String) : super(ageOfNormalAnimal) {
        this.ageOfNormalAnimal = ageOfNormalAnimal
    }

    override var ageOfAbstractAnimal: Int = 0
    override fun pleaseOverRide(ageOfAnimal: Int) {
        println("Age Of the abstract animal is :: $ageOfAnimal")
    }

    fun ageOfNormalAnimal() {
        println("Age Of the normal animal is :: $ageOfNormalAnimal")
    }
}