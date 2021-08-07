package com.example.mq_protocol.protostruct;


import com.google.protobuf.ByteString;
import com.google.protobuf.LazyStringArrayList;
import com.google.protobuf.ProtocolStringList;
import org.mapstruct.Mapper;
import org.mapstruct.ObjectFactory;

import java.util.List;

@Mapper
public class BaseMapper {

    @ObjectFactory
    public ProtocolStringList createProtocolStringList(List<String> list) {
        return new LazyStringArrayList(list.size());
    }

    public static byte[] toByte(ByteString bytes) {
        return bytes.toByteArray();
    }

}

