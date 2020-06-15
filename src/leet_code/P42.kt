package leet_code

/**
 * Author: LiFan
 * Date: 2020/6/15
 * Description:
 * 给定 n 个非负整数表示每个宽度为 1 的柱子的高度图，计算按此排列的柱子，下雨之后能接多少雨水。
 * https://leetcode-cn.com/problems/trapping-rain-water/
 */

//检查之后是否有高于自己的index
fun checkArray(arr: IntArray, index: Int, offset: Int): Int {
    ((index+1)until arr.size).forEach {
        if (arr[index] - offset <= arr[it]) {
            return it
        }
    }
    return -1
}
//如果没有高于自己的 删减高度继续遍历
fun forHeight(arr: IntArray, index: Int): Int {
    (0 until  arr[index]).forEach {
        val result = checkArray(arr,index,it)
        if (result != -1) {
            return result
        }
    }
    return -1
}

fun main() {
    trap(arrayOf(0,1,0,2,1,0,1,3,2,1,2,1).toIntArray())
}


fun trap(height: IntArray): Int {
    var index = 0
    while (index < height.size) {
        println(forHeight(height,index))



        index++
    }



    return 0
}