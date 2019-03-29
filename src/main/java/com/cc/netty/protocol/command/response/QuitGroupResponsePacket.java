package com.cc.netty.protocol.command.response;

import com.cc.netty.protocol.command.Packet;
import lombok.Data;

import static com.cc.netty.protocol.command.command.Command.QUIT_GROUP_RESPONSE;

/**
 * @Author: cc
 */
@Data
public class QuitGroupResponsePacket extends Packet {

    public String reason;

    public boolean success;

    public String groupId;

    @Override
    public Byte getCommand() {
        return QUIT_GROUP_RESPONSE;
    }
}
