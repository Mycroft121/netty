package com.cc.netty;

import com.cc.netty.protocol.command.LoginRequestPacket;
import com.cc.netty.protocol.command.Packet;
import com.cc.netty.protocol.command.PacketCodeC;
import com.cc.netty.serializer.JSONSerializer;
import com.cc.netty.serializer.Serializer;
import io.netty.buffer.ByteBuf;
import org.junit.Assert;
import org.junit.Test;

/**
 * @Author: cc
 */
public class PackerCodeCTest {

//    @Test
//    public void encode(){
//
//        Serializer serializer = new JSONSerializer();
//        LoginRequestPacket loginRequestPacket = new LoginRequestPacket();
//
//        loginRequestPacket.setVersion(((byte)1));
//        loginRequestPacket.setUserId("123");
//        loginRequestPacket.setUsername("zhangsan");
//        loginRequestPacket.setPassword("password");
//
//        PacketCodeC packetCodeC = new PacketCodeC();
//        ByteBuf byteBuf = packetCodeC.encode(loginRequestPacket);
//        Packet decodedPacket = packetCodeC.decode(byteBuf);
//
//        Assert.assertArrayEquals(serializer.serializer(loginRequestPacket),serializer.serializer(decodedPacket));
//    }
}
