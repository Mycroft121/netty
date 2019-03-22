package com.cc.netty.protocol.command;

import lombok.Data;
import static com.cc.netty.protocol.command.Command.LOGIN_REQUEST;

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
        return LOGIN_REQUEST;
    }
}
