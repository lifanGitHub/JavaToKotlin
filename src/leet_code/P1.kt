package leet_code

/**
 * @author by LiFan
 * @date 2018/9/19
 * 两数之和
 * 给定一个整数数组和一个目标值，找出数组中和为目标值的两个数。
 * 你可以假设每个输入只对应一种答案，且同样的元素不能被重复利用。
 * 给定 nums = [2, 7, 11, 15], target = 9
 * 因为 nums[0] + nums[1] = 2 + 7 = 9
 * 所以返回 [0, 1]
 */

class P1 {
    fun twoSum(nums: IntArray, target: Int): IntArray {
        val result: IntArray = IntArray(2)
        for (i in nums.indices){
            for (j in nums.indices){
                if (nums[i] + nums[j] == target && i != j){
                    result[0] = i
                    result[1] = j
                    return result
                }
            }
        }
        return result
    }
}

fun main(args: Array<String>) {
    P1().twoSum(arrayOf(2,7,11,15).toIntArray(),9)
}