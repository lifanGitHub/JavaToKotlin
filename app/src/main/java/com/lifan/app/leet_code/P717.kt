package leet_code

/**
 * @author by LiFan
 * @date 2018/9/19
 * 1比特与2比特字符
 * 有两种特殊字符。第一种字符可以用一比特0来表示。第二种字符可以用两比特(10 或 11)来表示。
 * 现给一个由若干比特组成的字符串。问最后一个字符是否必定为一个一比特字符。给定的字符串总是由0结束。
 *
 */
class P717 {
    fun isOneBitCharacter(bits: IntArray): Boolean {
        return if (bits.size < 2) {
            bits.size % 2 != 0
        } else if (bits[0] == 0) {
            isOneBitCharacter(bits.slice(1 until bits.size).toIntArray())
        } else {
            isOneBitCharacter(bits.slice(2 until bits.size).toIntArray())
        }

    }
}

fun main(args: Array<String>) {
    println(P717().isOneBitCharacter(arrayOf(1,1,1,0).toIntArray()))
}