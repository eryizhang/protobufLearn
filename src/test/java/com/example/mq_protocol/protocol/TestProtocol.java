package com.example.mq_protocol.protocol;
import com.google.protobuf.Descriptors;
import com.google.protobuf.InvalidProtocolBufferException;
public class TestProtocol {
    public static void main(String[] args) {
        Userpro.User.Builder builder=Userpro.User.newBuilder();
        Descriptors.Descriptor descriptor= Userpro.User.getDescriptor();
        builder.setAge(14);
        builder.setName("zs");
        builder.setPhone("123456");
        Userpro.User zs=builder.build();
        byte[] zsb=zs.toByteArray();

        try
        {
            Userpro.User zsf=Userpro.User.parseFrom(zsb);
            System.out.println(zsf.getAge());

        } catch (InvalidProtocolBufferException e) {
            e.printStackTrace();
        }


    }
    }
