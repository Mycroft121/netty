package com.cc.netty.protocol.command.response;

import com.cc.netty.protocol.command.Packet;
import lombok.Data;

import static com.cc.netty.protocol.command.command.Command.*;

/**
 * @Author: cc
 */
@Data
public class JoinGroupResponsePacket extends Packet {

    @Override
    public Byte getCommand() {
        return JOIN_GROUP_RESPONSE;
    }
}
