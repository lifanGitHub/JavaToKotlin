package leet_code


/**
 * @author by LiFan
 * @date 2018/9/21
 * 给定一个字符串，找出不含有重复字符的最长子串的长度。
 * 输入: "abcabcbb"
 * 输出: 3
 * 解释: 无重复字符的最长子串是 "abc"，其长度为 3。
 */
class P3 {
    fun lengthOfLongestSubstring(s: String): Int {
        var max = 0
        for ( i in s.indices){
            val list: ArrayList<Char> = ArrayList()
            for ( j in s.indices){
                if (j < i) continue
                if (!list.contains(s[j])){
                    list.add(s[j])
                }else{
                    break
                }
            }
            max = if (max >= list.size) max else list.size
        }
        return max
    }
}

fun main(args: Array<String>) {
    println(P3().lengthOfLongestSubstring(" "))

}