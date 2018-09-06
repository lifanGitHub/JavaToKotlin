package java_to_kotlin.demo14

/**
 * @author by LiFan
 * @date 2018/8/27
 * Try Kotlin C_5_3 的3,4一直不理解
 */
fun main(args: Array<String>) {
    val list = listOf(0, 1, 2, 3, 4, 5)
    list.map { it - 1 }
    list.filter { it > 0 }
    list.any { it != 3 }
    list.find { it % 2 == 0}
    list.groupBy { it.toString() } //转换为Map

    val strings = listOf("abc", "def")
    println(strings.flatMap { it.toList() })


}

