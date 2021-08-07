package com.example.mq_protocol.mapstruct;

import java.util.ArrayList;
import java.util.List;

public class Test {
    public static void main(String[] args) {
        Objs s=new Objs();
        s.setI(1);
        Objs s1=new Objs();
        s.setI(2);

        Source source=new Source();
        source.setObjs(s);
        List<Objs> list=new ArrayList<>();
        list.add(s);
        list.add(s1);
        source.setObjss(list);

        Target t=Convert.INSTANCE.t(source);
        System.out.println(t.getObjs().i+"  "+t.getObjss().size());
    }
}
