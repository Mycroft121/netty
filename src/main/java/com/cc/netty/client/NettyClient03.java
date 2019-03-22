package com.cc.netty.client;

import com.cc.netty.handler.ClientHandler;
import com.cc.netty.handler.FirstClientHandler;
import com.cc.netty.util.ConnectUtil;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @Author: cc
 */
public class NettyClient03 {


    public static void main(String[] args) {
        NioEventLoopGroup workerGroup = new NioEventLoopGroup();

        Bootstrap bootstrap = new Bootstrap();
        bootstrap
                .group(workerGroup)
                .channel(NioSocketChannel.class)
                .handler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel ch) throws Exception {
                        ch.pipeline().addLast(new ClientHandler());
                    }
                });
        //重连
        ConnectUtil.connect(bootstrap, "127.0.0.1", 8000, ConnectUtil.MAX_RETRY);

    }




}
