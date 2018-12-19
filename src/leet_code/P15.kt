package leet_code

/**
 * 给定一个包含 n 个整数的数组 nums，判断 nums 中是否存在三个元素 a，b，c ，使得 a + b + c = 0 ？
 * 找出所有满足条件且不重复的三元组。
    [-1, 0, 1, 2, -1, -4]
 */

class P15{
    fun ArrayList<List<Int>>.checkAdd(addList :List<Int> ){
        if (this.isEmpty()) this.add(addList)
        var flag = true //是否添加
        for (list in this){
            flag = !list.checkEquals(addList)
            if (!flag)
                break
        }
        if (flag)
            this.add(addList)
    }
    //检查list是否相同
    fun List<Int>.checkEquals(other :List<Int>) :Boolean{
        return this.sortedBy { it } == other.sortedBy { it }
//        val copy = ArrayList<Int>()
//        copy.addAll(other)
//        this.forEach{
//            copy.remove(it)
//        }
//        return copy.isEmpty()
    }

    fun threeSum(nums: IntArray): List<List<Int>> {
        val result = ArrayList<List<Int>>()
        for (ai in nums.indices){
            for (bi in nums.indices){
                if (bi <= ai) continue
                for (ci in nums.indices){
                    if (ci <= bi) continue
                    if (nums[ai] + nums[bi] + nums[ci] == 0){
                        val ele = listOf(nums[ai],nums[bi],nums[ci])
                        result.checkAdd(ele)
                    }
                }
            }
        }
    return result
    }
}

fun main(args: Array<String>) {
//    println(P15().threeSum(listOf(-1,0,1,2,-1,-4).toIntArray()))
    println(P15().threeSum(listOf(0,1,-1,-2,0,0).toIntArray()))

}