package com.example.mq_protocol.protostruct;


import lombok.Data;

@Data
public class ItemDTO {

    private Long itemId;

    private Double price;

    private Integer uint32Count;

    private Long uint64Count;

    private Integer sint32Count;

    private Long sint64Count;

    private Integer fixed32Count;

    private Long fixed64Count;

    private Integer sfixed32Count;

    private Long sfixed64Count;

    private byte[] type;
}

