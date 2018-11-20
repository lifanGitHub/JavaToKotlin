package leet_code;

import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/**
 * @author by LiFan
 * @date 2018/9/28
 */

class Test2 {
    public static void main(String[] args) {
        String string = "hello world";
        String hash1 = null;
        String hash2;
        try {
            hash1 = bytesToHexString(MessageDigest.getInstance("SHA-256").digest(string.getBytes(Charset.forName("UTF-8")))).replace(" ", "");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }
        hash2 = String.valueOf(string.hashCode());
//        System.out.println(hash1);
//        System.out.println(hash2);

        System.out.println(toHashCode("8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92qq"));
        System.out.println("8d969eef6ecad3c29a3a629280e686cf0c3f5d5a86aff3ca12020c923adc6c92".length());
        System.out.println(null + "xx");

    }

    private static String toHashCode(String string){
        String result = string.length() > 64 ?
                string.substring(0,64) :
                string;
        try {
            result = bytesToHexString(MessageDigest.getInstance("SHA-256").digest(string.getBytes(Charset.forName("UTF-8")))).replace(" ", "");
        } catch (Exception e) {

        }
        return result;
    }

    public static String bytesToHexString(byte[] bArray) {
        StringBuilder sb = new StringBuilder(bArray.length);
        String sTemp;
        for (int i = 0; i < bArray.length; i++) {
            sTemp = Integer.toHexString(0xFF & bArray[i]);
            if (sTemp.length() < 2)
                sb.append(0);
            sb.append(sTemp.toUpperCase());
            sb.append(" ");
        }
        return sb.toString();
    }
}
