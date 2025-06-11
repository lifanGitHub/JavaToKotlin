package java_to_kotlin.demo5

/**
 * @author by LiFan
 * @date 2018/7/23
 */

internal class TestKotlin {


    fun max2(a: Int, b: Int): Int {
        return if (a >= b) a else b
    }

    companion object {

        fun max(a: Int, b: Int): Int {
            return if (a >= b) a else b
        }

        fun testFun() : Long {
            return System.currentTimeMillis()
        }

        fun lambadaTestFun() {
            System.currentTimeMillis()
        }

        val lambadaTest = {
            System.currentTimeMillis()
        }

        val lambadaTest2 = System.currentTimeMillis()

    }
}


fun main(args: Array<String>) {
    val first = TestKotlin().max2(1, 2)
    val second = TestKotlin.max(1, 2)

    System.out.println("这不是我想要的效果 TestKotlin.lambadaTestFun()" + TestKotlin.lambadaTestFun())
    System.out.println(TestKotlin.testFun())
    System.out.println(TestKotlin.lambadaTestFun())
    System.out.println(TestKotlin.lambadaTest())
    System.out.println(TestKotlin.lambadaTest2)

    System.out.println("-----------------------------------")

    System.out.println(TestKotlin.lambadaTestFun().toString())
    System.out.println(TestKotlin.lambadaTest())
    System.out.println(TestKotlin.lambadaTest2)
}