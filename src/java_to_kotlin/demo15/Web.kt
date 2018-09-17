package java_to_kotlin.demo15

/**
 * @author by LiFan
 * @date 2018/9/10
 */
fun printMessagesWithPrefix(messages: Collection<String>, prefix: String) {
    messages.forEach {
        println("$prefix $it")
    }
}

fun main(args: Array<String>) {
    val errors = listOf("403 Forbidden", "404 Not Found")
    printMessagesWithPrefix(errors, "Error:")

}
