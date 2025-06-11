package leet_code

/**
 * Author: LiFan
 * Date: 2020/5/8
 * Description:给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 * 有效字符串需满足：
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 */

class Solution20 {
    fun isValid(s: String): Boolean {
        var str = s;
        while (str.contains("{}") || str.contains("[]") || str.contains("()")) {
            str = str.replace("{}", "")
            str = str.replace("[]", "")
            str = str.replace("()", "")
        }
        return str.isEmpty()
    }
}

fun main() {
//    println(Solution20().isValid(""))
    println(Solution20().isValid("{}"))
    println(Solution20().isValid("{{}}"))
    println(Solution20().isValid("{{[]}}"))
}