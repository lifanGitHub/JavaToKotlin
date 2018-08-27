package java_to_kotlin.demo13

/**
 * @author by LiFan
 * @date 2018/8/27
 */
data class Person(val name: String, val age: Int)

fun main(args: Array<String>) {
    val createPerson = ::Person
    val p = createPerson("Alice", 29)
    println(p)
}
