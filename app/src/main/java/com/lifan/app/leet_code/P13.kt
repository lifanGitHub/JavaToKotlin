package com.lifan.app.leet_code

/**
 * @author: LiFan
 * @date: 2025/6/12
 * @Description:
 */

fun main() {
    println(P13().romanToInt("MCMXCIV"))
}

class P13 {
    fun CharArray.next(i: Int): Char {
        if (i < this.size -1) return this[i+1] else return 'Z'
    }

    fun romanToInt(s: String): Int {
        val arr = s.toCharArray()
        var i = 0
        var sum = 0
        while (i < arr.size) {
            val n = arr[i]
            if (n=='M'){
                sum += 1000
            }else if (n=='D'){
                sum += 500
            }else if (n=='C'){
                if (arr.next(i)=='D'){
                    sum += 400
                    i++
                }else if (arr.next(i)=='M'){
                    sum += 900
                    i++
                }else{
                    sum += 100
                }
            }else if (n=='L'){
                sum += 50
            }else if (n=='X'){
                if (arr.next(i)=='L'){
                    sum += 40
                    i++
                }else if (arr.next(i)=='C'){
                    sum += 90
                    i++
                }else{
                    sum += 10
                }
            }else if (n=='V'){
                sum += 5
            }else if (n=='I'){
                if (arr.next(i)=='V'){
                    sum += 4
                    i++
                }else if (arr.next(i)=='X'){
                    sum += 9
                    i++
                }else{
                    sum += 1
                }
            }

            i++
        }

        return sum
    }
}