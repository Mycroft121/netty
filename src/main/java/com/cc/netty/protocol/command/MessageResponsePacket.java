package com.cc.netty.protocol.command;

import lombok.Data;

import static com.cc.netty.protocol.command.Command.MESSAGE_RESPONSE;

/**
 * @Author: cc
 */
@Data
public class MessageResponsePacket extends Packet{

    private String message;


    @Override
    public Byte getCommand() {
        return MESSAGE_RESPONSE;
    }
}
