package java_to_kotlin.demo13

/**
 * @author by LiFan
 * @date 2018/8/27
 */
fun main(args: Array<String>) {
    var any: Any = Any()
    val sum = { x: Int, y: Int ->
        println("Computing the sum of $x and $y...")
        x + y
    }
    any = sum
    println((any as (kotlin.Int, kotlin.Int) -> kotlin.Int) (1,2))


}
