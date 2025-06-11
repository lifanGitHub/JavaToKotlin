package leet_code

import java.lang.RuntimeException

/**
 * Author: LiFan
 * Date: 2020/7/2
 * Description:
 * 给定一个正整数 n，生成一个包含 1 到 n2 所有元素，且元素按顺时针顺序螺旋排列的正方形矩阵。
 */

class Solution59 {
    class Matrix(private val n: Int) {
        private val matrix: Array<IntArray> = Array<IntArray>(n) { IntArray(n) }
        private val matrixFlag: Array<BooleanArray> = Array<BooleanArray>(n) { BooleanArray(n) }
        private var direction = 0
        private var x = 0
        private var y = 0

        fun nextPoint() {
            when (direction % 4) {
                0 -> x++
                1 -> y++
                2 -> x--
                3 -> y--
            }
        }

        fun checkNext(): Boolean {
            when (direction % 4) {
                0 -> return (x + 1 in matrix[0].indices && y in matrix.indices && !matrixFlag[y][x + 1])
                1 -> return (x in matrix[0].indices && y + 1 in matrix.indices && !matrixFlag[y + 1][x])
                2 -> return (x - 1 in matrix[0].indices && y in matrix.indices && !matrixFlag[y][x - 1])
                3 -> return (x in matrix[0].indices && y - 1 in matrix.indices && !matrixFlag[y - 1][x])
            }
            throw RuntimeException("xxx")
        }

        fun start(): Array<IntArray> {
            for (i in (1..n * n)) {
                if (!checkNext()) {
                    direction++
                }
                matrix[y][x] = i
                matrixFlag[y][x] = true
                nextPoint()
            }

            return matrix
        }
    }
}





fun main() {
//    val a = Matrix(3).start()
}
