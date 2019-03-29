package com.cc.netty.protocol.command.request;

import com.cc.netty.protocol.command.Packet;
import lombok.Data;
import static com.cc.netty.protocol.command.command.Command.CREATE_GROUP_REQUEST;
import java.util.List;

/**
 * @Author: cc
 */
@Data
public class CreateGroupRequestPacket extends Packet {

    private List<String> userIdList;

    @Override
    public Byte getCommand() {
        return CREATE_GROUP_REQUEST;
    }
}
