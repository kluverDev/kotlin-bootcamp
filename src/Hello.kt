fun main(args: Array<String>) {
    fun max(numbers: IntArray): Int {
        var large = Int.MIN_VALUE
        println(large)
        for (number in numbers) {
            println("$number hell")
            large = if (number > large) number else large
            println(large)
        }
        return large
    }
    println(max(intArrayOf(1, 5, 2, 12, 7, 3)))
//    //shortest func you can write in kotlin
//    fun greet(): String {
//        return "string"
//    }
//
//    println(greet())
    //    fun sayHello() = println("Well, hello") //kotlin infers the type as Unit.
//    val message: String = sayHello() //ERROR
//    fun sayHello(): Unit = println("Well, hello")
//    val message: Unit = sayHello()
//    println(message).toString()

}