package java_to_kotlin.demo2

/**
 * @author by LiFan
 * @date 2018/7/13
 */

internal class TestKotlin {
    var n: Int = 0
    var nn: Int = 0
    private var nnn: Int = 0  // 可写不可读
    val nnnn: Int = 0 // 可读不可写

    var x: String = ""
        get() = field + "Kotlin"
        set(value) {
            field = value + "Kotlin"
        }

}
