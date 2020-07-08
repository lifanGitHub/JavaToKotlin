package leet_code

/**
 * Author: LiFan
 * Date: 2020/6/17
 * Description:
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 * 你的目标是使用最少的跳跃次数到达数组的最后一个位置。
 */


fun main() {
    val t1 = System.currentTimeMillis()
//    val result = Solution45().jump(arrayOf(5, 6, 4, 4, 6, 9, 4, 4, 7, 4, 4, 8, 2, 6, 8, 1, 5, 9, 6, 5, 2, 7, 9, 7, 9, 6, 9, 4, 1, 6, 8, 8, 4, 4, 2, 0, 3, 8, 5).toIntArray())
    val result = Solution45().jump(arrayOf(5, 8, 1, 8, 9, 8, 7, 1, 7, 5, 8, 6, 5, 4, 7, 3, 9, 9, 0, 6, 6, 3, 4, 8, 0, 5, 8, 9, 5, 3, 7, 2, 1, 8, 2, 3, 8, 9, 4, 7, 6, 2, 5, 2, 8, 2, 7, 9, 3, 7, 6, 9, 2, 0, 8, 2, 7, 8, 4, 4, 1, 1, 6, 4, 1, 0, 7, 2, 0, 3, 9, 8, 7, 7, 0, 6, 9, 9, 7, 3, 6, 3, 4, 8, 6, 4, 3, 3, 2, 7, 8, 5, 8, 6, 0).toIntArray())
    val div = System.currentTimeMillis() - t1
    println(div)


}


class Solution45 {
    class A {
        var times = Int.MAX_VALUE

        fun jump(nums: IntArray): Int {
            if (nums.size <= 1) {
                return 0
            }
            findAll(nums, 0, 1)
            return times
        }

        fun findAll(nums: IntArray, index: Int, times: Int) {
            val step = nums[index]

            //永不可达
            if (step == 0) return
            //优化 若已经大于当前 则不再继续尝试
            if (times >= this.times) return

            if (index + step >= nums.size - 1) {
                if (times < this.times) {
                    this.times = times
//                    println("经历时间$times")
                }
            } else {
                (step downTo 1).forEach {
                    findAll(nums, index + it, times + 1)
                }

            }

        }
    }


    fun jump(nums: IntArray): Int {
        return A().jump(nums)
    }

}

