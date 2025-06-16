package com.lifan.app.leet_code

/**
 * @author: LiFan
 * @date: 2025/6/12
 * @Description:
 */

class P12 {
    val map = mapOf(1000 to "M", 900 to "CM", 500 to "D", 400 to "CD", 100 to "C", 90 to "XC", 50 to "L", 40 to "XL", 10 to "X", 9 to "IX", 5 to "V", 4 to "IV", 1 to "I")
    fun intToRoman(num: Int): String {
        var result = ""
        var last = num
        while (last > 0){
            for ((k,v) in map){
                if (last >= k){
                    last -= k
                    result += v
                    break
                }
            }
        }
        return result
    }
}

fun main() {
    println(P12().intToRoman(3749))
}