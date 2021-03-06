/**
 * 代理属性
 */

import kotlin.reflect.KProperty

class Example {
    var p: String by Delegate()
    val time: String by lazy { System.currentTimeMillis().toString() }
    override fun toString() = "Example Class"
}

class Delegate {
    operator fun getValue(thisRef: Any?, prop: KProperty<*>): String {
//        return "p被设置了:${(thisRef as Example).p}"
        return System.currentTimeMillis().toString()
    }

    operator fun setValue(thisRef: Any?, prop: KProperty<*>, value: String) {
//        println("$value has been assigned to ${prop.name} in $thisRef")
        println("p被设置了:$value")
    }
}

fun main(args: Array<String>) {
    val e = Example()
    println(e.p)
    Thread.sleep(1234)
    println(e.p)
    e.p = "NEW"

    //lazy 只会加载一次
    println(e.time)
    Thread.sleep(123)
    println(e.time)
    Thread.sleep(123)
    println(e.time)
}
