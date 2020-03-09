package exercise

import org.jetbrains.annotations.NotNull

class Nullability {

    fun fixme(@NotNull str: String?) {
        val length = str.length
        print("$str length is $length")
    }
}