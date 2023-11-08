package leet_code

import java.lang.RuntimeException
import java.lang.StringBuilder

/**
 * @author: LiFan
 * @date: 2023/11/7
 * @Description:
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 */

class P22 {
    val sb = StringBuilder()

    fun IntArray.checkNext(index: Int): Boolean {
        var sum = 0
        for (i in 0..index) {
            sum += this[i]
            if (sum < 0) {
                return false
            }
        }
        return true
    }

    fun IntArray.checkResult(): Boolean {
        var sum = 0
        for (it in this) {
            sum += it
        }
        return sum == 0
    }

    fun exe(array: IntArray, indexOld: Int, result: MutableList<String>) {
        if (indexOld == array.size - 1) {
            if (array.checkResult())
                addString(array, result)
            return
        }
        val index = indexOld + 1

        array[index] = 1
        if (array.checkNext(index)) {
            exe(array, index, result)
        }

        array[index] = -1
        if (array.checkNext(index)) {
            exe(array, index, result)
        }
    }

    fun addString(array: IntArray,result: MutableList<String>){
        sb.clear()
        for (it in array){
            if (it == 1) sb.append('(')
            if (it == -1) sb.append(')')
            if (it == 0) throw RuntimeException()
        }
        result.add(sb.toString())
    }

    fun generateParenthesis(n: Int): List<String>? {
        val result = mutableListOf<String>()
        val size = 2 * n
        val arrray = IntArray(size)
        arrray[0] = 1
        exe(arrray, 0,result)
//        for (it in result){
//            println(it)
//        }
        return result
    }


}

fun main() {
    P22().generateParenthesis(3)
//    intArrayOf(1,1,-1,1,-1,-1).checkNext()
}

fun IntArray.checkNext(): Boolean {
    var tag = 0
    for (it in this) {
        tag += it
        if (tag < 0) {
            return false
        }
    }
    return true
}