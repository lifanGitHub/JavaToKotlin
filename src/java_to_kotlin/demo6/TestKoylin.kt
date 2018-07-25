
/**
 * @author by LiFan
 * @date 2018/7/25
 */

internal class TestKoylin {
    fun function(first: String = "Start", second: String = "End"): String {
        return first + "_" + second
    }

}

fun main(args: Array<String>) {
    println(TestKoylin().function())
    println(TestKoylin().function("A"))
    println(TestKoylin().function(first = "A"))
    println(TestKoylin().function(second = "A"))
    println(TestKoylin().function("A","B"))
    println(TestKoylin().function(second = "A",first = "B"))
}
