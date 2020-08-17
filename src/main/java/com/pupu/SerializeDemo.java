package com.pupu;

import com.pupu.json.FastJsonSerializer;
import com.pupu.xml.XStreamSerializer;

/**
 * @author : lipu
 * @since : 2020-08-17 22:11
 */
public class SerializeDemo {

    public static void main(String[] args) {
//        ISerializer iSerializer = new JavaSerializerWithFile();
//        ISerializer iSerializer = new XStreamSerializer();
        ISerializer iSerializer = new FastJsonSerializer();
        User user = new User();
        user.setAge(18);
        user.setName("pupu");


        byte[] bytes = iSerializer.serializer(user);
        System.out.println(bytes.length);
        System.out.println(new String(bytes));

        User user1 = iSerializer.deserialize(bytes,User.class);
        System.out.println(user1);
    }
}
