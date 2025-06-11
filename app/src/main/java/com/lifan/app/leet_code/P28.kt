package leet_code

/**
 * Author: LiFan
 * Date: 2020/6/15
 * Description:
 * 给定一个 haystack 字符串和一个 needle 字符串，在 haystack 字符串中找出 needle 字符串出现的第一个位置 (从0开始)。如果不存在，则返回  -1。
 */

fun strStr(haystack: String, needle: String): Int {
    if (needle.isEmpty()) {
        return 0
    }

    for (i in haystack.indices) {
        if (needle[0] == haystack[i]) {
            //余下长度不足
            if (haystack.length - i < needle.length) {
                return -1
            } else {
                var match = true
                for (ii in needle.indices) {
                    if (haystack[i + ii] != needle[ii]) {
                        match = false
                    }
                }
                if (match) {
                    return i
                }
            }
        }

    }
    return -1
}

fun main() {
    println(strStr("mississippi", "issip"))
}