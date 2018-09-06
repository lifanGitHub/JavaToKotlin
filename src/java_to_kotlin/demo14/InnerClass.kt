package java_to_kotlin.demo14

/**
 * @author by LiFan
 * @date 2018/9/6
 */
class Father{
    private val str = "Father"
    //持有外部引用 必须存在外部对象
    inner class In{
        fun foo(){ println(str) }
    }

    //不持有外部引用(java static)
    class Normal{
//        fun foo(){ println(str) }
        fun foo(){ println("Father") }
    }
}

fun main(args: Array<String>) {

    Father().In().foo()
    Father.Normal().foo()
}