package leet_code

/**
 * Author: LiFan
 * Date: 2021/1/13
 * Description:
 * 给定一个二维网格和一个单词，找出该单词是否存在于网格中。
 * 单词必须按照字母顺序，通过相邻的单元格内的字母构成，其中“相邻”单元格是那些水平相邻或垂直相邻的单元格。同一个单元格内的字母不允许被重复使用。
 */

fun main() {
//    val charArray = "Aloha".toCharArray()
//    val charArray2 ="Hello".toCharArray()
//    val board = arrayOf(charArray,charArray2)
//
//    println(Solution79().exist(board,"haollX"))

    val charArray = "CAA".toCharArray()
    val charArray2 = "AAA".toCharArray()
    val charArray3 = "BCD".toCharArray()
    val board = arrayOf(charArray, charArray2, charArray3)

    println(Solution79().exist(board, "AABCDAAAC"))
}

class Solution79 {
    fun exist(board: Array<CharArray>, word: String): Boolean {
        return MainClass(board, word).start()
    }

    class MainClass(val board: Array<CharArray>, val word: String) {
        val width = board[0].size
        val height = board.size
        val array = mutableListOf<Point>()

        fun start(): Boolean {
            //遍历所有起点
            for (y in board.indices) {
                for (x in board[y].indices) {
                    if (board[y][x] != word[0]) continue
                    if (recall(x, y))
                        return true
                }
            }
            return false
        }

        //main 从某一个点开始计算
        fun recall(x: Int, y: Int): Boolean {
            array.add(Point(x, y))
            //检查是否已经完成任务

            if (checkEnd(x, y)) {
                return true
            }

            if (checkNextPoint(x + 1, y) && recall(x + 1, y)) {
                return true
            }

            if (checkNextPoint(x - 1, y) && recall(x - 1, y)) {
                return true
            }

            if (checkNextPoint(x, y + 1) && recall(x, y + 1)) {
                return true
            }

            if (checkNextPoint(x, y - 1) && recall(x, y - 1)) {
                return true
            }

            //没有匹配项目 回溯上一层
            array.removeAt(array.lastIndex)
            return false

        }


        //1 检查点是否越界 2 是否已经遍历 3 char字符是否符合要求
        fun checkNextPoint(x: Int, y: Int): Boolean {
            return y in (0 until height) && x in (0 until width) &&
                    !array.contains(Point(x, y)) &&
                    word[array.size] == board[y][x]
        }

        //检查是否结束
        fun checkEnd(x: Int, y: Int): Boolean {
            return word.length == array.size && word[word.lastIndex] == board[y][x]
        }

    }

    class Point(val x: Int, val y: Int) {
        override fun equals(other: Any?): Boolean {
            if (other is Point) {
                return other.x == x && other.y == y
            }
            return false;
        }
    }
}