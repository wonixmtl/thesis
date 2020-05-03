package com.wonix.online_exam.utils;

import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.Arrays;

public class Encryption
{
    public static String getMd5(String plainText)
    {
        try
        {
            MessageDigest md = MessageDigest.getInstance("MD5");
            md.update(plainText.getBytes());
            byte[] digest = md.digest();

            //简单二次加密
            StringBuilder sb = new StringBuilder();
            for (int i = 0; i < digest.length; i++)
            {
                if (digest[i] < 0)
                    digest[i] += 256;
                if (digest[i] < 16)
                    sb.append(0);
                //变为16进制
                sb.append(Integer.toHexString(digest[i]));
            }

            return sb.toString();
        }
        catch (NoSuchAlgorithmException e)
        {
            e.printStackTrace();
            return null;
        }
    }
}
