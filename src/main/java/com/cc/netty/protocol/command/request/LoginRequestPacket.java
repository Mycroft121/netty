package com.cc.netty.protocol.command.request;

import com.cc.netty.protocol.command.Packet;
import lombok.Data;
import static com.cc.netty.protocol.command.command.Command.LOGIN_REQUEST;

/**
 * @Author: cc
 */
@Data
public class LoginRequestPacket extends Packet {

    private String userId;

    private String userName;

    private String password;

    @Override
    public Byte getCommand() {
        return LOGIN_REQUEST;
    }
}
