package com.cc.netty.server.handler;

import com.cc.netty.protocol.command.request.CreateGroupRequestPacket;
import com.cc.netty.protocol.command.request.JoinGroupRequestPacket;
import com.cc.netty.protocol.command.response.CreateGroupResponsePacket;
import com.cc.netty.util.IDUtil;
import com.cc.netty.util.SessionUtil;
import io.netty.channel.Channel;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;
import io.netty.channel.group.ChannelGroup;
import io.netty.channel.group.DefaultChannelGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: cc
 */
public class JoinGroupRequestHandler extends SimpleChannelInboundHandler<JoinGroupRequestPacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, JoinGroupRequestPacket joinGroupRequestHandler) throws Exception {
        // 1.获取群对应的 channelGroup,然后将当前用户的channel 填加进去
        String groupId = joinGroupRequestHandler.getGroupId();
//        SessionUtil.getChannel()

    }
}
