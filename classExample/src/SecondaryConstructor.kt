class SecondaryConstructor {
    private var myString = "Initialized String"
    private var myInt = 100

    constructor() {
        println("Empty secondary constructor initialized")
    }

    /*Secondary constructor initialized*/
    constructor(secondaryString: String, secondaryInt: Int) {
        myString = secondaryString.toUpperCase()
        myInt = secondaryInt
        println("Initialized string is $secondaryString + $secondaryInt")
    }

    fun getMyString(): String {
        return myString
    }

    fun getMyInt(): Int {
        return myInt
    }
}