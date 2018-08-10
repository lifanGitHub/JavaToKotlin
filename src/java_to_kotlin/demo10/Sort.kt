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
    val persons = listOf(Person("Alice",22),
            Person("Bob", age = 29))

    val oldest = persons.maxBy { it.age ?: 0 }
    val youngest = persons.maxBy { 1/(it.age ?: -1) } // or minBy Kotlin语法糖真是多
    println("The oldest is: $oldest")
    println("The oldest is: $youngest")
}

// The oldest is: Person(name=Bob, age=29)