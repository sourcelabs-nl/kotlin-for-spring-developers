package exercise

fun main() {
    val s: String = myStringBuilder {
        append("text")
        append("text")
    }
    println(s)
}

fun myStringBuilder(function: StringBuilder.()-> Unit): String {
    val strBuilder = java.lang.StringBuilder()
    strBuilder.function()
    return strBuilder.toString()
}
