package com.xht.lease.common.utils;

import java.util.Random;

/**
 * @author : YIYUANYUAN
 * @date: 2024/7/13  13:33
 */
public class VerifyCodeUtil {
    public static String getVerifyCode(int length) {
        StringBuilder builder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < length; i++) {
            builder.append(random.nextInt(10));
        }
        return builder.toString();
    }
}
