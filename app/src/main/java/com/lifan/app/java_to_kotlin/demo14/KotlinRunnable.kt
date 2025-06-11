package java_to_kotlin.demo14

/**
 * @author by LiFan
 * @date 2018/9/6
 */

fun createAllDoneRunnable(): Runnable {
    return Runnable { println("All done!") }
}

fun main(args: Array<String>) {
    println("All done!")
    createAllDoneRunnable().run()
}
