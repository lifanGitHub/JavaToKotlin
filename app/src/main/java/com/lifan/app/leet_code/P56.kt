package leet_code

/**
 * Author: LiFan
 * Date: 2020/6/30
 * Description: 给出一个区间的集合，请合并所有重叠的区间。
 */

class Solution56 {
    fun merge(intervals: Array<IntArray>): Array<IntArray> {
        if (intervals.size <= 1) {
            return intervals
        }
        val removeList = mutableSetOf<Int>()

        var i = 0
        while (i in (0..intervals.size - 2)) {
            if (i in removeList) {
                i++
                continue
            }

            var j = i+1
            while (j in (i + 1 until intervals.size)) {
                if (j in removeList) {
                    j++
                    continue
                }
                val arrA = intervals[i]
                val arrB = intervals[j]
                if (arrB[0] in (arrA[0]..arrA[1])
                        || arrB[1] in (arrA[0]..arrA[1])
                        || arrA[0] in (arrB[0]..arrB[1])
                        || arrA[1] in (arrB[0]..arrB[1])) {
                    //合并目标下标==j
                    val left = if (arrA[0] <= arrB[0]) arrA[0] else arrB[0]
                    val right = if (arrA[1] >= arrB[1]) arrA[1] else arrB[1]
                    val newArr = arrayOf(left, right).toIntArray()
                    intervals[i] = newArr
                    removeList.add(j)
                    //重要 如果有合并区间 合并后退出当前匹配 i再次循环匹配需要合并的空间
                    i--
                    break
                }
                j++
            }

            i++
        }
        //循环结束后删除区间内数组
        val result = mutableListOf<IntArray>()
        for (index in intervals.indices) {
            if (!removeList.contains(index)) {
                result.add(intervals[index])
            }
        }
        return result.toTypedArray()
    }
}



fun main() {
    val arr = mutableListOf<IntArray>()
//    arr.add(arrayOf(1, 3).toIntArray())
//    arr.add(arrayOf(2, 6).toIntArray())
//    arr.add(arrayOf(8, 10).toIntArray())
//    arr.add(arrayOf(15, 18).toIntArray())
//    arr.add(arrayOf(1, 4).toIntArray())
//    arr.add(arrayOf(0, 4).toIntArray())

//    arr.add(arrayOf(2, 3).toIntArray())
//    arr.add(arrayOf(4, 5).toIntArray())
//    arr.add(arrayOf(6, 7).toIntArray())
//    arr.add(arrayOf(8, 9).toIntArray())
//    arr.add(arrayOf(1, 10).toIntArray())
//        arr.add(arrayOf(1, 4).toIntArray())
//    arr.add(arrayOf(0, 0).toIntArray())
//    val x = merge(arr.toTypedArray())
//    val a = 1
}