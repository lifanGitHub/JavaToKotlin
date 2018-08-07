package java_to_kotlin.demo7

/**
 * @author by LiFan
 * @date 2018/8/7
 */
data class User2(val name: String, val id: Int)

private fun getUser(): User2 {
    return User2("Alex", 1)
}

fun main(args: Array<String>) {
    val user = getUser()
    println("name = ${user.name}, id = ${user.id}")

    // or

    val (name, id) = getUser()
    println("name = $name, id = $id")

    // or
    getUser().component1()
    println("name = ${getUser().component1()}, id = ${getUser().component2()}")
}