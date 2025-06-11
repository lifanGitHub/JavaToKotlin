package leet_code

/**
 * Author: LiFan
 * Date: 2020/5/8
 * Description:给定一个字符串 s 和一个字符串数组 words。 words 中所有字符串 长度相同。
 */

class Solution30 {
    fun findSubstring(s: String, words: Array<String>): List<Int> {
        val src = s.toCharArray()
        val tagList = words.map { it.toCharArray() }
        val result = mutableListOf<Int>()

        val forIndex = s.length - (words[0].length * words.size)

        val tempList = mutableListOf<CharArray>()
        for (cursor in 0 .. forIndex){
            tempList.clear()
            tempList.addAll(tagList)
            doIt(src,cursor,tempList,words[0].length)
            //递归消耗了所有key说明匹配了
            if (tempList.isEmpty()){
                result.add(cursor)
            }
        }

        return result

    }

    private fun doIt(src: CharArray, cursor: Int, list: MutableList<CharArray>, size: Int) {
        var result = -1
        for (i in list.indices) {
            if (compair(src, cursor, list[i])) {
                result = i
                break
            }
        }
        if (result != -1) {
            list.removeAt(result)
            doIt(src, cursor + size, list, size)
        }
        //找不到 就结束递归
    }

    private fun compair(src: CharArray, cursor: Int, charArray: CharArray): Boolean {
        for (index in charArray.indices){
            if (src[cursor+index] == charArray[index]){
                continue
            }else{
                return false
            }
        }
        return true
    }


}

fun main() {
//    val result = Solution30().findSubstring("barfoothefoobarman", arrayOf("foo","bar"))
//    val result = Solution30().findSubstring("wordgoodgoodgoodbestword", arrayOf("word","good","best","word"))
//    val result = Solution30().findSubstring("barfoofoobarthefoobarman", arrayOf("bar","foo","the"))
    val result = Solution30().findSubstring("wordgoodgoodgoodbestword", arrayOf("word","good","best","good"))
    println(result)
}