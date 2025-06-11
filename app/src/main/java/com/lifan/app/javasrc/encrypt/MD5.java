package com.lifan.app.javasrc.encrypt;

import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

//import javasrc.util.HexUtil;

/**
 * @author by LiFan
 * @date 2018/10/17
 */

class MD5 {
//    public static final int SIZE = 1024 * 12;
//
//    public static void main(String[] args) {
//        if (args.length != 0){
//            System.out.println(stringMD5(args[0]));
//        }else {
//            System.out.println("Error args");
//        }
//    }
//
//
//    public static String stringMD5(String input) {
//        try {
//            byte[] buffer = new byte[SIZE];
//            int len;
//            FileInputStream in = new FileInputStream(new File(input));
//            // 拿到一个MD5工厂（如果想要SHA1参数换成”SHA1”）
//            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
//            while ((len = in.read(buffer, 0, SIZE)) != -1) {
//                messageDigest.update(buffer, 0, len);
//            }
//            // 获得结果
//            byte[] resultByteArray = messageDigest.digest();
//            // 转换成字符串返回
//            return HexUtil.bytesToHexString(resultByteArray);
//        } catch (Exception e) {
//            return e.getClass().getSimpleName();
//        }
//    }
}
