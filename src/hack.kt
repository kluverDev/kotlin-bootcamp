class main {
    //listOf is immutable. mutablelistof is mutable
    //there is no mutable version of an array. the size is fixed
    //arrayof has no type associated so u can mix types. intArrayof declares a pecific type of array int
    //val school = listOf("mackerel", "trout", "halibut")
    //println(school)
    //val myList = mutableListOf("tuna", "salmon", "shark")
    //myList.remove("shark")
    //val school = arrayOf("shark", "salmon", "minnow")
    //println(java.util.Arrays.toString(school))
    //val mix = arrayOf("fish", 2)

    //COMBINE TWO ARRAYS WITH + OPERATOR

    //val numbers = intArrayOf(1,2,3)
    //val numbers3 = intArrayOf(4,5,6)
    //val foo2 = numbers3 + numbers
    //println(foo2[5])

    //COMBINATION OF NESTED ARRAYS AND LISTS
    //val numbers = intArrayOf(1, 2, 3)
    //val oceans = listOf("Atlantic", "Pacific")
    //val oddList = listOf(numbers, oceans, "salmon")
    //println(oddList)

    //FOR LOOP
    //val school = arrayOf("shark", "salmon", "minnow")
    //for (element in school) {
    //    print(element + " ")
    //}

    //In Kotlin, you can loop through the elements and the indexes at the same time. Try this example:

   // for ((index, element) in school.withIndex()) {
    //    println("Item at $index is $element\n")
    //}

    //TRY RANGES
    //for (i in 1..5) print(i)
    //⇒ 12345
    //
    //for (i in 5 downTo 1) print(i)
    //⇒ 54321
    //
    //for (i in 3..6 step 2) print(i)
    //⇒ 35
    //
    //for (i in 'd'..'g') print (i)

    //DO WHILE LOOP
    //var bubbles = 0
    //while (bubbles < 50) {
    //    bubbles++
    //}
    //println("$bubbles bubbles in the water\n")
    //
    //do {
    //    bubbles--
    //} while (bubbles > 50)
    //println("$bubbles bubbles in the water\n")
    //
    //repeat(2) {
    //     println("A fish is swimming")
    //}

    // Learn about the ? and ?: operators
    //var fishFoodTreats = 6
    //fishFoodTreats = fishFoodTreats?.dec()
    //fishFoodTreats = fishFoodTreats?.dec() ?: 0  If fishfoodtreats is not null, decrement else it is =0
}