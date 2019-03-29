package com.cc.netty.client.handler;

import com.cc.netty.protocol.command.Packet;
import com.cc.netty.protocol.command.PacketCodeC;
import com.cc.netty.protocol.command.request.LoginRequestPacket;
import com.cc.netty.protocol.command.response.LoginResponsePacket;
import com.cc.netty.protocol.command.response.MessageResponsePacket;
import com.cc.netty.session.Session;
import com.cc.netty.util.LoginUtil;
import com.cc.netty.util.SessionUtil;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.SimpleChannelInboundHandler;

import java.util.Date;
import java.util.UUID;

/**
 * @Author: cc
 */
public class LoginResponseHandler extends SimpleChannelInboundHandler<LoginResponsePacket> {

    @Override
    protected void channelRead0(ChannelHandlerContext ctx, LoginResponsePacket loginResponsePacket) throws Exception {
        String userId = loginResponsePacket.getUserId();
        String userName = loginResponsePacket.getUserName();

        if (loginResponsePacket.isSuccess()) {
            System.out.println("[" + userName + "]登录成功，userId 为: " + loginResponsePacket.getUserId());
            SessionUtil.bindSession(new Session(userId, userName), ctx.channel());
        } else {
            System.out.println("[" + userName + "]登录失败，原因：" + loginResponsePacket.getReason());
        }
    }

    @Override
    public void channelInactive(ChannelHandlerContext ctx) throws Exception {
        System.out.println("客户端连接被关闭!");
    }
}
