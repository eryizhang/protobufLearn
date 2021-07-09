package com.example.mq_protocol.dynamic_protocol;

import com.google.protobuf.*;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DynamicProtocolTest {

    public static void main(String[] args) {
        Ownerpro.Owner.Builder ownerbuilder = Ownerpro.Owner.newBuilder();
        ownerbuilder.setAge(56);
        ownerbuilder.setName("ls");
        ownerbuilder.setPhone("33336");

        List<Housepro.House> list=new ArrayList<Housepro.House>();
        Housepro.House.Builder builder1=Housepro.House.newBuilder();
        builder1.setXiaoqu("hubing");
        builder1.setLou("15dong");
        builder1.setDanyuan(303);
        Housepro.House.Builder builder12=Housepro.House.newBuilder();
        builder12.setXiaoqu("gaoshan");
        builder12.setLou("8dong");
        builder12.setDanyuan(201);
        list.add(builder1.build());
        list.add(builder12.build());


        ownerbuilder.addAllHouses(list);
        Ownerpro.Owner owner=ownerbuilder.build();


        byte[] ba=owner.toByteArray();

        ByteString bs=owner.toByteString();

        /*try {
            SendAndRead1( ba);
        } catch (Exception e) {
            e.printStackTrace();
        }
*/
        try {
            sendAndRead2(ba);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            sendAndRead3(bs);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    //标识类的信息，利用反射调用方法反解数据
    static void  sendAndRead3(ByteString bs) throws Exception {
        RoundUppro.RoundUp.Builder builder=RoundUppro.RoundUp.newBuilder();
        builder.setClassName("com.example.mq_protocol.dynamic_protocol.Ownerpro$Owner");
        builder.setMessage(bs);
        RoundUppro.RoundUp roundUp=builder.build();
        ByteString b=roundUp.toByteString();

        RoundUppro.RoundUp rr=RoundUppro.RoundUp.parseFrom(b);
        System.out.println(rr.getClassName());
        Ownerpro.Owner owner=Ownerpro.Owner.parseFrom(rr.getMessage());
        System.out.println(owner.getHousesList().size());

        Class cl=Class.forName(rr.getClassName());
        Method method=cl.getMethod("parseFrom",ByteString.class);
        Object owner1= method.invoke(cl,rr.getMessage());
        System.out.println(owner.getHousesList().size());
    }

    //从生成的类中获取descriptor，通过动态反解
    static void sendAndRead2(byte[] ba) throws InvalidProtocolBufferException {

        Descriptors.Descriptor descriptor=Ownerpro.Owner.getDescriptor();
        DynamicMessage dynamicMessage=DynamicMessage.parseFrom(descriptor,ba);
        System.out.println(descriptor.getFullName());
        System.out.println(descriptor.getIndex());
        System.out.println(dynamicMessage.getField(descriptor.findFieldByNumber(1)));
        //dynamicMessage.getField(descriptor.getIndex())
        //dynamicMessage.getField(descriptor.findFieldByNumber());
        System.out.println(dynamicMessage.getAllFields());



    }

    //生成description文件，通过getname获取到需要的descriptor，反解
    static void SendAndRead1(byte[] ba) throws IOException, Descriptors.DescriptorValidationException, InterruptedException {
        SelfDescribePro.SelfDescribe.Builder selfBuider=SelfDescribePro.SelfDescribe.newBuilder();
/*        String protocCMD = "protoc --descriptor_set_out=D://projects//mq_protocol//src//test//java//com//example//mq_protocol//dynamic_protocol//dynamic.description D://projects//mq_protocol//src//test//java//com//example//mq_protocol//dynamic_protocol//dynamic.proto --proto_path=D://projects//mq_protocol//src//test//java//com//example//mq_protocol//dynamic_protocol//";
        Process process = Runtime.getRuntime().exec(protocCMD);
        process.waitFor();
        int exitValue = process.exitValue();
        if (exitValue != 0) {
            System.out.println("protoc execute failed");
            return;
        }*/
        DescriptorProtos.FileDescriptorSet descriptorSet = DescriptorProtos.FileDescriptorSet
                .parseFrom(new FileInputStream("D://projects//mq_protocol//src//test//java//com//example//mq_protocol//dynamic_protocol//dynamic.description"));
       // selfBuider.setDescriptorSet(Ownerpro.getDescriptor());
        for (DescriptorProtos.FileDescriptorProto fdp : descriptorSet.getFileList()) {
            System.out.println(fdp.getName());
            Descriptors.FileDescriptor fileDescriptor = Descriptors.FileDescriptor.buildFrom(fdp, new Descriptors.FileDescriptor[]{});
            System.out.println(fileDescriptor.getName());
            for (Descriptors.Descriptor descriptor : fileDescriptor.getMessageTypes()) {
                System.out.println(descriptor.getName());
               /* String className = fdp.getOptions().getJavaPackage() + "."
                        + fdp.getOptions().getJavaOuterClassname() + "$"
                        + descriptor.getName();
                System.out.println(descriptor.getFullName() + " -> " + className);*/
            }
        }
    }

}
