package java_to_kotlin.demo9

/**
 * @author by LiFan
 * 回顾本章节已经基本了解 可以删除
 * @date 2018/8/8
 */

//来自于Try Kotlin 感觉高阶函数嵌套泛型反而不容易理解
fun main(args: Array<String>) {
    val oddLength = compose(::isOdd, ::length)
    val strings = listOf("a", "ab", "abc")
    println(strings.filter(oddLength))
}

fun isOdd(x: Int) = x % 2 != 0
fun length(s: String) = s.length

fun <A, B, C> compose(f: (B) -> C, g: (A) -> B): (A) -> C {
    return { x -> f(g(x)) }
}
