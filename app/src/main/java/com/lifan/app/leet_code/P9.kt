package leet_code

/**
 * @author by LiFan
 * @date 2018/9/26
 * 判断一个整数是否是回文数。回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。
 */
class P9 {
    fun isPalindrome(x: Int): Boolean {
        val str = x.toString()
        for ( i in str.indices){
            if (str[i] != str[str.length - 1 - i]){
                return false
            }
        }
        return true
    }
}

fun main(args: Array<String>) {
    println(P9().isPalindrome(-1))
}