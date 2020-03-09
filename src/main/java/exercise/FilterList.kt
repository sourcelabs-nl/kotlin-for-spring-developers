package exercise

fun main() {

    listOf("a", "b").filter({ item -> item == "a" })
    listOf("a", "b").filter() { item -> item == "a" } // Moved out of parentesis
    listOf("a", "b").filter { item -> item == "a" } // Omit parentesis
    listOf("a", "b").filter { it == "a" } // Implicit receiver it

}