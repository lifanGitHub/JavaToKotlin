/**
 * There's some new syntax: you can say `val 'property name': 'Type' by 'expression'`.
 * The expression after by is the delegate, because get() and set() methods
 * corresponding to the property will be delegated to it.
 * Property delegates don't have to implement any interface, but they have
 * to provide methods named getValue() and setValue() to be called.</p>
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
