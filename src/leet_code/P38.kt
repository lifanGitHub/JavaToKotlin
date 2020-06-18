package leet_code

import leet_code.A.sayHI

/**
 * Author: LiFan
 * Date: 2020/6/16
 * Description: 「外观数列」是一个整数序列，从数字 1 开始，序列中的每一项都是对前一项的描述。
 */

private class P38 {
    fun countAndSay(n: Int): String {
        val list = mutableListOf("null", "1")
        (2..n).forEach {i->
            val res = deliver(list[i - 1])
            list += res.toString()
        }
        return list[n]
    }

    fun deliver(str: String):String {
        var i = 0
        var result = ""
        while (i < str.length) {
            val count = check(str, i)
            result += "$count${str[i]}"
            println(result)
            i += count
        }
        return result

    }

    fun check(str: String, index: Int): Int {
        var count = 1
        for (i in str.indices) {
            if (i < index || i > str.length - 2)
                continue
            val nowValue = str[i]
            if (str[i + 1] == nowValue) {
                count++
                continue
            } else {
                break
            }
        }
        return count
    }

}


fun main() {
//    println(countAndSay(10))
}