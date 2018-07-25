/**
 * @author by LiFan
 * @date 2018/7/18
 */
class Greeter(val name: String) {
    fun greet() {
        println("Hello, ${name}");
    }
}

fun main(args: Array<String>) {

//    var temp = args[1];
    Greeter(args[0]).greet()

}
