package leet_code

/**
 * Author: LiFan
 * Date: 2020/7/15
 * Description:给定一个由整数组成的非空数组所表示的非负整数，在该数的基础上加一。
 * 最高位数字存放在数组的首位， 数组中每个元素只存储单个数字。
 * 你可以假设除了整数 0 之外，这个整数不会以零开头。
 */

class Solution66 {
    fun plusOne(digits: IntArray): IntArray {
        if (digits.isEmpty()) return digits
        var addFlag = true
        for (i in (digits.size - 1 downTo 0)) {
            if (addFlag) {
                if (digits[i] != 9) {
                    digits[i] = digits[i] + 1
                    addFlag = false
                } else {
                    digits[i] = 0
                }
            }
            if (addFlag && i == 0 && digits[0] == 0) {
                return IntArray(digits.size + 1) {
                    when (it) {
                        0 -> 1
                        else -> 0
                    }
                }
            }
        }
        return digits
    }

}

fun main() {
    val a = Solution66().plusOne(arrayOf(9).toIntArray())
}