package com.cc.netty.handler;

import io.netty.buffer.ByteBuf;
import io.netty.channel.ChannelHandler;
import io.netty.channel.ChannelHandlerContext;
import io.netty.channel.ChannelInboundHandlerAdapter;
import io.netty.util.concurrent.EventExecutorGroup;

import java.nio.charset.Charset;
import java.util.Date;

/**
 * @Author: cc
 * @Date: 2019/3/21 下午11:33
 * @Description: TODO
 */
public class FirstClientHandler extends ChannelInboundHandlerAdapter {

    @Override
    public void channelRead(ChannelHandlerContext ctx, Object msg) throws Exception {
        //收到数据
        ByteBuf byteBuf = (ByteBuf) msg;
        System.out.println(new Date() + ": 客户端读到数据 -> "+ byteBuf.toString(Charset.forName("utf-8")));
    }

    @Override
    public void channelActive(ChannelHandlerContext ctx) {
        System.out.println(new Date()+": 客户端写出数据");

        //1.获取数据
        ByteBuf byteBuf = getByteBuf(ctx);

        //2.写数据
        ctx.channel().writeAndFlush(byteBuf);
    }

    private ByteBuf getByteBuf(ChannelHandlerContext ctx) {
        //1.获取二进制抽象 ByteBuff
        ByteBuf buffer = ctx.alloc().buffer();

        //2.准备数据,指定字符串的字符集为 UTF-8
        byte[] bytes = "你好,闪电侠！".getBytes(Charset.forName("utf-8"));

        //3.填充数据到 ByteBuf
        buffer.writeBytes(bytes);

        return buffer;
    }
}
