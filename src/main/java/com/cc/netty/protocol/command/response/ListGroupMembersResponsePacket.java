package com.cc.netty.protocol.command.response;

import com.cc.netty.protocol.command.Packet;
import com.cc.netty.session.Session;
import lombok.Data;

import java.util.List;

import static com.cc.netty.protocol.command.command.Command.LIST_GROUP_MEMBERS_RESPONSE;

/**
 * @Author: cc
 */
@Data
public class ListGroupMembersResponsePacket extends Packet {

    public String reason;

    public boolean success;

    public String groupId;

    public List<Session> sessionList;

    @Override
    public Byte getCommand() {
        return LIST_GROUP_MEMBERS_RESPONSE;
    }
}
