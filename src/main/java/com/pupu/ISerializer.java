package com.pupu;

/**
 * 序列化、反序列化
 *
 * @author : lipu
 * @since : 2020-08-17 21:33
 */
public interface ISerializer {
    /**
     * 序列化
     * @param obj 要序列化的对象
     * @param <T> 序列化后T类型的byte数组
     * @return
     */
    <T> byte[] serializer(T obj);

    /**
     * 反序列化
     * @param data  需要反序列化的byte数组
     * @param clazz 反序列化后的类对象
     * @param <T>  反序列化后的类 类型
     * @return
     */
    <T> T deserialize(byte[] data,Class<T> clazz);
}
