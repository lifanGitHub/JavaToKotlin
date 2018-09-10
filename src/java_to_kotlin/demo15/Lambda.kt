@file:JvmName("OperateKt")

package java_to_kotlin.demo15

/**
 * @author by LiFan
 * @date 2018/9/10
 */

fun f0() {
    println("A")
}

val f1 = {
    println("A")
}

fun main(args: Array<String>) {
    //运行一个方法
    run(::f0)
    run(f1);

    // 这是一个对象(虽然他是方法)
    val x = { println("A") }
    //加()运行它
    { println("A") } ()
    //使用run 运行它
    run{ println("A") }

    //打印对象(打印方法的入参和返回值)
    println(::f0)
    println(f1)

    //打印匿名函数 { println("A") } (本质上打印入参和返回值)
    println({ println("A") } )
    //运行匿名函数 { println("A") } 打印其返回值kotlin.Unit
    println({ println("A") } ())
}