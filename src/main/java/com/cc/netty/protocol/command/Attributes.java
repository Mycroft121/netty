package com.cc.netty.protocol.command;

import com.cc.netty.session.Session;
import io.netty.util.AttributeKey;

/**
 * @Author: cc
 */
public interface Attributes {

    AttributeKey<Boolean> LOGIN = AttributeKey.newInstance("login");

    AttributeKey<Session> SESSION = AttributeKey.newInstance("session");;
}
