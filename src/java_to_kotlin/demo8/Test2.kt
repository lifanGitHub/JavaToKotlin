package java_to_kotlin.demo8

/**
 * @author by LiFan
 * @date 2018/8/7
 */
/**
 * 代理属性
 */
import kotlin.properties.Delegates

class User {
    var name: String by Delegates.observable("no name") {
        d, old, new ->
        println("$old - $new")
    }

}

fun main(args: Array<String>) {
    val user = User()
    user.name = "Carl"
}