package leet_code

/**
 * @author by LiFan
 * @date 2018/9/25
 * 反转整数
 * 给定一个 32 位有符号整数，将整数中的数字进行反转。
 */
class P7 {
    fun reverse(x: Int): Int {
        var str = if (x < 0) "-0" else "0"
        var int = Math.abs(x)
        while (int != 0){
            str += int % 10
            int /= 10
        }
//        -2143847412
        return if ((str.length < 15)  && str.toLong() in Int.MIN_VALUE .. Int.MAX_VALUE) str.toInt() else 0
    }

    fun Int.remove0(): Int{
        if (this == 0 || this % 10 != 0){
            return this
        }
        return (this / 10).remove0()
    }
}

fun main(args: Array<String>) {
    println(P7().reverse(-2147483412))
}