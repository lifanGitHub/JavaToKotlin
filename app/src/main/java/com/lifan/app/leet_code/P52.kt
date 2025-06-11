package leet_code

/**
 * Author: LiFan
 * Date: 2020/6/29
 * Description:
 * n 皇后问题2 Kotlin 继承
 * 第一个自己用回溯算法解的题目 方式同P51
 */

class Solution52 {
    class Board(val NN: Int) : Solution51.Board(NN) {
        var resultInt  = 0

        override
        fun recall(stepY: Int) {
            if (stepY == N) {
                resultInt++
                return
            }
            for (i in (0 until N)) {
                if (!checkPoint(i, stepY)) {
                    continue
                }
                input(i, stepY)
                recall(stepY + 1)
                remove(i, stepY)
            }
        }

        fun startInt(): Int {
            recall(0)
            return resultInt
        }
    }
}



fun main() {
    println(Solution52.Board(14).startInt())
}