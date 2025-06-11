package java_to_kotlin.demo12

/**
 * @author by LiFan
 * @date 2018/8/24
 */
class A (val str1: String = "Hello",
         var str2: String = "Aloha",
         str3: String = "invisible",
         str4: String = "main")
{
    var str:String = str4
    get() = field.toUpperCase()
    set(value) {
        println(field)
        println(value)
        field = value
    }
}


fun main(args: Array<String>) {
    val a = A()
    a.str1
    a.str2
    a.str = "hello"
    println(a.str)
//    a.str3 不可见

}