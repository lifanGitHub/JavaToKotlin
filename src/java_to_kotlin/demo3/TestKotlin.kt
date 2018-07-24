package java_to_kotlin.demo3

import java.util.ArrayList
import java.util.Arrays

/**
 * @author by LiFan
 * @date 2018/7/23
 */

fun main(args: Array<String>) {
    val list: ArrayList<String> = ArrayList<String>()
    val list2 = arrayOf("X", "XX", "XXX")
    val list3 = listOf("X", "XX", "XXX")//这个是只读的
    //星号投射 暂时理解为安全的泛型转换
    list.addAll(Arrays.asList(*list2))

    //这种方式比较比较愚蠢
//        for (a in list2){
//            list.add(a)
//        }

    val s = list[0]
    val i = 3

    println("data:$s")
    println("data:${i+1+2+3}")
    println("data:${list[1]}")
    println("data:${list[2]}")

}