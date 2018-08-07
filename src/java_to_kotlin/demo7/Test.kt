import java.util.function.BiConsumer

/**
 * This example introduces a concept that we call destructuring declarations.
 * It creates multiple variable at once. Anything can be on the right-hand
 * side of a destructuring declaration, as long as the required number of component
 * functions can be called on it.
 * See http://kotlinlang.org/docs/reference/multi-declarations.html#multi-declarations
 */

fun main(args: Array<String>) {

    val map = mapOf<String,Int>("A" to 1, "B" to 2, "C" to 3);
    val list = listOf<String?>("X",null,"Y")

    for ((key, value) in map) {
        println("key = $key, value = $value")
    }

    for (str in list){
        println("args=$str")
    }



}



