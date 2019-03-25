package com.cc.netty.protocol.command.request;

import com.cc.netty.protocol.command.Packet;
import lombok.Data;
import static com.cc.netty.protocol.command.command.Command.MESSAGE_REQUEST;

/**
 * @Author: cc
 */
@Data
public class MessageRequestPacket extends Packet {

    private String message;


    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
