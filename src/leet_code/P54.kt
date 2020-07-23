package leet_code

import java.lang.RuntimeException

/**
 * Author: LiFan
 * Date: 2020/7/2
 * Description:
 * 给定一个包含 m x n 个元素的矩阵（m 行, n 列），请按照顺时针螺旋顺序，返回矩阵中的所有元素。给定一个包含 m x n 个元素的矩阵（m 行, n 列），
 * 请按照顺时针螺旋顺序，返回矩阵中的所有元素。
 */

class Solution54 {
    class Matrix(private val matrix: Array<IntArray>) {
        private val matrixFlag: Array<BooleanArray> = Array<BooleanArray>(matrix.size) { BooleanArray(matrix[0].size) }
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

        fun start():  List<Int> {
            val result = mutableListOf<Int>()
            if (matrix.isEmpty() || matrix[0].isEmpty()){
                return result
            }

            (0 until matrix.size * matrix[0].size).forEach { i ->
//            print("${matrix[y][x]}_")
                result += matrix[y][x]
                if (!checkNext()) {
                    direction++
                }
                matrixFlag[y][x] = true
                nextPoint()
            }
            return result
        }
    }
}

fun main() {
    val a = Solution54.Matrix(arrayOf(arrayOf(1, 2, 3, 0).toIntArray(), arrayOf(8, 9, 4, 0).toIntArray(), arrayOf(7, 6, 5, 0).toIntArray())).start()
}
