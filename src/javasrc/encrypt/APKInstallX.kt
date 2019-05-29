package javasrc.encrypt

import java.io.IOException

/**
 * @author by LiFan
 * @date 2019/1/22
 */

internal object APKInstallX {

    private val MD5_RES = "DB 64 99 52 50 3F 11 57 BF 89 CC 86 A3 59 1F A9 "
    private val Win_SRC = ".\\bin\\adb install -r .\\bin.\\DSAir-release.apk"
    @JvmStatic
    fun main(args: Array<String>) {
        println("DSAir 2019-1-25 三期测试使用Android安装包 [ V1.0 维护:LiFan ]")
        val checkMD5 = MD5.stringMD5(".\\bin\\DSAir-release.apk")
        if (MD5_RES != checkMD5){
            println("MD5校验失败 请核对APK版本$checkMD5")
            println("${checkMD5.length}${MD5_RES.length}")
            System.exit(0)
        }else{
            println("APK MD5校验成功:6ABB0D777FB963592151D4B6DAB798F9")
        }
        println()
        println("请保证在Windows系统运行且唯一Android设备连接成功")
        println("确认请按回车键继续...")
        println()
        System.`in`.read()
        try {
            Runtime.getRuntime().exec(Win_SRC)
            println("完成")
        } catch (e: IOException) {
            println("异常")
        }
        System.exit(0)
    }
}
