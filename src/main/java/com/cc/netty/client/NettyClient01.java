package com.cc.netty.client;

import com.cc.netty.util.ConnectUtil;
import io.netty.bootstrap.Bootstrap;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.nio.NioSocketChannel;

/**
 * @Author: cc
 */
public class NettyClient01 {

    public static void main(String[] args) {
        NioEventLoopGroup workerGroup = new NioEventLoopGroup();

        Bootstrap bootstrap = new Bootstrap();
        bootstrap
                //1.指定线程模型
                .group(workerGroup)
                //2.指定IO类型为NIO
                .channel(NioSocketChannel.class)
                //3.IO处理逻辑
                .handler(new ChannelInitializer<NioSocketChannel>() {
                    @Override
                    protected void initChannel(NioSocketChannel nioSocketChannel) throws Exception {

                    }
                });

        ConnectUtil.connect(bootstrap, "127.0.0.1", 8000, ConnectUtil.MAX_RETRY);

    }


}
