package java_to_kotlin.demo14

/**
 * @author by LiFan
 * @date 2018/8/27
 */
fun main(args: Array<String>) {
    val list = listOf(0, 1, 2, 3, 4, 5)
    list.map { it - 1 }
    list.filter { it > 0 }
    println(list.any { it != 3 })

    val numbers = mapOf(0 to "zero", 1 to "one")
    println(numbers.mapValues { it.value.toUpperCase() })

    //是否存在canBeInClub27不允许的成员
    val people = listOf(Person("Alice", 27), Person("Bob", 31))
    println(people.all(canBeInClub27))
}
data class Person(val name: String, val age: Int)

val canBeInClub27 = { p: Person -> p.age <= 27 }
