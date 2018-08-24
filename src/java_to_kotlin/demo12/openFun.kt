package java_to_kotlin.demo12

import java.io.BufferedReader
import java.io.StringReader
import java.util.*
import kotlin.collections.ArrayList

/**
 * @author by LiFan
 * @date 2018/8/15
 */

fun main(args: Array<String>) {
    val list = listOf("A","B","C")
    list.printElement("_LF")
}

fun Collection<String>.printElement(add: String = " "){
    for((index, value) in this.withIndex()){
        println("${index}_${value}_$add")
    }
}