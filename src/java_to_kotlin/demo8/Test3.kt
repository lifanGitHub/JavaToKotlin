package java_to_kotlin.demo8

/**
 * @author by LiFan
 * @date 2018/8/7
 */
class User2(val map: Map<String, Any?>) {
    val name: String by map
    val age: Int     by map
}

fun main(args: Array<String>) {
    val user = User2(mapOf(
            "name" to "John Doe",
            "age"  to 25
    ))

    println("name = ${user.name}, age = ${user.age}")

}