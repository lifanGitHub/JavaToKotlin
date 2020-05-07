package leet_code

/**
 * Author: LiFan
 * Date: 2020/5/6
 * Description:
 */


class Solution17 {
    fun DKEProduct(a: List<String>, b: List<String>): List<String> {
        val result = mutableListOf<String>()
        if (b.isEmpty()) {
            return a
        }
        a.forEach { itA ->
            b.forEach { itB ->
                result.add(itA + itB)
            }
        }
        return result
    }
    val data = mapOf('2' to listOf("a", "b", "c"),
            '2' to listOf("a", "b", "c"),
            '3' to listOf("d", "e", "f"),
            '4' to listOf("g", "h", "i"),
            '5' to listOf("j", "k", "l"),
            '6' to listOf("m", "n", "o"),
            '7' to listOf("p", "q", "r", "s"),
            '8' to listOf("t", "u", "v"),
            '9' to listOf("w", "x", "y", "z"))

    fun letterCombinations(digits: String): List<String> {
        var result = emptyList<String>()
        if (digits.length == 1) {
            result = data[digits[0]]!!
        } else if (digits.isNotEmpty()) {
            result = data[digits[0]]!!
            for (i in digits.indices) {
                val tar: List<String> = if (i + 1 < digits.length) {
                    data[digits[i + 1]]!!
                } else {
                    emptyList<String>()
                }
                result = DKEProduct(result, tar)
            }
        }

        return result
    }


}

fun main() {
    println(Solution17().letterCombinations("233"))
}