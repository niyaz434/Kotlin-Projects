/**
 *
 * This is the [main] function of the program
 * And its having [arguments] as a param
 * @author Mohamed Niyaz
 * */
fun main(arguments:Array<String>){

    //Example of understanding  pairs in Kotlin
    //creating the list for ten
    val arrayList = ArrayList<Int>()
    arrayList.add(1)
    arrayList.add(10)
    arrayList.add(200)
    arrayList.add(3000)

    arrayList.let {
        it.forEach { it ->
            println(it)
        }
    }
    //creating the person name for string
    val personName = "FirstName"
    val namePair = Pair<String,ArrayList<Int>>(personName,arrayList)

    // Printing the list of elements stored in Pair
    println("My name is ${namePair.first} and list size count is ${namePair.second.size}")
}