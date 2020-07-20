package leet_code

/**
 * Author: LiFan
 * Date: 2020/6/22
 * Description: 给定一个字符串数组，将字母异位词组合在一起。字母异位词指字母相同，但排列不同的字符串。
 */

class Solution49 {
    fun String.equalWord(s: String): Boolean {
        if (s.length != this.length) {
            return false
        }
        val list = s.toCharArray().toMutableList()
        for (it in this) {
            if (list.contains(it)) {
                list.remove(it)
            } else {
                return false
            }
        }
        return true
    }

    fun groupAnagrams(strs: Array<String>): List<List<String>> {
        val result = mutableListOf<List<String>>()
        val ignoreList = mutableListOf<Int>()

        for (i in strs.indices) {
            if (ignoreList.contains(i)) continue
            val tarStr = strs[i]
            val list = mutableListOf(tarStr)
            (i + 1 until strs.size).forEach {
                if (tarStr.equalWord(strs[it])){
                    list.add(strs[it])
                    ignoreList.add(it)
                }
            }
            result.add(list)
        }
        return result
    }
}



fun main() {
    Solution49().groupAnagrams(arrayOf("eat", "tea", "tan", "ate", "nat", "bat"))

}