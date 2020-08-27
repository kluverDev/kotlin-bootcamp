fun main(args: Array<String>) {
     //destructuring
     fun getFullName() = Triple("John", "Quincy", "Adams")
    val result = getFullName()
    /*val first = result.first
    val middle = result.second
    val last = result.third*/
    val (first, middle, last) = getFullName()
    /*
    val (first, _, last) = getFullName()*/
    //to get only the middle name
//    val (_, middle) = getFullName()
    println("$first $middle $last") //John Quincy Adams
    //In addition to using destructuring when the return type is a data class, you can
    //also use destructuring to extract key and value from Map entries
}
