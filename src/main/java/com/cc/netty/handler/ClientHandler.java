package com.cc.netty.handler;

import com.cc.netty.protocol.command.LoginRequestPacket;
import com.cc.netty.protocol.command.PacketCodeC;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

import java.util.Date;
import java.util.UUID;

/**
 * @Author: cc
 */
public class ClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelActive(ChannelHandlerContext ctx) throws Exception {
        System.out.println(new Date()+": 客户端开始登陆");

        //创建登陆对象
        LoginRequestPacket loginRequestPacket = new LoginRequestPacket();
        loginRequestPacket.setUserId(UUID.randomUUID().toString());
        loginRequestPacket.setUsername("flash");
        loginRequestPacket.setPassword("pwd");

        //编码
        ByteBuf byteBuf = PacketCodeC.INSTANCE.encode(ctx.alloc() ,loginRequestPacket);

        //写数据
        ctx.channel().writeAndFlush(byteBuf);
    }
}
