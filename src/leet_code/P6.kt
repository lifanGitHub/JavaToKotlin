package leet_code

/**
 * @author by LiFan
 * @date 2018/9/27
 * 将字符串 "PAYPALISHIRING" 以Z字形排列成给定的行数：
 *P   A   H   N
 *A P L S I I G
 *Y   I   R
 */
class P6 {
    fun convert(s: String, numRows: Int): String {
        data class Point(val x: Int, val y: Int, val value: Char)
        if (numRows == 1 || s.isEmpty())
            return s
        val list = ArrayList<Point>()
        list.add(Point(0,-1,'X'))
        for( i in s.indices){
            val point = list[i]
            //沿着y轴上升
            if(point.x % (numRows -1) == 0){
                if (point.y < numRows - 1){
                    list.add(Point(point.x,point.y + 1,s[i]))
                }else{
                    list.add(Point(point.x + 1,point.y - 1,s[i]))
                }
            }else{
                list.add(Point(point.x + 1,point.y - 1,s[i]))
            }
        }

        list.removeAt(0)

        var sb = ""
        (0 .. numRows).forEach{y ->
            list.filter { y == it.y }.forEach { sb += it.value }
        }
        return sb
    }

}

fun main(args: Array<String>) {
    println(P6().convert("ABCDEFGHIJKLM",4))
//    println(P6().convert("A",1))
}