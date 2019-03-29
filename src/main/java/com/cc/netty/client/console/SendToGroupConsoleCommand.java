package com.cc.netty.client.console;

import com.cc.netty.protocol.command.request.GroupMessageRequestPacket;
import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: cc
 */
public class SendToGroupConsoleCommand implements ConsoleCommand {
    @Override
    public void exec(Scanner scanner, Channel channel) {
        System.out.print("发送消息给某个某个群组：");

        String toGroupId = scanner.next();
        String message = scanner.next();

        channel.writeAndFlush(new GroupMessageRequestPacket(toGroupId,message));
    }
}