fun main(args: Array<String>) {
//    val only = "whatnot"
//    val price = 12.25
//    val taxRate = 0.08
//    val output = "The amount $price after tax comes to $${price * (1 + taxRate)}"
//    val disclaimer = "The amount is in US$, that's right in \$only"
//    println(output)
//    println(disclaimer)

    val factor = 2
    fun doubleIt(n: Int) = n * factor
    val message = "The factor is $factor"
    println(doubleIt(2))
    println(message)
}