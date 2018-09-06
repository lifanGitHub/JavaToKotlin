package java_to_kotlin.demo14

/**
 * @author by LiFan
 * @date 2018/9/6
 */

//?.遇到null之后不执行 返回 ?: XX
fun strLenSafe(s: String?): Int = s?.length ?: 0

//?.遇到null之后不执行 返回null
fun strLenSafe1(s: String?): Int? = s?.length

//!!断言 如果遇到null则抛出异常
fun strLenSafe2(s: String?): Int? = s!!.length

fun main(args: Array<String>) {
    println(strLenSafe("abc"))
    println(strLenSafe(null))
}

