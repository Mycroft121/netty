package com.cc.netty.client.console;

import io.netty.channel.Channel;

import java.util.Scanner;

/**
 * @Author: cc
 */
public interface ConsoleCommand {
    public void exec(Scanner scanner, Channel channel);
}
