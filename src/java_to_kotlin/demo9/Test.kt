package java_to_kotlin.demo9

/**
 * @author by LiFan
 * @date 2018/8/7
 */
fun main(args: Array<String>) {
    val numbers = listOf(1, 2, 3)
    println(numbers.filter(::isOdd1))
}

//以下两个都可以用于 不过更喜欢用第二个
private fun isOdd1(x: Int) = x % 2 != 0

private fun isOdd2(x: Int) : Boolean{
    return x % 2 != 0
}
