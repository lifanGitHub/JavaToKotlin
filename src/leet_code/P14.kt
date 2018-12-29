package leet_code

/**
 * @author by LiFan
 * @date 2018/11/6
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""。
 */
class Solution {
    fun commonSize(str1 :String,str2 :String) :Int{
        val min = if (str1.length >= str2.length) str2.length else str1.length
        var maxSize = 0
        for (it in 0 until min){
            if (str1[it] == str2[it])
                maxSize++
            else
                break
        }
        return maxSize
    }

    fun longestCommonPrefix(strs: Array<String>): String {
        if (strs.isEmpty())
            return ""
        if (strs.size == 1)
            return strs[0]

        val commonSizeList = ArrayList<Int>()
        for (i1 in strs.indices){
            val string = strs[i1]
            var max = Int.MAX_VALUE
            for (i2 in strs.indices){
                if (i1 == i2) continue
                val it = strs[i2]
                val maxNow = commonSize(it,string)
                if (maxNow < max)
                    max = maxNow
            }
            commonSizeList.add(max)
        }

        var maxIndex = 0
        for (i in commonSizeList.indices){
            if (commonSizeList[i] > maxIndex){
                maxIndex = i
            }
        }

        return strs[maxIndex].substring(0,commonSizeList[maxIndex])
    }

}

fun main(args: Array<String>) {
    println(Solution().longestCommonPrefix(arrayOf("ab","a","cbc")))
}