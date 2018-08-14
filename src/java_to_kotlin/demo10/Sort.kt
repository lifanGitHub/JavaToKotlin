package java_to_kotlin.demo10

/**
 * @author by LiFan
 * @date 2018/8/10
 *
 * ？.遇到null不调用 返回null
 * ？:遇到null不调用 返回逻辑自定义
 * !! 断言
 */
data class Person(val name: String,
                  val age: Int?)

fun main(args: Array<String>) {
    val persons = listOf(
            Person("Alice",21),
            Person("Bob", age = 29),
            Person("double", age = 29))

    //目测是选择第一个符合条件的
    val oldest = persons.maxBy { it.age ?: 0 }
    // or minBy Kotlin语法糖真是多
    val youngest = persons.maxBy { 1/(it.age ?: -1) }

    println("The oldest is: $oldest")
    println("The oldest is: $youngest")
}
