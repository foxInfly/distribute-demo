package com.pupu;


import java.io.*;

/**
 * @author : lipu
 * @since : 2020-08-17 21:10
 */
public class JavaSerializer implements ISerializer {



    @Override
    public <T> byte[] serializer(T obj) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(byteArrayOutputStream);
            //把obj放入输出流写出，同时就是序列化了
            outputStream.writeObject(obj);
            return byteArrayOutputStream.toByteArray();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> clazz) {
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(data);
        try {
            ObjectInputStream inputStream = new ObjectInputStream(byteArrayInputStream);
            //读取输入流数据
            T t = (T) inputStream.readObject();
            return t;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
