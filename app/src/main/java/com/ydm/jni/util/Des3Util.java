package com.ydm.jni.util;

import com.ydm.jni.util.base64.BASE64Decoder;
import com.ydm.jni.util.base64.BASE64Encoder;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/**
 * Description: 3DES算法与AES一样是可逆算法，支持对加密字符串进行解密，前提是解密时密钥必须与加密时一致
 * Data：2019/1/14-10:36
 * Author: DerMing_You
 */
public class Des3Util {
    /**
     * 3DES（Triple DES）是三重数据加密算法，相当于对每个数据块应用3次DES加密算法。
     * 因为原先DES算法的密钥长度过短，容易遭到暴力破解，所以3DES算法通过增加密钥的
     * 长度防范加密数据被破解
     */
    // 定义加密算法，DESede即3DES
    private static final String Algorithm = "DESede";

    //加密函数。key为密钥
    public static String encrypt(String key, String raw) {
        byte[] enBytes = encryptMode(key, raw.getBytes());
        BASE64Encoder encoder = new BASE64Encoder();
        return encoder.encode(enBytes);
    }

    //解密函数。key值必须和加密时的key一致
    public static String decrypt(String key, String enc) {
        try {
            BASE64Decoder decoder = new BASE64Decoder();
            byte[] enBytes = decoder.decodeBuffer(enc);
            byte[] deBytes = decryptMode(key, enBytes);
            return new String(deBytes);
        } catch (IOException e) {
            e.printStackTrace();
            return enc;
        }
    }

    private static byte[] encryptMode(String key, byte[] src) {
        try {
            SecretKey deskey = new SecretKeySpec(build3DesKey(key), Algorithm);
            Cipher cipher = Cipher.getInstance(Algorithm);
            cipher.init(Cipher.ENCRYPT_MODE, deskey);
            return cipher.doFinal(src);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    private static byte[] decryptMode(String key, byte[] src) {
        try {
            SecretKey deskey = new SecretKeySpec(build3DesKey(key), Algorithm);
            Cipher cipher = Cipher.getInstance(Algorithm);
            cipher.init(Cipher.DECRYPT_MODE, deskey);
            return cipher.doFinal(src);
        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }

    //根据字符串生成密钥24位的字节数组
    private static byte[] build3DesKey(String keyStr) throws UnsupportedEncodingException {
        byte[] key = new byte[24];
        byte[] temp = keyStr.getBytes("UTF-8");

        if (key.length > temp.length) {
            System.arraycopy(temp, 0, key, 0, temp.length);
        } else {
            System.arraycopy(temp, 0, key, 0, key.length);
        }
        return key;
    }
}
