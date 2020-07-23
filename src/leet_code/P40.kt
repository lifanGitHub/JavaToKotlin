package leet_code

/**
 * Author: LiFan
 * Date: 2020/7/16
 * Description:
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 * candidates 中的数字可以无限制重复被选取。
 */

class Solution40 {


    fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
        val a = A(candidates, target)
        a.recall(ArrayList(), 0)
        return a.resultList
    }


    private class A(val candidates: IntArray, val target: Int) {
        val resultList = ArrayList<List<Int>>()
        fun List<Int>.addAllNum(): Int {
            var sum = 0
            this.forEach { sum += it }
            return sum
        }

        fun recall(nowList: ArrayList<Int>, index: Int) {
            val all = nowList.addAllNum()
            if (all == target && !resultList.equalList2(nowList)) {
                resultList.add(nowList.toMutableList())
                return
            }
            for (i in candidates.indices) {
                if (i <= index && nowList.isNotEmpty()) continue
                if (all + candidates[i] <= target) {
                    nowList.add(candidates[i])
                    recall(nowList, i)
                    nowList.removeAt(nowList.size - 1)
                }
            }
        }

        private fun List<Int>.equalList(src: List<Int>): Boolean {
            if (src.size != this.size) {
                return false
            }
            val list = src.toMutableList()
            for (it in this) {
                if (list.contains(it)) {
                    list.remove(it)
                } else {
                    return false
                }
            }
            return true
        }

        private fun ArrayList<List<Int>>.equalList2(src: List<Int>): Boolean {
            for (list in this){
                if (list.equalList(src))
                    return true
            }
            return false
        }
    }
}

fun main() {
//    val a = Solution40().combinationSum(arrayOf(10,1,2,7,6,1,5).toIntArray().sortedArray(), 8)
    val a = Solution40().combinationSum(arrayOf(10,1,2,7,6,1,5).toIntArray(), 8)
//    Solution39().combinationSum(arrayOf(4,3).toIntArray(),7)
}