package leet_code

/**
 * Author: LiFan
 * Date: 2020/6/11
 * Description:
 * 根据每日 气温 列表，请重新生成一个列表，对应位置的输出是需要再等待多久温度才会升高超过该日的天数。
 * 如果之后都不会升高，请在该位置用 0 来代替。
 */

class Solution739 {
    fun check(arr: IntArray,index:Int):Int{
        val now = arr[index]
        (index until arr.size).forEach {
            if (arr[it]> now){
                return it - index
            }
        }
        return 0
    }

    fun dailyTemperatures(T: IntArray): IntArray {
        val result = mutableListOf<Int>()
        for (i in T.indices){
            result.add(check(T,i))
        }
        return result.toIntArray()
    }


}
//fun main() {
//    dailyTemperatures(arrayOf(1,1,3,100).toIntArray())
//}
