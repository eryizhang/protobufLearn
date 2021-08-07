package com.example.mq_protocol.protostruct;

import java.util.ArrayList;
import java.util.List;

public class Tests {
    public static void main(String[] args) {
        ItemDTO itemDTO=new ItemDTO();
        itemDTO.setItemId(12l);
        ItemDTO itemDTO1=new ItemDTO();
        itemDTO.setItemId(121l);
        List<ItemDTO> list=new ArrayList<>();
        TestDTO testDTO=new TestDTO();
        testDTO.setItemList(list);
        testDTO.setMainItem(itemDTO);

        //TestOuterClass test=TestMapper.instance.toProto(testDTO);
    }
}
