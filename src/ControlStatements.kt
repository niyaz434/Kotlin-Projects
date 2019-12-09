fun main() {
    start()
    startIfCondition()
    switchAliasWhenCondition()
    whileCondition(6)
    doWhileCondition(4)
    forCondition(6)
    forTextCondition(arrayListOf("One", "Two", "Three"))
}

fun start() {
    print("Learning control statements in Kotlin\n")
}

fun startIfCondition() {
    /*print the lines according to the boolean entered*/
    ifStatement(true, true)
    ifStatement(false, true)
    ifStatement(true, false)
    ifStatement(false, false)
}

fun switchAliasWhenCondition() {
    startSwitchCondition('a')
    startSwitchCondition('b')
    startSwitchCondition('c')
    startSwitchCondition('d')
}

fun ifStatement(print: Boolean, dontPrint: Boolean) { /*If else ladder in kotlin*/
    if (print && dontPrint) {
        print("Printing both the lines and now it will accept both the integers\n")
    } else if (!print && dontPrint) {
        print("Print is not working and dont print is working now\n")
    } else if (print && !dontPrint) {
        print("Print is working and dont print is not working now\n")
    } else {
        print("Thats the end of the if and nested if statement\n")
    }
}

fun whileCondition(loop: Int) {/*while loop printing the values*/
    var count = loop
    while (count > 0) {
        println("$count is running...")
        count--
    }
}

fun doWhileCondition(count: Int) {/* do while loop printing the values*/
    var loop = count
    do {
        println("$loop is running... In do while loop..")
        loop--
    } while (loop > 0)
}

fun forCondition(forLoop: Int) {
    val count = forLoop
    for (i in 0..count) { /*normal for loop print all */
        print(i)
        if (i == count)
            println()
    }

    for (i in count downTo 0) { /*normal for loop print in reverse order */
        print(i)
        if (i == 0)
            println()
    }

    for (i in count downTo 0 step 3) { /*using continue and break option*/
        if (i == 3)
            continue
        else
            print(i)
        if (i == 0)
            println()
    }
}


fun forTextCondition(arrayListOf: ArrayList<String>) {
    for (String in arrayListOf.reversed()) { /*printing the list in reverse order*/
        println(String)
    }
}

fun startSwitchCondition(char: Char) {/*when statement like switch in java*/
    when (char) {
        'a', 'b', 'c' -> println("${char.toUpperCase()} is printed in the editor")
        else -> println("${char.toUpperCase()} is not a valid char to print in this editor")
    }
}


