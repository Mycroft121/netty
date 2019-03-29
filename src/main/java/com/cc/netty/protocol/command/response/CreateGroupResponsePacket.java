package com.cc.netty.protocol.command.response;

import com.cc.netty.protocol.command.Packet;
import lombok.Data;
import static com.cc.netty.protocol.command.command.Command.CREATE_GROUP_RESPONSE;
import java.util.List;

/**
 * @Author: cc
 */
@Data
public class CreateGroupResponsePacket extends Packet {
    private boolean success;

    private String groupId;

    private List<String> userNameList;

    @Override
    public Byte getCommand() {

        return CREATE_GROUP_RESPONSE;
    }
}
