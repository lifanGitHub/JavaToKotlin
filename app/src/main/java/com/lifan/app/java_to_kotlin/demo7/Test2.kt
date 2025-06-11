package java_to_kotlin.demo7

/**
 * @author by LiFan
 * @date 2018/7/26
 */
/**
 * Data class gets next functions, generated automatically:
 * component functions, toString(), equals(), hashCode() and copy().
 * See http://kotlinlang.org/docs/reference/data-classes.html#data-classes
 */

data class User1(val name: String, val id: Int)

fun main(args: Array<String>) {
    val user = User1("Alex", 1)
    println(user) // toString()

    val secondUser = User1("Alex", 1)
    val thirdUser = User1("Max", 2)

    println("user == secondUser: ${user == secondUser}")
    println("user == thirdUser: ${user == thirdUser}")

    // copy() function
    println(user.copy())
    println(user.copy("Max"))
    println(user.copy(id = 2))
    println(user.copy("Max", 2))
}
