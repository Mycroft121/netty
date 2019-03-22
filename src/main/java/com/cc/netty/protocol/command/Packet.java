package com.cc.netty.protocol.command;

import lombok.Data;

/**
 * @Author: cc
 */
@Data
public abstract class Packet {

    /**
     * 协议版本
     */
    private Byte version = 1;

    /**
     * 指令
     * @return
     */
    public abstract Byte getCommand();

}
