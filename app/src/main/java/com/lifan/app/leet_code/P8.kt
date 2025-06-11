package leet_code

import java.util.*


class Solution8 {
    fun pow1(a: Int): Long {
        var b = 1L
        (1..a).forEach {
            b *= 10
        }
        return b
    }

    fun myAtoi(str: String): Int {
        var negativeFlag: Int? = null
        val stack = Stack<Char>()
        var noZero = true
        for (c in str) {
            if (stack.isEmpty() && negativeFlag == null && (c !in '0'..'9' && c != '+' && c != '-' && c != ' ')) {
                //非法字符
                break
            } else if (stack.isEmpty() && noZero && negativeFlag == null && (c == '+' || c == '-')) {
                //正负号
                negativeFlag = if (c == '-') -1 else 1
                continue
            } else if (stack.isEmpty() && noZero && negativeFlag == null && (c == ' ')) {
                //无意义字符
                continue
            } else if (stack.isEmpty() && (c == '0')) {
                //无意义字符
                noZero = false
                continue
            } else if ((c in '0'..'9')) {
                stack.push(c)
                continue
            } else {
                break
            }
        }

        if (negativeFlag == null) negativeFlag = 1;

        var i = 0;
        var sum: Long = 0
        if (stack.size > 10) {
            sum = if (negativeFlag == 1) Int.MAX_VALUE.toLong() else Int.MIN_VALUE.toLong()
        } else {
            while (!stack.empty()) {
                sum += ((stack.pop().toLong() - 48) * pow1(i))
                i++
            }
            sum *= negativeFlag
            if (sum > Int.MAX_VALUE || sum < Int.MIN_VALUE) {
                sum = if (negativeFlag == 1) Int.MAX_VALUE.toLong() else Int.MIN_VALUE.toLong()
            }
        }
        return sum.toInt()
    }
}

fun main() {
//    println(Int.MAX_VALUE - 2.0.pow(31.0))
//    println(Int.MAX_VALUE)
    println(Solution8().myAtoi("-6147483648"))
//    println(Solution8().myAtoi("-2147483648"))
//    println(Solution8().myAtoi(Int.MIN_VALUE.toString()))
//    println(Int.MIN_VALUE)
//    println(pow(0))
//    println(pow(1))
//    println(pow(2))
}