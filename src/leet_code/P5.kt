package leet_code

/**
 * @author by LiFan
 * @date 2018/9/27
 * 给定一个字符串 s，找到 s 中最长的回文子串
 */



class P5 {
    //检查回文
    fun String.check(): String{
        for (i in indices){
            if (this[i] != this[length -1 - i])
                return ""
        }
        return this
    }

    fun longestPalindrome(s: String): String {
        var maxStr = if (s.isEmpty()) "" else s[0].toString()
        for(start in s.indices){
            for (end in s.indices){
                if (end <= start)
                    continue
                val nowStr = s.substring(start,end+1).check()
                if (nowStr.length > maxStr.length){
                    maxStr = nowStr
                }
            }
        }

        return maxStr
    }
}

fun main(args: Array<String>) {
    println(P5().longestPalindrome("ab"))
//    println("baba".substring(0,0))
}