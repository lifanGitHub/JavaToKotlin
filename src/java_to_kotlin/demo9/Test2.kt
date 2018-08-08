package java_to_kotlin.demo9

import java_to_kotlin.demo9.Test2.Companion.low2

/**
 * @author by LiFan
 * @date 2018/8/8
 */
//自己写的高阶函数

fun main(args: Array<String>) {
    val t = Test2()
    t.high(t::low)
    t.high(::low)
    t.high(Test2.Companion::low2)
}

private class Test2 {
    fun high(low: () -> Long) {
        println(low())
    }

    fun low(): Long {
        return System.currentTimeMillis()
    }

    companion object {
        fun low2(): Long {
            return System.currentTimeMillis()
        }
    }

}

fun low(): Long {
    return System.currentTimeMillis()
}
