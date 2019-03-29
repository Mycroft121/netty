package com.cc.netty.protocol.command.request;

import com.cc.netty.protocol.command.Packet;
import lombok.Data;
import static com.cc.netty.protocol.command.command.Command.*;

/**
 * @Author: cc
 */
@Data
public class JoinGroupRequestPacket extends Packet {

    private String groupId;

    @Override
    public Byte getCommand() {
        return JOIN_GROUP_REQUEST;
    }
}
