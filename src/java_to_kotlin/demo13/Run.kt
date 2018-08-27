package java_to_kotlin.demo13

/**
 * @author by LiFan
 * @date 2018/8/27
 */
fun main(args: Array<String>) {
    val str = "Aloha"

    //run内部可以定义重复
    val strRun = run {
        println(str)
        str + "_OK"
    }
    println(strRun)
}