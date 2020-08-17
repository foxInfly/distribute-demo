package com.pupu.xml;

import com.pupu.ISerializer;
import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;

/**
 * xml序列化实现
 *
 * @author : lipu
 * @since : 2020-08-17 23:05
 */
public class XStreamSerializer implements ISerializer {

    XStream xStream = new XStream(new DomDriver());

    public <T> byte[] serializer(T obj) {
        return xStream.toXML(obj).getBytes();
    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {
        return (T)xStream.fromXML(new String(data));
    }
}
