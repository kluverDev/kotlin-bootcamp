fun main(args: Array<String>) {
     fun max(vararg numbers: Int): Int {
         var large = Int.MIN_VALUE
         for (number in numbers) {
             large = if (number > large) number else large
         }
         return large
     }
    val values = intArrayOf(1, 21, 3)
    println(max(*values))
    println(max(*listOf(1, 4, 18, 12).toIntArray()))
    //By placing a * in front of the argument, you’re asking Kotlin to
    //spread the values in that array as discrete values for the vararg parameter
    /*
         println(max(1, 5, 2)) //5
         println(max(1, 5, 2, 12, 7, 3)) //12*/
    fun greetMany(vararg names: String, msg: String) {
        println("$msg ${names.joinToString(", ")}")
    }

    /* When calling the function, if you pass any number of unnamed String arguments
the compiler will assume all of them are for the vararg parameter. For it to know
that a value is for the msg parameter, you’ll have to use a named argument, like so:*/
    greetMany("Tom", "Jerry", "Spike", msg = "Hello") //Hello Tom, Jerry, Spike
    //The vararg parameter isn’t required to be the trailing parameter, but I highly
    //recommend that it is
}
