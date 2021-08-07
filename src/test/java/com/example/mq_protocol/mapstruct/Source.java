package com.example.mq_protocol.mapstruct;

import lombok.Data;

import java.util.List;

@Data
public class Source {
    String name;
    int age;
    long id;
    Objs objs;
    List<Objs> objss;
}
