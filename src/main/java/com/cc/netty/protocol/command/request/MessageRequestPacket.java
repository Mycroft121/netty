package com.cc.netty.protocol.command.request;

import com.cc.netty.protocol.command.Packet;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.cc.netty.protocol.command.command.Command.MESSAGE_REQUEST;

/**
 * @Author: cc
 */
 @Data
 @NoArgsConstructor
public class MessageRequestPacket extends Packet {

    private String userId;

    private String toUserId;

    private String message;

    public MessageRequestPacket(String toUserId, String message) {
        this.toUserId = toUserId;
        this.message = message;
    }


    @Override
    public Byte getCommand() {
        return MESSAGE_REQUEST;
    }
}
