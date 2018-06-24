package com.lv.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class SaltUtil {

    @Value("${password.salt}")
    private static String salt;

    public static String getSalt() {
        return salt;
    }

    public static void setSalt(String salt) {
        SaltUtil.salt = salt;
    }
}
