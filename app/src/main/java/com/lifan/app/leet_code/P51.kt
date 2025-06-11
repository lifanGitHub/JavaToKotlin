package leet_code

/**
 * Author: LiFan
 * Date: 2020/6/29
 * Description: 第一个自己用回溯算法解的题目
 * n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * https://leetcode-cn.com/problems/n-queens/
 */

class Solution51 {
    open class Board(val N: Int) {
        val result  = ArrayList<List<String>>()
        val board = Array(N) { BooleanArray(N) }
        fun checkPoint(x: Int, y: Int): Boolean {
            //斜角
            for (i in (0 until N)) {
                //X轴不检测
                //Y轴相同
                if (board[x][i]) return false
                if (x + i in (0 until N) && y + i in (0 until N)) {
                    if (board[x + i][y + i]) return false
                }
                if (x - i in (0 until N) && y - i in (0 until N)) {
                    if (board[x - i][y - i]) return false
                }
                if (x + i in (0 until N) && y - i in (0 until N)) {
                    if (board[x + i][y - i]) return false
                }
                if (x - i in (0 until N) && y + i in (0 until N)) {
                    if (board[x - i][y + i]) return false
                }
            }
            return true
        }

        fun remove(x: Int, y: Int) {
            board[x][y] = false
        }

        fun input(x: Int, y: Int) {
            board[x][y] = true
        }

        fun toResult(){
            val sb = StringBuilder()
            val list = ArrayList<String>()
            (0 until N).forEach { x ->
                sb.clear()
                (0 until N).forEach { y ->
                    sb.append(if (board[x][y]) 'Q' else '.')
                }
//            println(sb.toString())
                list.add(sb.toString())
            }
//        println()
            result.add(list)
        }

        open fun recall(stepY: Int) {
            if (stepY == N) {
                toResult()
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

        open fun start(): List<List<String>> {
            recall(0)
            return result
        }
    }
}



fun main() {
//    Board(4).start()
}