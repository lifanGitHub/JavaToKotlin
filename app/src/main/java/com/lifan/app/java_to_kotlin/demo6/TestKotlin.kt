import java_to_kotlin.demo6.functionTest

/**
 * @author by LiFan
 * @date 2018/7/25
 */

internal class TestKotlin {

    companion object {
        fun function(first: String = "Start", second: String = "End"): String {
            return first + "_" + second
        }
    }


}

fun main(args: Array<String>) {
    //静态方法
    println(TestKotlin.function())
    println(TestKotlin.function("A"))
    println(TestKotlin.function(first = "A"))
    println(TestKotlin.function(second = "A"))
    println(TestKotlin.function("A","B"))
    println(TestKotlin.function(second = "A",first = "B"))

    println("------------------------等同--------------------------")

    //全局方法
    println(functionTest())
    println(functionTest("A"))
    println(functionTest(first = "A"))
    println(functionTest(second = "A"))
    println(functionTest("A","B"))
    println(functionTest(second = "A",first = "B"))

//    Kotlin允许定义全局函数而不需要引用类
//    疑问：不会导致全局库冲突或者混乱吗？

}
