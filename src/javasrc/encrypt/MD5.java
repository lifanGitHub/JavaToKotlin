package javasrc.encrypt;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/**
 * @author by LiFan
 * @date 2018/10/17
 */

class MD5 {
    public static final int SIZE = 16384;

    public static void main(String[] args) {
        if (args.length != 0){
            System.out.println(stringMD5(args[0]));
        }else {
            System.out.println("No File");
        }
    }

    
    public static String stringMD5(String input) {
        try {
            byte[] buffer = new byte[SIZE];
            int len;
            FileInputStream in = new FileInputStream(new File(input));

            // 拿到一个MD5转换器（如果想要SHA1参数换成”SHA1”）
            MessageDigest messageDigest =MessageDigest.getInstance("MD5");
            // 输入的字符串转换成字节数组
            byte[] inputByteArray = input.getBytes();
            // inputByteArray是输入字符串转换得到的字节数组
            while ((len = in.read(buffer, 0, SIZE)) != -1) {
                messageDigest.update(buffer, 0, len);
            }
            // 转换并返回结果，也是字节数组，包含16个元素
            byte[] resultByteArray = messageDigest.digest();
            // 字符数组转换成字符串返回
            return HexUtil.bytesToHexString(resultByteArray);
        } catch (Exception e) {
            e.printStackTrace();
            return "";
        }
    }
}
