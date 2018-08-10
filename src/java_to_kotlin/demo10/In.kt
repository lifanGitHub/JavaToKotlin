package java_to_kotlin.demo10

/**
 * @author by LiFan
 * @date 2018/8/10
 * isLetter 1和2等效 3不行
 */

fun isLetter1(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
fun isLetter2(c: Char):Boolean { return c in 'a'..'z' || c in 'A'..'Z' }
fun isLetter3(c: Char) = { c in 'a'..'z' || c in 'A'..'Z' }

fun isNotDigit(c: Char) = c !in '0'..'9'

fun main(args: Array<String>) {
    println(isLetter3('q'))
    println(isNotDigit('x'))
}