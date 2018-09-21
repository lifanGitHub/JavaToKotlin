package java_to_kotlin.demo16
import kotlin.reflect.full.memberProperties

/**
 * @author by LiFan
 * @date 2018/9/17
 */
var counter = 0

class Person(val name: String,
                  val age: Int?,
                  id :String = "")

fun salute2(a :String = "default") = println("fun!")

fun main(args: Array<String>) {
    val person = Person("Alice", 29,"1926")
    val kClass = person.javaClass.kotlin
    val memberProperty = Person::age
    println(memberProperty.get(person))
    println(kClass.simpleName)

    //未打印出private
    kClass.memberProperties.forEach { println("${kClass.simpleName}的属性->${it.name}") }

    //方法
    val fun0 = ::salute2
    fun0.call("Fun!")

    val kProperty = ::counter
    kProperty.setter.call(21)
    println(kProperty.get())
}
