package leet_code

import kotlin.system.measureTimeMillis

/**
 * Author: LiFan
 * Date: 2020/7/14
 * Description:
 * 动态规划计算斐波那契数列
 */

fun main() {
    val n = 42
    val smart = measureTimeMillis {
        println(fi(n))
    }
    val smart2 = measureTimeMillis {
        println(fi2(n))
    }
    val old = measureTimeMillis {
        println(fibOld(n))
    }
    println("old = $old smart = $smart smart2 = $smart2")
}

//标准
fun fibOld(n: Int): Int {
    if (n <= 0) return 0
    return if (n == 1) 1 else fibOld(n - 1) + fibOld(n - 2)
}

//动态规划
private fun fi(index: Int): Int {
    return calculate(index,
            IntArray(index + 1) { i ->
                when (i) {
                    0 -> 0
                    1 -> 1
                    2 -> 1
                    else -> -1
                }
            })
}

//自低向上
fun fi2(index: Int): Int {
    val array = IntArray(index + 1) { i ->
        when (i) {
            0 -> 0
            1 -> 1
            2 -> 1
            else -> -1
        }
    }
    (3..index).forEach {i ->
        array[i] = array[i-1] + array[i-2]
    }
    return array[index]
}

private fun calculate(index: Int, array: IntArray): Int {
    if (array[index] == -1) {
        return calculate(index - 2, array) + calculate(index - 1, array)
    } else {
        return array[index]
    }
}