package com.example.mq_protocol.dynamic_protocol;


import com.alibaba.fastjson.JSON;
import com.google.protobuf.*;
import com.google.protobuf.util.JsonFormat;


import java.io.FileInputStream;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;

public class DynamicProtocolTest {

    public static void main(String[] args) throws InvalidProtocolBufferException {
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

        ownerbuilder.setHouse(builder1.build());
        ownerbuilder.addAllHouses(list);
       // System.out.println(JsonFormat.printer().print(ownerbuilder));;
        Ownerpro.Owner owner=ownerbuilder.build();
        System.out.println("-------mapstructtest-------");
        HousePojo housePojo=OwnerConvert.INSTANCE.house1(builder1.build());
        System.out.println(housePojo.getDanyuan()+housePojo.getLou()+housePojo.xiaoqu1);
        Housepro.House housepro=OwnerConvert.INSTANCE.house1(housePojo);
        System.out.println(housepro.getDanyuan()+housepro.getLou()+housepro.getXiaoqu());
        OwnerPojo ownerPojo1=OwnerConvert.INSTANCE.proto2pojo(owner);
        System.out.println(ownerPojo1.getAge()+ownerPojo1.getName()+ownerPojo1.getHouse().getLou()/*+ownerPojo1.getHouses().size()*/);
        System.out.println("-------mapstructtest-------");


        byte[] ba=owner.toByteArray();


        ByteString bs=owner.toByteString();



        Ownerpro.Owner owner1=Ownerpro.Owner.parseFrom(ba);
        String s=JsonFormat.printer().print(owner1);
        OwnerPojo ownerPojo= JSON.parseObject(s,OwnerPojo.class);
        //System.out.println(ownerPojo.getAge()+ownerPojo.getName()+ownerPojo.housesList.size());

        System.out.println(owner1.getHousesList().size());

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
    static void compareString()
    {
        Ownerpro.Owner.Builder builder=Ownerpro.Owner.newBuilder();
        builder.setPhone("abcdesdfasdesd44fg");
        builder.setName("asdfasdfasdfaasdfa");
        Ownerpro.Owner owner=builder.build();
        ByteString bs=owner.toByteString();

        Ownerpro.Owner.Builder builder1=Ownerpro.Owner.newBuilder();

        builder1.setPhone("abcdesdfasdesd44fg");
        builder1.setName("asdfasdfasdfaasdfa");
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


        System.out.println("s");
    }


    //从生成的类中获取descriptor，通过动态反解
    static void sendAndRead2(byte[] ba) throws InvalidProtocolBufferException {

        Descriptors.Descriptor descriptor=Ownerpro.Owner.getDescriptor();
        DynamicMessage dynamicMessage=DynamicMessage.parseFrom(descriptor,ba);
        System.out.println(descriptor.getFullName());
        System.out.println(descriptor.getIndex());
        System.out.println(dynamicMessage.getField(descriptor.findFieldByNumber(1)));
        System.out.println(dynamicMessage.getField(descriptor.findFieldByNumber(2)));
        System.out.println(dynamicMessage.getField(descriptor.findFieldByNumber(3)));
        System.out.println(dynamicMessage.getField(descriptor.findFieldByNumber(4)));
        //dynamicMessage.getField(descriptor.getIndex())
        //dynamicMessage.getField(descriptor.findFieldByNumber());
        System.out.println(dynamicMessage.getAllFields());



    }

    //生成description文件，通过getname获取到需要的descriptor，反解
    static void SendAndRead1(byte[] ba) throws Exception {
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
