package java_to_kotlin.demo15

/**
 * @author by LiFan
 * @date 2018/9/10
 */
data class PointF(val x: Int, val y: Int)

data class Rectangle(val upperLeft: PointF, val lowerRight: PointF)

operator fun Rectangle.contains(p: PointF): Boolean {
    return p.x in upperLeft.x until lowerRight.x &&
            p.y in upperLeft.y until lowerRight.y
}

fun main(args: Array<String>) {
    val rect = Rectangle(PointF(10, 20), PointF(50, 50))
    println(PointF(20, 30) in rect)
    println(PointF(5, 5) in rect)
}
