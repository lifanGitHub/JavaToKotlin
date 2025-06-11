package java_to_kotlin.demo12

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