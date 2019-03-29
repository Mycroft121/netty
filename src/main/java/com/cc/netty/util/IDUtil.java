package com.cc.netty.util;

import java.util.UUID;

/**
 * @Author: cc
 */
public class IDUtil {

    public static String randomId() {
        return UUID.randomUUID().toString().split("-")[0];
    }

}
