package com.cc.netty.protocol.command;

import lombok.Data;

/**
 * @Author: cc
 */
@Data
public class LoginRequestPacket extends Packet{

    private String userId;

    private String username;

    private String password;

    @Override
    public Byte getCommand() {
        return Command.LOGIN_REQUEST;
    }
}
