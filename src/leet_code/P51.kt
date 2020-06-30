package leet_code

import java.lang.StringBuilder
import javax.swing.text.html.HTML.Attribute.N

/**
 * Author: LiFan
 * Date: 2020/6/29
 * Description:
 * n 皇后问题研究的是如何将 n 个皇后放置在 n×n 的棋盘上，并且使皇后彼此之间不能相互攻击。
 * https://leetcode-cn.com/problems/n-queens/
 */

class Solution51 {

}

class Board(val N: Int) {
    private val board = Array(N) { BooleanArray(N) }
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

    //    fun checkPoint2(x: Int, y: Int): Boolean {
//        //X轴不检测
//        //Y轴相同
//        (0 until N).forEach { i ->
//            if (board[x][i]) return false
//        }
//        //斜角
//        for (i in (0 until N)) {
//
//
//            val nextX = x + i
//            val nextY = y + i
//            if (nextX in (0 until N) && nextY in (0 until N)) {
//                if (board[nextX][nextY])
//                    return false
//            }
//        }
//        for (i in (0 until N)) {
//            val nextX = x - i
//            val nextY = y - i
//            if (nextX in (0 until N) && nextY in (0 until N)) {
//                if (board[nextX][nextY])
//                    return false
//            }
//        }
//        for (i in (0 until N)) {
//            val nextX = x + i
//            val nextY = y - i
//            if (nextX in (0 until N) && nextY in (0 until N)) {
//                if (board[nextX][nextY])
//                    return false
//            }
//        }
//        for (i in (0 until N)) {
//            val nextX = x - i
//            val nextY = y + i
//            if (nextX in (0 until N) && nextY in (0 until N)) {
//                if (board[nextX][nextY])
//                    return false
//            }
//        }
//
//        return true
//    }
    fun remove(x: Int, y: Int) {
        board[x][y] = false
    }

    fun input(x: Int, y: Int) {
        board[x][y] = true
    }

    fun toResult():List<String> {
        val sb = StringBuilder()
        val list = mutableListOf<String>()
        (0 until N).forEach { x ->
            sb.clear()
            (0 until N).forEach { y ->
                sb.append(if (board[x][y]) 'Q' else '.')
            }
//            println(sb.toString())
            list.add(sb.toString())
        }
        return list
    }

}

val result: List<List<String>> = mutableListOf()
//val board = Array(4){IntArray(4)}

//fun solveNQueens(n: Int): List<List<String>> {
//
//}

fun recall(board: Board, stepY: Int) {
    if (stepY == board.N) {
        board.toResult()
        println()
        return
    }
    for (i in (0 until board.N)) {
        if (!board.checkPoint(i, stepY)) {
            continue
        }
        board.input(i, stepY)
        recall(board, stepY + 1)
        board.remove(i, stepY)
    }

}

fun main() {
    recall(Board(4), 0)
}