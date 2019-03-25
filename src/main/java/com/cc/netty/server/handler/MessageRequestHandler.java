package com.cc.netty.server.handler;

import com.cc.netty.protocol.command.PacketCodeC;
import com.cc.netty.protocol.command.request.MessageRequestPacket;
import com.cc.netty.protocol.command.response.MessageResponsePacket;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Date;

/**
 * @Author: cc
 */
public class MessageRequestHandler extends SimpleChannelInboundHandler<MessageRequestPacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, MessageRequestPacket messageRequestPacket) throws Exception {
        //处理消息
        System.out.println(new Date() + ": 收到客户端信息: " + messageRequestPacket.getMessage());

        MessageResponsePacket messageResponsePacket = new MessageResponsePacket();
        messageResponsePacket.setMessage("客户端回复[" + messageRequestPacket.getMessage() + "]");
        ctx.channel().writeAndFlush(messageResponsePacket);
    }
}
