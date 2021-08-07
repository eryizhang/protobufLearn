package com.example.mq_protocol.protostruct;


import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;
import java.util.Map;

@Data
public class TestDTO {

    private Integer id;

    private String name;

    private Date createTime;

    private TypeEnum downloadResourceTypeEnum;

    private ItemDTO mainItem;

    private Boolean disable;

    private BigDecimal prePrice;

    private Map<String, String> kv;

    private List<ItemDTO> itemList;

    private List<String> numberList;

    private List<TypeEnum> typesList;

    private List<Integer> nosList;
}