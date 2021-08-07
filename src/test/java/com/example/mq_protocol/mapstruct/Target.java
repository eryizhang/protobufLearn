package com.example.mq_protocol.mapstruct;

import lombok.Data;

import java.util.List;

@Data
public class Target {
    String name;
    int age;
    long id;
    Objt objs;
    List<Objt> objss;
}
