package leet_code

/**
 * @author by LiFan
 * @date 2019/1/31
 */
class ArrayP1 {
    fun IntArray.addLeft(index: Int) :Int{
        var sum = 0
        for (i in this.indices){
            if (i < index)
                sum += this[i]
        }
        return sum
    }
    fun IntArray.addRight(index: Int) :Int{
        var sum = 0
        for (i in this.indices){
            if (i > index)
                sum += this[i]
        }
        return sum
    }

    fun pivotIndex(nums: IntArray): Int {
        for (i in nums.indices){
            if (nums.addLeft(i) == nums.addRight(i)){
                return i
            }
        }
        return -1
    }


}

fun main(args: Array<String>) {
    println(ArrayP1().pivotIndex(listOf<Int>().toIntArray()))
}