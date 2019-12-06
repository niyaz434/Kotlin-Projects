fun main() {
    println("Just a test")

    /*printing squared number*/
    println("Please enter a number to be squared")
    val enteredNum: Int = Integer.valueOf(readLine())

    println("Entered number and the square of the number is  :: " + enteredNum.times(enteredNum))

    /*getting the user name and mobile number*/
    println("Please enter your name")
    var enteredName = readLine()
    println("Please enter mobile number")
    var enterNum = readLine()

    println("Enter to print the entered result")
    /*printing the entered output by the user*/
    println("Entered Name :: " + enteredName + "\nEntered Number :: " + enterNum)

    /*initializing a class for saving the name and mobile number and printing the result*/
    val justForCall = JustForCall()

    /*initializing a array list and adding the objects to it for testing*/
    val arrayList = arrayListOf<JustForCall>()

    if (enteredName != null && enterNum != null) {
        justForCall.name = enteredName
        justForCall.mobileNo = enterNum
    }
    println("Entered from another class name is  : " + justForCall.name)
    println("Entered from another class number is  : " + justForCall.mobileNo)

    arrayList.add(justForCall)

    /*entering the second name of the user and mobile no storing it in another variable*/
    println("Please enter second name")
    enteredName = readLine()
    println("Please enter second mobile number")
    enterNum = readLine()

    val secondCall = JustForCall()
    if (enteredName != null && enterNum != null) {
        secondCall.name = enteredName
        secondCall.mobileNo = enterNum
    }
    println("Entered from another class name second is  : " + secondCall.name)
    println("Entered from another class number second is  : " + secondCall.mobileNo)

    arrayList.add(secondCall)

    /*printing the result for stored array list*/
    for (justForCall in arrayList) {
        println("Name is " + justForCall.name)
        println("Mobile number is " + justForCall.mobileNo)
    }
}