package leet_code

/**
 * Author: LiFan
 * Date: 2020/5/8
 * Description:
 * 给你 旋转后 的数组 nums 和一个整数 target ，如果 nums 中存在这个目标值 target ，则返回它的下标，否则返回 -1 。
 * 重点：你必须设计一个时间复杂度为 O(log n) 的算法解决此问题。
 */

class Solution33 {
    fun search(nums: IntArray, target: Int): Int {
        var left = 0
        var righ = nums.size - 1

        while (left <= righ) {
            var mid = (left + righ) / 2
            if (nums[mid] == target) {
                return mid
            }else if (nums[mid] < target){
                left = mid + 1
            }else if (nums[mid] > target){
                righ = mid - 1
            }
        }

        return -1
    }


}

fun main() {
    println( Solution33().search(intArrayOf(1,2,3,4,5,6,7,8,9),7) )

}