package com.example.mq_protocol.teststring;

import com.google.protobuf.ByteString;

public class TestStrings {
    public static void main(String[] args) {
        String s="asdfasdfas234dfasds234dfoifasdlaks34dfaosfad";
        Bytespro.Bytes.Builder builder=Bytespro.Bytes.newBuilder();
        builder.setXiaoqu(ByteString.copyFrom(s.getBytes()));
        Bytespro.Bytes bytes=builder.build();
        byte[] bs=bytes.toByteArray();
        System.out.println(bs.length);

        Stringspro.Strings.Builder builder1=Stringspro.Strings.newBuilder();
        builder1.setXiaoqu(s);
        Stringspro.Strings strings=builder1.build();
        byte[] bs1=strings.toByteArray();
        System.out.println(bs1.length);
    }
}
