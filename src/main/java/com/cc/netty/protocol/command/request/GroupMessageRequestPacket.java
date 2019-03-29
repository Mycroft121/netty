package com.cc.netty.protocol.command.request;

import com.cc.netty.protocol.command.Packet;
import lombok.Data;
import lombok.NoArgsConstructor;

import static com.cc.netty.protocol.command.command.Command.GROUP_MESSAGE_REQUEST;

/**
 * @Author: cc
 */
@Data
@NoArgsConstructor
public class GroupMessageRequestPacket extends Packet {

    private String toGroupId;
    private String message;

    public GroupMessageRequestPacket(String toGroupId, String message) {
        this.toGroupId = toGroupId;
        this.message = message;
    }

    @Override
    public Byte getCommand() {
        return GROUP_MESSAGE_REQUEST;
    }
}
