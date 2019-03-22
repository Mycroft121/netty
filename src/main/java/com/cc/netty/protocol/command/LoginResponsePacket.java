package com.cc.netty.protocol.command;

import lombok.Data;
import static com.cc.netty.protocol.command.Command.LOGIN_RESPONSE;


/**
 * @Author: cc
 */
@Data
public class LoginResponsePacket extends Packet{

    private boolean success;

    private String reason;

    @Override
    public Byte getCommand() {
        return LOGIN_RESPONSE;
    }
}
