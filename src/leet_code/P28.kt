package leet_code

/**
 * Author: LiFan
 * Date: 2020/6/15
 * Description:
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

//"mississippi"
//"issip"


class Solution28 {

}

fun main() {
    println(strStr("mississippi", "issip"))
}