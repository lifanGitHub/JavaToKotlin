package leet_code

import java.util.*

/**
 * Author: LiFan
 * Date: 2020/6/18
 * Description:
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 * 使用回溯算法
 */

class Solution46 {
    fun permute(nums: IntArray): List<List<Int>> {
        recall(nums, LinkedList<Int>())
        return result
    }

    val result = LinkedList<List<Int>>()

    fun recall(nums: IntArray, list: MutableList<Int>) {
        if (list.size == nums.size) {
            //完成
            result.add(LinkedList(list))
            return
        }
        for (it in nums) {
            if (list.contains(it)) {
                continue
            }
            list.add(it)
            recall(nums, list)
            list.removeAt(list.size - 1)
        }

        //添加一个元素 无论是否正确
    }
}

fun main() {
    Solution46().permute(arrayOf(1, 2, 3).toIntArray())

}