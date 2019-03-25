package com.cc.netty.util;

import com.cc.netty.protocol.command.Attributes;
import io.netty.channel.Channel;
import io.netty.util.Attribute;


/**
 * @Author: cc
 */
public class LoginUtil {

    public static void markAsLogin(Channel channel) {
        channel.attr(Attributes.LOGIN).set(true);
    }

    public static boolean hasLogin(Channel channel) {
        Attribute<Boolean> loginAttr = channel.attr(Attributes.LOGIN);
        return loginAttr.get() != null;
    }

}
