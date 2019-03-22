package com.cc.netty.util;

import io.netty.bootstrap.Bootstrap;
import io.netty.bootstrap.ServerBootstrap;
import io.netty.util.concurrent.Future;
import io.netty.util.concurrent.GenericFutureListener;

import java.util.Date;
import java.util.concurrent.TimeUnit;

/**
 * @Author: cc
 */
public class ConnectUtil {

    public static final int MAX_RETRY = 10;

    public static void connect(Bootstrap bootstrap, String host, int port, int retry) {
        bootstrap.connect(host, port).addListener(future -> {
            if (future.isSuccess()) {
                System.out.println("连接成功");
            } else if (retry == 0) {
                System.out.println("重试次数已用完,放弃连接");
            } else {
                //第几次重连
                int order = (MAX_RETRY - retry) + 1;
                //本次重连的间隔
                int delay = 1 << order;
                System.out.println(new Date()+":连接失败,第"+order+"次重连...");
                bootstrap.config().group().schedule(() -> connect(bootstrap, host, port, retry - 1), delay, TimeUnit.SECONDS);
            }
        });
    }

    public static void bind(final ServerBootstrap serverBootstrap, final int port) {
        serverBootstrap.bind(port).addListener(new GenericFutureListener<Future<? super Void>>() {
            @Override
            public void operationComplete(Future<? super Void> future) throws Exception {
                if (future.isSuccess()){
                    System.out.println("端口["+port+"]绑定成功");
                }else {
                    System.out.println("端口["+port+"]绑定失败");
                    bind(serverBootstrap,port + 1);
                }
            }
        });
    }

}
