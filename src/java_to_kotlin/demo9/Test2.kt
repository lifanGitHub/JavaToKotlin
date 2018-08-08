package java_to_kotlin.demo9

/**
 * @author by LiFan
 * @date 2018/8/8
 */
//自己写的高阶函数
//高阶函数中的低阶函数必须是静态的吗？为什么伴生对象对象不行？
fun main(args: Array<String>) {
    val t = Test2()
    t.high(::low)

}

private class Test2 {
    fun high(low: () -> Long) {
        println(low())
    }

    companion object {
        fun low(): Long {
            return System.currentTimeMillis()
        }
    }

}

fun low(): Long {
    return System.currentTimeMillis()
}
