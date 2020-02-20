fun main() {

    println("===========Learning Abstract class implementation===============")

    /*Zebra animal is abstracted an used*/
    val animal = Animal("Zebra")
    animal.ageOfNormalAnimal = "90"
    animal.ageOfAbstractAnimal = 112
    animal.canPrint()
    animal.ageOfNormalAnimal()
    animal.pleaseOverRide(36)

    println("===========Learning Abstract class implementation===============")

    /*Lion animal is abstracted an used*/
    val lionAnimal = Animal("Lion")
    lionAnimal.ageOfNormalAnimal = "02"
    lionAnimal.ageOfNormalAnimal()
    lionAnimal.canPrint()
    lionAnimal.pleaseOverRide(20)

}