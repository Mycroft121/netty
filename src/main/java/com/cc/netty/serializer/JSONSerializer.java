package com.cc.netty.serializer;

import com.alibaba.fastjson.JSON;

/**
 * @Author: cc
 */
public class JSONSerializer implements Serializer {


    @Override
    public byte getSerializerAlgorithm() {
        return SerializerAlgorithm.JSON;
    }

    @Override
    public byte[] serializer(Object object) {
        return JSON.toJSONBytes(object);
    }

    @Override
    public <T> T deserialize(Class<T> clazz, byte[] bytes) {
        return JSON.parseObject(bytes, clazz);
    }
}
