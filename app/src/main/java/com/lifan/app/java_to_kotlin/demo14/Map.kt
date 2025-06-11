package java_to_kotlin.demo14

/**
 * @author by LiFan
 * @date 2018/9/17
 */
fun main(args: Array<String>) {
    val map = mutableMapOf(1 to "one")
    map.apply { this[2] = "two"}
    with (map) { this[3] = "three" }
    println(map)
}
