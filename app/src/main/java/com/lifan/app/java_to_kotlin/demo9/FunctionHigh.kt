package demo9

/**
 * @author by LiFan
 * @date 2018/9/11
 */


fun main(args: Array<String>) {
    //高阶函数
    fun functionHigh(a: Int, b:Int, operate: (Int, Int)->Int) :Int{
        return operate(a,b)
    }

    //普通函数
    fun funDel(a :Int,b :Int) :Int {return a - b}
    val funAdd:(a :Int,b :Int) -> Int = { a, b -> a + b }

    println(functionHigh(2,3,::funDel))
    println(functionHigh(2,3,funAdd))


}