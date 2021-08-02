package com.example.mq_protocol.dynamic_protocol;

import com.google.protobuf.ByteString;

public class TestProrun {
    public static void main(String[] args) {
        Testpro.Test.Builder testbuilder=Testpro.Test.newBuilder();
        byte[] ba=new byte[20];
        testbuilder.setBs(ByteString.copyFrom(ba));
    }
}
