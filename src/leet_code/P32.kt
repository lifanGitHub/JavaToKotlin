package leet_code

/**
 * Author: LiFan
 * Date: 2020/5/8
 * Description: 给你一个只包含 '(' 和 ')' 的字符串，找出最长有效（格式正确且连续）括号子串的长度。
 */

class Solution32 {
    val left = '('.code
    val right = ')'.code
    var maxLength = 0
    var maxIndex = 0

    fun longestValidParentheses(s: String): Int {
        val src = s.toCharArray()
        val size = src.size
        for (i in 0 until size) {
            val index = x(src, i)
            if (index > i) {
                //有结果
                val length = index - i + 1 //括号长度
                if (length > maxLength) {
                    maxIndex = i
                    maxLength = length
                }
            }
            //提前结束
            if (i + maxLength > size) {
                break
            }
        }
        return maxLength
    }

    //返回最长值坐标 -1无效
    fun x(src: CharArray, index: Int): Int {
        var sum = 0
        var sum0Index = index //记录0点
        for (i in index until src.size) {
            if (src[i].code == right) {
                sum--
            } else {
                sum++
            }
            //括号格式错误，返回上一个0点
            if (sum < 0) {
                break
            }
            //括号格式正确，记录一个0点
            if (sum == 0){
                sum0Index = i
            }
        }
        //循环完结 返回上一个0点
        return sum0Index
    }

}

fun main() {
//    Solution32().longestValidParentheses(")(()))")
    Solution32().longestValidParentheses("()((")
//    println('('.code)
//    println(')'.code)
}