package com.example.mq_protocol.mapstruct;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface Convert {
    Convert INSTANCE = Mappers.getMapper(Convert.class);

    Objt t(Objs s);
    Target t(Source s);
}
