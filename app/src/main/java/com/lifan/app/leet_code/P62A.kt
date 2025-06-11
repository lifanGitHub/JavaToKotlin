package leet_code

/**
 * Author: LiFan
 * Date: 2020/7/15
 * Description:
 * 一个机器人位于一个 m x n 网格的左上角 （起始点在下图中标记为“Start” ）。
 * 机器人每次只能向下或者向右移动一步。机器人试图达到网格的右下角
 */

class Solution62 {
    fun uniquePathsM(m: Int, n: Int): Int {
        return calcualte(1, 1, 1, m, n)
    }


    private fun calcualte(step: Int, x: Int, y: Int, m: Int, n: Int): Int {
        var step = step
//        println("step==$step $x $y")
        if (x == m && y == n) {
            return ++step
        }
        if (x < m) {
            step = calcualte(step, x + 1, y, m, n)
        }
        if (y < n) {
            step = calcualte(step, x, y + 1, m, n)
        }
        return step
    }


}

fun main() {
    println("END = " + Solution62().uniquePathsM(3, 3))
}