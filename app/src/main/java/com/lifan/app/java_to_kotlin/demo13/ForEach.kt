package java_to_kotlin.demo13

/**
 * @author by LiFan
 * @date 2018/8/27
 */
fun main(args: Array<String>) {
    val errors = listOf(Pair("403 Forbidden",403), Pair("404 Not Found",404))
//    printMessagesWithPrefix(errors, "Error:")
    errors.forEach { println("Error: ${it.first}") }
}
