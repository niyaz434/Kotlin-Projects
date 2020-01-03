class SimpleClass(private var simpleString: String, private var simpleInt: Int) {
    /*primary constructor example*/
    init {
        this.simpleString = this.simpleString.toUpperCase()
        this.simpleInt = simpleInt.plus(10)
        val myString = this.simpleString + " This is string concatenated from the class ${simpleInt} ${simpleString}"
        println("Integer:: " + simpleInt + " String is  :: " + myString)
    }

    fun getSimpleString(): String {
        return this.simpleString
    }

    fun getSimpleInt(): Int {
        return this.simpleInt
    }

    fun setSimpleInt(simpleInt: Int) {
        this.simpleInt = simpleInt
    }

    fun setSimpleString(simpleString: String) {
        this.simpleString = simpleString
    }
}