fun main(args: Array<String>) {
     //Iterating
   /* val array = arrayOf(1, 2, 3)
    for (e in array) { print("$e, ") }
    val list = listOf(1, 2, 3)
    for (e in list) { print("$e, ") }*/

    //iterating over index and values
    val names = listOf("Tom", "Jerry","GHANA", "Spike")
   /* for (index in names.indices) {
        println("Position of ${names.get(index)} is $index")
    }*/
   /* for (index in names.indices) println("Position of ${names[index]} is $index")*/

    //we can also get index and position using withIndex() and destructuring
    for ((index, name) in names.withIndex()) println("Position of $name is $index")
}
