package leet_code

/**
 * Author: LiFan
 * Date: 2020/7/16
 * Description:
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的数字可以无限制重复被选取。
 */

class Solution39A {


    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val a = A(candidates,target)
        a.recall(ArrayList())
        return a.resultList
    }


    private class A(val candidates: IntArray, val target: Int) {
        val resultList = mutableListOf<List<Int>>()
        fun List<Int>.addAllNum(): Int {
            var sum = 0
            this.forEach { sum += it }
            return sum
        }

        fun recall(nowList: ArrayList<Int>) {
            val all = nowList.addAllNum()
            if (all == target) {
                resultList.add(nowList.toMutableList())
                return
            }
            candidates.forEach {
                if (all + it <= target) {
                    nowList.add(it)
                    recall(nowList)
                    nowList.removeAt(nowList.size - 1)
                }
            }
        }
    }
}

fun main() {
    Solution39A().combinationSum(arrayOf(2,3,6,7).toIntArray(),7)
//    Solution39().combinationSum(arrayOf(4,3).toIntArray(),7)
}