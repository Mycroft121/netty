package com.cc.netty.protocol.command.response;

import com.cc.netty.protocol.command.Packet;
import lombok.Data;

import static com.cc.netty.protocol.command.command.Command.MESSAGE_RESPONSE;

/**
 * @Author: cc
 */
@Data
public class MessageResponsePacket extends Packet {

    private String message;

    private String fromUserId;

    private String fromUserName;

    @Override
    public Byte getCommand() {
        return MESSAGE_RESPONSE;
    }
}
