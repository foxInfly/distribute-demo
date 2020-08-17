package com.pupu.json;

import com.alibaba.fastjson.JSON;
import com.pupu.ISerializer;

/**
 * @author : lipu
 * @since : 2020-08-17 23:15
 */
public class FastJsonSerializer implements ISerializer {
    public <T> byte[] serializer(T obj) {
        return JSON.toJSONBytes(obj);
    }

    public <T> T deserialize(byte[] data, Class<T> clazz) {
        return JSON.parseObject(new String(data),clazz);
    }
}
