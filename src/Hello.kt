fun main(args: Array<String>) {
    fun greet(name: String, msg: String): String = "$msg "
    /*println(greet("Eve")) //Hello Eve*/
    println(greet("Eve", "Howdy")) //Howdy Eve
    /*println(greet("name"))*/
    fun createPerson(name: String, age: Int = 1, height: Int, weight: Int) {
        println("$name $age $height $weight")
    }
    //named arguments
    createPerson(name = "Jake", age = 12, weight = 43, height = 152)
}