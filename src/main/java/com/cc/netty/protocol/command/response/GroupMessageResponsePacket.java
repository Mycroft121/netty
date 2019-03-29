package com.cc.netty.protocol.command.response;

import com.cc.netty.protocol.command.Packet;
import com.cc.netty.session.Session;
import lombok.Data;

import static com.cc.netty.protocol.command.command.Command.GROUP_MESSAGE_RESPONSE;

/**
 * @Author: cc
 */
@Data
public class GroupMessageResponsePacket extends Packet {
    private String fromGroupId;

    private Session fromUser;

    private String message;

    @Override
    public Byte getCommand() {

        return GROUP_MESSAGE_RESPONSE;
    }
}
