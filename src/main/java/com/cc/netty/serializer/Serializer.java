package com.cc.netty.serializer;

/**
 * @Author: cc
 */
public interface Serializer {

    /**
     * json 序列化
     */
    byte JSON_SERIALIZER = 1;

    Serializer DEFAULT = new JSONSerializer();

    /**
     * 序列号算法
     * @return
     */
    byte getSerializerAlgorithm();

    /**
     * java 对象转换成二进制
     *  @param object
     *  @return
     */
    byte[] serializer(Object object);

    /**
     * 二进制转换成 java 对象
     *  @param clazz
     *  @param bytes
     *  @return
     */
    <T> T deserialize(Class<T> clazz, byte[] bytes);
}
