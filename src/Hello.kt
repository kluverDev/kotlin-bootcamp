fun main(args: Array<String>) {
    val name = "eve"
    //prefer to use raw string instead of escape string in kotlin
    val raw = """The kid asked, "How's it going, $name?""""
    //multiline string is a rw string that contains a line break
    val mem = """Dear $name, a quick reminder about the
party we have scheduled next Tuesday at
the 'Low Ceremony Cafe' at Noon. | Please plan to..."""

    fun createMemoFor(name: String): String {
        if (name == "Eve") {
            val memo = """
                |Dear $name, a quick reminder about the
party we have scheduled next Tuesday at
the 'Low Ceremony Cafe' at Noon. | Please plan to...
                """
            return memo.trimMargin()
        }
        return ""
    }
    println(createMemoFor("Eve"))
}