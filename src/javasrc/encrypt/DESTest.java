package javasrc.encrypt;

import java.security.SecureRandom;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.DESKeySpec;

import javasrc.util.HexUtil;

/**
 * @author by LiFan
 * @date 2018/7/31
 * 典型的对称加密 现在更多使用的是3DES
 */

class DESTest {


    /**
     * @param args
     */
    public static void main(String[] args) {
        String content = "蓝天白云晴空万里忽然暴风雨";
        String password = "12345678";

        if (password.length() % 8 != 0){
            System.out.println("密钥格式错误" + password);
        }

        System.out.println("密　钥：" + password);
        System.out.println("加密前：" + content);
        byte[] result = encrypt(content, password);
        System.out.println("加密后：" + HexUtil.bytesToHexString(result));
        String decryResult = decrypt(result, password);
        System.out.println("解密后：" + decryResult);
    }

    /**
     * 加密
     *
     * @param content 待加密内容
     * @param key     加密的密钥
     * @return
     */
    public static byte[] encrypt(String content, String key) {
        try {
            SecureRandom random = new SecureRandom();
            DESKeySpec desKey = new DESKeySpec(key.getBytes());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey securekey = keyFactory.generateSecret(desKey);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.ENCRYPT_MODE, securekey, random);
            byte[] result = cipher.doFinal(content.getBytes());
            return result;
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;
    }

    /**
     * 解密
     *
     * @param content 待解密内容
     * @param key     解密的密钥
     * @return
     */
    public static String decrypt(byte[] content, String key) {
        try {
            SecureRandom random = new SecureRandom();
            DESKeySpec desKey = new DESKeySpec(key.getBytes());
            SecretKeyFactory keyFactory = SecretKeyFactory.getInstance("DES");
            SecretKey securekey = keyFactory.generateSecret(desKey);
            Cipher cipher = Cipher.getInstance("DES");
            cipher.init(Cipher.DECRYPT_MODE, securekey, random);
            byte[] result = cipher.doFinal(content);
            return new String(result);
        } catch (Throwable e) {
            e.printStackTrace();
        }
        return null;

    }
}
