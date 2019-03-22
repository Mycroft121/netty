package com.cc.netty.handler;

import com.cc.netty.protocol.command.LoginRequestPacket;
import com.cc.netty.protocol.command.Packet;
import com.cc.netty.protocol.command.PacketCodeC;
import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;

/**
 * @Author: cc
 */
public class ServerHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        ByteBuf byteBuf = (ByteBuf) msg;

        //解码
        Packet packet = PacketCodeC.INSTANCE.decode(byteBuf);

        //判断是否是登陆请求的数据包
        if (packet instanceof LoginRequestPacket){
            LoginRequestPacket loginRequestPacket = (LoginRequestPacket) packet;

            //登陆校验
            if (valid(loginRequestPacket)){
                //校验成功
                System.out.println("校验成功");
            }else {
                //校验失败
                System.out.println("校验失败");
            }
        }
    }

    private boolean valid(LoginRequestPacket loginRequestPacket) {
        if (!"flash".equals(loginRequestPacket.getUsername())){
            return false;
        }else if (!"pwd".equals(loginRequestPacket.getPassword())){
            return false;
        }else {
            return true;
        }
    }
}
