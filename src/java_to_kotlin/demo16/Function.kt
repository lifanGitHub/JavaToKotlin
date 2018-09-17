package java_to_kotlin.demo16

import java_to_kotlin.demo10.Person
import kotlin.reflect.full.memberProperties

/**
 * @author by LiFan
 * @date 2018/9/17
 */
fun main(args: Array<String>) {
    val person = Person("Alice", 29)
    val kClass = person.javaClass.kotlin
    println(kClass.simpleName)
    kClass.memberProperties.forEach { println(it.name) }
}
