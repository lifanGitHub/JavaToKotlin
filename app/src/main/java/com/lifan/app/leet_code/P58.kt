package leet_code

/**
 * Author: LiFan
 * Date: 2020/7/8
 * Description: 最后一个单词长度
 */

class Solution58 {
    fun lengthOfLastWord(s: String): Int {
        val string = s.trim()
        if (string.isEmpty()) {
            return 0
        }
        if (!string.contains(' ')) {
            return string.length
        }
        var length = 0
        for (i in (string.length - 1 downTo 0)) {
            if (string[i] == ' ') {
                break
            }else{
                length++
            }
        }
        return length

    }
}

fun main() {
    println(Solution58().lengthOfLastWord("hello world 1"))
}