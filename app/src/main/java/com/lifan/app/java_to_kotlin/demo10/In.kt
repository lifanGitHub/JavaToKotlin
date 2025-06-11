package java_to_kotlin.demo10

/**
 * @author by LiFan
 * @date 2018/8/10
 * isLetter 1和2等效 3不行
 */

private fun isLetter1(c: Char) = c in 'a'..'z' || c in 'A'..'Z'
private fun isLetter2(c: Char):Boolean { return c in 'a'..'z' || c in 'A'..'Z' }
private fun isLetter3(c: Char) = { c in 'a'..'z' || c in 'A'..'Z' }

private fun isNotDigit(c: Char) = c !in '0'..'9'

fun main(args: Array<String>) {
    println(isLetter3('q'))
    println(isNotDigit('x'))
}