package com.cc.netty.protocol.command;

import io.netty.util.AttributeKey;

/**
 * @Author: cc
 */
public interface Attributes {

    AttributeKey<Boolean> LOGIN = AttributeKey.newInstance("login");

}
