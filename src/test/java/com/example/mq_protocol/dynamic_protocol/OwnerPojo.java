package com.example.mq_protocol.dynamic_protocol;

import lombok.Data;

import java.util.List;

@Data
public class OwnerPojo {
    String name;
    String phone;
    int age;
    List<HousePojo> housesList;
    HousePojo house;

}
