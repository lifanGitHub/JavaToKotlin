package leet_code

/**
 * @author by LiFan
 * @date 2018/11/6
 * 给定 n 个非负整数 a1，a2，...，an，每个数代表坐标中的一个点 (i, ai) 。
 * 在坐标内画 n 条垂直线，垂直线 i 的两个端点分别为 (i, ai) 和 (i, 0)。
 * 找出其中的两条线，使得它们与 x 轴共同构成的容器可以容纳最多的水。
 * 说明：你不能倾斜容器，且 n 的值至少为 2。
 *
 */
class Solution {
    fun maxArea(height: IntArray): Int {
        var maxLength = 0
        //起点
        for (i in height.indices){
            //遍历点
            for (j in height.indices){
                val length = Math.abs(i - j)
                val heightNow = Math.min(height[i],height[j])
                if (length * heightNow > maxLength){
                    maxLength = length * heightNow
                }
            }
        }

        return maxLength
    }
}

fun main(args: Array<String>) {
    print(Solution().maxArea(intArrayOf(3,5,3,5,3)))
}