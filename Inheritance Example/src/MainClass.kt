fun main() {
    /*Person initialization*/
    val person = Person("11", "Organizing software")
    person.speak()
    person.walk()

    println("================================================================\n")

    /*Teacher is inheriting person method*/
    val teacher = Teacher()
    teacher.setPersonAge("24")
    teacher.setPersonName("Software World")
    /*additional feature of the teacher is to teach lesson*/
    teacher.teach()
    /*normal attributes in which a person can do*/
    teacher.speak()
    teacher.walk()
    println("================================================================\n")

    /*Driver is inheriting person method*/
    val driver = Driver()
    driver.setAge("69")
    driver.setName("World Software")
    /*driving is the additional feature for the driver*/
    driver.drive()
    /*normal attributes of a person*/
    driver.speak()
    driver.walk()
    println("================================================================\n")

}