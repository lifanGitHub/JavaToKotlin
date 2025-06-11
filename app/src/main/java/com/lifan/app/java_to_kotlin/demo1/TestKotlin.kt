package java_to_kotlin.demo1

import java.util.LinkedHashMap

/**
 * @author by LiFan
 * @date 2018/7/12
 */

internal class TestKotlin(private val map0: Map<String, String>) {
    private val n: Int

    private val mapNull: Map<String, String>? = null
    var map1: Map<String, String> = LinkedHashMap()
    var map2: Map<String, String> = LinkedHashMap()
    val map3: Map<String, String> = LinkedHashMap()


    init {
        this.n = map0.size
    }

    companion object {
        var map4: Map<String, String> = LinkedHashMap()
        val map5: Map<String, String> = LinkedHashMap()

        @JvmStatic
        fun main(args: Array<String>) {

        }
    }
}
