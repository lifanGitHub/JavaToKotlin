package leet_code

/**
 * @author: LiFan
 * @date: 2024/1/10
 * @Description:
 */

class Solution34 {
    fun searchRange(nums: IntArray, target: Int): IntArray {
        return intArrayOf(search1(nums,target),search2(nums,target))
    }

    //搜索第一个等于target的数 注意 这不是标准的二分查找
    fun search1(nums: IntArray, target: Int): Int {
        var result = -1
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            var mid = (left + right) / 2
            if (nums[mid] > target) {
                right = mid - 1
            } else if (nums[mid] < target) {
                left = mid + 1
            } else if (target == nums[mid]) {
                result = mid
                right-- //重点
            }
        }
        return if (result != -1 && nums[result] == target) result else -1
    }

    //搜索最后一个等于target的数 注意 这不是标准的二分查找
    fun search2(nums: IntArray, target: Int): Int {
        var result = -1
        var left = 0
        var right = nums.size - 1
        while (left <= right) {
            var mid = (left + right) / 2
            if (nums[mid] > target) {
                right = mid - 1
            } else if (nums[mid] < target) {
                left = mid + 1
            } else if (target == nums[mid]) {
                result = mid
                left++ //重点
            }
        }
        return if (result != -1 && nums[result] == target) result else -1
    }
}

fun main() {
    println("\n\n" + Solution34().search1(intArrayOf(5,7,7,8,8,10), 8))
}