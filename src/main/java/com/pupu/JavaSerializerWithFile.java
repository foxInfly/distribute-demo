package com.pupu;


import java.io.*;

/**
 * @author : lipu
 * @since : 2020-08-17 21:10
 */
public class JavaSerializerWithFile implements ISerializer {



    @Override
    public <T> byte[] serializer(T obj) {
        try {
            ObjectOutputStream outputStream = new ObjectOutputStream(
                    new FileOutputStream(new File("user")));
            //把obj放入输出流写出，同时就是序列化了
            outputStream.writeObject(obj);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return new byte[0];
    }

    @Override
    public <T> T deserialize(byte[] data, Class<T> clazz) {
        try {
            ObjectInputStream inputStream = new ObjectInputStream(
                    new FileInputStream(new File("user")));
            //读取输入流数据
            T t = (T) inputStream.readObject();
            return t;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return null;
    }
}
