package leet_code

/**
 * @author by LiFan
 * @date 2018/9/20
 *给定两个二进制字符串，返回他们的和（用二进制表示）。
 *输入为非空字符串且只包含数字 1 和 0。
 *输入: a = "11", b = "1"
 *输出: "100"
 *输入: a = "1010", b = "1011"
 *输出: "10101"
 */

fun main(args: Array<String>) {
    println(P67().addBinary("1","1"))
}

class P67 {
    private fun IntArray.rightGet(n : Int): Int{
        val index = size - 1 - n
        return if (index in 0..(size - 1)) this[index] else 0
    }

    fun addBinary(a: String, b: String): String {
        val maxSize = if (a.length >= b.length) a.length else b.length
        val src1 = a.map { it.toInt() - '0'.toInt() }.toIntArray()
        val src2 = b.map { it.toInt() - '0'.toInt() }.toIntArray()
        val div = IntArray(maxSize + 1)
        val sumSB = StringBuilder()
        (0 until div.size).forEach{
            var temp = src1.rightGet(it) + src2.rightGet(it) + div.rightGet(it)
            if (temp in 2..3){
                div[div.size - 2 - it] = 1
                temp -= 2
            }
            if (!(it == div.size -1 && temp == 0)) {
                sumSB.insert(0, temp)
            }
        }
        return sumSB.toString()
    }
}

