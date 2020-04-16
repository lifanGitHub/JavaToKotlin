package leet_code

/**
 * Author: LiFan
 * Date: 2020/4/16
 * Description:
 */

class Solution4 {
    fun findMedianSortedArrays(nums1: IntArray, nums2: IntArray): Double {
        var i1 = 0
        var i2 = 0
        val len = nums1.size + nums2.size
        val targetArr = IntArray(len)

        for (i in 0 until len) {
            var max = 0
            if (i1 < nums1.size && i2 < nums2.size) {
                max = if (nums1[i1] <= nums2[i2]) {
                    nums1[i1++]
                } else {
                    nums2[i2++]
                }
            } else if (i1 >= nums1.size) {
                max = nums2[i2]
                i2++
            } else if (i2 >= nums2.size) {
                max = nums1[i1]
                i1++
            }

            targetArr[i] = max
            print("_$max")
        }

        return if (len % 2 == 1) {
            targetArr[len / 2] / 1.0
        } else {
            (targetArr[len / 2 - 1] + targetArr[len / 2]) / 2.0
        }
    }
}

fun main() {
    print(Solution4().findMedianSortedArrays(intArrayOf(1, 3), intArrayOf(2)))
}