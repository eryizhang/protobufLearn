package com.example.mq_protocol.dynamic_protocol;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface OwnerConvert {
    OwnerConvert INSTANCE = Mappers.getMapper(OwnerConvert.class);

    OwnerPojo proto2pojo(Ownerpro.Owner proto);
    Ownerpro.Owner pojo2proto(OwnerPojo pojo);

    @Mapping(target = "xiaoqu1", source = "xiaoqu")
    HousePojo house1(Housepro.House proto);

    @Mapping(target = "xiaoqu", source = "xiaoqu1")
    Housepro.House house1(HousePojo pojo);

    //List<HousePojo> houses(List<Housepro.House> houses);
    //List<Housepro.House> houses(List<HousePojo> houses);
}
